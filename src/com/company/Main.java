package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random random = new Random(100);
        ArrayList<Random> array = new ArrayList<>();
        array.add(random);
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println("tak sandar: " + i);
        }

        System.out.println("" +
                "" +
                "");

        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println("jup sandar: " + i);
        }
    }
}