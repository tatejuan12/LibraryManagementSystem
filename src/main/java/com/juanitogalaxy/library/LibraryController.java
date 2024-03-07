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
    public TextField memberName;

    @FXML
    public void changeScene(ActionEvent event, String fxmlName) throws IOException {
        Parent fxml = Helper.loadFXML(fxmlName);
        Button btn = (Button) event.getSource();
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.getScene().setRoot(fxml);
    }

    @FXML
    public void handleAddMember(ActionEvent event) throws IOException {
        changeScene(event, "addMember");
    }

}
// Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
// primaryStage.getScene().setRoot(newRoot);

// Also note you can get the stage from any node, e.g. in the controller you can
// do Stage primaryStage = (Stage) loginBtn.getScene().getWindow();