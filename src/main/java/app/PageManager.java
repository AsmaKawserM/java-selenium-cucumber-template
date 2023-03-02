package app;

import lombok.Getter;
import pages.BasePage;
import pages.Home;
import pages.Installation;
import pages.Login;

public class PageManager {

    @Getter private Home home;
    @Getter private Installation installation;
    @Getter private Login login;
    @Getter private BasePage basePage;
//    private AppSession appSession; // Required for lazy initialization
    public PageManager(AppSession appSession){

        basePage = new BasePage(appSession);
        home = new Home(appSession);
        login = new Login(appSession);
        installation = new Installation(appSession);
    }

    // If required apply lazy loading, example:
//    public Home getHome() {
//        return (home == null) ? home = new Home(appSession) : home;
//    }
}
