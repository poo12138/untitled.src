package fclm;

import java.util.*;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer,
 *     // rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds,
 *     // if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds,
 *     // if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class ListFlatten {
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> list = new ArrayList<Integer>();
        doFlatten(nestedList, list);
        return list;
    }

    public void doFlatten(List<NestedInteger> nestedList, List<Integer> list) {
        if (nestedList != null)
            for (NestedInteger t : nestedList) {
                if (t.isInteger())
                    list.add(t.getInteger());
                else
                    doFlatten(t.getList(), list);
            }


    }
}

//  public List<Integer> flatten(List<NestedInteger> nestedList) {
//        boolean isFlat = true;
//        List<NestedInteger> ls = nestedList;
//        while (isFlat) {
//            isFlat = false;
//            List<NestedInteger> newLs = new ArrayList<>();
//            for (NestedInteger ni : ls) {
//                if (ni.isInteger()) {
//                    newLs.add(ni);
//                } else {
//                    newLs.addAll(ni.getList());
//                    isFlat = true;
//                }
//            }
//            ls = newLs;
//        }
//        List<Integer> r = new ArrayList<>();
//        for (NestedInteger ni : ls) {
//            r.add(ni.getInteger());
//        }
//        return r;
//    }
//}
