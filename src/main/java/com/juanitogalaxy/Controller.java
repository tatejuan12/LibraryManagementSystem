package com.juanitogalaxy;

import java.io.IOException;

import com.juanitogalaxy.library.Library;
import com.juanitogalaxy.library.LibraryController;
import com.juanitogalaxy.library.entities.controllers.MemberController;
import com.juanitogalaxy.utils.Helper;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXML;

public abstract class Controller {
    protected Library library;
    private LibraryController libraryController;
    private MemberController memberController;

    public Controller(Library library) {
        this.library = library;

    }

    protected LibraryController getLibraryController() {
        if (libraryController == null)
            return new LibraryController(library);
        return this.libraryController;
    }

    protected MemberController getMemberController() {
        if (memberController == null)
            return new MemberController(library);
        return this.memberController;
    }

    protected <T extends Controller> void changeScene(ActionEvent event, String fxmlName, T controller)
            throws IOException {
        Parent fxml = Helper.loadFXML(fxmlName, controller);
        Button btn = (Button) event.getSource();
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.getScene().setRoot(fxml);
    }
}