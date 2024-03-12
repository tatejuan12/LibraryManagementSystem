package com.juanitogalaxy.library;

import java.io.IOException;

import com.juanitogalaxy.Controller;
import com.juanitogalaxy.library.entities.controllers.MemberController;
import com.juanitogalaxy.utils.Helper;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public final class LibraryController extends Controller {

    public LibraryController(Library library) {
        super(library);
    }

    // ! I need to pass a Controller class to the changeScene method, but it needs
    // to be dynamic so it can accommodate different controllers.
    // ! I am thinking I need to make a main Controller class and extend other
    // conrollers, and pass main into the method.
    @FXML
    public void handleAddMember(ActionEvent event) throws IOException {
        changeScene(event, "addMember", new MemberController(library));
    }

}