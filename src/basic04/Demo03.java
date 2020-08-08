package basic04;

public class Demo03 {
    public static void main(String[] args) {
        //反转
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0, h = arr.length-1; i < h; i++, h--) {
            int num = arr[i];
            arr[i] = arr[h];
            arr[h] = num;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }

    }
}
