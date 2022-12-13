package main.chapter1.quack;

public class DontQuack implements QuackInterface {
    @Override
    public void quack() {
        System.out.println("<<SILENCE>>");
    }
}
