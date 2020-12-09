package org.selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideMainPageTests {
    @Test
    public void openMainSelenidePage(){
        open("https://selenide.org");
        $(".main").shouldHave(Condition.text("What is Selenide?"));
    }
}

