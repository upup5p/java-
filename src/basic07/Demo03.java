package basic07;

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        //集合存储字符串并遍历
        ArrayList<String> list = new ArrayList<>();
        list.add("h");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
