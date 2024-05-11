package AdvJava_OOP.Abstract;

abstract class Action {
    // Make sure that values don't add up
    // and equal each other
    public static final int EAT = 1;
    public static final int SLEEP = 5;
    public static final int WORK = 7;

    public void command(int flag) {
        switch (flag) {
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;

            case WORK + SLEEP:
                this.sleep();
                this.work();
                break;
        }
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void work();
}

class Robot extends Action {
    public void eat() {
        System.out.println("The robot is charging!");
    }

    public void sleep() {
        // The robot does not sleep
        // so we don't need to define this method
    }

    public void work() {
        System.out.println("The robot is working!");
    }
}

class Human extends Action {
    public void eat() {
        System.out.println("The human is eating!");
    }

    public void sleep() {
        System.out.println("The human is sleeping!");
    }

    public void work() {
        System.out.println("The human is working!");
    }
}

class Pig extends Action {
    public void eat() {
        System.out.println("The pig is eating!");
    }

    public void sleep() {
        System.out.println("The pig is sleeping!");
    }

    public void work() {
        // The pig does not work so we don't need to
        // define this method
    }
}

public class AbstractTemplate {
    public static void main(String[] args) {
        fun(new Human());
        fun(new Pig());
        fun(new Robot());
    }

    public static void fun(Action act) {
        act.command(Action.EAT);
        act.command(Action.SLEEP);
        act.command(Action.WORK);
    }
}
