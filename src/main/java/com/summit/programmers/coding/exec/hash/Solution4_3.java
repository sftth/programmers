package com.summit.programmers.coding.exec.hash;

import java.util.*;

public class Solution4_3 {
    public int solution(String[][]  clothes) {
        int answer = 0;

        Map<String, Integer> hashMap = new HashMap<>();
        Integer count = 0;

        for(String[] cloth : clothes) {
            if(hashMap.get(cloth[1]) == null) {
                hashMap.put(cloth[1],1);
            } else {
                count = hashMap.get(cloth[1]);
                hashMap.put(cloth[1], ++count);
            }
        }

        Set<String> keySet = hashMap.keySet();

        int multiple = 1;

        for(String s : keySet) {
            multiple *= (hashMap.get(s)+1);
        }

        answer = multiple - 1;

        return answer;
    }
}
