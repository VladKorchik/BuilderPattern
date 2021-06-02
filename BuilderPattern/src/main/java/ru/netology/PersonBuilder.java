package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = 999;
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
        }   if ( age < -1 || age > 1000) {
            throw new IllegalArgumentException("Bad request: check input data (age)");
        }   else {
            return new Person(name, surname, age, adress);
        }
    }

}
