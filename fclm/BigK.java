package fclm;

public class BigK {
    public  void px(int nums[],int k) {
        int n;
        int length = nums.length;
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int m = i; m < length; m++) {
                if (nums[i] > nums[m]) {
                    temp = nums[i];
                    nums[i] = nums[m];
                    nums[m] = temp;
                }
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.print("第"+k+"大的元素是"+nums[length-k]);

    }

    public static void main(String[] args) {
        int k=1;
        int a[]={1,5,6,7,2,1};
        BigK c=new BigK();
        c.px(a,k);
    }
}
