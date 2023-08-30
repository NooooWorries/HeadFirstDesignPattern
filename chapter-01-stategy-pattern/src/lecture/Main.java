package lecture;

import lecture.duck.Duck;
import lecture.duck.DuckCall;
import lecture.duck.MallardDuck;
import lecture.fly.FlyNoWay;
import lecture.fly.FlyRocketPowered;
import lecture.quack.DefaultIQuack;

public class Main {
    public static void main(String[] args) {
        mallardDuck();
        duckCall();
    }

    private static void mallardDuck() {
        // Simulate Mallard Duck
        System.out.println("===== Mallard Duck Start =====");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();

        mallardDuck.performFly();
        System.out.println("I am about to change the way I fly - with rocket!");
        mallardDuck.setFlyBehaviour(new FlyRocketPowered());
        mallardDuck.performFly();

        mallardDuck.performQuack();

        mallardDuck.swim();

        System.out.println("===== Mallard Duck End =====");
    }

    private static void duckCall() {
        System.out.println("===== Duck Call Start =====");
        DuckCall duckCall = new DuckCall(
            new FlyNoWay(),
            new DefaultIQuack()
        );
        duckCall.fly();
        duckCall.quack();
        System.out.println("===== Duck Call End =====");
    }
}
