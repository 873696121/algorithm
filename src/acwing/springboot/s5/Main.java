package acwing.springboot.s5;

import java.util.Scanner;

/***********************************************************                                          *
 * Time: 2022/6/30
 * Author: HuHong
 * Desc:
 ***********************************************************/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int hours = seconds / 3600, minutes = (seconds - hours * 3600) / 60, secs = seconds - hours * 3600 - minutes * 60;
        System.out.println(hours + ":" + minutes + ":" + secs);
    }
}
