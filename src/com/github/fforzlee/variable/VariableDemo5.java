package com.github.fforzlee.variable;

import java.util.Scanner;

public class VariableDemo5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int seconds2 = seconds % 3600 % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds2);
    }
}
