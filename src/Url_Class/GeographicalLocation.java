package Url_Class;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GeographicalLocation {
    @JsonProperty("lng")
    private String longitude;
    @JsonProperty("lat")
    private String latitude;



}
