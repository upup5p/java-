package basic01;

import java.util.Random;

public class Demo10 {
    public static void main(String[] args) {
        //Random
        Random a = new Random();
        int b = a.nextInt(10)+1;
        System.out.println(b);

    }
}
