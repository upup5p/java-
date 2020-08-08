package basic06;

import java.util.Scanner;

public class Demo08 {
    //切割字符串
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("，");
        stu.setName(s1[0]);
        stu.setAge(s1[1]);
        System.out.println(stu.getName()+" "+stu.getAge()+"岁");
    }
}
