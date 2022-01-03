package new2;

public class animal {
    String name;
    int age;
    boolean alive = true;

    void ageUp() {
        ++age;
    }
    
    void ageDown() {
        --age;
    }
    
    void dead() {
        alive = false;
    }
}
