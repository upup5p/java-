package basic01;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //普通运算符
        Scanner input = new Scanner(System.in);
        System.out.println("please input num");
        int num = input.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        System.out.println("整数" + num + "个位：" + ge);
        System.out.println("整数" + num + "十位：" + shi);
        System.out.println("整数" + num + "百位：" + bai);
    }
}
