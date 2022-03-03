package javaseAll.testCollection;

import org.junit.Test;

import java.util.*;

//HashSet 无序，唯一   泛型对象是自定义对象时，一定要重写equals和hashCode，不然就有可能添加重复的对象
//LinkedHashSet  有序：添加顺序 ，唯一
//TreeSet  有序：自然顺序,唯一
public class testSet {
    @Test
    public void t1(){
        Set<Student> students=new HashSet<>();
        Student s1=new Student(12,"李白");
        Student s2=new Student(18,"杜甫");
        Student s3=new Student(8,"王羲之");
        Student s4=new Student(7,"孟浩然");
        Student s5=new Student(25,"李清照");
        Student s6=new Student(25,"李清照");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        System.out.println(students);
        System.out.println("students.size() = " + students.size());//Student未重写hashCode()和equals==> 6
                                                                  //Student重写hashCode()和equals后 ==> 5
        System.out.println("------------");
//        students.s

    }
    @Test
    public void t2(){
        Set<Integer> list=new LinkedHashSet<>();
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(20);
        list.add(50);
        System.out.println(list);
    }
    @Test
    public void t3(){
        Set<Integer> list=new TreeSet<>();
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(20);
        list.add(50);
//        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            if((Integer)iterator.next()==10){
//                iterator.remove();
//            }
//        }
//        list.forEach((s)->{
//            if(s==10){
//                list.add(60);
//            }
//        });
        list.forEach((s)-> System.out.println(s));
    }
}
