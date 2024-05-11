package AdvJava_OOP.Interface;

/**
 * An interface 'Fruit' is defined with a method 'eat'.
 * Two classes 'Apple' and 'Orange' implement the 'Fruit' interface and provide
 * their own implementation for the 'eat' method.
 * A 'Factory' class is defined with a static method 'getFruit' that returns an
 * instance of a Fruit based on the input string.
 * The 'InterfaceFactoryApp' class demonstrates the usage of the Factory class
 * to get an instance of 'Apple' and call the 'eat' method.
 */
interface Fruit {
    public void eat();
}

class Apple implements Fruit {
    public void eat() {
        System.out.println("Eating Apple");
    }
}

class Orange implements Fruit {
    public void eat() {
        System.out.println("Eating Orange");
    }
}

class Factory {
    public static Fruit getFruit(String fruit) {
        if (fruit.equals("Apple")) {
            return new Apple();
        } else if (fruit.equals("Orange")) {
            return new Orange();
        } else {
            return null;
        }
    }
}

public class InterfaceFactoryApp {
    public static void main(String[] args) {
        Fruit f = Factory.getFruit("Apple");
        f.eat();
    }
}
