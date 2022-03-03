package javaseAll.testSort;

import java.util.Arrays;
//插入排序，以0点为有序的序列，比有序队列大一的数开始与前面的值进行比较
//挪位置方法
//找到比该值小或等于的插入空的位置，
public class testInsertSort {
    public static void main(String[] args) {
        int []arr={2,80,52,36,14,56,25,24,36};
        int []arr1=insertSort(arr);
        System.out.println(Arrays.toString(arr1));

    }

    private static int[] insertSort(int[] arrSource) {
        int []arr= Arrays.copyOf(arrSource,arrSource.length);
        for (int i = 1; i <arr.length ; i++) {
            int temp=arr[i];
            int j=i;
            while(j>0&&temp<arr[j-1]){
                arr[j]=arr[--j];
            }
            if(j!=i){
                arr[j]=temp;
            }
        }
        return arr;
    }
}
