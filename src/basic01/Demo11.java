package basic01;

import java.util.Random;
import java.util.Scanner;

public class Demo11 {
    //猜数字
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int a = r.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入猜测数字:");
            int num = sc.nextInt();

            if (num > a) {
                System.out.println("太大了");

            } else if (num < a) {
                System.out.println("太小了");

            } else {
                System.out.println("猜对了");
                break;
            }
            System.out.println("谢谢参与！");
        }
    }
}
