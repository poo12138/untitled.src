package fclm;

import java.util.*;

public class Permute_ {

    //非递归
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if ( nums == null)
            return res;
        if( nums.length == 0)
        {
            res.add(new ArrayList<Integer>());
            return res;
        }
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        res.add(new ArrayList<Integer>(list));

        for(int i=1;i<nums.length;i++) {
            int size1 = res.size();
            for(int j=0;j<size1;j++) {
                int size2 = res.get(0).size();
                for(int k=0;k<=size2;k++) {
                    ArrayList<Integer> temp = new ArrayList<>(res.get(0));
                    temp.add(k,nums[i]);
                    if(res.contains(temp))
                        continue;;
                    res.add(temp);
                }
                res.remove(0);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        Permute_ pn=new Permute_();
        List<List<Integer>> list=pn.permute(nums);
        for(List<Integer> i:list){
            System.out.println(i);
        }

    }
}
