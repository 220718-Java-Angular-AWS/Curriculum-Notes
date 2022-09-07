import test.Child;
import test.Parent;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();


        parent.test();
        child.test();
        child.testParent();
    }
}
