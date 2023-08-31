package Url_Class;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Person {

    private String name;
    private int age;
    @JsonSerialize(using = LocalDateSerializer.class)
//    @JsonDeserialize(using = LocalDateSerializer.class)
    private LocalDate dateOfBirth;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime createdAt;



}
