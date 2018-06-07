package fclm;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list_ = new ArrayList<Integer>();
        list_.add(1);
        list_.add(1);
        list_.add(2);
        list_.add(4);
        List<Integer> list1_ = new ArrayList<Integer>();
        list1_.add(1);
        list1_.add(1);
        list1_.add(2);

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add( 0,list_);
        list.add( 1,list_);
        list.add(2, list_);
        list.add(2, list1_);
//        list.add(2, list_);
//        list.add(3, list_);

        for (List<Integer> i : list) {

            System.out.println(i);
        }
    }
}
