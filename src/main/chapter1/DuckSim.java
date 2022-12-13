package main.chapter1;

public class DuckSim {
    public static void main(String[] args) {
        Duck wildDuck = new CrossDuck();
        wildDuck.executeFly();
        wildDuck.executeQuack();
    }
}
