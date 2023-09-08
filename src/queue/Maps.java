package queue;

import java.util.HashMap;
import java.util.Map;

public  class Maps{
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();

        map.put("Asiwaju",200);
        map.put("Yungidu",500);
        map.put("Chimo",4000);
        map.remove("asiwaju");
        System.out.println(map);

        Map<String, Integer> dictionary = new HashMap<>(map);
        System.out.println(dictionary);


    }

}
