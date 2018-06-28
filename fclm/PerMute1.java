package fclm;

import java.util.*;

public class PerMute1 {

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(nums==null){
            return list;
         }
         if(nums.length==0){
            list.add(new ArrayList<Integer>());
            return list;
         }
        List<Integer> fuzhu=new ArrayList<Integer>();
        dfs(list,fuzhu,nums);
        return list;
    }
    public void dfs(List<List<Integer>> list,List<Integer> fuzhu,int[] nums){
        int n=nums.length;

        if(fuzhu.size()==n){

            System.out.println(fuzhu+"---");
            list.add(new ArrayList<Integer>(fuzhu));
        }

        for(int i=0;i<n;i++){
            if(fuzhu.contains(nums[i]))
            continue;
            fuzhu.add(nums[i]);
            dfs(list,fuzhu,nums);
            fuzhu.remove(fuzhu.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        PerMute1 pn=new PerMute1();
        List<List<Integer>> list=pn.permute(nums);
        System.out.println(list);
//        for(List<Integer> i:list){
//            System.out.println(i);
//        }

    }
}