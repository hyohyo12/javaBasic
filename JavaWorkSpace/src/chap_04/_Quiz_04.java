package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        boolean common = false;
        boolean diabled = true;
        boolean minicar = true;
        int cost = 0;
        int time = 1;
        while (time <= 5){
            cost += 4000;
            time += 1;
        }
        if (cost > 30000){
            cost = 30000;
        }
        if(common){
            System.out.println("주차 요금" + cost + "임");
        } else if (diabled || minicar) {
            System.out.println("주차 요금" + cost/2 + "임");
        }
    }
}
