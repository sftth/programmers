package com.summit.programmers.coding.exec.hash;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class Solution4_3Test {

    @Test
    public void case1() {
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        Solution4_3 solution4_3 = new Solution4_3();

        int result = solution4_3.solution(clothes);

        assertEquals(result, 5);
    }

    @Test
    public void case2() {
        String[][] clothes = {
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}
        };

        Solution4_3 solution4_3 = new Solution4_3();

        int result = solution4_3.solution(clothes);

        assertEquals(result, 3);
    }
}