package com.jpro.hellojpro;

import com.jpro.hellojpro.page.FXMLPage;
import com.jpro.hellojpro.page.InfoPage;
import com.jpro.hellojpro.page.LandingPage;
import com.jpro.webapi.WebAPI;
import one.jpro.routing.Route;
import one.jpro.routing.RouteApp;
import one.jpro.routing.RouteUtils;

public class HelloRoutingApp extends RouteApp {
    @Override
    public Route createRoute() {

        getScene().getStylesheets().add(getClass().getResource("/com/jpro/hellojpro/css/HelloJPro.css").toString());

        return Route.empty()
            .and(RouteUtils.redirect("/", "/landing"))
            .and(RouteUtils.redirect("/", "/landing"))
            .and(RouteUtils.get("/landing", (s) -> new LandingPage(WebAPI.isBrowser() ? WebAPI.getWebAPI(getStage()) : null)))
            .and(RouteUtils.get("/info", (s) -> new InfoPage(WebAPI.isBrowser() ? WebAPI.getWebAPI(getStage()) : null)))
            .and(RouteUtils.get("/fxml", (s) -> new FXMLPage(WebAPI.isBrowser() ? WebAPI.getWebAPI(getStage()) : null)));
    }

    /*
    HelloJProApp(Stage stage) {
        super(stage);


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
        }});*/
}
