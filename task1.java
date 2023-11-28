class Engine {
    private String name;
    private int power;

    public Engine(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Power: " + power + " hp");
    }
}
class InternalCombustionEngine extends Engine {
    private String fuelType;
    private int cylinderVolume;

    public InternalCombustionEngine(String name, int power, String fuelType, int cylinderVolume) {
        super(name, power);
        this.fuelType = fuelType;
        this.cylinderVolume = cylinderVolume;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Cylinder Volume: " + cylinderVolume + " cc");
    }
}
class DieselEngine extends InternalCombustionEngine {
    private boolean turbocharged;

    public DieselEngine(String name, int power, String fuelType, int cylinderVolume, boolean turbocharged) {
        super(name, power, fuelType, cylinderVolume);
        this.turbocharged = turbocharged;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Turbocharged: " + (turbocharged ? "Yes" : "No"));
    }
}

class JetEngine extends Engine {
    private int thrust;

    public JetEngine(String name, int power, int thrust) {
        super(name, power);
        this.thrust = thrust;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Thrust: " + thrust + " N");
    }
}

public class task1 {
    public static void main(String[] args) {
        Engine engine = new Engine("Generic Engine", 200);
        InternalCombustionEngine icEngine = new InternalCombustionEngine("Petrol Engine", 300, "Petrol", 2000);
        DieselEngine dieselEngine = new DieselEngine("Diesel Engine", 250, "Diesel", 1800, true);
        JetEngine jetEngine = new JetEngine("Jet Engine", 1000, 50000);

        Engine[] engines = {engine, icEngine, dieselEngine, jetEngine};

        for (Engine e : engines) {
            e.show();
            System.out.println("=================");
        }
    }
}
