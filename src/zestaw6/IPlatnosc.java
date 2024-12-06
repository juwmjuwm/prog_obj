package zestaw6;

public interface IPlatnosc {

    double getValue();

    PaymentStatus getStatus();

    void setValue(double value);

    void setStatus(PaymentStatus status);

    void zaplac();

    default void convertCurrency(double exchangeRate) {
        setValue(getValue() * exchangeRate);
    }
}
