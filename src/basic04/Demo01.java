package basic04;

public class Demo01 {
    public static void main(String[] args) {
        //位运算符
        System.out.println( 6 & 2);
        System.out.println( 6 | 2);
        System.out.println( 6 ^ 2);
        System.out.println( 6 ^ 2 ^ 6);
        System.out.println( ~6 );
        System.out.println( 6 >> 1 );//直接操作二进制数据
        System.out.println( 6 >>> 1 );
    }
}
