package basic06;

import java.util.Scanner;

public class Demo06 {
    //手机号屏蔽
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars.length == 11) {
                for (int j = 3; j < 7; j++) {
                    chars[j] = '*';
                }
                System.out.println(chars);
                break;
            } else {
                System.out.println("手机号输入错误");
                break;
            }
        }

        //截取字符串 substring
        String num = "helloworld";
        String num1 = num.substring(1);//(1,3) begin endIndex
        System.out.println(num1);
    }
}
