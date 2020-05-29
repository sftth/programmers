package com.summit.programmers.coding.exec.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
public class Solution4_4Test {

    @Test
    public void case1() {
        String[] genres ={"classic","pop","classic","classic","pop"};
        int[] plays ={500, 600, 150, 800, 2500} ;

        Solution4_4 solution4_4 = new Solution4_4();

        int[] result = solution4_4.solution(genres, plays);
        int[] answer = {4,1,3,0};

        assertEquals(result, answer);
    }
}