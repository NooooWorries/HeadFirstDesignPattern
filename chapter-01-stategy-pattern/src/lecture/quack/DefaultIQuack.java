package lecture.quack;

public class DefaultIQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Default Quack!");
    }
}
