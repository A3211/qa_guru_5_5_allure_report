package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step
    public void openMainPage() {
        open("https://github.com");
    }

    @Step
    public void searchForRepository(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
    }

    @Step
    public void goToRepository(String repository) {
        $(By.linkText(repository)).click();
    }

    @Step
    public void clickOnIssueTab() {
        $(withText("Issues")).click();
    }

    @Step
    public void shouldSeeIssueWithNumber(int number) {
        $(withText("#" + number)).should(Condition.exist);
    }
}
