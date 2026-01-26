package org.example;
import java.util.ArrayList;
public class Factorizer {
    public ArrayList<Integer> factorize(int numToFactorizeTo) {
        ArrayList<Integer> numArray = new ArrayList<>();

        for (int i = 1; i < numToFactorizeTo;i++) {
            if (numToFactorizeTo % i == 0) {
                numArray.add(i);
            }
        }
        numArray.add(numToFactorizeTo);
        return numArray;
    }
}