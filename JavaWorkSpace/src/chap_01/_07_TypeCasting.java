package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형 변환 TypeCasting
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);
        //float,double to int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int) score_f);
        score = 93 + (int) 98.8;
        System.out.println(score);

        //변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; //191 -> 191.0
        //int -> long ->float -> double (자동 형 변환)

        int converedScoreInt = (int) score_d; // 191.8 ->191
        //double -> float -> long -> int (수동 형 변환)

        //숫자 데이터 문자열로
        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 = Integer.toString(93);
        System.out.println(s1);
        String s2 = String.valueOf(98.8);
        System.out.println(s2);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");

        int error = Integer.parseInt("자바");
    }
}
