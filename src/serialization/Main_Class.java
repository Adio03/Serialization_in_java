package serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main_Class{
        public static void main(String[] args) {
                ObjectMapper objectMapper = new ObjectMapper();
                Car car = new Car();
                car.setBrand("Toyota");
                car.setColor("White");
                car.setMileage(200000L);
                car.setModel("camry");
                try {

                        objectMapper.writeValue(System.out,car);
                } catch (IOException e) {
                        System.err.println(e.getMessage());
                }


        }
        }
