package basic04;

public class Demo04 {
    public static void main(String[] args) {
        //二维数组
        int[][] arr = new int[2][5];//表示2个二维数组，每个一位数组可以存5个元素
        System.out.println(arr);//二维数组地址
        System.out.println(arr[0]);//一位数组地址
        System.out.println(arr[0][1]);//一位数组元素
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        arr[0] = arr1;
        System.out.println(arr[0][5]);
        int[][] arr2 = new int[][]{{10, 20}, {11, 22}};
        int[][] arr3 = {{10, 20}, {30,40}};
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
