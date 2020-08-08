package basic04;

public class Demo02 {
    //数据交换
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
