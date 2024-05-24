package JavaNewFeatures.Generics;

interface A<T> {
    public void print(T t);
}

class B<S> implements A<S> {
    public void print(S t) {
        System.out.println(t);
    }
}

class C implements A<String> {
    public void print(String t) {
        System.out.println(t);
    }
}

public class Interface {

}
