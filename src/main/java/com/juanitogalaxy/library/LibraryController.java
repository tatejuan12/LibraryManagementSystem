package com.juanitogalaxy.library;

import java.io.IOException;
import com.juanitogalaxy.utils.Helper;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LibraryController {
    @FXML
    public TextField memberName;

    @FXML
    public void handleButton1Action() {

    }

    @FXML
    public void addMemberController() {
        // library.addMember();
    }

    @FXML
    public void changeScene(ActionEvent event) throws IOException {
        Button btn = (Button) event.getSource();
        Stage primaryStage = (Stage) btn.getScene().getWindow();
        primaryStage.getScene().setRoot(Helper.loadFXML("addBook"));
    }

}
// Parent newRoot = FXMLLoader.load(getClass().getResource("lessons.fxml"));
// primaryStage.getScene().setRoot(newRoot);

// Also note you can get the stage from any node, e.g. in the controller you can
// do Stage primaryStage = (Stage) loginBtn.getScene().getWindow();