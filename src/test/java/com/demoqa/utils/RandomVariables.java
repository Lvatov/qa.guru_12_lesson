package com.demoqa.utils;

import static com.demoqa.utils.RandomUtils.*;

public class RandomVariables {


    public String firstNameValue = getRandomFirstName(),
            lastNameValue = getRandomLastName(),
            emailValue = getRandomEmail(),
            genderValue = getRandomGender(),
            phoneNumber = getRandomMobileNumber(),
            monthValue = getRandomMonth(),
            yearValue = getRandomYear(),
            dayValue = getRandomDay(),
            subjectValue = getRandomSubject(),
            hobbyValue = getRandomHobie(),
            pictureNameValue = getRandomPic(),
            addressValue = getRandomAddress(),
            stateValue = getRandomState(),
            cityValue = getRandomCity(stateValue);

}
