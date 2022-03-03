package javaseAll.setting;

import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class test {
   public static void main(String[] args) {

        Properties properties = System.getProperties();//获得系统的某个属性值
        properties.list(System.out);
        long l = System.currentTimeMillis();//获得当前系统时间的毫秒值
       System.gc();
        System.out.println(l);
   }
}
