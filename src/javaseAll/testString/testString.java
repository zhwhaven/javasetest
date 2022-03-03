package javaseAll.testString;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class testString {
    public static void main(String[] args) {
        String x="abDSd124";
        System.out.println(x.toUpperCase());
//        String具有不可变性
        System.out.println(x);

//        String substring = x.substring(1, 5);
//        System.out.println(substring);
//        System.out.println(x.indexOf("ds"));
//        System.out.println(x.charAt(1));
//        System.out.println(x.concat("88888"));
//        System.out.println(x.contains("12"));
//        System.out.println(x.replace("ab", "AB"));
//        System.out.println(x.toLowerCase());
//        System.out.println(x.toUpperCase());
    }
    @Test
    public void test2(){

        String x1="sfsdf";
        String x2="11111";
        String s = x1 + x2;
        String s1 = x1.concat(x2);
        System.out.println(s==s1);

        System.out.println(x1+x2);
        System.out.println(x1.concat(x2));
    }
}
