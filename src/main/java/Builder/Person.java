package Builder;

import java.util.function.Predicate;

class Person {
    private final String firstName;
    private final String lastName;
    private final int age;

    private Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;

        public Builder() {

        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, age);
        }
    }

    public Predicate<Person> isAgedPerson() {
        return p -> p.age > 25;
    }

    public <T> boolean getPersonAge(T t) {
        if (t instanceof Integer) {
            System.out.println("It's integer");
        }

        if (t instanceof String) {
            System.out.println("It's a string");
        }

        return true;
    }

    public <U, V> String helloPanch(U u, V v) {
        if (u instanceof String && v instanceof Integer) {
            return u + String.valueOf(v);
        }

        return "";
    }
}
