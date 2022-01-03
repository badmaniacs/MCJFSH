package tkdthr;

public class tkdthr {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();
        ch.display("오버로딩된 display()메소드");
    }
    
}

class Parent {
    void display() {
        System.out.println("부모 클래스의 display()메소드");

    }
}

class Child extends Parent {
    void display() {
        System.out.println("자식 클래스의 display()메소드");
    }

    void display(String str) {
        System.out.println(str);
    }
}

