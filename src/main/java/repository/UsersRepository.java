package repository;

import entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query("SELECT * FROM Users") // SQL запрос
    List<Users> findAllSql();

    @Query(value = "SELECT * FROM users WHERE nameSurname LIKE '%roman%' AND humanGender = 'M'", nativeQuery = true)
    List<Users> findWhereNameStartsFromRomanAndHumanGenderIsM();


}