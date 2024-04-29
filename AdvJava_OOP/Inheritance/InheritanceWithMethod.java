package AdvJava_OOP.Inheritance;

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

class Student extends Person {
    private String SchoolName;

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    public String getSchoolName() {
        return this.SchoolName;
    }
}

public class InheritanceWithMethod {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Bob");
        student.setAge(20);
        System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", School Name: "
                + student.getSchoolName());
    }
}
