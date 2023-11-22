package chap_07.camera;

public class Camera {
    public String name;

    public Camera() {
        this("카메라");
    }
    protected Camera(String name){
        this.name = name;
    }
    public void takePicture(){
        //사진 촬영
        System.out.println(this.name + " : 사진 촬영");
    }
    public void recordVideo(){
        //동영상 녹화
        System.out.println(this.name + " : 동영상 촬영");
    }
    public void showMainFeature(){
        System.out.println(this.name+" 의 주요기능 : 사진 촬영, 동영상 녹화");
    }
}
