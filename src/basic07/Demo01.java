package basic07;

import basic07.domin.Student;

public class Demo01 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student("zhang",15,"1");
        Student s2 = new Student("li",14,"2");
        Student s3 = new Student("zhao",16,"3");
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        for (int i=0;i < arr.length;i++) {
            System.out.println(arr[i].getName()+arr[i].getAge()+arr[i].getNumber());
        }
    }
}
