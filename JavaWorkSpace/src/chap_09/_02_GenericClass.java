package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass {
    //제네릭 클래스
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByNickName c2 = new CoffeeByNickName("유재석");
        c2.ready();
        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);
        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

//        c4Name = (String) c3.name;
        Coffee<Integer> c5 = new Coffee<>(55);
        c5.ready();

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);
        String c6Name = c6.name;
        System.out.println("주문 고객 번호 : " + c6Name);
        System.out.println("--------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();
        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("서장훈"));
        c8.ready();
        orderCoffee("김영철님");
        orderCoffee(36);
//        CoffeeByUser<BlackBox> c9 = new CoffeeByUser<BlackBox>();
        orderCoffee(37,"라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }
    public static <T,V> void orderCoffee(T name,V coffee) {
        System.out.println(coffee + "커피 준비 완료 : " + name);
    }
}

