package lab2;
/*
 * C5 = 2; C=A+B
 * C7 = 1; byte
 * С11 = 6; Обчислити суму найбільших елементів в стовпцях матриці з парними номерами та найменших елементів в стовпцях матриці
 * з непарними номерами
 */

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть кількість рядків А: ");
        int n = in.nextInt();
        System.out.print("Введіть кількість стовпців А: ");
        int m = in.nextInt();
        byte[][] A = new byte[n][m];
        System.out.println("Введіть елементи матриці А по порядку :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = in.nextByte();
            }
        }
        System.out.print("Введіть кількість рядків матриці В: ");
        int k = in.nextInt();
        System.out.print("Введіть кількість стовпців В: ");
        int t = in.nextInt();
        byte[][] B = new byte[n][m];
        System.out.println("Введіть елементи матриці В по порядку :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = in.nextByte();
            }
        }
        System.out.println("Матриця А: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Матрица В: ");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
        byte[][] C = new byte[n][m];
        if (n == k && m == t) {
            System.out.println("Матриця C: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    C[i][j] = (byte) (A[i][j] + B[i][j]);
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Матриці не мають однакової розмірності");
        }
        byte suma = 0;
        for (int i = 0; i < m; i++) {
            byte zmin = C[0][i];
            if (i % 2 == 0) {
                for (int j = 1; j < n; j++) {
                    if (C[j][i] < zmin) {
                        zmin = C[j][i];
                    }
                }
            } else {
                for (int j = 1; j < n; j++) {
                    if (C[j][i] > zmin) {
                        zmin = C[j][i];
                    }
                }
            }
            suma += zmin;
        }
        System.out.println("Остаточна сума - " + suma);
    }
}

