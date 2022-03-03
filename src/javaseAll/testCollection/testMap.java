package javaseAll.testCollection;

import org.junit.Test;

import java.util.*;

public class testMap {
    @Test
    public void t1(){
        Map<Integer,String> map=new HashMap<>();
        map.put(12,"中国");
        map.put(28,"美国");
        map.put(3,"法国");
        map.put(7,"德国");
        System.out.println("map.get(12) = " + map.get(12));
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "===>" + entry.getValue());
        }
    }
    @Test
    public void t2(){
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(12,"中国");
        map.put(28,"美国");
        map.put(3,"法国");
        map.put(7,"德国");
        Set<Integer> ms= map.keySet();
        for (Integer m : ms) {
            System.out.println("m+\"==>\"+map.get(m) = " + m + "==>" + map.get(m));
        }

    }
    @Test
    public void t3(){
        Map<Integer,String> map=new TreeMap<>();
        map.put(12,"中国");
        map.put(28,"美国");
        map.put(3,"法国");
        map.put(7,"德国");
//        System.out.println("map.get(12) = " + map.get(12));
//
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println(entry.getKey() + "===>" + entry.getValue());
//        }
        map.forEach((k,v)->System.out.println("key="+k+",vaule="+v));
    }

}
