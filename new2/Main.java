package new2;

public class Main {
    public static void main(String[] args) {
       
        Student person1 = new Student("Mino",5000);       
        Bus bus100 = new Bus("100");       
        person1.takeBus(bus100);

        Student person2 = new Student("TaekBro",10000);
        Subway subway2 = new Subway("2");
        person2.takeSubway(subway2);
        

    }
    
}
