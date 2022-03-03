package javaseAll.testSingle;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Date;

public class t1 {
    @Test
    public void tw(){
        String tt="D:\\pratice\\gradle\\wrapper\\gradle-wrapper.properties";
        String replace = tt.replace("\\", "/");
        System.out.println(replace);
        long l = System.currentTimeMillis();
        System.out.println("new Date(l).toLocaleString() = " + new Date(l).toLocaleString());

    }
    @Test
    public void t2(){
        String name="同九年，如何修";
        byte[] bytes = name.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
    @Test
    public void t3(){
             String a="a.txt";
        int i = a.indexOf(".");
        String substring = a.substring(i);
        System.out.println(substring);

    }

}
