package com.jpro.hellojpro.page;


import com.jpro.webapi.WebAPI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import one.jpro.platform.routing.LinkUtil;

import java.io.IOException;

public class LandingPage extends DefaultPage {

    public LandingPage(WebAPI webAPI) {
        super(webAPI);
    }

    @Override
    public Node pageContent() {
        FlowPane flow = new FlowPane();
        flow.getStyleClass().add("flow-pane");
        flow.getChildren().add(new BigCell(1, "Markdown Page", "/info"));
        flow.getChildren().add(new BigCell(2, "FXML Page", "/fxml"));
        flow.getChildren().add(new BigCell(3, "", "https://www.jpro.one"));
        flow.getChildren().add(new BigCell(4, "", "https://www.javafx-ensemble.com"));
        flow.getChildren().add(new BigCell(5, "", "https://www.jfx-central.com"));
        flow.getChildren().add(new BigCell(6, "", "https://openjfx.io"));
        return flow;
    }

    class BigCell extends StackPane {
        BigCell(int i, String txt, String link) {
            LinkUtil.setLink(this, link);
            getStyleClass().add("big-cell");
            getStyleClass().add("big-cell-" + i);
            getChildren().add(new Label(txt));

            //getChildren().add(new ImageView(new Image("https://www.jpro.one/app/default/resourcesencoded/jar:file:/home/ubuntu/jpro/jpro.one-jpro/libs/jpro.one.jar!/one/jpro/img/demos/jpro.one.jpg")));
        }
    }
}
