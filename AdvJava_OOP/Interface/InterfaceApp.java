package AdvJava_OOP.Interface;

/**
 * The USB interface defines the methods start() and stop() that must be
 * implemented by classes that implement it.
 * The Flash class implements the USB interface and provides specific
 * implementations for the start() and stop() methods related to USB
 * functionality.
 * The Print class also implements the USB interface with its own
 * implementations for start() and stop() methods related to printing
 * functionality.
 * The Computer class has a method plugin(USB usb) that takes an object
 * implementing the USB interface and calls its start() and stop() methods.
 * The InterfaceApp class demonstrates the usage of the USB interface, Flash,
 * Print, and Computer classes by creating a Computer object and plugging in
 * instances of Flash and Print.
 */
interface USB {
    public void start();

    public void stop();
}

class Flash implements USB {
    public void start() {
        System.out.println("USB start");
    }

    public void stop() {
        System.out.println("USB stop");
    }
}

class Print implements USB {
    public void start() {
        System.out.println("Print start");
    }

    public void stop() {
        System.out.println("Print stop");
    }
}

class Computer {
    public void plugin(USB usb) {
        usb.start();
        usb.stop();
    }
}

public class InterfaceApp {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.plugin(new Flash());
        com.plugin(new Print());
    }
}
