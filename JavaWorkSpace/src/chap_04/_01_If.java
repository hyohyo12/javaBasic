package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 If
        int hour = 12;
        if (hour<14){
            System.out.println("아이스 아메리카노 +1");
        }
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");
        boolean morningCoffee = false;
        if (hour < 14 && !morningCoffee){
            System.out.println("아아+1");
        }
        morningCoffee = true;
        if (hour >= 14 || morningCoffee){
            System.out.println("아아+1");
        }
    }
}
