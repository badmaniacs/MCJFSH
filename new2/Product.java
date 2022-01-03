package new2;

public class Product {
    String color;
    boolean motor = false;
    int width;
    int height;
    int depth;
    int price;

    Product(){
        
        System.out.println("This is consturct func");
       
    }
    
    Product(int price, String color){
        this(price, true, color);
        System.out.println("This is consturct func");
        this.price = price;
        this.color = color;


        System.out.println("이 오토바이의 가격은" + this.price);
        System.out.println("이 오토바이의 색상은 " + color);}

    Product(int price, boolean motor, String color){
        System.out.println("This is consturct func");
        this.price = price;
        this.motor = motor;
        this.color = color;

        System.out.println("이 오토바이의 가격은" + this.price);
        System.out.println("이 오토바이의 색상은 " + color);    

    }

    void motorOn() {
        this.motor = true;
        System.out.println(this.motor);
    }

    void motorOff() {
        this.motor = false;
        System.out.println(this.motor);
    }

    boolean motorOnOff(){
        this.motor = !this.motor;
        System.out.println(this.motor);
        return this.motor;
    }

    int setPrice(int price) {
        this.price = price;
        System.out.println(this.price);
        return this.price;

    }
}
