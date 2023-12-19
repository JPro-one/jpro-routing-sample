package com.jpro.hellojpro.component;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import one.jpro.platform.routing.LinkUtil;

public class Header extends HBox {
    String currentURL;
    public Header(String currentURL) {
        this.currentURL = currentURL;
        getStyleClass().add("header");
        getChildren().add(new Link("Header","/landing"));
        getChildren().add(new Link("Info","/info"));
        getChildren().add(new Link("FXML","/fxml"));
    }

    class Link extends Label {
        Link(String txt, String link) {
            super(txt);
            LinkUtil.setLink(this,link,txt);
            getStyleClass().add("header-link");
            System.out.println("currentURL: \"" + currentURL + "\"");
            System.out.println("link: \"" + link + "\"");
            if(link.equals(currentURL)) {
                System.out.println("Was true!");
                getStyleClass().add("header-link-selected");
            }
        }
    }
}
