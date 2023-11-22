package chap_07;

class HamBurger{
    public String name;
    HamBurger(){
        this("햄버거");
    }
    HamBurger(String name){
        this.name = name;
    }
    String[] ingredient = {"양상추","패티","피클"};
    public void cook(){
        System.out.println(name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        for (int i = 0; i < 3 ; i++){
            if (i == 0){
                System.out.println("> " + ingredient[i]);
            }
            else{
                System.out.println("+ " + ingredient[i]);
            }
        }
    }
}
class CheeseBurger extends HamBurger{
    CheeseBurger(){
        super("치즈버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}
class ShrimpBurger extends HamBurger{
    public ShrimpBurger() {
        super("새우버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}

public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("---------------");
        for (HamBurger hamBurger :
                hamBurgers) {
            hamBurger.cook();
            System.out.println("---------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
