package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        //세트
        HashSet<String> set = new HashSet<>();
        //데이터 추가
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size());
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("--------------------------");

        //확인
        if (set.contains("삼겹살")){
            System.out.println("삼겹살 사러 출");
        }
        System.out.println("----------------------------");
        System.out.println("총 구매 상품 수 (삼겹살 구매 전):" + set.size());//7
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 (삼겹살 구매 후):" + set.size()); //6
        System.out.println("----------------------------");
        //전체 삭제
        set.clear();
        if (set.isEmpty()){
            System.out.println("남은 구매 상품 수:" + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("----------------------------");
        //중복 허용,순서 보장 모두 안된다.
        HashSet<Integer> IntSet = new LinkedHashSet<>();
        IntSet.add(1);
        IntSet.add(13);
        IntSet.add(2);

        for (int i : IntSet) {
            System.out.println(i);
        }




    }
}
