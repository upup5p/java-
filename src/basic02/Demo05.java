package basic02;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //查找
        int[] arr = {1,25,32,65,95,45,75,65};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据：");
        int num = sc.nextInt();
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                j = i;
                break;
            }
        }
        if (j != -1){
            System.out.println("数据索引为"+j);
        }else {
            System.out.println("数据不存在");
        }
    }
}
