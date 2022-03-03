package javaseAll.testShuzu;
//二分查找
//开始下标，结束下标，中间下标，
public class testBinarySearch {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,90,100,150,180,2000};
        int i=BinarySearch1(arr,30);
        System.out.println("i = " + i);
    }

    private static int BinarySearch1(int[] arr, int i) {
        int startIndex=0;
        int endIndex=arr.length-1;
        while(startIndex<=endIndex){
            int midIndex=(startIndex+endIndex)/2;
            int midValue=arr[midIndex];
            if(midValue<i){
            startIndex=midIndex+1;
            }else if(midValue>i){
                endIndex=midIndex-1;
            }else {
                return midIndex;
            }
        }

        return -1;}
}
