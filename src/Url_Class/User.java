package Url_Class;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    @JsonProperty("phone")
    private String phoneNumber;
    private String website;
    private Company company;


}
