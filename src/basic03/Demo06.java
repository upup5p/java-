package basic03;

public class Demo06 {
    //数组遍历
    public  static void bian(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length-1) {
                System.out.print(arr[i] + ",");
            }else {
                System.out.println(arr[i]+"]");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,3,6,45};
        bian(arr);
    }
}
