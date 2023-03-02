package app;

import lombok.Getter;
import lombok.Setter;

public class AppSession {

    private static int DEFAULT_DEFAULT_TIMEOUT = 10;
    private static int DEFAULT_EXTENDED_TIMEOUT = 60;
    @Getter @Setter private int defaultTimeout = DEFAULT_DEFAULT_TIMEOUT;
    @Getter @Setter private int extendedTimeout = DEFAULT_EXTENDED_TIMEOUT;
    @Getter private String baseUrl;
    @Getter private DriverManager driverManager;

    public AppSession(String browserName, String baseUrl){
        driverManager = new DriverManager(browserName);
        this.baseUrl = baseUrl;
    }
}
