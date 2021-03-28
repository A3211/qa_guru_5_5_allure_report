package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
    private final static String BASE_URL = "https://github.com";
    private final static String REPOSITORY = "A3211/qa_guru_5_5_allure_report";
    private final static int ISSUE_NUMBER = 2;

    @Test
    public void searchForIssue() {
        open(BASE_URL);
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(REPOSITORY);
        $(".header-search-input").submit();
        $(By.linkText(REPOSITORY)).click();
        $(withText("Issues")).click();
        $(withText("#" + ISSUE_NUMBER)).should(Condition.exist);
    }
}
