package new2;

public class Overload {

    String print(int a) {
        return a + "오버로딩1";
    }
    
    String print(int a, String b) {
        return a + "오버로딩2";
    }

    String print(String a, String b) {
        return "오버로딩3";
    }
}
