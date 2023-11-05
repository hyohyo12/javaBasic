package chap_04;

public class _06_While {
    //반복문 while
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        while (move < distance){
            System.out.println("발차기");
            System.out.println("이동거리" + move);
            move+=3;
        }
        System.out.println("도착");
    }
}
