package PassByValue;

public class PassbyValueAppTwo {
    public static void main(String[] args) {
        Member m = new Member(1, "TestName");
        Member chd = new Member(2, "TestNameChild");
        Car c = new Car("TestCar");
        Car cc = new Car("TestNameChildCar");

        m.setCar(c);
        c.setMember(m);
        chd.setCar(cc);
        cc.setMember(chd);
        m.setChild(chd);

        System.out.println(m.getCar().getInfo()); // Getting Car info from Member
        System.out.println(c.getMember().getInfo()); // Gettting Member info from Car
        System.out.println(m.getChild().getInfo());
        System.out.println(m.getChild().getCar().getInfo());
    }
}

class Member {
    private int mid;
    private String name;
    private Car car;
    private Member child;

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

    public void setChild(Member child) {
        this.child = child;
    }

    public Member getChild() {
        return this.child;
    }

    public String getInfo() {
        return "ID: " + this.mid + ", Name: " + this.name;
    };

}

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

}