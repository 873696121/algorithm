package acwing.springboot.s7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        double[] s = new double[]{4.00, 4.50, 5.00, 2.00, 1.50};
        System.out.printf("Total: R$ %.2f", s[a - 1] * b);
    }
}