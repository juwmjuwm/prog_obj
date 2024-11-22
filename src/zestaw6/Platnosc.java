package zestaw6;

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
}
