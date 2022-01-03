package new2;
import utiltest.*;

public class Parent {
    private int a = 10;
    public int b = 20;
    
}

class Child extends Parent {
    public int c = 30;
    void display() {
        System.out.println(b);
        System.out.println(c);
    }
}

class PrivateTest {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();

        c1.display();
    }
}