package Url_Class;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Company {
    private String name;
    private String catchPhrase;
    @JsonProperty("bs")
    private String businessService;


}
