package basic06;

import java.util.Scanner;

public class Demo07 {
    //敏感词替换
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.replace("tmd","***"));
    }
}
