package javaseAll.testInet.testUdp;

import java.io.IOException;
import java.net.*;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(50002);
        DatagramPacket datagramPacket;
        byte []bytes=new byte[1024];
        String xx="nihaowordl";
        byte[] bytes1 = xx.getBytes();
        datagramPacket = new DatagramPacket(bytes1,bytes1.length,InetAddress.getLocalHost(),50001);
        socket.send(datagramPacket);

        DatagramPacket packet2=new DatagramPacket(bytes,bytes.length);
        socket.receive(packet2);
        System.out.println(new String(bytes));
    }
}
