package com.jpro.hellojpro.page;

import com.jpro.hellojpro.component.Header;

import com.jpro.webapi.WebAPI;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import one.jpro.platform.routing.View;

public abstract class DefaultPage extends View {

    WebAPI webAPI;

    public DefaultPage(WebAPI webAPI) {
        this.webAPI = webAPI;
    }

    @Override
    public String title() {
        return "Title: Hello JPro";
    }

    @Override
    public String description() {
        return "I'm the description. Google will find me!";
    }

    @Override
    public boolean fullscreen() {
        return false;
    }

    @Override
    public Node content() {
        VBox innerVBox = new VBox(pageContent());
        innerVBox.getStyleClass().add("page-inner-vbox");
        VBox root = new VBox();
        root.getStyleClass().add("page-outer-vbox");
        root.getChildren().add(new Header(url()));
        root.getChildren().add(innerVBox);
        return root;
    }

    abstract public Node pageContent();
}
