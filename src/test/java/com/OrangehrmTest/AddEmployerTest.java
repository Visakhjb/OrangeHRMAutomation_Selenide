package com.OrangehrmTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

class AddEmployerTest {

    @Test
    void AddEmployeeTest(){
        Selenide.open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        $(Selectors.byName("username")).should(Condition.visible).setValue("Admin");
        $(Selectors.byName("password")).should(Condition.visible).setValue("admin123");
        $(Selectors.by("type","submit")).should(Condition.visible).click();

    }
}
