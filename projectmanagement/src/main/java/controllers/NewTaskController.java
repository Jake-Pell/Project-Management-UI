package controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import library.App;

public class NewTaskController {

    @FXML
    private Button createTaskButton;

    @FXML
    private TextArea description;

    @FXML
    private Button exit;

    @FXML
    private TextField taskName;

    @FXML
    private ComboBox priorityBox;

    @FXML
    private void backToProjectList(ActionEvent event) throws IOException {
        App.setRoot("project");
    }

    @FXML
    void taskList(MouseEvent event) {

    }

}
