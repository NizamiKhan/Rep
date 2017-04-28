package com.nizami.controllers;

import com.nizami.objects.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditDialogController {
    @FXML
    private TextField txtFIO;
    @FXML
    private TextField txtPhone;
    @FXML
    private Button btnOk;
    @FXML
    private Button btnCancel;

    private Person person;

    public void actionClose(ActionEvent actionEvent){
        Node source=(Node) actionEvent.getSource();
        Stage stage=(Stage) source.getScene().getWindow();
        stage.hide();
    }
    public void setPerson(Person person){
        if (person==null){return;}
        this.person=person;
        txtFIO.setText(person.getFio());
        txtPhone.setText(person.getPhone());
    }
    public void actionSave(ActionEvent actionEvent){
        person.setPhone(txtPhone.getText());
        person.setFio(txtFIO.getText());
        actionClose(actionEvent);
    }
    public Person getPerson(){
        return person;
    }
}
