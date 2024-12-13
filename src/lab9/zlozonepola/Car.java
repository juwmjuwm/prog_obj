package lab9.zlozonepola;

import java.util.Objects;

public class Car {

    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(getMake(), car.getMake()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getEngine(), car.getEngine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMake(), getModel(), getEngine());
    }
}
