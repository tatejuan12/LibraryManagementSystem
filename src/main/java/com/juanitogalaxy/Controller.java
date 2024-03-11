package com.juanitogalaxy;

import java.io.IOException;

import com.juanitogalaxy.utils.Helper;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXML;

public class Controller {

    public void changeScene(ActionEvent event, String fxmlName, Controller controller) throws IOException {
        Parent fxml = Helper.loadFXML(fxmlName, controller);
        // ! We would need to pass controller over here like (MemberController(library))
        // so i can pass library
        Button btn = (Button) event.getSource();
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.getScene().setRoot(fxml);
    }

    @FXML
    private void test(MouseEvent event) {
        System.out.println("wow works");
    }
}