package javaseAll.testFileAndIO;

import java.io.Serializable;

public class Person implements Serializable {
//    序列号，不同序列号就不可读取
    private static final long serialVersionUID = 8355309344397631818L;
    String name;
//    transient，static  都不可读取
    transient int age;

    public void setCountry(String country) {
        Person.country = country;
    }

    static String country;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +"country="+country+
                "，name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
