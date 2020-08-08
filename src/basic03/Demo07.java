package basic03;

public class Demo07 {
    //获取数组最大值
    public static int[] getResult(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (min > arr[j]){
                min = arr[j];
            }
        }

        int[] result = {max,min};
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,5,116,4,50,5,25};
        int[] result = getResult(arr);
        int a = result[0];
        int b = result[1];
        System.out.println("数组中最大值和最小值为:"+a+"和"+b);
    }
}
