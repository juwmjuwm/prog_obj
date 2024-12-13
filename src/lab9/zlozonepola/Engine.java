package lab9.zlozonepola;

import java.util.Objects;

public class Engine {

    private double power;
    private String type;
    private String serialNumber;

    public Engine(double power, String type, String serialNumber) {
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine engine)) return false;
        return Double.compare(getPower(), engine.getPower()) == 0 &&
                Objects.equals(getType(), engine.getType()) && Objects.equals(getSerialNumber(), engine.getSerialNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPower(), getType(), getSerialNumber());
    }
}
