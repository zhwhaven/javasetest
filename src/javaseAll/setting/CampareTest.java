package javaseAll.setting;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CampareTest {
    public static void main(String[] args) {
        /*
        * 比较double类型数据时,因为double类型的数据是约数，所以用
        * Double.compare(x1, x2);
        *  double x1=1.5;
        double x2=2.5;
        int compare = Double.compare(x1, x2);
        System.out.println(compare);
        *
        * 比较String 类型时用equals()*/
        double x1=1.5;
        double x2=2.5;
        int compare = Double.compare(x1, x2);
        System.out.println(compare);
        System.out.println(compare);
    }
}
