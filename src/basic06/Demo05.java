package basic06;

import java.util.Scanner;

public class Demo05 {
    //统计字符次数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                a++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z'){
                b++;
            }else if (chars[i] >= '0' && chars[i] <= '9'){
                c++;
            }
        }
        System.out.println("共有小写字母"+a+"个"+"，大写字母"+b+"个"+"，数字"+c+"个");
    }
}
