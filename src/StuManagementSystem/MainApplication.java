package StuManagementSystem;

import StuManagementSystem.domin.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        while (true) {
            System.out.println("---欢迎来到学生管理系统---");
            System.out.println("1 增加学生信息");
            System.out.println("2 查找学生信息");
            System.out.println("3 删除学生信息");
            System.out.println("4 修改学生信息");
            System.out.println("5 退出系统");
            System.out.println("请输入指令：");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            ArrayList<Student> list = new ArrayList<>();
            if (a == 1) {
                Student student = addStu();
                list.add(student);
                System.out.println("添加成功");
            }
            if (a == 2) {
                ArrayList<Student> list1 = seeStu(list);
                for (int i = 0; i < list1.size(); i++) {
                    Student student = list1.get(i);
                    System.out.println("姓名："+student.getName()+" 年龄："+student.getAge()+" 班级："+student.getClas());
                }
            }
            if (a == 3) {
                deStu(list);
            }
            if (a == 4) {
                chStu(list);
            }
            if (a == 5) {
                System.out.println("感谢使用！");
                break;
            }
        }
    }

    //增加学生信息
    public static Student addStu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入班级：");
        String clas = sc.next();
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setClas(clas);
        System.out.println("添加成功!");
        return s;
    }

    //删除学生信息
    public static ArrayList<Student> deStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        ArrayList<Student> newlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student s = new Student();
            s = list.get(i);
            if (name.equals(s.getName())) {
                System.out.println(name + "来自" + s.getClas() + ",今年" + s.getAge() + "岁");
                System.out.println("确认删除请按1");
                int a = sc.nextInt();
                if (a == 1) {
                    list.remove(i);
                    System.out.println("删除成功！");
                }
            } else {
                newlist.add(s);
            }
        }
        return newlist;
    }

    //查找学生信息
    public static ArrayList<Student> seeStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> newlist = new ArrayList<>();
        System.out.println("1 根据姓名查找");
        System.out.println("2 根据年龄查找");
        System.out.println("3 根据班级查找");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("请输入姓名：");
            String name = sc.next();
            for (int i = 0; i < list.size(); i++) {
                if (name.equals(list.get(i).getName())) {
                    newlist.add(list.get(i));
                }
            }
            return newlist;
        } else if (a == 2) {
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            for (int i = 0; i < list.size(); i++) {
                if (age == list.get(i).getAge()) {
                    newlist.add(list.get(i));
                }
            }
            return newlist;
        } else if (a == 3) {
            System.out.println("请输入班级：");
            String clas = sc.next();
            for (int i = 0; i < list.size(); i++) {
                if (clas.equals(list.get(i).getClas())) {
                    newlist.add(list.get(i));
                }
            }
            return newlist;
        } else {
            System.out.println("操作有误请重试");
            return null;
        }
    }

    //修改学生数据
    public static ArrayList<Student> chStu(ArrayList<Student> list) {
        System.out.println("可修改对象如下：");
        Student s = new Student();
        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            String name = s.getName();
            int age = s.getAge();
            String clas = s.getClas();
            System.out.println((i + 1) + ".姓名：" + name + " 年龄：" + age + " 班级：" + clas);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择修改对象：");
        int a = sc.nextInt();
        System.out.println("请选择需要修改的部分：1姓名 2年龄 3班级");
        int b = sc.nextInt();
        if (b == 1) {
            System.out.println("请输入修改名：");
            String name = sc.next();
            s = list.get(a - 1);
            s.setName(name);
            Student student = s;
            list.set(a - 1, student);
        } else if (b == 2) {
            System.out.println("请输入修改年龄：");
            int age = sc.nextInt();
            s = list.get(a - 1);
            s.setAge(age);
            Student student = s;
            list.set(a - 1, student);
        } else if (b == 3) {
            System.out.println("请输入修改班级：");
            String clas = sc.next();
            s = list.get(a - 1);
            s.setClas(clas);
            Student student = s;
            list.set(a - 1, student);
        } else {
            System.out.println("输入错误请重试");
        }
        return list;
    }

}
