package javaseAll.testReflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;

public class testReflect {
    @Test
    public void test1() throws Exception{
//获取class的常用方法
//        Class p = Person.class;
        Class aClass = Class.forName("javaseAll.testReflect.Person");
//        操作静态资源
        Field country = aClass.getDeclaredField("country");
        Method setCountry = aClass.getDeclaredMethod("setCountry", String.class);
        Method getCountry = aClass.getDeclaredMethod("getCountry");

//      调用静态资源
        System.out.println(getCountry.invoke(null));
        country.set(null,"chinese");
        Object o = country.get(null);
        System.out.println("o = " + o);
        System.out.println(getCountry.invoke(null));
        setCountry.invoke(null,"中国");
        System.out.println(getCountry.invoke(null));

    }
    @Test
    public void test2(){
//         操作私有和公有资源
        Class aClass = Person.class;
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
//            获取属性的修饰
            int modifiers = field.getModifiers();
            String s = Modifier.toString(modifiers);
            System.out.println(field.getName()+"===>"+s);

        }
    }
    @Test
    public void test3() throws Exception {
        //         操作私有
        Class aClass = Class.forName("javaseAll.testReflect.Person");
        Object o = aClass.newInstance();
        Field age = aClass.getDeclaredField("age");
        Method getAge = aClass.getDeclaredMethod("getAge");
//        设置私有可见
        age.setAccessible(true);
        getAge.setAccessible(true);
//        操作
        System.out.println(getAge.invoke(o));
        age.set(o,20);
        System.out.println(getAge.invoke(o));


    }
    @Test
    public void test4() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        突破泛型限制
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(50);
        Class aClass = arr.getClass();
        Method add = aClass.getDeclaredMethod("add", Object.class);
        add.invoke(arr,new Date());
        add.invoke(arr,new String("sdfsfs"));
        System.out.println(arr);

    }
}
