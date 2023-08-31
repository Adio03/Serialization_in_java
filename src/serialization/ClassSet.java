package serialization;

import java.util.HashSet;
import java.util.Set;

public class ClassSet {
    public static void main(String[] args) {
        String word = "Mavens";
        Set<Object> set = new HashSet<>();
       String word2 = String.valueOf(set.add(word));
        System.out.println(word2.hashCode());
    }
}
