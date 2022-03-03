package javaseAll.testSort;

import java.util.Arrays;
//希尔排序  就是将数组进行分组 然后根据不同组进行插入排序   直到分组数为1
//分组数等于数组长度除以2
public class testShellSort {
    public static void main(String[] args) {
        int []arr={2,80,52,36,14,56,25,24,36};
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        int len=arr.length;
        for(int step=len/2;step>=1;step=step/2){
            for (int i = 0; i <step ; i++) {
                for(int j=i+step;j<arr.length;j+=step){
                    int k=j;
                    int temp=arr[k];
                     while ((arr[k-step]>temp)&&(k>0)){
                         arr[k]=arr[k-step];
                         k=k-step;
                         if(k-step<0){
                             break;
                         }
                     }
                     if(k!=j){
                         arr[k]=temp;
                     }
                }
            }
        }
    }
}
