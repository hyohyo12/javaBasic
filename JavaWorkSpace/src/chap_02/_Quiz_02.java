package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        //퀴즈 2
        int h1 = 115;
        int h2 = 121;
        String pass = (h1 >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + h1 + " 이므로 "+ pass +" 합니다");
        pass = (h2 >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + h2 + " 이므로 "+ pass +" 합니다");
    }
}
