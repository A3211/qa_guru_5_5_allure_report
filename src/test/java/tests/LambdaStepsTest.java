package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepsTest {
    private final static String BASE_URL = "https://github.com";
    private final static String REPOSITORY = "A3211/qa_guru_5_5_allure_report";
    private final static int ISSUE_NUMBER = 2;

    @Test
    public void searchForIssue() {
        step("Открываем главную страницу", () -> {
            open(BASE_URL);
        });
        step("Ищем репозиторий", () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });
        step("Переходим в репозиторий", () -> {
            $(By.linkText(REPOSITORY)).click();
        });
        step("Переходим в таб Issues", () -> {
            $(withText("Issues")).click();
        });
        step("Проверяем что Issue существует", () -> {
            $(withText("#" + ISSUE_NUMBER)).should(Condition.exist);
        });
    }
}
