package com.juanitogalaxy.library;

import java.io.IOException;
import com.juanitogalaxy.utils.Helper;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LibraryController {

    @FXML
    // ! I need to pass a Controller class to the changeScene method, but it needs
    // to be dynamic so it can accommodate different controllers.
    // ! I am thinking I need to make a main Controller class and extend other
    // conrollers, and pass main into the method.

    public void changeScene(ActionEvent event, String fxmlName) throws IOException {
        Parent fxml = Helper.loadFXML(fxmlName);
        // ! We would need to pass controller over here like (MemberController(library))
        // so i can pass library
        Button btn = (Button) event.getSource();
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.getScene().setRoot(fxml);
    }

    @FXML
    private void handleAddMember(ActionEvent event) throws IOException {
        changeScene(event, "addMember");
    }

}