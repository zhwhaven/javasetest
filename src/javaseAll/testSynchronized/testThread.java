package javaseAll.testSynchronized;

import org.junit.Test;

public class testThread {
    @Test
    public void test(){
        Thread t1=new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"running");
        });
        t1.setName("kkkkk");
        t1.start();
    }
}

