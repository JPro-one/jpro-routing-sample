package com.jpro.hellojpro;

import com.jpro.hellojpro.page.FXMLPage;
import com.jpro.hellojpro.page.InfoPage;
import com.jpro.hellojpro.page.LandingPage;
import com.jpro.webapi.WebAPI;
import one.jpro.platform.routing.Response;
import one.jpro.platform.routing.Route;
import one.jpro.platform.routing.RouteApp;
import one.jpro.platform.routing.RouteUtils;

public class HelloRoutingApp extends RouteApp {
    @Override
    public Route createRoute() {

        getScene().getStylesheets().add(getClass().getResource("/com/jpro/hellojpro/css/HelloJPro.css").toString());

        return Route.empty()
            .and(Route.redirect("/", "/landing"))
            .and(Route.redirect("/", "/landing"))
            .and(Route.get("/landing", (r) -> Response.view(new LandingPage(WebAPI.isBrowser() ? WebAPI.getWebAPI(getStage()) : null))))
            .and(Route.get("/info", (r) -> Response.view(new InfoPage(WebAPI.isBrowser() ? WebAPI.getWebAPI(getStage()) : null))))
            .and(Route.get("/fxml", (r) -> Response.view(new FXMLPage(WebAPI.isBrowser() ? WebAPI.getWebAPI(getStage()) : null))));
    }

}
