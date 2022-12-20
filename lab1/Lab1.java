package lab1;
/*
 * C2 = 1; O1 = -
 * C3 = 1;
 * C5 = 2; O2 = %
 * C7 = 1; short
 */

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        System.out.println("\n" +
                "Enter the data values, the data values \u200B\u200B\"a\" and \"b\" must be between -32768 and 32767, and the values \u200B\u200B\"n > a, m > b\"\n");


        double C = 1;
        short a, n, m, b;
        double S = 0;
        boolean counterWhile = true;
        boolean counterResult = false;
        while (counterWhile) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a:");
            a = sc.nextShort();
            System.out.println("Enter n:");
            n = sc.nextShort();
            System.out.println("Enter m:");
            m = sc.nextShort();
            System.out.println("Enter b:");
            b = sc.nextShort();
            S = 0;
            if (a >= n || b >= m) {
                System.out.println("Logical error in data entry, please try again");
                continue;
            } else {
                for (short i = a; i <= n; i++) {
                    for (short j = b; j <= m; j++) {

                        if (j != 0 && (i - C) != 0) {

                            S += (i / j) / (i - C);
                        } else {
                            System.out.println("Error division to 0 , please try again");
                            counterResult = true;
                            break;
                        }
                    }
                }
            }
            if (!counterResult) {
                System.out.println("S = " + S);
                counterWhile = false;
            }
            counterResult = false;
        }
    }
}
