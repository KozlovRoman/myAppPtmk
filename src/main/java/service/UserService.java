package service;

import entity.Users;
import repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public void createUsers(Users users) {
        usersRepository.save(users);
    }

    public List<Users> findAll(){
        return usersRepository.findAll();
    }

    public Users findById(Long userId){
        return usersRepository.findById(userId).orElse(null);
    }

    public List<Users> findAllSql(){
        return usersRepository.findAllSql();
    }

    public List<Users> findWhereNameStartsFromRomanAndHumanGenderIsM(){
        return usersRepository.findWhereNameStartsFromRomanAndHumanGenderIsM();
    }
}