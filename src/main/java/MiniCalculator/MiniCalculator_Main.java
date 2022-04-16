package MiniCalculator;

import java.lang.Math;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class MiniCalculator_Main {
    private static final Logger logger = LogManager.getLogger(MiniCalculator_Main.class);

    public MiniCalculator_Main() {
    }

    public static void main(String[] args) {
        try {
            MiniCalculator_Main compute = new MiniCalculator_Main();
            Scanner scanner = new Scanner(System.in);
            System.out.println("To find the square root, press 1.\n" +
                    "To acquire factorial information, press 2.\n" +
                    "To acquire the natural logarithm, press 3.\n" +
                    "To activate the power function, press 4.");
            int feed = scanner.nextInt();

            if (feed == 1) {
                System.out.println("Type a numerical");
                System.out.println("Output : " + compute.root(scanner.nextDouble()));
            } else if (feed == 3) {
                System.out.println("Type a numerical");
                System.out.println("Output : " + compute.log(scanner.nextDouble()));
            } else if (feed == 2) {
                System.out.println("Type a numerical");
                System.out.println("Output : " + compute.factorial(scanner.nextInt()));
            } else if (feed == 4) {
                System.out.println("Type a numerical");
                System.out.println("Output : " + compute.power(scanner.nextDouble(), scanner.nextDouble()));
            } else
                System.out.println("Invalid operation!");
        } catch (InputMismatchException error) {
            System.out.println("Invalid feed!");
            logger.error("Invalid feed!");
            return;
        }
    }
    public double root(double val_x) {
        logger.info("[ROOT] - " + val_x);
        double root_val = Math.sqrt(val_x);
        logger.info("[RESULT - ROOT] - " + root_val);
        return root_val;
    }

    public double factorial(int val_x) {
        logger.info("[FACTORIAL] - " + val_x);
        if (val_x < 0)
            return Double.NaN;
        double factorial_value = 1;
        int t = 1;
        while (t <= val_x) {
            factorial_value = factorial_value * t;
            t += 1;
        }
        logger.info("[RESULT - FACTORIAL] - " + factorial_value);
        return factorial_value;
    }

    public double log(double val_x) {
        logger.info("[LOG] - " + val_x);
        double log_ans = Math.log(val_x);
        logger.info("[RESULT - LOG] - " + log_ans);
        return log_ans;
    }

    public double power(double val_x, double val_y) {
        logger.info("[POWER] - " + val_x + ", " + val_y);
        double power_val = Math.pow(val_x, val_y);
        logger.info("[RESULT - POWER] - " + power_val);
        return power_val;
    }
}
