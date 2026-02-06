package org.example;
import java.util.ArrayList;

public class Factorizer {
    public ArrayList<Integer> factorize(int numToFactorize) {
        ArrayList<Integer> factors = new ArrayList<>();

        
        if (numToFactorize <= 1) {
            return factors;
        }

        
        int divisor = 2;
        int tempNum = numToFactorize;

        while (tempNum > 1) {
            while (tempNum % divisor == 0) {
                factors.add(divisor);
                tempNum /= divisor;
            }
            divisor++;
        }

        return factors;
    }
}
