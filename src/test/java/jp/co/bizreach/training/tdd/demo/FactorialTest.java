package jp.co.bizreach.training.tdd.demo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    Factorial factorial = new Factorial();
    @Test
    public void _1を入力すると1が出力される() {
        assertThat(factorial.calculate(1), is(1));
    }

    @Test
    public void _2を入力すると2が出力される() {
        assertThat(factorial.calculate(2), is(2));
    }

    @Test
    public void _3を入力すると6が出力される() {
        assertThat(factorial.calculate(3), is(6));
    }

    @Test
    public void _4を入力すると24が出力される() {
        assertThat(factorial.calculate(4), is(24));
    }

    @Test
    public void _10を入力すると3628800が出力される() {
        assertThat(factorial.calculate(10), is(3628800));
    }

    @Test
    public void _0を入力するとー1が出力される() {
        assertThat(factorial.calculate(0), is(-1));
    }

    @Test
    public void _11を入力するとー1が出力される() {
        assertThat(factorial.calculate(11), is(-1));
    }
}
