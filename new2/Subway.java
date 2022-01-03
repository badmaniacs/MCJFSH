package new2;

public class Subway {
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
