package javaseAll.testFileAndIO;

import org.junit.Test;

import java.io.*;

public class testBufferedStream {
    @Test
    public void test1(){
        BufferedInputStream is=null;
        BufferedOutputStream os=null;
        try {
//            缓冲流即处理流，在内存中进行，速度更快

            is = new BufferedInputStream(new FileInputStream("D:\\newtry\\sdf\\p1.jpg"));
            os = new BufferedOutputStream(new FileOutputStream("D:/x.jpg"));
            byte []b=new byte[1024];
            int len=0;
            while((len=is.read(b))!=-1){
                 os.write(b,0,len);
                System.out.println(len);
                 os.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void test2(){
//    字节流缓冲流
        BufferedReader reader=null;
        BufferedWriter writer=null;
        try {
            reader=new BufferedReader(new FileReader("D:\\newtry\\test\\a.txt"));
            writer=new BufferedWriter(new FileWriter("D:/tttt.txt"));
            String len=null;
            while ((len=reader.readLine())!=null){

                  writer.write(len);
                    writer.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
