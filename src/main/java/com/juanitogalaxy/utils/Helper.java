package com.juanitogalaxy.utils;

import java.io.IOException;

import com.juanitogalaxy.App;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Helper {

    public static Parent loadFXML(String fxml) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

}
