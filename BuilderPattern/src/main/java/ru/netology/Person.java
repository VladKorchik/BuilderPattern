package ru.netology;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String adress;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public boolean hasAge() {
        if (age == 999) return false;
        else return true;
    }

    public boolean hasAddress() {
        if (adress.equals(null)) return false;
        else return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        if (hasAddress()) return adress;
        else return null;
    }

    public String setAddress(String city) {
        this.adress = city;
        return adress;
    }

    public void happyBirthday() {
        if (hasAge()) { age++; }
        else { System.out.println("Age can't be changed because it's unknown"); }
    }

    @Override
    public String toString() {
        String finalAge;
        if (hasAge()) {
            finalAge = Integer.toString(age);
        }   else {
            finalAge = " неизвестен, ";
        }
        return name + " " + surname + ", Возраст " + finalAge + ", Живёт в городе " + adress;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(adress)
                .setAge(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(adress, person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, adress);
    }
}
