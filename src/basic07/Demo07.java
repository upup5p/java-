package basic07;

import basic07.domin.Student;

import java.util.ArrayList;

public class Demo07 {
    //集合元素筛选
    public static void main(String[] args) {
        Student stu1 = new Student("bob", 15, "1");
        Student stu2 = new Student("tom", 12, "2");
        Student stu3 = new Student("jimi", 19, "3");
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        ArrayList<Student> ele = getEle(list);
        System.out.print("青少年为：");
        for (int i = 0; i < ele.size(); i++) {
            String name = ele.get(i).getName();
            if (i  == ele.size()-1){
                System.out.println(name+"。");
            }else {
                System.out.print(name+"，");
            }
        }

    }

    public static ArrayList<Student> getEle(ArrayList<Student> list) {
        ArrayList<Student> nlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getAge() <= 18) {
                nlist.add(s);
            }
        }
        return nlist;
    }
}
