package com.operations;

public class Power {
    public static double pow (double base, double exp) {
        double result = base;
        if (exp == 0)
            return 1;
        else if (exp < 0) {
            for (int i = 0; i >= exp; i--) {
                result = result / base;
            }
        } else {
            for (int i = 0; i < exp - 1; i++) {
                result = result * base;
            }
        }
        return result;
    }
}
