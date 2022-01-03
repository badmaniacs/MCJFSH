package homework.day5;

public class Rps {
    public static void main(String[] args) {        
        Player p1 = new Player("김철수");
        Player p2 = new Player("김수철");
        p1.ready();
        p2.ready();
        System.out.printf("%s는 %s를, %s는 %s를 냈습니다",p1.name,p1.hand,p2.name,p2.hand);

        }
        
    }
    


class Player {
    String name;
    int rps;
    String hand;

    Player(String name) {
        this.name = name;
    }

    void ready() {
        rps = (int)Math.random()*3+1;
        switch(rps){
            case 1 :
            hand = "가위";
            break;
            case 2 :
            hand = "바위";
            break;
            case 3 : 
            hand = "보";
            break;
            default:
            
        } 
    }

}

