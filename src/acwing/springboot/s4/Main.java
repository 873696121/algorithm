package acwing.springboot.s4;

import java.util.Scanner;

/***********************************************************                                          *
 * Time: 2022/6/30
 * Author: HuHong
 * Desc:
 ***********************************************************/
public class Main {
    public static void main(String[] args) {
        int[] s = new int[]{100, 50, 20, 10, 5, 2, 1};
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        System.out.println(total);
        for(int i = 0; i < s.length; i ++){
            int cnt = total / s[i];
            System.out.printf("%d nota(s) de R$ %d,00\n", cnt, s[i]);
            total -= cnt * s[i];
        }
    }
}
