package com.summit.programmers.coding.exec.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class SolutionTest {

    @Test
    public void solutionTest1() {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};

        Solution solution = new Solution();

        String result = solution.solution(participant1, completion1);

        assertEquals(result,"leo");
    }

    @Test
    public void solutionTest2() {
        String[] participant1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion1 = {"josipa", "filipa", "marina", "nikola"};

        Solution solution = new Solution();

        String result = solution.solution(participant1, completion1);

        assertEquals(result,"vinko");
    }

    @Test
    public void solutionTest3() {
        String[] participant1 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion1 = {"stanko", "ana", "mislav"};

        Solution solution = new Solution();

        String result = solution.solution(participant1, completion1);

        assertEquals(result,"mislav");
    }

    @Test
    public void solutionTest4() {
        String[] participant1 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion1 = {"stanko", "mislav", "mislav"};

        Solution solution = new Solution();

        String result = solution.solution(participant1, completion1);

        assertEquals(result,"ana");
    }

    @Test
    public void solutionTest5() {
        String[] participant1 = {"mislav", "mislav", "mislav", "ana"};
        String[] completion1 = {"mislav", "mislav", "mislav"};

        Solution solution = new Solution();

        String result = solution.solution(participant1, completion1);

        assertEquals(result,"ana");
    }

    @Test
    public void solutionTest6() {
        String[] participant1 = {"mislav", "mislav", "mislav", "mislav"};
        String[] completion1 = {"mislav", "mislav", "mislav"};

        Solution solution = new Solution();

        String result = solution.solution(participant1, completion1);

        assertEquals(result,"mislav");
    }
}