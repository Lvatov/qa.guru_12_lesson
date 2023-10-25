package com.demoqa.tests;


import com.demoqa.pages.RegistrationPage;
import com.demoqa.utils.RandomVariables;
import org.junit.jupiter.api.Test;

public class PracticeForm extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    RandomVariables randomVariables = new RandomVariables();

    @Test
    void formTest() {

        registrationPage.openPage()
                .removeBanner()
                .setFirstName(randomVariables.firstNameValue)
                .setLastName(randomVariables.lastNameValue)
                .setUserEmail(randomVariables.emailValue)
                .setGender(randomVariables.genderValue)
                .setUserNumber(randomVariables.phoneNumber)
                .setBirthDate(randomVariables.dayValue,randomVariables.monthValue, randomVariables.yearValue)
                .setSubject(randomVariables.subjectValue)
                .setHobbie(randomVariables.hobbyValue)
                .selectPicture(randomVariables.pictureNameValue)
                .setCurrentAddress(randomVariables.addressValue)
                .selectStateAndCity(randomVariables.stateValue, randomVariables.cityValue)

                .submitPress();

        registrationPage.verifyRegistrationResultModalAppears()
                .verifyResult("Student Name", randomVariables.firstNameValue
                        + " " + randomVariables.lastNameValue)
                .verifyResult("Student Email", randomVariables.emailValue)
                .verifyResult("Gender", randomVariables.genderValue)
                .verifyResult("Mobile", randomVariables.phoneNumber)
                .verifyResult("Date of Birth", randomVariables.dayValue + " "
                        + randomVariables.monthValue + "," + randomVariables.yearValue)
                .verifyResult("Subjects", randomVariables.subjectValue)
                .verifyResult("Hobbies", randomVariables.hobbyValue)
                .verifyResult("Picture", randomVariables.pictureNameValue)
                .verifyResult("Address", randomVariables.addressValue)
                .verifyResult("State and City", randomVariables.stateValue
                        + " " + randomVariables.cityValue)

                .closeModalVerify();

    }

}
