package fclm;

public class Partition {
    public int partitionArray(int[] nums, int k) {
        // write your code here
        if(nums==null||nums.length==0){
            return 0;
        }
        int left=0;
        int right=nums.length-1;
        while(left<right){
            while(left<right && nums[left]<k)
                left++;
            while(left<right&&nums[right]>=k)
                right--;
             if(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }

        }
        if (nums[left] >= k) {
            return left;
        }
        // left和right正好顺序排列，即left
        return left+1;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,5,4,8,6,7,9};
        Partition p=new Partition();
        int x=p.partitionArray(nums,4);
        System.out.println(x);

    }
}
