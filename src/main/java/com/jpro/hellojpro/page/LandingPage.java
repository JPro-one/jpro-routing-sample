package com.jpro.hellojpro.page;

import com.jpro.web.View;
import com.jpro.webapi.WebAPI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class LandingPage extends DefaultPage {

    public LandingPage(WebAPI webAPI) {
        super(webAPI);
    }

    @Override
    public Node pageContent() {
        FlowPane flow = new FlowPane();
        flow.getStyleClass().add("flow-pane");
        flow.getChildren().add(new BigCell(1));
        flow.getChildren().add(new BigCell(2));
        flow.getChildren().add(new BigCell(3));
        flow.getChildren().add(new BigCell(4));
        flow.getChildren().add(new BigCell(5));
        flow.getChildren().add(new BigCell(6));
        return flow;
    }

    class BigCell extends StackPane {
        BigCell(int i) {
            getStyleClass().add("big-cell");
            getStyleClass().add("big-cell-" + i);
            getChildren().add(new Label("BIG CELL!!"));
        }
    }
}
