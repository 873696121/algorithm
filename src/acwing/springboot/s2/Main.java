package acwing.springboot.s2;

import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        System.out.printf("DIFERENCA = %d", a * b - c * d);
    }
}