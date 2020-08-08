package basic01;

public class Demo08 {
    //跳转控制语句
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i >= 5) {
                continue;
            }
            //类似方法
//            if (i == 5) {
//                break;
//            }
            System.out.println(i + "楼到了");
        }

    }
}
