package list.ordenacao;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    private String name;
    private Integer age;
    private Double height;

    public Person(String name, Integer age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(age, o.getAge());
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

}

class comparatorPorAltura implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return  Double.compare(o1.getHeight(), o2.getHeight());
    }
}