package com.company;

public class Main {

    public static void main(String[] args) {
        int yearOfBirthday = 1999;
        int monthOfBirthday = 11;
        int dayOfBirthday = 24;

        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения: " + sum);

        boolean monthBiggerDay = monthOfBirthday > dayOfBirthday;
        System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);

        char[] name = new char[4];
        name[0] = 'K';
        name[1] = 'a';
        name[2] = 'т';
        name[3] = 'я';
        System.out.println("Массив с моим именем: " + name[0] + name[1] + name[2] + name[3]);

        double myAge = 21;
        double partYear = 1.0 / 12;

        myAge = myAge + partYear;
        System.out.println("Мне " + myAge);
    }
}
