package serialization.Deserization;

import com.fasterxml.jackson.databind.ObjectMapper;
import serialization.Car;

import java.io.IOException;

public class DeSerization_Class {
    public static void main(String[] args) {


        String json = "{\"brand\":\"peugeot\",\"model\":\"404\",\"color\":\"Black\",\"mileage\":40000}";
        ObjectMapper mapper = new ObjectMapper();
        Car car = null;
        try {
            car = mapper.readValue(json.getBytes(), Car.class);
            System.out.println(car);
            System.out.println(car.getBrand());
            System.out.println(car.getModel());
            System.out.println(car.getColor());
            System.out.println(car.getMileage());

        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}