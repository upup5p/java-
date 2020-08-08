package basic02;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //数组元素求和
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] shuzu = new int[5];
        for (int i = 0; i < shuzu.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数字");
            shuzu[i]=sc.nextInt();
        }
        for (int j = 0; j < shuzu.length; j++) {
            sum += shuzu[j];
        }
        System.out.println("数字之和是"+sum);
    }
}
