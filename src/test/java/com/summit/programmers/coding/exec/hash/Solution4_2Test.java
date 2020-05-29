package com.summit.programmers.coding.exec.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertFalse;


@RunWith(SpringRunner.class)
public class Solution4_2Test {

    @Test
    public void case1(){
        String[] phone_book = {"119", "97674223", "1195524421"};

        Solution4_2 solution4_2 = new Solution4_2();

        boolean result = solution4_2.solution(phone_book);

        assertFalse( result );
    }

}