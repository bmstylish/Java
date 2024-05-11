package AdvJava_OOP.Interface;

interface Network {
    public void browse();
}

class Real implements Network {
    public void browse() {
        System.out.println("Real Network");
    }
}

class Proxy implements Network {
    private Network network;

    public Proxy(Network network) {
        this.network = network;
    }

    public void check() {
        System.out.println("Checking Proxy");
    }

    public void browse() {
        this.check();
        this.network.browse();
    }
}

public class ProxyApp {
    public static void main(String[] args) {
        Network net = null;
        net = new Proxy(new Real());
        net.browse();
    }
}

class Book {
}

class Book extends Object {
}