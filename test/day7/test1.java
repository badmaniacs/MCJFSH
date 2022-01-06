package test.day7;
class Card {
    String kind;
    int number;

    Card() {
        this("SPADE",1);
    }
    
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }


}

class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();



        System.out.println(c1.toString());
        System.out.println(c2.toString());
        String animals = "dog,cat,bear";
        String[] arr2 = animals.split(",");
        String str = String.join("-",arr2);
        System.out.println(str);
    }
}

