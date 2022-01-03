package new2;

public class myTv {
    public static void main(String[] args) {
        TV t = new TV();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은" + t.channel + "입니다");

    }
    
}
