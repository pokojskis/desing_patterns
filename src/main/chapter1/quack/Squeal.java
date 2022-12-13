package main.chapter1.quack;

public class Squeal implements QuackInterface {
    @Override
    public void quack() {
        System.out.println("I'm squealing!");
    }
}
