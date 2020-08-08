package basic03;


public class Demo02 {
    //设计一个print方法用于打印n-m间所有的奇数
    public static void printt(int n,int m){
        if (n > m){
            System.out.println("输入有误，较小数在前");
            return;
            //方法的弹栈
        }
        else {
            for (int i = n; i <= m; i++) {
                if (i%2 !=0){
                    System.out.println(i);
                }
            }

        }
    }

    public static void main(String[] args) {
        printt(50,49);

    }
}
