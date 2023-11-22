package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //다차원 배열(2차원)
        String Seats [][] = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };
        System.out.println(Seats[1][1]);
        System.out.println(Seats[2][4]);

        String[][] Seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        System.out.println(Seats2[0][2]);
//        System.out.println(Seats2[0][4]);
//        이건 에러
        //3차원 배열 만들기
        String [][][] marray = new String[3][3][3];

    }
}
