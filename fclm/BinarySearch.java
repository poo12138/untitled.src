package fclm;

public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;
        while(low<=high) {
            mid = (low + high) / 2;
            if (nums[mid]==target){
            while (mid>0&&nums[mid-1]==target) {
                mid--;
            }
                 return mid;
            }
             //if (nums[mid]==target) { return mid;}
             if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {

                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 10};
        BinarySearch bs=new BinarySearch();
        System.out.println("循环查找：" + (bs.binarySearch(arr, 3) ));

        }
}
