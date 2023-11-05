package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        boolean hallabongAde = false;
        boolean orangeJuice = true;
        boolean mangoJuice = false;
        if (hallabongAde){
            System.out.println("한라봉+1");
        } else if (mangoJuice) {
            System.out.println("망고+1");
        }
        else if(orangeJuice){
            System.out.println("오렌지 + 1");
        }
        else{
            System.out.println("아아+1");
        }
        System.out.println("커피 주문 완료");
    }

}
