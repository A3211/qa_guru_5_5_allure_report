package tests;

import org.junit.jupiter.api.Test;

public class AnnotatedStepsTest {
    private final static String BASE_URL = "https://github.com";
    private final static String REPOSITORY = "A3211/qa_guru_5_5_allure_report";
    private final static int ISSUE_NUMBER = 2;

    private WebSteps steps = new WebSteps();

    @Test
    public void testSearch() {
        steps.openMainPage();
        //steps.searchForRepository(REPOSITORY);
        //steps.goToRepository(REPOSITORY);
        //steps.clickOnIssueTab();
        //steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }
}
