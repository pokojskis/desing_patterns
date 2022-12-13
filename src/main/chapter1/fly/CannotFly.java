package main.chapter1.fly;

public class CannotFly implements FlyInterface {
    @Override
    public void fly() {
        System.out.println("Sry, can't fly");
    }
}
