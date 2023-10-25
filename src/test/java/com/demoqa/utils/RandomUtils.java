package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

import static Data.StateAndCityPracticeForm.statesAndCities;

public class RandomUtils {

    static Faker fakerEn = new Faker(new Locale("en"));

    public static String getRandomText() {
        return fakerEn.harryPotter().character();
    }



    public static String getRandomString(int len) {
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));

        return sb.toString();
    }

    public static String getRandomItemFromArray(String[] array) {
        int index = getRandomInt(0, array.length - 1);

        return array[index];
    }

    public static int getRandomInt(int min, int max) {

        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }


    public static String getRandomFirstName() {
        return fakerEn.name().firstName();
    }

    public static String getRandomLastName() {
        return fakerEn.name().lastName();

    }

    public static String getRandomEmail() {

        return fakerEn.internet().emailAddress();
    }

    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return new Faker().options().option(genders);

    }

    public static String getRandomMobileNumber() {

        return fakerEn.numerify("##########");
    }

    public static String getRandomYear() {
        int year = fakerEn.number().numberBetween(1950, 2005);
        return Integer.toString(year);

    }
    public static String getRandomMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return new Faker().options().option(months);

    }

    public static String getRandomDay() {
        int day = getRandomInt(1, 28);
        //if (day < 10) {
        //    return "0" + day;
        //} else {
//
        //}
            return Integer.toString(day);

    }

    public static String getRandomSubject() {
        String[] subjects = {"Accounting", "Arts", "Biology", "Chemistry", "Civics", "Economics",
                "English", "Commerce", "Computer Science", "Physics", "Maths", "Hindi", "History", "Social Studies"};
        return new Faker().options().option(subjects);
    }

    public static String getRandomHobie() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return new Faker().options().option(hobbies);
    }

    public static String getRandomPic() {
        String[] pics = {"ava.PNG", "ava1.PNG"};
        return new Faker().options().option(pics);
    }

    public static String getRandomAddress() {
        return fakerEn.address().fullAddress();
    }


    public static String getRandomState() {

        return fakerEn.options().option(statesAndCities.keySet().toArray()).toString();
    }

    public static String getRandomCity(String state) {

        return fakerEn.options().option(statesAndCities.get(state));
    }

}
