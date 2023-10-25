package com.demoqa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {

    SelenideElement
            fullNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitButtonTB = $("#submit"),
            checkName = $("#output").$("#name"),
            checkEmail = $("#output").$("#email"),
            checkCurrentAddress = $("#output").$("#currentAddress"),
            checkPermanentAddress = $("#output").$("#permanentAddress");


    public TextBoxPage textBoxPageOpen() {

        open("/text-box");

        return this;
    }

    public TextBoxPage removeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public TextBoxPage setFullName(String values) {
        fullNameInput.setValue(values);

        return this;
    }

    public TextBoxPage setUserEmail(String values) {
        userEmailInput.setValue(values);

        return this;
    }

    public TextBoxPage setCurrentAddress(String values) {
        currentAddressInput.setValue(values);

        return this;
    }

    public TextBoxPage setPermanentAddress(String values) {
        permanentAddressInput.setValue(values);

        return this;
    }

    public TextBoxPage presSubmitButtonTB() {
        submitButtonTB.click();

        return this;
    }

    public TextBoxPage checkNameMod(String value) {
        checkName.shouldHave(Condition.text(value));

        return this;
    }

    public TextBoxPage checkEmailMod(String value) {
        checkEmail.shouldHave(Condition.text(value));

        return this;
    }

    public TextBoxPage checkCurrentAddressMod(String value) {
        checkCurrentAddress.shouldHave(Condition.text(value));

        return this;
    }

    public TextBoxPage checkPermanentAddressMod(String value) {
        checkPermanentAddress.shouldHave(Condition.text(value));

        return this;
    }

}
