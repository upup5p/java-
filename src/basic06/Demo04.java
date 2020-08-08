package basic06;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //遍历字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                System.out.print("[" + s.charAt(i)+",");
            }else if(i < s.length()-1){
                System.out.print(s.charAt(i)+",");
            }else {
                System.out.print(s.charAt(i)+"]");
            }
        }
        //法二
        char[] c = s.toCharArray();//将字符串拆分为字符数组
        for (int j = 0; j < c.length; j++) {
            System.out.println(c[j]);
        }
    }
}
