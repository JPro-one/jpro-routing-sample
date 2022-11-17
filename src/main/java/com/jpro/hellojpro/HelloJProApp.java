package com.jpro.hellojpro;

import com.jpro.hellojpro.page.FXMLPage;
import com.jpro.hellojpro.page.InfoPage;
import com.jpro.hellojpro.page.LandingPage;
import com.jpro.routing.Redirect;
import com.jpro.routing.WebApp;
import com.jpro.webapi.JProApplication;
import com.jpro.webapi.WebAPI;
import javafx.stage.Stage;

public class HelloJProApp extends WebApp {
    HelloJProApp(Stage stage) {
        super(stage);
        getStylesheets().add(getClass().getResource("/com/jpro/hellojpro/css/HelloJPro.css").toString());

        addRoute((s) -> { switch(s) {
            case "":
            case "/":
                return new Redirect("/landing");
            case "/landing":
                return new LandingPage(WebAPI.isBrowser() ? WebAPI.getWebAPI(stage) : null);
            case "/info":
                return new InfoPage(WebAPI.isBrowser() ? WebAPI.getWebAPI(stage) : null);
            case "/fxml":
                return new FXMLPage(WebAPI.isBrowser() ? WebAPI.getWebAPI(stage) : null);
            default:
                return null;
        }});
    }
}
