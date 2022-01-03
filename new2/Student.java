package new2;

public class Student {
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
