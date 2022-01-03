package homework.day5;

public class Computer {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("intel",8000);
        Power power = new Power("power",5000);
        int perform = cpu.price + power.price;
        if (cpu.hasthis && power.hasthis == true) {
            System.out.println("부팅이 시작됩니다");
            System.out.printf("%s %s 시스템%n",cpu.name,power.name);
            System.out.printf("성능 : %d",perform);
        } else {
            System.out.println("에러 발생");
        }

    }    
}

class Cpu {
    boolean hasthis = false;
    int price;
    String name;

    Cpu (String name,int price) {
        this.name = name;
        this.price = price;
        this.hasthis = true;
    }
    String cpuName () {
        return this.name;
    }
}

class Power {
    boolean hasthis = false;
    int price;
    String name;

    Power (String name,int price) {
        this.name = name;
        this.price = price;
        this.hasthis = true;
    }
    String powerName () {
        return this.name;
    }    
}