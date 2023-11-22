package chap_07;

import javax.swing.*;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoRport(); //지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoRport();
        b1.insertMemoryCard(256);
        //일반 영상 : 1
        // 이벤트 영상(충돌 갑지) : 2

        int FileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수 : " + FileCount + "개");
        FileCount = b1.getVideoFileCount(2);
        System.out.println("일반 영상 파일 수 : " + FileCount + "개");
    }
}
