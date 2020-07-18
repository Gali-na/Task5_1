public class Car implements Cloneable {
    private String model;
    private int length;
    private int width;
    private int height;
    private int turningDiameter;
    private Engine engine;

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        car.engine = engine.clone();
        return car;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getTurningDiameter() {
        return turningDiameter;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTurningDiameter(int turningDiameter) {
        this.turningDiameter = turningDiameter;
    }
}


