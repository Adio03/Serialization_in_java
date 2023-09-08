package serialization.Deserization;

import lombok.Data;

@Data
public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public int compareTo(Cat cat) {
        if(this.age > cat.age) return 1;
        else  if (this.age == cat.age) return 0;
        return -1;
    }
}
