package basic01;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //switch语句
        Scanner num = new Scanner(System.in);
        int week = num.nextInt();
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
                //case穿透后匹配效果消失直到break或语句结束
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            default:
                System.out.println("you are wrong");
        }
    }
}
