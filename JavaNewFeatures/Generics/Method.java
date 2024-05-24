package JavaNewFeatures.Generics;

public class Method {
    public static void main(String[] args) {
        String str = fun("org.apache.");
        System.out.println(str);
    }

    public static <T> T fun(T t) {
        return t;
    }
}
