package com.company;

public class Main {

    public static void main(String[] args) {
        int largest = 0;
        int smallest = 0;
        for (int n = 0; n <= 50; n++)
    {
        int value = n * (n - 30) * (n -50);
        if (value > largest)
            largest = value;
        if (value < smallest)
            smallest = value;
    }
        System.out.println("largest: " + largest);
        System.out.println("smallest: " + smallest);
}
}
