package basic07;

import basic07.domin.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo05 {
    //学生信息录入
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student = getStudent();
        Student student2 = getStudent();
        Student student3 = getStudent();
        list.add(student);
        list.add(student2);
        list.add(student3);
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            int age = list.get(i).getAge();
            String number = list.get(i).getNumber();
            System.out.println("姓名："+name+" 年龄："+age+" 编号："+number);
        }

    }

    private static Student getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String s = sc.next();
        System.out.println("请输入年龄：");
        int a = sc.nextInt();
        System.out.println("请输入编号：");
        String b = sc.next();
        return new Student(s,a,b);
    }

}
