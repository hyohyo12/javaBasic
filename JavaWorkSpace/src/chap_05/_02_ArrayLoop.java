package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i]);
        }
        //배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]);
        }
        //enhanced for (for - each) 반복문
        for (String coffee :
                coffees) {
            System.out.println(coffee);
        }
    }
}
