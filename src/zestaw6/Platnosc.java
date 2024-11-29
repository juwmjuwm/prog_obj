package zestaw6;

import java.util.Objects;

public class Platnosc {

    private double value;
    private PaymentStatus status;

    public Platnosc(double value, PaymentStatus status) {
        this.value = value;
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void zaplac() {
        status = PaymentStatus.PAID;
    }

    @Override
    public String toString() {
        return "Platnosc{" +
                "value=" + value +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platnosc platnosc = (Platnosc) o;
        return Double.compare(value, platnosc.value) == 0 && status == platnosc.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, status);
    }
}
