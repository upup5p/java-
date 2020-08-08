package basic06;

public class Demo11 {
    //拼接字符串
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4};
        String s = arrtostr(arr);
        System.out.println(s);
    }

    public static String arrtostr(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }
}
