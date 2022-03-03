package javaseAll.testInet.testUdp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class Sever {
    public static void main(String[] args) throws IOException {
//        数据端口
        DatagramSocket datagramSocket=new DatagramSocket(50001);
        byte []bytes=new byte[1024];
//        数据包
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length);
//        接受
        datagramSocket.receive(packet);
        String s = bytes.toString();
        System.out.println("服务端接受客户端"+packet.getAddress()+packet.getPort()+ new String(bytes));

//        发给
        String tt="aaaa";
        byte[] bytes1 = tt.getBytes();
        DatagramPacket packet1 = new DatagramPacket(bytes1,bytes1.length,packet.getAddress(),packet.getPort());
        datagramSocket.send(packet1);
    }
}
