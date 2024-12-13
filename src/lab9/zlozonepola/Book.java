package lab9.zlozonepola;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private List<Double> reviews;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Double> getReviews() {
        return reviews;
    }

    public void setReviews(List<Double> reviews) {
        this.reviews = reviews;
    }

    public void addReview(double review) {
        reviews.add(review);
    }

    public boolean removeReview(double review) {
        Double removed = null;
        if (!reviews.isEmpty()) {
            removed = reviews.removeLast();
        }
        return removed != null;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(getTitle(), book.getTitle()) &&
                Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor());
    }
}
