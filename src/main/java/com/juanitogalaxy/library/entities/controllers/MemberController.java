package com.juanitogalaxy.library.entities.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class MemberController {
    @FXML
    private TextField memberName;
    @FXML
    private TextField memberPhone;

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

        // library.addMember();
    }

}
