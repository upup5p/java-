package basic04;

public class Demo05 {
    public static void main(String[] args) {
        //二维数组求和：公司年销售额求和
        int[][] season = {{10, 0, 0}, {0, 0, 20}, {0, 0, 30}, {40, 0, 0}};
        int sum = 0;
        for (int i = 0; i < season.length; i++) {
            for (int j = 0; j < season[i].length; j++) {
                sum += season[i][j];
            }
        }
        System.out.println(sum);
    }
}
