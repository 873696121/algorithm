package acwing.springboot.s6;

import java.util.Scanner;

/***********************************************************                                          *
 * Time: 2022/6/30
 * Author: HuHong
 * Desc:
 ***********************************************************/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a % b == 0 || b % a == 0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");
    }
}
