package fclm;

public class Merge {
    Merge a;

    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int length=A.length + B.length;
        if(A.length<=0){
            return B;
        }
        if(B.length<=0){
            return A;
        }
        int arr[] = new int[A.length + B.length];
        int i=0;
        int k=0;
        int j=0;
        while (i < A.length && j < B.length)
        {
            if (A[i] > B[j])
            {
                arr[k++] = B[j++];

            } else
            {
                arr[k++] = A[i++];
            }
        }
        while (i < A.length)
        {
            arr[k++] = A[i++];
        }
        while (j < B.length)
        {
            arr[k++] = B[j++];
        }

        return arr;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={2,4,6,8,8,9};
        Merge ms=new Merge();

        int c[]=ms.mergeSortedArray(a,b);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
