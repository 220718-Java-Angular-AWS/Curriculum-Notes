package test;

public class Child extends Parent{
    public void test() {
        System.out.println("child");
    }

    public void testParent() {
        super.test();
    }
}
