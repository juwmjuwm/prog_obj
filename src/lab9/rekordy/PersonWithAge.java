package lab9.rekordy;

public record PersonWithAge(
        String name,
        int age
) {

    public PersonWithAge(String name, int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        this.name = name;
    }
}
