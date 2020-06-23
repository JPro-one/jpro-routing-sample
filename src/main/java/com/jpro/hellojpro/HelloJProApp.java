package com.jpro.hellojpro;

import com.jpro.hellojpro.page.LandingPage;
import com.jpro.web.WebApp;
import com.jpro.webapi.JProApplication;
import com.jpro.webapi.WebAPI;
import javafx.stage.Stage;

public class HelloJProApp extends WebApp {
    HelloJProApp(Stage stage) {
        super(stage);

        addRouteJava((s) -> {
            if(s.equals("") || s.equals("/")) {
                return new LandingPage(WebAPI.isBrowser() ? WebAPI.getWebAPI(stage) : null);
            } else {
                return null;
            }
        });
    }
}
