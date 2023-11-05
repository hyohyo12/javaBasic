package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean 김치찌개 = true;
        boolean 제육 = true;
        boolean 계란 = true;
        System.out.println(김치찌개 || 계란 || 제육 ); //하나라도 참이면 true
        System.out.println(김치찌개 && 계란 && 제육 ); //하나라도 거짓이면 false

        //논리 부정 연산자
        System.out.println(!true); //false
        System.out.println(!false); //true

    }
}
