package basic05;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age = 15;
        stu.name = "小王";
        System.out.println(stu.age);
        System.out.println(stu.name);
        stu.study();
        stu.goHome(null);

    }
}
