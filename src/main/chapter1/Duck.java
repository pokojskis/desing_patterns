package main.chapter1;

import main.chapter1.fly.FlyInterface;
import main.chapter1.quack.QuackInterface;

public abstract class Duck {
    FlyInterface flyInterface;
    QuackInterface quackInterface;

    public abstract void display();

    public void executeFly() {
        flyInterface.fly();
    }
    public void executeQuack() {
        quackInterface.quack();
    }
    public void swim() {
        System.out.println("Every duck can swim");
    }
}
