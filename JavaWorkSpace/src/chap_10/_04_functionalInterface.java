package chap_10;

import chap_10.converter.*;

public class _04_functionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(2);
        convertUSD((USD)-> System.out.println(USD + "달러 = " + (USD * 1400) + "원 입니다."),2);
        convertible convertible =(USD)-> System.out.println(USD + "달러 = " + (USD * 1400) + "원 입니다.");
        convertUSD(convertible,1);

        //전달값이 하나도 없다면?
        convertibleWithNoParams c1 = () -> System.out.println("1달러는 1400원");
        c1.convert();
        //두 줄 이상 코드 있을 땐?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 = " + (USD * KRW) + "원 입니다.");
        };
        covertibleWithTwoParams c2 = (D,W) -> System.out.println(D + "달러 = " + (D * W) + "원 입니다.");
        c2.convert(10,1400);
        convertibleWithReturn c3 = (D,W) -> D * W;
        int result = c3.covert(20, 1400);
        System.out.println(20 + "달러 = " + result + "원 입니다.");


    }
    public static void convertUSD(convertible converter, int USD){
         converter.convert(USD);
    }
}
