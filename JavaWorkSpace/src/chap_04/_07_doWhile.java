package chap_04;

public class _07_doWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 25;
        do{
            System.out.println("발차기");
            System.out.println("이동거리 " + move);
            move += 3;
        }while(move + height < distance);
        System.out.println("도착");
    }
}
