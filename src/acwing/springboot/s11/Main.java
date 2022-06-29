package acwing.springboot.s11;

import java.util.Scanner;

/***********************************************************                                          *
 * Time: 2022/6/30
 * Author: HuHong
 * Desc:
 ***********************************************************/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            double s = sc.nextDouble();
            if(s > 0) {
                cnt ++;
            }
        }
        System.out.printf("%d positive numbers", cnt);
    }
}
