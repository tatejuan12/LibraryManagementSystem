package com.juanitogalaxy.library.entities.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.juanitogalaxy.Controller;
import com.juanitogalaxy.library.Library;
import com.juanitogalaxy.library.LibraryController;
import com.juanitogalaxy.library.entities.Member;
import com.juanitogalaxy.utils.Helper;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MemberController extends Controller {

    public MemberController(Library library) {
        super(library);
    }

    @FXML
    private TextField memberName;
    @FXML
    private TextField memberPhone;
    @FXML
    private Label errorField;

    public TextField getMemberName() {
        return this.memberName;
    }

    public TextField getMemberPhone() {
        return this.memberPhone;
    }

    public void setMemberPhone(TextField memberPhone) {
        this.memberPhone = memberPhone;
    }

    @FXML
    private void addMemberController(ActionEvent event) {
        String memberNameInput = getMemberName().getText();
        String memberNamePhone = getMemberPhone().getText();
        try {
            library.addMember(Integer.parseInt(memberNamePhone), memberNameInput);

        } catch (NumberFormatException error) {
            errorField.setText("Please enter a phone number consisting of only numbers.");

        }

    }

    @FXML
    private void backToMainSceneController(ActionEvent event) throws IOException {
        changeScene(event, "main", getLibraryController());
    }

}
