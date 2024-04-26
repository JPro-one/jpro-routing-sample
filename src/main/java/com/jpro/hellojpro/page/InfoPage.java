package com.jpro.hellojpro.page;

import com.jpro.webapi.WebAPI;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import one.jpro.platform.mdfx.MarkdownView;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;

public class InfoPage extends DefaultPage {

    private File readmeFile = new File("README.md");

    public InfoPage(WebAPI webAPI) {
        super(webAPI);
    }

    @Override
    public Node pageContent() {
        try {
            String readmeStr = IOUtils.toString(readmeFile.toURI()   , "utf-8");
            MarkdownView mview = new MarkdownView(readmeStr);
            StackPane infoContainer = new StackPane(mview);
            infoContainer.getStyleClass().add("info-container");
            return infoContainer;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
