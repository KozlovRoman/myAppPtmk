package entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nameSurname;

    @Column
    private Integer birthDate;

    @Column
    private String humanGender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Integer getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthDate = birthDate;
    }

    public String getHumanGender() {
        return humanGender;
    }

    public void setHumanGender(String humanGender) {
        this.humanGender = humanGender;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", nameSurname='" + nameSurname + '\'' +
                ", birthdate=" + birthDate +
                ", humanGender='" + humanGender + '\'' +
                '}';
    }
}
