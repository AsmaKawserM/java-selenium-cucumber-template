package app;

import lombok.Getter;
import pages.BasePage;
import pages.Home;
import pages.Installation;
import pages.Login;

public class PageManager {

    private final AppSession appSession;
    private BasePage basePage;
    private Home home;
    private Installation installation;
    private Login login;
    public PageManager(AppSession appSession){
        this.appSession = appSession;
    }

//     Using lazy initialization
    public BasePage getBasePage() {
        return (basePage == null) ? basePage = new BasePage(appSession) : basePage;
    }
    public Home getHome() {
        return (home == null) ? home = new Home(appSession) : home;
    }

    public Installation getInstallation() {
        return (installation == null) ? installation = new Installation(appSession) : installation;
    }

    public Login getLogin() {
        return (login == null) ? login = new Login(appSession) : login;
    }

}
