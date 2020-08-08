package basic07;

import java.util.ArrayList;

public class Demo06 {
    //集合删除元素
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("张三");
        list.add("test");
        list.add("李四");
        list.add("test");
        list.add("test");
        list.add("王二");
        for (int i = 0; i < list.size(); i++) {
            if ("test".equals(list.get(i))){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

    }
}
