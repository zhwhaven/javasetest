package javaseAll.testFileAndIO;

import org.junit.Test;

import java.io.*;

public class testDataStream {
//    数据流读写
    @Test
    public void test1(){
        try(  DataOutputStream data=new DataOutputStream(new FileOutputStream("D:/data.txt"));
        ) {
            data.writeInt(124);
            data.writeUTF("您那你");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test(){
        try(DataInputStream data=new DataInputStream(new FileInputStream("D:/data.txt"))) {
            int i = data.readInt();
            String s = data.readUTF();
            System.out.println(i);
            System.out.println(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
