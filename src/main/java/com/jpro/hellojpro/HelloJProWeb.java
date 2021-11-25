package com.jpro.hellojpro;

import com.jpro.web.sessionmanager.SessionManager;
import com.jpro.webapi.JProApplication;
import com.jpro.webapi.WebAPI;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import fr.brouillard.oss.cssfx.CSSFX;

public class HelloJProWeb extends Application {

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        CSSFX.start();

        HelloJProApp app = new HelloJProApp(stage);
        Scene scene = new Scene(app);
        stage.setScene(scene);
        stage.show();
        app.start(SessionManager.getDefault(app,stage));
    }
}
