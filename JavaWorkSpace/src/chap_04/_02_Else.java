package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        //조건문 if Else
        int hour = 10;
        if (hour < 14){
            System.out.println("아아+1");
        }
        else{
            System.out.println("아아디카페인+1");
        }
        hour = 15;
        boolean morningCoffe = true;
        if (hour >= 14 || morningCoffe){
            System.out.println("디카페인+1");
        }
        else{
            System.out.println("아아+1");
        }
    }
}
