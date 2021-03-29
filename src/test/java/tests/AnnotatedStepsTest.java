package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тест с аннотациями")
public class AnnotatedStepsTest {
    private final static String BASE_URL = "https://github.com";
    private final static String REPOSITORY = "A3211/qa_guru_5_5_allure_report";
    private final static int ISSUE_NUMBER = 2;

    private WebSteps step = new WebSteps();

    @Test
    @Owner("Kuslin")
    @Feature("Работа с разметкой")
    @Story("Разметка")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "BaseURL", url = "https://github.com")
    @DisplayName("Пример теста с аннотациями")
    public void searchForIssue() {
        step.openMainPage(BASE_URL);
        step.searchForRepository(REPOSITORY);
        step.goToRepository(REPOSITORY);
        step.clickOnIssueTab();
        step.shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }
}
