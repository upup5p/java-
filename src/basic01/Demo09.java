package basic01;

import java.util.Scanner;

public class Demo09 {
    //循环标号
    public static void main(String[] args) {
        gu:while (true) {
            System.out.println("请输入你想看的星期：");
            Scanner sc = new Scanner(System.in);
            int week = sc.nextInt();
            switch (week) {
                case 0:
                    System.out.println("感谢使用！");
                    break gu;//标号名
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tues");
                    break;
                case 3:
                    System.out.println("Wednes");
                    break;
                case 4:
                    System.out.println("Thurs");
                    break;
                default:
                    System.out.println("nothing");
                    break;
            }
        }
    }
}
