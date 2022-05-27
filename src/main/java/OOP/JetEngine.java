package OOP;

/**
 * @author Fatima Trtak
 */
public class JetEngine {
    String model;
    int fanSpeed;
    int maxSpeed;
    int thrust;

    {
        this.model = "";
        System.out.println("Initializer called");
    }

    public JetEngine() {
        System.out.println("no arg");
    }

    private JetEngine(String model) {
        this.model = model;
        System.out.println("model");
    }

    public JetEngine(String model, int fanSpeed) {
        this(model);
        this.fanSpeed = fanSpeed;
        System.out.println("model and fan speed");
    }

    @Override
    public String toString() {
        return "JetEngine{" +
                "model='" + model + '\'' +
                ", fanSpeed=" + fanSpeed +
                ", maxSpeed=" + maxSpeed +
                ", thrust=" + thrust +
                '}';
    }

    public static void main(String[] args) {
        JetEngine jetEngine = new JetEngine("M1", 6000);
        System.out.println(jetEngine.toString());
    }
}
