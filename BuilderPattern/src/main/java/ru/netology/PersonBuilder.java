package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String adress;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge (int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.adress = address;
        return this;
    }

    public Person build() {
        if  (name == null || surname == null) {
            throw new IllegalArgumentException("Bad request: check input data (name or surname)");
        }   if (age == null) {
            return new Person(name, surname, null, adress);
        }   if ( age < 0 || age > 300 ) {
            throw new IllegalArgumentException("Bad request: check input data (age)");
        }   else {
            return new Person(name, surname, age, adress);
        }
    }

}
