package basic01;

public class Demo02 {
    public static void main(String[] args) {
        //三元运算符
        int h1 = 210;
        int h2 = 465;
        int h3 = 305;
        int ht = h1 > h2 ? h1 : h2;
        int ht2 = ht > h3 ? ht : h3;
        System.out.println("最高为：" + ht2);
    }
}
