package basic03;

import java.util.Scanner;

public class Demo01 {
    public static void spark() {
        System.out.println("spark");
    }

    public static void way(int a){
        if (a % 2 == 0){
            System.out.println("输入数字为偶数");
        }else {
            System.out.println("输入数字为奇数");
        }
    }
    public static void main(String[] args) {
        way(-5);
    }
}
