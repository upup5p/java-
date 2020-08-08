package basic07;

import basic07.domin.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo04 {
    //存储学生对象并遍历
    public static void main(String[] args) {
        Student s1 = new Student("sun",20,"1");
        Student s2 = new Student("song",22,"2");
        Student s3 = new Student("shao",23,"3");
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            int age = list.get(i).getAge();
            String number = list.get(i).getNumber();
            System.out.println("姓名："+name+" 年龄："+age+" 编号："+number);
        }


    }
}
