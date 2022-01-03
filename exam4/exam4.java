package exam4;

public class exam4 {
    public static void main(String[] args) {       
        Student person1 = new Student("Mino",5000);       
        Bus bus100 = new Bus("100");       
        person1.takeBus(bus100);
        Student person2 = new Student("TaekBro",10000);
        Subway subway2 = new Subway("2");
        person2.takeSubway(subway2);        
    }        
}

class Student {
    String name;
    String grade;
    int money;

    Student(String name, int money) {
        System.out.println("*****************************");
        this.name = name;
        this.money = money;
        System.out.printf("%s님의 남은 돈은 %d원입니다.%n", this.name,this.money);               
    }

    void takeBus(Bus bus) {
        bus.take(1000);
        this.money -=1000;
        System.out.printf("%s님은 버스를 탑니다%n",this.name);
        System.out.printf("%s님의 남은 돈은 %d원입니다.%n", this.name,this.money);
        bus.showinfo();
    }
    void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -=1500;
        System.out.printf("%s님은 지하철을 탑니다%n",this.name);
        System.out.printf("%s님의 남은 돈은 %d원입니다.%n", this.name,this.money);
        subway.showinfo();
    }    
}

class Bus {
    String busNumber;
    int count;
    int money;

    Bus(String busNumber) {
        this.busNumber = busNumber;
    }

    void take(int money) {
        this.money += 1000;
        count++;        
    }

    void showinfo() {
        System.out.printf("%s번의 승객은 %d명이고, 수입은 %d원입니다.%n", this.busNumber,this.count,this.money);
    }
}

class Subway {
    String subNumber;
    int count;
    int money;

    Subway(String subNumber) {
        this.subNumber = subNumber;
    }

    void take(int money) {
        this.money += 1500;
        count++;        
    }

    void showinfo() {        
        System.out.printf("%s호선의 승객은 %d명이고, 수입은 %d원입니다.%n", this.subNumber,this.count,this.money);
    }
}
