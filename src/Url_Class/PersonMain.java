package Url_Class;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Maven");
        person.setAge(20);
        person.setDateOfBirth(LocalDate.now().minusYears(person.getAge()));
        LocalDateTime oneYearAgo = LocalDateTime.now().minusYears(1);
        person.setCreatedAt(oneYearAgo);
        System.out.println("person ----->>>> "+ person);

    }
}
