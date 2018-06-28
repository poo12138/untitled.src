package fclm;

import java.util.*;
import java.lang.*;

public class Mergeinterval {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        List<Interval> list=new ArrayList<>();
        int n=intervals.size();
        if(n==0||intervals==null){
            intervals.add(newInterval);
            return intervals;
        }
        if(newInterval==null){
            return intervals;
        }
        if(newInterval.start>intervals.get(n-1).end){
            intervals.add(newInterval);
            return intervals;
        }
        Interval temp;
        int pos=0;
        for(int i=0;i<n;i++){
            temp=intervals.get(i);
            if(newInterval.start>temp.end){
             list.add(temp);
             pos++;
            }
            else if(temp.start>newInterval.end){
                list.add(temp);
            }else {
                newInterval.start=Math.min(temp.start,newInterval.start);
                newInterval.end=Math.max(temp.end,newInterval.end);
            }
        }
        list.add(pos,newInterval);
        return list;
    }
    public static void main(String[] args) {
        List<Interval> intervals=new ArrayList<>();
        Interval a=new Interval(1,2);
        Interval b=new Interval(5,9);
        Interval c=new Interval(2,5);
        Interval d=new Interval(1,3);
        Interval e=new Interval(1,3);
        intervals.add(a);
        intervals.add(b);
        Mergeinterval mg=new Mergeinterval();
        List<Interval> test=mg.insert(intervals,c);
        for(Interval i:test){
        System.out.println(i);
        }

    }

}
