package chap_06;

import java.util.Stack;

public class _03_Return {
    //반환값 리턴값
    public static String getPhoneNum(){
        String phoneNum = "02-1234-5678";
        return phoneNum;
    }    //호텔. 전화번호
    //호첼 주소
    public static String getAddress(){
        return "서울시 어딘가";
    }
    public static String getActivities(){
        return "볼링장,탁구장,노래방";
    }
    //호텔 액티비티
    public static void main(String[] args) {
        String contactNumber = getPhoneNum();
        System.out.println("호텔 전화번호: " + contactNumber);
        String address = getAddress();
        System.out.println(address);
        System.out.println("호텔 액티비티" + getActivities());
    }
}
