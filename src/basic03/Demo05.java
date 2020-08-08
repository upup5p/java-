package basic03;

public class Demo05 {
    //方法参数传递
    public static int change(int num){
        num = 100;
        return num;
    }
    public static void gai(int[] arr){
        arr[1] = 100;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        change(num);
        System.out.println(num);
        System.out.println("---------");
        int[] arr = {1,2,3};
        System.out.println(arr[1]);
        gai(arr);
        System.out.println(arr[1]);
    }
}
