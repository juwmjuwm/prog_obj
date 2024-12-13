package lab9.zlozonepola;

import java.util.Arrays;
import java.util.Objects;

public class BookWithArray {
    private String title;
    private String author;
    private double[] reviews;
    private int idx;

    public BookWithArray(String title, String author, int numOfReviews) {
        this.title = title;
        this.author = author;
        reviews = new double[numOfReviews];
        idx = 0;
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

    public double[] getReviews() {
        return reviews;
    }

    public void setReviews(double[] reviews) {
        this.reviews = reviews;
    }

    public boolean addReview(double review) {
        if (idx >= reviews.length) {
            return false;
        }
        reviews[idx++] = review;
        return true;
    }

    public boolean removeReview() {
        idx--;
        if (idx < 0) {
            return false;
        }
        reviews[idx] = 0;
        return true;
    }

    @Override
    public String toString() {
        return "BookWithArray{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + Arrays.toString(reviews) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookWithArray that)) return false;
        return Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getAuthor(), that.getAuthor()) && Objects.deepEquals(getReviews(), that.getReviews());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), Arrays.hashCode(getReviews()));
    }
}
