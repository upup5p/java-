package basic06;

import java.util.Scanner;

public class Demo03 {
    //用户登录
    public static void main(String[] args) {
        String name = "zhang";
        String scr = "123456";
        for (int i = 1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String n = sc.nextLine();
            System.out.println("请输入密码：");
            String m = sc.nextLine();
            if (n.equals(name) && m.equals(scr)) {
                System.out.println("登陆成功！");
                break;
            } else {
                if (i == 3) {
                    System.out.println("操作频繁，请稍后再试");
                } else {
                    System.out.println("登陆失败,还剩" + (3 - i) + "次机会");
                }
            }
        }

    }
}
