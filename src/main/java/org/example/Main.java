package org.example;

import logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> bs = new BubbleSort<>();

        System.out.println("result: " + bs.sort(Arrays.asList(args)));
    }
}