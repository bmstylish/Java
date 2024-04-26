package Simple_Java_OOP.PassByValue;

public class PassbyValueApp {
    public static void main(String[] args) {
        Member m = new Member(1, "TestName");
        Car c = new Car("TestCar");

        m.setCar(c);
        c.setMember(m);

        System.out.println(m.getCar().getInfo()); // Getting Car info from Member
        System.out.println(c.getMember().getInfo()); // Gettting Member info from Car

    }
}

class Member {
    private int mid;
    private String name;
    private Car car;

    public Member(int mid, String name) {
        this.mid = mid;
        this.name = name;
    };

    public void setCar(Car car) {
        this.car = car;
    };

    public Car getCar() {
        return this.car;
    };

    public String getInfo() {
        return "ID: " + this.mid + ", Name: " + this.name;
    };

};

class Car {
    private Member member;
    private String cName;

    public Car(String cName) {
        this.cName = cName;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Member getMember() {
        return this.member;
    }

    public String getInfo() {
        return "Car: " + this.cName;
    }
};
