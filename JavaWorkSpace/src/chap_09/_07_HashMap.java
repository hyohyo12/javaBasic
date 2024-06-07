package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        //맵 (key,value)
        HashMap<String,Integer> map = new HashMap<>();
        //데이터 추가
        map.put("유재석",10);
        map.put("박명수",5);
        map.put("김종국",3);
        map.put("서장훈",15);

        System.out.println("총 고객 수:" + map.size());
        System.out.println("--------------------");
        System.out.println("유재석 님의 포인트:"+map.get("유재석"));
        System.out.println("박명수 님의 포인트:"+map.get("박명수"));

        if (map.containsKey("서장훈")){
            int point = map.get("서장훈");
            map.put("서장훈",++point);
            System.out.println("서장훈 님의 누적 포인트" + map.get("서장훈"));
        }else{
            map.put("서장훈",1);
            System.out.println("서장훈님 신규 등록 (포인트 1)");
         }
        System.out.println("--------------------");
        map.remove("유재석");
        System.out.println(map.get("유재석"));

        map.clear();
        if (map.isEmpty()){
            System.out.println("남은 고객 수" + map.size());
            System.out.println("가게 접자");
        }
        map.put("유재석",10);
        map.put("박명수",5);
        map.put("김종국",3);
        map.put("서장훈",15);

        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (int value : map.values()){
            System.out.println(value);
        }
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "포인트 : " + map.get(key));
        }
    }
}
