package javaseAll.testCollection;

import org.junit.Test;

import java.util.*;
//list常用方法集合
public class testList {
    public static void main(String[] args) {
        List x=new ArrayList<Integer>();
        x.add(12);
        x.add(118);
        x.add(3);

        System.out.println(x);
        System.out.println("-------------");
        x.add(1,8);
        System.out.println(x);
        Iterator iterator = x.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(x);
        System.out.println("-------------");
        x.remove(8);

    }
    @Test
    public void t2(){
        List<Integer> x=new ArrayList<Integer>();
        x.add(12);
        x.add(118);
        x.add(3);
        System.out.println("x.contains(12) = " + x.contains(12));
        x.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println("x = " + x);
    }

    @Test
    public void t3(){
        List<Student> list=new ArrayList<>();
        Student s1=new Student(12,"李白");
        Student s2=new Student(18,"杜甫");
        Student s3=new Student(8,"王羲之");
        Student s4=new Student(7,"孟浩然");
        Student s5=new Student(25,"李清照");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        ListIterator<Student> sl = list.listIterator();
        while (sl.hasNext()){
            System.out.println(sl.next());
        }
        System.out.println("---------------");
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age-o2.age;
            }
        });
        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println("list.size() = " + list.size());
        System.out.println("---------------");
        list.set(1,new Student(85,"白居易"));
        System.out.println(list);

    }
}
