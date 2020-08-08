package basic01;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //if案例
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 0 && score <= 100) {
            //合法
            if (score >= 80 && score <= 100) {
                System.out.println("获得iphone11pro max");
            } else if (score >= 60 && score <= 80) {
                System.out.println("获得iphone11pro");
            } else if (score >= 40 && score <= 60) {
                System.out.println("获得iphone11");
            } else if (score >= 0 && score <= 40) {
                System.out.println("蠢猪 想什么呢！");
            }
        } else {
            System.out.println("输入成绩有误！");
        }
    }

}
