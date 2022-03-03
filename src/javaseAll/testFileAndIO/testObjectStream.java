package javaseAll.testFileAndIO;

import org.junit.Test;

import java.io.*;

public class testObjectStream {
//    对象流写出，存入   对象接口Serializable
    @Test
    public void test1(){
        Person person=new Person("havenZeng",21);
        person.setCountry("china");
        try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("D:/obj.txt"));) {
            obj.writeObject(person);
            obj.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //    对象流写入，读取  对象接口Serializable
    @Test
    public void test2(){
         try(ObjectInputStream obj=new ObjectInputStream(new FileInputStream("D:/obj.txt"));) {
             Object o = obj.readObject();
             System.out.println(o);

         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
    }

//      对象流 接口Externalizable  对象一定要有无参构造器
    @Test
     public void test3(){
       Student person=new Student("havenZeng",21);
        person.setCountry("china");
        try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("D:/obj1.txt"));) {
            obj.writeObject(person);
            obj.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test4() throws IOException {

        try(ObjectInputStream obj=new ObjectInputStream(new FileInputStream("D:/obj1.txt"));) {
            Object o = obj.readObject();
            System.out.println(o);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
