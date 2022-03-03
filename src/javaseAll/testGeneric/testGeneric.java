package javaseAll.testGeneric;

import java.util.ArrayList;
import java.util.Collections;

public class testGeneric {
    public static void main(String[] args) {
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        ArrayList<Person> list=new ArrayList<>();
        Person<String> p1=new Person<>("李白","优秀");
        Person<Integer> p2=new Person<>("华罗庚",100);
        list.add(p1);
        list.add(p2);
        System.out.println(list);
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

    }
}
