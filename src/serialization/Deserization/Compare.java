package serialization.Deserization;



import java.util.*;

import static java.util.Collections.sort;

public class Compare{
    public static void main(String[] args) {
        Cat actty = new Cat("maven",20);
        Cat actty_one = new Cat("Burna",7);
        Cat actty_two = new Cat("olamide",5);

        List<Cat> catList = new ArrayList<>();
        catList.add(actty);
        catList.add(actty_one);
        catList.add(actty_two);
        sort(catList);

        System.out.println(catList);

        Comparator<Cat> comparator = (first_maven,second_mavens)->{
            if(first_maven.getName().compareTo(second_mavens.getName()) >0) return 1;
            else if(first_maven.getName().compareTo(second_mavens.getName())< 0)return -1;
            return 0;
        };

        TreeSet<Cat> cats = new TreeSet<>(comparator);
        cats.add(new Cat("Bruno",50));
        cats.add(new Cat("Pauly",10));
        cats.add(new Cat("Young john",20));
        cats.add(new Cat("shigo baba",100));
        System.out.println("---->>> " +cats);
        sort(catList,comparator);
        System.out.println(catList);

    }



}
