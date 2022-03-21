package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter your weight (kg): ");
        weight = sc.nextDouble();
        System.out.print("Enter your height (meter): ");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);
        String message = "Condition: ";
        String str = "";

        if (bmi < 18)
            str = "Underweight";
        else if (bmi < 25.0)
            str = "Normal";
        else if (bmi < 30.0)
            str = "Overweight";
        else
            str = "Obese";

        System.out.println(message + str);
        System.out.println("BMI :" + bmi);
    }
}
