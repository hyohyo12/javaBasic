package chap_08;

import chap_08.camera.factoryCam;
import chap_08.camera.Camera;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
//        Camera camera = new Camera();
        factoryCam factorycam = new factoryCam();
        factorycam.showMainFeature();
        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
