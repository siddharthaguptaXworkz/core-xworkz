public class Camera {
    private String company;
    private String model;
    private String sensorSize;
    private float resolution;
    private int viewFinderThousandDots;
    private static int numCamera;
    private static String className = "Camera";

    public Camera(String company, String model, String sensorSize, float resolution, int viewFinderThousandDots) {

        this.company = company;
        this.model = model;
        this.sensorSize = sensorSize;
        this.resolution = resolution;
        this.viewFinderThousandDots = viewFinderThousandDots;
        Camera.numCamera++;
    }

    public void getDisplayInfo() {
        System.out.println("company = " + company);
        System.out.println("model = " + model);
        System.out.println("sensorSize = " + sensorSize);
        System.out.println("resolution = " + resolution);
        System.out.println("viewFinderThousandDots = " + viewFinderThousandDots);
        System.out.println("numCamera = " + numCamera);
        System.out.println("className = " + className);
    }
}
