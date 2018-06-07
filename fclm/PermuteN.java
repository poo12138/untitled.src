package fclm;
import java.util.*;
public class PermuteN {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null)
            return res;
        if(nums.length == 0)
        {
            res.add(new ArrayList<Integer>());

            return res;
        }

        ArrayList<Integer> list = new ArrayList<>();
        dfs(res, list, nums);
        return res;
    }

    private void dfs(List<List<Integer>> res, ArrayList<Integer> list, int[] nums) {

        int n = nums.length;
        if(list.size() == n)
        {
            res.add(new ArrayList<Integer>(list));
            return;
        }

        for(int i = 0;i < n;i++) {
            if(list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            dfs(res, list, nums);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
PermuteN pn=new PermuteN();
        List<List<Integer>> list=pn.permute(nums);
        for(List<Integer> i:list){
            System.out.println(i);
        }

    }
}