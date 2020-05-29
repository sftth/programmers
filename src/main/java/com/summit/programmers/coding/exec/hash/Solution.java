package com.summit.programmers.coding.exec.hash;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Solution {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        Map<String, Integer> cHashMap = new HashMap<>();

        for(String c : completion) {
            if(cHashMap.get(c) == null) {
                cHashMap.put(c, 1);
            } else {
                int cnt = cHashMap.get(c).intValue();
                cHashMap.put(c, ++cnt);
            }
        }

        int value = 0;

        for(String p : participant){
            if(null == cHashMap.get(p)) {
                answer = p;
                break;
            } else {
                value = cHashMap.get(p);

                if(value <= 0) {
                    answer = p;
                    break;
                } else {
                    answer = "";
                    Integer v = cHashMap.get(p);
                    cHashMap.put(p, --v);
                }
            }
        }
        return answer;
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";

        List<String> cList = new LinkedList<String>();

        for(String c : completion) {
            cList.add(c);
        }

        int index = -1;

        if (participant.length > 0 && participant.length <= 1000000) {
            for(String p : participant){
                if(p.length() <= 20) {
                    index = cList.indexOf(p) ;
                    if(index == -1) {
                        answer = p;
                        break;
                    } else {
                        cList.remove(index);
                    }
                }
            }
        }

        return answer;
    }
}
