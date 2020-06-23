package com.jpro.hellojpro.page;

import com.jpro.hellojpro.HelloJProFXMLController;
import com.jpro.web.View;
import com.jpro.webapi.WebAPI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class LandingPage extends View {

    WebAPI webAPI;

    public LandingPage(WebAPI webAPI) {
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
        return true;
    }

    @Override
    public Node content() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/jpro/hellojpro/fxml/HelloJPro.fxml"));
        Scene scene = null;
        try
        {
            Parent root = loader.load();
            HelloJProFXMLController controller = loader.getController();
            controller.init(webAPI);

            return root;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
