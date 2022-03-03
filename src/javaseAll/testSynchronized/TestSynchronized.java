package javaseAll.testSynchronized;

public class TestSynchronized {
    public static void main(String[] args) {
          Bar bar=new Bar();
          Cook cook=new Cook(bar);
        Waiter waiter = new Waiter(bar);
        Thread t1=new Thread(cook,"厨师");
        Thread t2=new Thread(waiter,"服务员");
        t1.start();
        t2.start();
    }
}
class  Bar{
    public static final int MAXSIZE=10;
    public int count=0;
    public  synchronized void add(){
        while (count>=MAXSIZE){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(Thread.currentThread().getName()+"上菜 已有第"+count+"个菜");
        this.notify();
    }
    public  synchronized void cut(){
        while (count<=0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        System.out.println(Thread.currentThread().getName()+"端菜 已有第"+count+"个菜");
        this.notify();
    }
}
class Cook implements Runnable{
    private Bar bar;

    Cook(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void run() {
        while(true){
            bar.add();}
    }
}
class Waiter implements Runnable{
    private Bar bar;

    Waiter(Bar bar) {
        this.bar = bar;
    }
    @Override
    public void run() {
        while (true){
         bar.cut();}
    }
}