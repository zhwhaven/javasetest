package javaseAll.testShuzu;

import java.util.Arrays;
//常见数组函数
public class testShuzu {
    public static void main(String[] args) {
        int []arr={50,20,40,80,90,120,51,79};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] copy = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(copy));
        int[] copy1 = Arrays.copyOfRange(arr, 1, 6);
        System.out.println(Arrays.toString(copy1));
        int i = Arrays.binarySearch(arr, 40);
        System.out.println(i);
    }
}
