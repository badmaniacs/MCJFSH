package homework.day5;


public class lotto {
    public static void main(String[] args) {
        lottoNumber lotto = new lottoNumber();
        lotto.start();
    }
    
}

class lottoNumber {

    void start() {
    int lottoNumber[] = new int[6];
    
    for (int i = 0; i < lottoNumber.length; i++) {
        lottoNumber[i] = (int)((Math.random()*45)+1);
        for (int j = 0; j < i; j++) {
            if (lottoNumber[i] == lottoNumber[j]) {
                i--;
            }
            if (lottoNumber[i]<lottoNumber[j]) {
                int lottoNumberTemp = lottoNumber[i];
                lottoNumber[i] = lottoNumber[j];
                lottoNumber[j] = lottoNumberTemp;
            }
    }

    }
    System.out.printf("당첨번호 : ");
    for (int i = 0; i< lottoNumber.length; i++) {
        System.out.printf("%d ", lottoNumber[i]);
    }
    }
}