package serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main_Class_Two {
//        In this PROCESS WE WANT TO CONVERT JAVA OBJECT TO JSON
        public static void main(String[] args) {
                ObjectMapper objectMapper = new ObjectMapper();
                Car car = new Car();
                car.setBrand("Toyota");
                car.setColor("White");
                car.setMileage(200000L);
                car.setModel("camry");
                String location ="C:\\Users\\mr Adio\\IdeaProjects\\Java_To_Jackson\\src\\car.txt";
                Path path = Path.of(location);
                try(OutputStream outputStream = Files.newOutputStream(path);
                PrintStream printStream = new PrintStream(outputStream)) {
                        System.setOut(printStream);

                        objectMapper.writeValue(System.out,car);
                } catch (IOException e) {
                        System.err.println(e.getMessage());
                }


        }
        }
