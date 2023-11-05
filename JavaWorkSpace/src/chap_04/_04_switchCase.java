package chap_04;

public class _04_switchCase {
    public static void main(String[] args) {
        //switchCase
        int rangking = 2;
        if (rangking == 1){
            System.out.println("전액 장학금");
        } else if (rangking==2 || rangking == 3) {
            System.out.println("반액 장학금");
        }
        else{
            System.out.println("장학금 대상 아님");
        }
        //switch case 문을 이용
        switch (rangking){
            case 1:
                System.out.println("전장");
                break;
            case 2:
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("노장학금");
        }
        System.out.println("조회 완료");

        int grade = 2;
        int price = 7000;
        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;

        }
        System.out.println(grade + "동급 제품의 가격 : "+price+" 원 ");

    }

}
