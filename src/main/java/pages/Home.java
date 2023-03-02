package pages;

import app.AppSession;
import org.openqa.selenium.By;

public class Home extends BasePage{

    private AppSession appSession;
    private By VIEW_DOCS_BUTTON = By.cssSelector("a[title='View Docs']");
    public Home(AppSession appSession){
        super(appSession);
        this.appSession = appSession;
    }

    public void go(){
        goTo(appSession.getBaseUrl());
    }

    public void clickViewDocs(){
        clickElement(VIEW_DOCS_BUTTON);
    }

}
