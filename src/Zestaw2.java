import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Contains solutions for Zestaw2.pdf
 */
public class Zestaw2 {

    public void zad1() {
        var var1 = 23.0 + 76;
        System.out.printf("23.0+76 ; type: %s%n", ((Object) var1).getClass().getSimpleName());
        var var2 = 41 * 2.0 + 3;
        System.out.printf("41*2.0+3 ; type: %s%n", ((Object) var2).getClass().getSimpleName());
        var var3 = 5 - 33;
        System.out.printf("5-33 ; type: %s%n", ((Object) var3).getClass().getSimpleName());
        var var4 = 109%3;
        System.out.printf("109%%3 ; type: %s%n", ((Object) var4).getClass().getSimpleName());
        var var5 = 50/2;
        System.out.printf("50/2 ; type: %s%n", ((Object) var5).getClass().getSimpleName());
        var var6 = 4|2;
        System.out.printf("4|2 ; type: %s%n", ((Object) var6).getClass().getSimpleName());
        var var7 = 3^5;
        System.out.printf("3^5 ; type: %s%n", ((Object) var7).getClass().getSimpleName());
        var var8 = 7&9;
        System.out.printf("7&9 ; type: %s%n", ((Object) var8).getClass().getSimpleName());
    }

    public void zad2() {
        double result1 = (Math.sqrt(7) - 1) / 2 + Math.pow(3, 3) % 2;
        int iResult1 = (int) result1;
        double result2 = 2001.0 / (19 * 12);
        int iResult2 = (int) result2;
        double result3 = 9876.0 % 50 % 4;
        int iResult3 = (int) result3;
        double result4 = (double) ("Nowak".length() % "Jacek".length() + 1) / Math.pow(2, 1.0 / 4);
    }

    public void zad3() {
        try (Scanner input = new Scanner(System.in)) {
            String word1 = input.next();
            String word2 = input.next();
            System.out.println(word1 + " " + word2);
        }
    }

    public void zad4() {
        try (Scanner input = new Scanner(System.in)) {
            double num1, num2;
            System.out.print("Enter the first number: ");
            if (input.hasNextDouble()) {
                num1 = input.nextDouble();
                input.nextLine();
            } else {
                throw new InputMismatchException("The input cannot be interpreted as a number.");
            }
            System.out.print("Enter the second number: ");
            if (input.hasNextDouble()) {
                num2 = input.nextDouble();
            } else {
                throw new InputMismatchException("The input cannot be interpreted as a number.");
            }
            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Difference: " + (num1 - num2));
            System.out.println("Product: " + (num1 * num2));
            System.out.println("Division: " + (num1 / num2));
        }
    }

    public void zad5() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer number: ");
            int num;
            if (input.hasNextInt()) {
                num = input.nextInt();
            } else {
                throw new InputMismatchException("The input cannot be interpreted as an integer number.");
            }
            System.out.println(num + 140);
            System.out.println(num -31);
            System.out.println(num * 7);
            System.out.println(num / 13);
            System.out.println(num % 7);
            System.out.println((long) num / 4);
            System.out.println(Math.pow(num, 45));
            System.out.println(num & 67);
            System.out.println(num | 59);
            System.out.println(num ^ 23);
            System.out.println(num << 5);
            System.out.println(num >> 6);
        }
    }
}
