package javaseAll.testEnum;

public enum Season1 {
    SPRING("春天","春暖花开"),
    SUMMER("夏天","里欸"),
    AUTUMN("秋天","春暖花开"),
    WINTER("冬天","春暖花开");
    private String name;
    private String desc;
//    public static Season1 getSeason(String name){
//         switch (name){
//             case"春天":
//                 return SPRING;
//                 break;
//             case"夏天":
//                 return SUMMER;
//             break;
//             case"秋天":
//                 return AUTUMN;
//             break;
//             case"冬天":
//                 return WINTER;
//             break;
//         }
//         return  null;
//    }
    Season1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
