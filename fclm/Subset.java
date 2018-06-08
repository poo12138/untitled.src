package fclm;

import java.util.*;

public class Subset {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(nums==null){
            return list;
        }
        if(nums.length==0){
            list.add(new ArrayList<Integer>());
            return list;
        }
        Arrays.sort(nums);
        List<Integer> fuzhu=new ArrayList<>();
        //int n= nums.length;
//        for(int i=0;i<n;i++){
//            fuzhu.add(nums[i]);
//        }
        list.add(new ArrayList<>());
        dfs(list,fuzhu,nums,0);
        return list;
    }
    public void dfs(List<List<Integer>> list,List<Integer> fuzhu,int[] nums,int n){
//        if(!list.contains(fuzhu))
//        list.add(new ArrayList<Integer>(fuzhu));


//         for(int i=0;i<n;i++){
//             fuzhu.remove(i);
//             int size=fuzhu.size();
//             dfs(list,fuzhu,nums,i-1);
//             fuzhu.add(nums[i]);
//         }
        for(int i = n; i < nums.length; i ++){
            fuzhu.add(nums[i]);
            //item是以整数为元素的动态数组，而res是以数组为元素的数组，在这一步，当item增加完元素后，item所有元素构成一个完整的子串，再由res纳入
            if(!list.contains(fuzhu))

            list.add(new ArrayList<Integer>(fuzhu));
            dfs(list,fuzhu,nums,i+1);
            fuzhu.remove(fuzhu.size() - 1);
        }

    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Subset pn = new Subset();
        List<List<Integer>> list = pn.subsets(nums);
        for (List<Integer> i : list) {
            System.out.println(i);
        }
    }
}
