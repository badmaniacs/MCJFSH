package homework.day9;

public class One {
    public static void main(String[] args) {
        Human h = new Human(); 
        h.walk();
        h.run();
        h.walk();
    }    
}
interface Runnable {
    public void run();
}
class Human implements Runnable, Speak {
    int speed = 3;
    int hp = 10;
    int Speakable = 1;

    public void chat(String chat) {
        switch (Speakable) {
            case 1:
            System.out.println(chat);
            break;
            case 2:
            System.out.println(chat+"!!!!");
            break;
            case 3:
            System.out.println("....");
            break;
        }
    }

    public void run () {
        speed = 9;
        hp--;
        System.out.printf("%d의 스피드로 달리기 시작했습니다. 남은 체력 : %d%n",this.speed,this.hp);
    }
    public void walk () {
        speed = 3;
        System.out.printf("%d의 스피드로 걷습니다%n",this.speed);
    }
    public void silent() {
        this.Speakable = 3;
    }
    public void loud() {
        this.Speakable = 2;
    }
}