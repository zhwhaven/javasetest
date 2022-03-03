package javaseAll.testFileAndIO;

import org.junit.Test;

import java.io.*;

public class testStream {
    @Test
     public void test01() throws IOException {
//        放文件时，先确定路径，mkdirs()可以创建多级目录
           File file =new File("D:/newtry/test");
           if(!file.exists()){
               file.mkdirs();
           }
//           创建文件，file.createNewFile(file);无则创建，有则返回false
       String s= file.getAbsolutePath()+ File.separator+"a.txt";
           File file1=new File(s);
        boolean newFile = file1.createNewFile();

    }
    @Test
    public void test02(){
//          查找文件
             selectFiles.selectFiles(new File("D:\\newtry"));
    }
    @Test
//    字节流读写
    public void test03(){
        InputStream is=null;
        OutputStream os=null;
        try {
//            创建输入输出流

            is = new FileInputStream("D:\\newtry\\sdf\\p1.jpg");

            os = new FileOutputStream("D:/x.jpg");
            byte []b=new byte[1024];
            int len=0;
            while ((len=is.read(b))!=-1){
                os.write(b,0,len);
                os.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }      if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//    字符流读写
    @Test
    public void test4(){
        Reader reader=null;
        Writer writer=null;
        try {
//            创建数据源
            reader = new FileReader("D:\\newtry\\test\\a.txt");
            writer = new FileWriter("D:/tttt.txt");
            char []c=new char[100];
             int len=0;
             while ((len=reader.read(c))!=-1){
                 writer.write(c,0,len);
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
