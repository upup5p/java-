package basic06;

public class Demo09 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(123);
        System.out.println(sb);
        sb.append("hello");
        System.out.println(sb);
        StringBuilder sb2 = sb.append("123");
        StringBuilder sb3 = sb.append("123");
        System.out.println(sb == sb2);
        System.out.println(sb2 == sb3);
        sb.append("a").append("b").append("c");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        String s = sb.toString();
        System.out.println(sb);
    }


}
