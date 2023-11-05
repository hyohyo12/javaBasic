package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //continue
        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 통닭");
            //치킨 노쇼
            if (i == noShow){
                System.out.println(i+"손님 노쇼로 인해 다음 기회");
                continue;
            }
            sold++;
            if (sold == max){
                System.out.println("금일 종료");
                break;
            }
        }
    }
}
