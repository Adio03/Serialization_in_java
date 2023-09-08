package queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asynchronous {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);

        List<Integer> numbers = Collections.synchronizedList(number);
        System.out.println(numbers);
    }

}
