package chap_10;
public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        homeMadeBuger momMadeBuger = getMomMadeBuger();
        momMadeBuger.cook();
        System.out.println("--------------------");
        homeMadeBuger broMadeBuger = getBroMadeBuger();
        broMadeBuger.cook();
        System.out.println("--------------------");
    }

    private static homeMadeBuger getBroMadeBuger() {
        return new homeMadeBuger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨 패티, 양배추 샐러드,딸기쨈,치즈,삶은 계란");
            }
        };

    }

    public static homeMadeBuger getMomMadeBuger() {
        return new homeMadeBuger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 빵,소고기패티,해쉬브라운,양상추,마요네즈,피클");
            }
        };
    }
}
abstract class homeMadeBuger{
    public abstract void cook();
}