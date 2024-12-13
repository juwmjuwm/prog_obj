package lab9.rekordy;

public record BankAccount(
        String accountNumber,
        float balance
) {

    public BankAccount(String accountNumber) {
        this(accountNumber, 0);
    }
}
