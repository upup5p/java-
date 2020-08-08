package basic07;

import basic07.domin.Student;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();//通过范型指定存储数据类型
        ArrayList list1 = new ArrayList();
        list1.add(13);
        list1.add("123");
        list1.add(false);
        list1.add(1,"a");
        System.out.println(list1);
        boolean b = list1.remove("123");//一般直接删除无需返回值
        Object remove = list1.remove(0);
        System.out.println(b);
        System.out.println(remove);
        list1.set(1,"hello");
        System.out.println(list1);
        Object o1 = list1.get(0);
        System.out.println(o1);
        System.out.println(list1.size());

    }
}
