package acwing.base.a_793;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(sub(a, b));
    }

    public static boolean isBigger(String a, String b) {
        if (a.length() != b.length()) return a.length() > b.length();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return a.charAt(i) > b.charAt(i);
        }
        return true;
    }

    public static String sub(String a, String b) {
        boolean flag = !isBigger(a, b);
        if (flag) return "-" + sub(b, a);
        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();
        StringBuffer sb = new StringBuffer();
        for (int i = 0, k = 0; i < a.length(); i++) {
            k += a.charAt(i) - '0';
            if (i < b.length()) k -= b.charAt(i) - '0';
            sb.append((k % 10 + 10) % 10);
            if (k < 0) {
                k = -1;
            } else {
                k = 0;
            }
        }
        while(sb.length() > 1 && sb.charAt(sb.length() - 1) == '0') sb.deleteCharAt(sb.length() - 1);
        return sb.reverse().toString();
    }

    public static String add(String a, String b) {
        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();
        StringBuffer sb = new StringBuffer();
        for (int i = 0, k = 0; i < a.length() || i < b.length() || k > 0; i++) {
            if (i < a.length()) k += a.charAt(i) - '0';
            if (i < b.length()) k += b.charAt(i) - '0';
            sb.append(k % 10);
            k /= 10;
        }
        return sb.reverse().toString();
    }
}
