package javaseAll.testInet.testSocket2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //       创建socket
        Socket socket=new Socket("localhost",50000);
//        获得socket的输入流，输出流
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        PrintStream writer=new PrintStream(outputStream);
        BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
//        用Scanner获取数据
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("输入数据");
            String next = scanner.next();
            if(next.equalsIgnoreCase("stop")){
                break;
            }
//            向服务器发出信息
            writer.println(next);
//            接受服务器信息
            System.out.println("服务器返回的信息："+reader.readLine());
        }
//        关闭资源
        writer.close();
        reader.close();
        socket.close();

    }
}
