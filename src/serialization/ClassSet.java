package serialization;

import java.util.*;

public class ClassSet {
    public static void main(String[] args) {
        String word = "Mavens";
        Set<Object> set = new HashSet<>();
       String word2 = String.valueOf(set.add(word));
        System.out.println(word2.hashCode());

            TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

       SortedSet<Integer> set_one = numbers.headSet(20);
        System.out.println(set_one);


    }
}
