package javaseAll.testInet.testSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever1 {
    public static void main(String[] args) throws IOException {
//        创建服务器的socket
        ServerSocket serverSocket=new ServerSocket(50000);
//        获得客户端的socket
        Socket socket = serverSocket.accept();
//        获得输入输出流
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
        PrintStream writer=new PrintStream(outputStream);

        String s = reader.readLine();
        while (s!=null){
//            获得数据的数据转化
            System.out.println("客户端传来的数据："+s);
            StringBuilder x=new StringBuilder(s);
            StringBuilder reverse = x.reverse();
//            返回数据到客户端
            writer.println(reverse.toString());
//            ------------
            s=reader.readLine();
        }
//        资源关闭
        reader.close();
        writer.close();
        serverSocket.close();
        socket.close();
    }
}
