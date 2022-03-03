package javaseAll.testReflect;

public class Person {
    public static String country="china";
    private int age=10;
    public String name;

    public Person() {
    }

    public static String getCountry() {
        return country;
    }

     private int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public static void setCountry(String country) {
        Person.country = country;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
