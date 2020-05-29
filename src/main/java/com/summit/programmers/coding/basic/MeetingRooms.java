package com.summit.programmers.coding.basic;

import java.util.Arrays;
import java.util.Comparator;
/*
 * Arrays.sort()
 * time complexity of O(n logn n)
 * space complexity of O(1).
 */


class Interval{
    int start;
    int end;
    Interval(){
        this.start = 0;
        this.end =0;
    }
    Interval(int s, int e){
        this.start = s;
        this.end = e;
    }

    @Override
    public String toString() {
        return start +" "+ end ;
    }
}

public class MeetingRooms {
    public boolean solve(Interval[] intervals) {
        if(intervals == null) return false;
        //1 sorting
        Arrays.stream(intervals).forEach(System.out::println);
        Arrays.sort(intervals, (a, b) -> { return a.start - b.start; });
        System.out.println("===after sort====");
        Arrays.stream(intervals).forEach(System.out::println);

        for(Interval interval : intervals) {
            if(interval.end >interval.start)
                return false;
        }

        return true;
    }
}