package basic02;

public class Demo03 {
    public static void main(String[] args) {
        //数组最大值获取
        int[] arr = {1,12,52,21,14,78,35};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
