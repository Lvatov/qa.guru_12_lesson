package com.demoqa.tests;


import com.demoqa.pages.RegistrationPage;
import com.demoqa.utils.RandomVariables;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("remote")
@DisplayName("Форма регистрации")
public class RemotePracticeForm extends RemoteTestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    RandomVariables randomVariables = new RandomVariables();

    @Test
    @DisplayName("Форма для регистрации")
    void formTest() {

        step("Открываем форму регистрации, убираем баннеры", () -> {
            registrationPage.openPage().removeBanner();
        });

        step("Вносим имя", () -> {
            registrationPage.setFirstName(randomVariables.firstNameValue);
        });

        step("Вносим фамилию", () -> {
            registrationPage.setLastName(randomVariables.lastNameValue);
        });

        step("Вносим почтовый адрес", () -> {
            registrationPage.setUserEmail(randomVariables.emailValue);
        });

        step("Выбираем гендер", () -> {
            registrationPage.setGender(randomVariables.genderValue);
        });

        step("Вносим номер телефона", () -> {
            registrationPage.setUserNumber(randomVariables.phoneNumber);
        });

        step("Заполняем дату рождения", () -> {
            registrationPage.setBirthDate(randomVariables.dayValue,randomVariables.monthValue, randomVariables.yearValue);
        });

        step("Выбираем предметы", () -> {
            registrationPage.setSubject(randomVariables.subjectValue);
        });

        step("Вносим хобби", () -> {
            registrationPage.setHobbie(randomVariables.hobbyValue);
        });

        step("Добавляем файл", () -> {
            registrationPage.selectPicture(randomVariables.pictureNameValue);
        });

        step("Вносим адрес", () -> {
            registrationPage.setCurrentAddress(randomVariables.addressValue);
        });

        step("Выбираем город и штат", () -> {
            registrationPage.selectStateAndCity(randomVariables.stateValue, randomVariables.cityValue);
        });

        step("Нажимаем кнопку применить", () -> {
            registrationPage .submitPress();
        });


        step("Открыта форма проверки", () -> {
            registrationPage.verifyRegistrationResultModalAppears();
        });

        step("Проверка имени и фамилии", () -> {
            registrationPage.verifyResult("Student Name", randomVariables.firstNameValue
                    + " " + randomVariables.lastNameValue);
        });

        step("Проверка почтового адреса", () -> {
            registrationPage.verifyResult("Student Email", randomVariables.emailValue);
        });

        step("Проверка гендера", () -> {
            registrationPage.verifyResult("Gender", randomVariables.genderValue);
        });

        step("Проверка номера телефона", () -> {
            registrationPage.verifyResult("Mobile", randomVariables.phoneNumber);
        });

        step("Проверка даты рождения", () -> {
            registrationPage.verifyResult("Date of Birth", randomVariables.dayValue + " "
                    + randomVariables.monthValue + "," + randomVariables.yearValue);
        });

        step("Проверка предметов", () -> {
            registrationPage.verifyResult("Subjects", randomVariables.subjectValue);
        });

        step("Проверка хобби", () -> {
            registrationPage.verifyResult("Hobbies", randomVariables.hobbyValue);
        });

        step("Проверка картинки", () -> {
            registrationPage.verifyResult("Picture", randomVariables.pictureNameValue);
        });

        step("Проверка адреса", () -> {
            registrationPage.verifyResult("Address", randomVariables.addressValue);
        });

        step("Проверка города и штата", () -> {
            registrationPage.verifyResult("State and City", randomVariables.stateValue
                    + " " + randomVariables.cityValue);
        });



    }

}
