package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(35)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        mom.happyBirthday();
        son.happyBirthday();
        mom.setAddress("Moscow");
        son.setAddress("Moscow");
        System.out.println("У " + mom + " есть сын, " + son);

        //creating person without age
        Person dad = new PersonBuilder()
                .setName("Petr")
                .setSurname("Smith")
                .setAddress("St.Petersburg")
                .build();
        System.out.println(dad);
        dad.happyBirthday();

        try {
            // there aren't necessary fields
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // age is incorrect
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
