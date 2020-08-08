package basic02;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        //评委打分：6评委去最高最低其余和除以4
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        double ave = 0.0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个分数");
            int score = sc.nextInt();
            if (0 <= score && score <= 100) {
                arr[i] = score;
            }else {
                System.out.println("分数不符合规范！");
                i--;
            }
        }
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (max <= arr[j]){
                max = arr[j];
            }
        }
        int min = arr[0];
        for (int k = 1; k < arr.length; k++) {
            if (max <= arr[k]){
                max = arr[k];
            }
        }
        for (int l = 0; l < arr.length; l++) {
            sum += arr[l];
        }
        ave =(sum-max-min) / 4;
        System.out.println("最后得分为" + ave);
    }
}
