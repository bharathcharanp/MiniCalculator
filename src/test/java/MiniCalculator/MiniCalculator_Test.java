package MiniCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiniCalculator_Test {
    private static final double DELTA = 1e-5;
    MiniCalculator_Main compute = new MiniCalculator_Main();

    @Test
    public void check_root() {
        double code_out = compute.root(25.0);
        double expected_out = 5.0;
        assertEquals(code_out, expected_out, DELTA);
    }

    @Test
    public void check_fact() {
        double code_out = compute.factorial(3);
        double expected_out = 6;
        assertEquals(code_out, expected_out, DELTA);
    }

    @Test
    public void check_log() {
        double code_out = compute.log(150);
        double expected_out = 5.0106352940963;
        assertEquals(code_out, expected_out, DELTA);
    }

    @Test
    public void check_power() {
        double code_out = compute.power(5.0, 4.0);
        double expected_out = 625.0;
        assertEquals(code_out, expected_out, DELTA);
    }
}
