package com.summit.programmers.coding.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
public class MeetingRoomsTest {

    @Test
    public void case1() {

        Interval[] intervals = {
                new Interval(15,20),
                new Interval(5,10),
                new Interval(0,30)};

        MeetingRooms a = new MeetingRooms();
        boolean result = a.solve(intervals);

        assertFalse( result );
    }

}