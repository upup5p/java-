package basic03;

public class Demo04 {
    public static boolean comp(int a, int b) {
        return a == b;
    }

    public static boolean comp(byte a, byte b) {
        if (a == b) {
            System.out.println("两数相等");
            return true;
        } else {
            System.out.println("两数不等");
            return false;
        }
    }

    public static boolean comp(short a, short b) {
        if (a == b) {
            System.out.println("两数相等");
            return true;
        } else {
            System.out.println("两数不等");
            return false;
        }
    }

    public static boolean comp(long a, long b) {
        if (a == b) {
            System.out.println("两数相等");
            return true;
        } else {
            System.out.println("两数不等");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(comp(-5,-5));
    }
}
