package lecture.duck;

import lecture.fly.IFlyBehaviour;
import lecture.quack.IQuackBehaviour;

// Brain Power: Implement a Duck call without implementing Duck super class
public class DuckCall {
    IFlyBehaviour flyBehaviour;
    IQuackBehaviour quackBehaviour;

    public DuckCall(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public void quack() {
        quackBehaviour.quack();
    }
}
