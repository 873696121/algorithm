package acwing.springboot.s3;

import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble();
        double res = Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
        System.out.printf("%.4f", res);
    }
}