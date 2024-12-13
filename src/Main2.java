import lab9.rekordy.*;
import lab9.zlozonepola.BookWithArray;

public class Main2 {

    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("Somebook", "Some Author", 39.99f, 2018);
        BookDTO book2 = new BookDTO("Somebook2", "Some Author2", 19.99f, 2023);

        Address address = new Address("Example Street", 21, "14-982", "New York");
        Person person1 = new Person("John", "Smith", address);
        Person person2 = new Person("James", "Murphy", address);

        Car car = new Car("Audi", "A1", 5.9);
        System.out.println(car.fuelCost(7.49, 289));

        PersonWithAge personWithAge1 = new PersonWithAge("Mike", 67);
        PersonWithAge personWithAge2 = new PersonWithAge("Mike", -1);
        System.out.println(personWithAge2.age());

        BankAccount bankAccount = new BankAccount("1234123412341234");
        System.out.println(bankAccount);

        BookWithArray itBook = new BookWithArray("IT", "Stephen King", 3);
        itBook.addReview(3);
        itBook.addReview(4);
        itBook.addReview(7);
        itBook.addReview(9);
        itBook.addReview(1);
        System.out.println(itBook);
        itBook.removeReview();
        itBook.removeReview();
        itBook.removeReview();
        itBook.removeReview();
        System.out.println(itBook);
    }
}
