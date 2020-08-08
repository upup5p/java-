package basic05;

public class Student {
    String name;
    int age;
    int xuehao;
    public void goToSchool(){
        System.out.println("去学校了");
    }
    public void study(){
        System.out.println("上课了");
    }
    public void goHome(String bell){
        if (bell != null){
        System.out.println("回家了");}
        else{
            System.out.println("还没下课");
        }
    }
}
