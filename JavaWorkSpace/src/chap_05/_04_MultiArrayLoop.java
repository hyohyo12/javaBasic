package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        //다차원 배열 순회
        String Seats [][] = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };
        for (int i = 0; i <Seats.length ; i++) {
            for (int j = 0; j < Seats[i].length; j++) {
                System.out.print(Seats[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("________________");
        String[][] Seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };

        for (int i = 0; i < Seats2.length; i++) {
            for (int j = 0; j < Seats2[i].length; j++) {
                System.out.print(Seats2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (1 + j);
            }
        }
        // 표구매
        seats3[7][8] = "__";
        seats3[7][9] = "___";
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
