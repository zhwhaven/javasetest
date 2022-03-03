package javaseAll.testEnum;

public class Season {

     public static final Season SPRING=new Season("春天","春暖花开");
     public static final Season SUMMER=new Season("夏天","烈日炎炎");
     public static final Season AUTOMN=new Season("秋天","秋高气爽");
     public static final Season WINTER=new Season("冬天","白雪皑皑");

    private String name;
    private String des;

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    private Season(String name, String des) {
        this.name = name;
        this.des = des;
    }

    private Season() {
    }

}
