package Package;

class Single {
    private final static Single instance = new Single();

    private Single() {
    }

    public void print() {
        System.out.println("Hello");
    }

    public static Single getInstance() {
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Single test = Single.getInstance();
        test.print();
    }
}
