package new2;

public class Inheritance {
    public static void main(String[] args) {
        Mother mother1 = new Mother();
        Son son1 = new Son();
        
    }    
}

class Mother {
    int motherAge = 50;
    String hometown = "경상도";
    boolean isMarried = true;
    String bloodType = "O";

    public Mother() {
        System.out.println("Welcome ot super class");
    }
}

class Son extends Mother {
    int sonAge = 23;
    String hometown = "서울";

    public Son() {
        System.out.println("welcome to sub class");
    }

    public void printMotherAge() {
        System.out.println("Mother's Age : " + super.motherAge);
    }

    public String getBloodType(){
        return this.bloodType;
    }

    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
}