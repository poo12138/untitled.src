package fclm;
import java.util.*;
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        //用来存放nums前n-1个数
        int[] array=null;
        //n表示nums数组的最后一个数
        int n = 0;
        //array数组的长度
        int array_len = nums.length-1;
        List<Integer> num = new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums==null||nums.length==0){
            list.add(num);
            return list;
        }
        //当只有一个数时，输出这个排列
        if(nums.length==1){
            num.add(nums[0]);
            list.add(num);
            return list;
        }else{
            //将这n个数的前n-1个数存到array数组中
            array = new int[array_len];
            for(int i = 0;i<array_len;i++){
                array[i]=nums[i];
            }
            //递归调用函数返回全排列的List
            list = permute(array);
            //size表示第n个数插入前list的大小
            int size = list.size();

            //对list中的每一个排列构造全排列
            for(int j=0;j<size;j++){
                //num表示list中的一个排列
                num = list.get(j);

                //num_size表示list的一个排列也就是num的大小
                int num_size = num.size();
                //将第n个数插入到前n-1个数的各个不同的位置，从0到num_size
                for(int k = 0;k<=num_size;k++){
                    //不能直接赋值，否则temp是num的引用，对temp的操作也就是对num的操作
                    List<Integer> temp  = new ArrayList<Integer>(num);
                    // List<Integer> temp  = new ArrayList<Integer>();
                    //temp.addAll(num);
                    n = nums[array_len];

                    temp.add(k,n);

                    list.add(temp);
                }


            }
            //第n个数插入到前n-1个排列之后够成n个数的全排列，要移除插入前的排列，每次移除首位
            for (int i = 0; i < size; i++) {
                list.remove(0);
            }
            for (List<Integer> i : list) {

                System.out.println(i);
            }
            return list;

        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};

        Permute m=new Permute();
        m.permute(nums);

       // list.add();
//        for(int i =0 ; i < list.size(); i ++ ){
//            System.out.println(list.get(i));
//        }
   }
}

