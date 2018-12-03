package com.jpro.hellojpro;

import com.jpro.hellojpro.page.LandingPage;
import com.jpro.web.WebApp;
import com.jpro.webapi.JProApplication;
import javafx.stage.Stage;

public class HelloJProApp extends WebApp {
    HelloJProApp(JProApplication app, Stage stage) {
        super(stage);

        addRouteJava((s) -> {
            if(s.equals("") || s.equals("/")) {
                return new LandingPage(app.getWebAPI());
            } else {
                return null;
            }
        });
    }
}
