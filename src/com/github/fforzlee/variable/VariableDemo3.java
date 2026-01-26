package com.github.fforzlee.variable;

public class VariableDemo3 {
    static void main() {
        double weight = 95;
        double height = 1.9;
        double bmi = weight / (height * height);
        System.out.println(bmi);

        double bmis = 23.9;
        double weights = bmis * height * height;
        System.out.println(weights);
    }
}
