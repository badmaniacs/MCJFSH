package new2;

public class homework {
    public static void main(String[] args) {
        int[] arr = {100, 88, 100, 100, 90};
        int sum = 0;
        
        for ( int i : arr) {
            sum += i;
        }
        System.out.println("합계"+sum); 
        System.out.println("평균"+sum/arr.length);       
    }
    
}
