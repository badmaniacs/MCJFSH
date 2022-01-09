package homework.day9;

public class Three {
    public static void main(String[] args) {
        Human h = new Human(); // from One.java
        h.chat("들리세요?");
        h.loud();
        h.chat("들리세요?");
        h.silent();
        h.chat("들리세요?");
        Tiger t = new Tiger(); // from Two.java
        t.setLocation("air");
        System.out.println(t.getLocation());
    }
    
}
interface Speak {
    public void silent();

    public void loud();
}

class Tiger extends Animal {

}
