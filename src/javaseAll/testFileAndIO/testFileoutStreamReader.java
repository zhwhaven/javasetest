package javaseAll.testFileAndIO;

import org.junit.Test;

import java.io.*;

public class testFileoutStreamReader {
    @Test
    public void test1() throws IOException {

        OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream("D:/xx.txt"),"gbk");

        writer.write("黑暗圣经覅就覅就");
        writer.flush();
        writer.close();
    }
    @Test
    public void test2() throws IOException {
//        编码格式不同时，要使用转换流
//              Reader reader=new FileReader("D:/xx.txt");
//              int len=0;
//              while ((len=reader.read())!=-1){
//                  System.out.println((char) len);
//              }
//              reader.close();


        InputStreamReader reader=new InputStreamReader(new FileInputStream("D:/xx.txt"),"gbk");
        int len=0;
        while((len=reader.read())!=-1){
            System.out.println((char)len);
        }
        reader.close();
    }
}
