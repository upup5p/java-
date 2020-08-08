package basic06;

import java.util.Scanner;

public class Demo10 {
    //对称字符串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String s2 = sb.reverse().toString();
        if (s.equals(s2)) {
            System.out.println("对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}
