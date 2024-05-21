package Package;

class Sex {
    private String title;
    private static final Sex MALE = new Sex("Male");
    private static final Sex FEMALE = new Sex("Female");

    private Sex(String title) {
        this.title = title;
    }

    public String toString() {
        return this.title;
    }

    public static Sex getInstance(int ch) {
        switch (ch) {
            case 1:
                return MALE;
            case 2:
                return FEMALE;
            default:
                return null;
        }
    }
}

interface Choose {
    public int MAN = 1;
    public int WOMAN = 2;
}

public class MultiTon {
    public static void main(String[] args) {
        Sex sex = Sex.getInstance(Choose.MAN);
        System.out.println(sex);
    }
}
