package lecture.duck;

import lecture.fly.FlyWithWings;
import lecture.quack.DefaultIQuack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new DefaultIQuack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real mallard duck!");
    }
}
