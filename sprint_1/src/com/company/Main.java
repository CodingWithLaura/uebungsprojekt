package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vars = new int[6];
        System.out.println("Enter " + vars.length + " vars: ");
        float total = 0;
        for (int i = 0; i < vars.length; i++) {
            vars[i] = in.nextInt();
            total = total + vars[i];
        }
        float average = total/vars.length;
        System.out.println("The mean value of your input is: " + average);
    }
}
