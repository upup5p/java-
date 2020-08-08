package basic07.domin;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String name;
    private int age;
    private String number;

    public Student(String name, int age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public Student() {
    }
}
