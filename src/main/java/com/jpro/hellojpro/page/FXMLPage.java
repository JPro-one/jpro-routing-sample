package com.jpro.hellojpro.page;

import com.jpro.webapi.WebAPI;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;

import java.io.IOException;

public class FXMLPage extends DefaultPage {

    @FXML
    private Label label1;

    public FXMLPage(WebAPI webAPI) {
        super(webAPI);
    }

    @Override
    public Node pageContent() {
        try {
            FXMLLoader root = new FXMLLoader(getClass().getResource("/com/jpro/hellojpro/fxml/example.fxml"));
            root.setController(this);
            return root.load();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onButtonPressed(javafx.event.ActionEvent e) {
        System.out.println(" ########################### ");
        label1.setText("Welcome to FXML and JPro!");
    }
}
