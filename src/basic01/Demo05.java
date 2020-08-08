package basic01;

public class Demo05 {
    public static void main(String[] args) {
        //for循环
        double num = 0;
        for (double i = 1.0; i < 6.5; i++) {
            num += i;
        }
        System.out.println(num);

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("0-100偶数和为 " + sum);
        //逢n过
        for (int i = 0; i <= 10; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            if (ge == 5 || shi == 5 || i % 5 == 0) {
                System.out.println(i);
            }
        }
        //水仙花数
            int count = 0;
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.print(i + " ");
                count++;
                if (count % 2 == 0){
                    System.out.println();
                }
            }
        }
    }

}
