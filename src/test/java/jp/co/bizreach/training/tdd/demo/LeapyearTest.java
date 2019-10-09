package jp.co.bizreach.training.tdd.demo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LeapyearTest {
    Leapyear leapyear = new Leapyear();

    @Test
    public void _2004年は閏年() {
        assertThat(leapyear.isLeap(2004), is(true));
    }

    @Test
    public void _2003年は平年() {
        assertThat(leapyear.isLeap(2003), is(false));
    }

    @Test
    public void _2100年は平年() {
        assertThat(leapyear.isLeap(2100), is(false));
    }

    @Test
    public void _2000年は閏年() {
        assertThat(leapyear.isLeap(2000), is(true));
    }
}
