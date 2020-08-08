package basic06;

public class Demo02 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);
        char[] c = {'a', 'b', 'c'};
        String s2 = new String(c);//根据字符数组内容创建字符串对象
        System.out.println(s2);
        String s3 = new String("123");//根据传入字符内容创建对象，此处创建了两个对象
        System.out.println(s3);
        String s4 = s3 + "a";
        String s5 = "123a";
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));//忽略大小写
        boolean b = s4 == s5;
        System.out.println(b);
    }
}
