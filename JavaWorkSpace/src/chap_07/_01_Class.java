package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        //유지 보수 용이
        // 높은 재사용성

        //차량용 블랙박스
        // 모델명, 해상도, 가격, 색상
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";
        // 새로운 제품 개발
        String modelName2 ="하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String coloe2 = "화이트";
        //객체 정의
        BlackBox bbox = new BlackBox();
        BlackBox bbox2 = new BlackBox();


    }
}
