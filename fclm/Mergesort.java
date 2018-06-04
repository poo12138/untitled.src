package fclm;
import java.lang.*;
import java.util.*;

public class Mergesort {
    /**
     * array=A+B
     * sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
         int[] arr=new int[A.length+B.length];
        System.arraycopy(A, 0, arr, 0, A.length);
        System.arraycopy(B, 0, arr, A.length, B.length);
        for(int i=0;i<A.length+B.length;i++){
            System.out.print(arr[i]+",");

        }
        int[] arrays=quicksort(arr,0,A.length+B.length-1);
        return arrays;
    }
    public int[] quicksort(int[] array,int lowIndex,int highIndex) {
            int low = lowIndex;
            int high = highIndex;
            int mid;
            if (lowIndex < highIndex) {
                while (low <= high) {
                    mid = array[(lowIndex + highIndex) / 2];
                    while ((low < highIndex) && (array[low] < mid)) {
                        ++low;
                    }
                    while ((high > lowIndex) && (array[high] > mid)) {
                        --high;
                    }
                    if (low <= high) {
                        wrap(array, low, high);
                        ++low;
                        --high;
                    }
                }
                if (low < highIndex) {
                    Arrays.sort(array, low, highIndex);
                }
                if (high > lowIndex) {
                    Arrays.sort(array, lowIndex, high);
                }
            }
                return array;
        }

        // 交换数组元素
        public static void wrap(int[] array, int low, int high) {
            // TODO Auto-generated method stub
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
        }

    public static void main(String[] args) {
        int a[]={1,5,6,7,2,1};
        int b[]={1,5,5,1,7,2,21};
        Mergesort ms=new Mergesort();
        //int length=ms.mergeSortedArray(a,b).length-1;
        //int[] c=ms.quicksort(ms.mergeSortedArray(a,b),0,length);
        int[] c=ms.mergeSortedArray(a,b);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
