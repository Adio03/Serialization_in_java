package serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.StringReader;

public class Builder {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String json ="{\"brand\":\"peugeot\",\"model\":\"404\",\"color\":\"Black\",\"mileage\":40000}";
       try(StringReader reader = new StringReader(json)){
           Car car = mapper.readValue(reader, Car.class);
           System.out.println(car);
       }catch (Exception exception){
           System.err.println(exception.getMessage());
       }
    }
}
