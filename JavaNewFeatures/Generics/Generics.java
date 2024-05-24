package JavaNewFeatures.Generics;

class Points<T> {
    private T x;
    private T y;

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return this.x;
    }

    public T getY() {
        return this.y;
    }
}

public class Generics {
    public static void main(String[] args) {
        Points<Integer> p = new Points<Integer>();
        p.setX(10);
        p.setY(20);
        int x = p.getX();
        int y = p.getY();
        System.out.println("x = " + x + ", y = " + y);
    }
}
