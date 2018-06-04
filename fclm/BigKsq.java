package fclm;

public class BigKsq {
    public int kthLargestElement(int k, int[] nums) {
        // write your code here
        if(k>nums.length){
            return 0;
        }
        int start=0;
        int end=nums.length-1;
        int index=partition(nums, 0, nums.length-1);
        while(index!=nums.length-k){
            if(index>nums.length-k){
                index=partition(nums, start, index-1);
            }else{
                index=partition(nums, index+1, end);
            }
        }
        return nums[index];
    }
    private static int partition(int []nums,int start,int end){
        int left=start;
        int right=end;
        int pivot=nums[start];
        while(left<right){
            while(left<right&&nums[right]>=pivot)
                right--;
            if(left<right){
                nums[left]=nums[right];
                left++;
            }
            while(left<right&&nums[left]<pivot)
                left++;
            if(left<right){
                nums[right]=nums[left];
                right--;
            }
        }

        nums[left]=pivot;
        for(int m:nums){
            System.out.print(m);
        }
        return left;
    }
    public static void main(String[] args) {
        int a[]={1,5,6,7,2,1};
        BigKsq c=new BigKsq();
        int x=c.kthLargestElement(1,a);
       // System.out.println(x);
    }
}

