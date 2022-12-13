package main.chapter1;

import main.chapter1.fly.FlyBecauseWings;
import main.chapter1.quack.Quack;

public class CrossDuck extends Duck {
    public CrossDuck() {
        quackInterface = new Quack();
        flyInterface = new FlyBecauseWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a crossduck or whatever");
    }
}
