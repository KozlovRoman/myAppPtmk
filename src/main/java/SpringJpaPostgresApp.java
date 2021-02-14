import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import entity.Users;
import service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringJpaPostgresApp {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(com.ptmk.app.SpringJpaPostgresApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    private void testJpaMethods(){

        Users users = new Users();
        users.setId(users.getId());
        users.setNameSurname("Roman Kozlov");
        users.setBirthDate(1996);
        users.setHumanGender("M");
        userService.createUsers(users);
        Users users1 = new Users();
        users1.setId(users.getId());
        users1.setNameSurname("Lana Kozlov");
        users1.setBirthDate(1995);
        users1.setHumanGender("F");
        userService.createUsers(users1);

        userService.findAllSql().forEach(it-> System.out.println(it));

        userService.findWhereNameStartsFromRomanAndHumanGenderIsM().forEach(it-> System.out.println(it));
    }
}