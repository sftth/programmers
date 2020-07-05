package com.summit.programmers.coding.exercise;

import org.springframework.aop.support.DynamicMethodMatcher;

import java.util.*;

public class DynamicArray {
    public int[] solution(int[] heights) {

        List<Integer> arrayList = new ArrayList<>();

        for(int i = heights.length-1 ; i >= 0 ; i--) {
            for(int j = i ; j >= 0 ; j--) {
                if(heights[i] < heights[j]) {
                    arrayList.add(j + 1);
                    break;
                }

                if(j == 0) {
                    arrayList.add(0);
                }
            }
        }

        Collections.reverse(arrayList);

        int[] answer = new int[arrayList.size()];

        for(int i=0; i<answer.length ; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] heights = {6,9,5,7,4};

        DynamicArray dynamicArray = new DynamicArray();
        int[] answer = dynamicArray.solution(heights);

        System.out.println("{");
        for(int i = 0 ; i< answer.length ; i++){
            System.out.println(answer[i] + ",");
        }
        System.out.println("}");
    }
}
