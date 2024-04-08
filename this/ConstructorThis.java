public class ConstructorThis {
    public static void main(String[] args) {
        Emp ea = new Emp();
        Emp eb = new Emp(2);
        Emp ec = new Emp(3, "Emp3");
        Emp ed = new Emp(4, "Emp4", 5000.0, "Boss");

        System.out.println(ea.getInfo());
        System.out.println(eb.getInfo());
        System.out.println(ec.getInfo());
        System.out.println(ed.getInfo());
    }

}

class Emp {
    private int empno;
    private String ename;
    private double sal;
    private String dept;

    public Emp() {
        this(0, "No Name", 0.0, "Uncertain");
    }

    public Emp(int empno) {
        this(empno, "Temp", 800, "Backend");
    }

    public Emp(int empno, String ename) {
        this(empno, ename, 2000.0, "Tech");
    }

    public Emp(int empno, String ename, double sal, String dept) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.dept = dept;
    }

    public String getInfo() {
        return "Emp NO: " + this.empno + ", Emp Name: " + this.ename + ", Emp Sal : " + this.sal + ", Emp Dept: "
                + this.dept;
    }

}