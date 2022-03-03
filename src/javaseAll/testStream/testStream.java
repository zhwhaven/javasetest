package javaseAll.testStream;

import org.junit.Test;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class testStream {
    @Test
    public void test1(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(600);
        list.add(50);
        list.add(70);
        list.add(80);
        list.add(180);
        list.add(990);
//        list.sort(Integer::compareTo);
//        list.forEach(System.out::println);
//        Stream 下的中间操作filer过滤，中间操作不会立刻启动，当终结操作启动时才启动
//        Lambda表达式的常用操作，简写匿名类
        Stream<Integer> stream = list.stream();
        stream.filter((s)->s>50).limit(3).forEach(System.out::println);
        System.out.println("------------------------>");
//        当stream操作到终结操作时，该流无法再被操作
//        stream.limit(2).forEach(System.out::println);

//        Lambda表达式中的功能型
        Stream<Integer> stream1 = list.stream();
//         stream1.map(new Function<Integer, Object>() {
//
//             @Override
//             public Object apply(Integer integer) {
//                 return integer+50;
//             }
//         }).forEach(System.out::println);
        stream1.map(s->s+50).forEach(System.out::println);
    }
    @Test
//    有bug
    public void test2() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Class<Array> aClass = Array.class;
////        Array array = null;
//        Method newInstance = aClass.getDeclaredMethod("newInstance", Class.class, int.class);
//        newInstance.setAccessible(true);
//        Object array = newInstance.invoke(null);
//        Method anInt = aClass.getDeclaredMethod("setInt", Object.class, int.class, int.class);
//        anInt.setAccessible(true);
//        Object invoke = anInt.invoke(array, 1, 5, 8, 3, 7, 9, 15);
//        Method getInt = aClass.getDeclaredMethod("getInt", Object.class, int.class);
//        getInt.setAccessible(true);
//        System.out.println(getInt.invoke(array, 1));


    }
    @Test
    public void test3(){
//        boxed() 将每一个整数进行装箱，把IntStream 转换成了 Stream< Integer >  不可或缺的一个步骤
        int []arr={10,8,15,62,25,34};
        List<Integer> collect1 = Arrays.stream(arr).boxed().collect(Collectors.toList());

        System.out.println(collect1);
//        long count = stream.count();
//        System.out.println(count);

    }
    @Test
    public void test4(){
//        List<Integer> list = Stream.of(10, 20, 50, 80, 90, 100, 20).sorted(Integer::compareTo).collect(Collectors.toList());
        List<Integer> list = Stream.of(10, 20, 50, 80, 90, 100, 20).sorted(Integer::compareTo).collect(Collectors.toList());
//        list.forEach(System.out::println);
        list.forEach((s)-> System.out.println(s));
    }
    @Test
    public void test5(){
        HashMap<String,String> map=new HashMap<>();
        map.put("haven","18");
        map.put("calin","20");
        map.put("junyi","22");
        map.forEach((a1,a2)->
            System.out.println(a1+"----->"+a2)
        );
    }
    @Test
    public void test06(){
        HashSet<Integer> x=new HashSet<>();
        for (int i = 0; i <100 ; i++) {
            x.add(i);
        }
//        x.forEach((s)-> System.out.println(s));

    }
}
