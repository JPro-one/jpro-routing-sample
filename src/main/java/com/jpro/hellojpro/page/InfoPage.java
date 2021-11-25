package com.jpro.hellojpro.page;

import com.jpro.webapi.WebAPI;
import com.sandec.mdfx.MarkdownView;
import javafx.scene.Node;

public class InfoPage extends DefaultPage {

    static String infoString = " ### Hello!\n" +
            "I'm some info text!";

    public InfoPage(WebAPI webAPI) {
        super(webAPI);
    }

    @Override
    public Node pageContent() {
        return new MarkdownView(infoString);
    }
}
