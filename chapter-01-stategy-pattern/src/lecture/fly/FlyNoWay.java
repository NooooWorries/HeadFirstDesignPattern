package lecture.fly;

public class FlyNoWay implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
