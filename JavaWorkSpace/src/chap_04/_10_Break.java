package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        int max = 20;
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i+"번 손님 치킨");
            if (i == max){
                System.out.println("재료 소진");
                break;
            }
        }
        int index = 1;
        while (index <= 50){
            System.out.println(index + " 손님 치킨");
            if(index == max){
                System.out.println("금일 통닭 끝");
                break;
            }
            index++;
        }
        System.out.println("영업 종료");
    }

}
