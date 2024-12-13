package lab9.rekordy;

public record BookDTO(
        String title,
        String author,
        float price,
        int yearOfPublication
) {
}
