package javaseAll.testInet.testSocket2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务器端同时接受多个客户端，采用方法：多线程
public class Sever {
    public static void main(String[] args) {
        System.out.println("-----------------服务器启动-----------------------");
        int count=1;
        try {
            ServerSocket serverSocket=new ServerSocket(50000);
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println(count++);
                Thread s=new SocketThread(socket.getLocalAddress().getHostName(),socket);
                s.start();
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
class SocketThread extends Thread{
    public SocketThread(String name, Socket socket) {
        this.socket = socket;
        this.name = name;
    }

    private Socket socket;
    private String name;

    @Override
    public String toString() {
        return "SocketThread{" +
                "socket=" + socket +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void run() {
           try(  BufferedReader reader=new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
                 PrintStream writer=new PrintStream(this.socket.getOutputStream());) {

               //           接受数据
          String s =null;
            while ((s=reader.readLine())!=null){
                System.out.println("这是"+name+"发送的数据:"+s);
                StringBuilder builder=new StringBuilder(s);
                builder.reverse();
//            发送数据
                writer.println(builder.toString());
            }
           } catch (IOException e) {
               e.printStackTrace();
           }


    }
}
