public class Engine implements Cloneable {
    private int engineCapacity;
    private int power;
    private int topSpeed;
    private int accelerationTime;
    private int cylinderDiameter;

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getPower() {
        return power;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getAccelerationTime() {
        return accelerationTime;
    }

    public int getCylinderDiameter() {
        return cylinderDiameter;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setAccelerationTime(int accelerationTime) {
        this.accelerationTime = accelerationTime;
    }

    public void setCylinderDiameter(int cylinderDiameter) {
        this.cylinderDiameter = cylinderDiameter;
    }
}

