package chap_08;

import chap_08.camera.factoryCam;
import chap_08.detector.AdvancdFireDetactor;
import chap_08.detector.Detectable;
import chap_08.detector.FIreDetector;
import chap_08.reporter.NomalReporter;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        //인터페이스
        Reportable nomalReporter = new NomalReporter();
        nomalReporter.report();
        Reportable videoReporter =new VideoReporter();
        videoReporter.report();
        System.out.println("------------------");
        Detectable fireDetector = new FIreDetector();
        fireDetector.detect();

        Detectable advancedFireDetactor = new AdvancdFireDetactor();
        advancedFireDetactor.detect();
        System.out.println("------------------");
        factoryCam factoryCam = new factoryCam();
        factoryCam.setDetector(advancedFireDetactor);
        factoryCam.setReporter(videoReporter);
        factoryCam.detect();
        factoryCam.report();
    }
}
