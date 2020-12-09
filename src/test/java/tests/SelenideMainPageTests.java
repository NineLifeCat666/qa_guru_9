package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class SelenideMainPageTests extends TestBase{


    @Test
    public void openMainSelenidePage(){
      step("Открываем главную страницу", () ->{
          open("https://selenide.org");
      });
      step("Проверяем что на главной странице присутствует текст What is Selenide?", ()->{
          $(".main").shouldHave(Condition.text("What is Selenide?"));
      });
    }
}

