package javaseAll.testSingle;

import jdk.nashorn.internal.ir.CallNode;

/*
* 单例模式，对象只有一个，分为饿汉式和懒汉式
* 饿汉式：一开始就创建对象，和枚举类似
* 懒汉式：需要时才创建,有线程安全问题
* */
public class TestSingle {
    public static void main(String[] args) {
        HungrySingle t1 = HungrySingle.instance;
        HungrySingle t2 = HungrySingle.instance;
        LazySingle t3=LazySingle.show();
        LazySingle t4=LazySingle.show();
        System.out.println(t1==t2);
        System.out.println(t3==t4);
    }
}
/*
 * 单例模式，对象只有一个，分为饿汉式和懒汉式
 * 饿汉式：一开始就创建对象，和枚举类似
 * 懒汉式：需要时才创建,有线程安全问题
 * */
class HungrySingle{
    public static final HungrySingle instance=new HungrySingle();

}
class LazySingle{
    private static LazySingle lazySingle;
    public static synchronized LazySingle show(){//synchronized 解决线程安全问题
        if(lazySingle==null){
            lazySingle=new LazySingle();
        }
        return  lazySingle;
    }
}