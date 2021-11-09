package Encapsulation;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Student obj = new Student("Ali" , 12 , "Gulberg");

        System.out.println("Student name is : " + obj.name);
        System.out.println("Student age is : " + obj.age);
        System.out.println("Student address is : " + obj.address);
    }
}
