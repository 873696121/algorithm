package acwing.springboot.s8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        if (d < 0 || d > 100) {
            System.out.println("Fora de intervalo");
        } else if (d <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (d <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (d <= 75) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }
    }
}