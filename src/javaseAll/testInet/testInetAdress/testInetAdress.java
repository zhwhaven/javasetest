package javaseAll.testInet.testInetAdress;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class testInetAdress {
    @Test
    public void test1() throws UnknownHostException {

        InetAddress localHost = InetAddress.getLocalHost();

        System.out.println("localHost = " + localHost);
        byte[] address =  localHost.getAddress();

        System.out.println(Arrays.toString(address));
    }
    @Test
    public void test2() throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);
    }
}
