public class CameraTest {
    public static void main(String[] args) {
        Camera fujiXT4 = new Camera("Fujifilm","X-T4","APS-C",26.1f,3690);
        fujiXT4.getDisplayInfo();
        Camera canonEOS = new Camera("Canon","EOS R6","Full-frame",20.1f,3960);
        canonEOS.getDisplayInfo();
        Camera nikon = new Camera("Nikon", "Z6 II","Full-frame",24.5f,3590);
        nikon.getDisplayInfo();
        

    }
}
