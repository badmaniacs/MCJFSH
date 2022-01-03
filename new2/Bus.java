package new2;

public class Bus {
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
