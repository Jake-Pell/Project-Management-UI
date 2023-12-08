package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import library.App;
import model.ProjectApplication;

public class NewTaskController implements javafx.fxml.Initializable {

    @FXML
    private Button createTaskButton;

    @FXML
    private TextArea description;

    @FXML
    private Button exit;

    @FXML
    private TextField taskName;

    @FXML
    private ComboBox<Integer> priorityBox;

    @FXML
    private ComboBox<String> columnSelectBox;

    @FXML
    private void backToProjectList(ActionEvent event) throws IOException {
        App.setRoot("project");
    }

    @FXML
    void taskList(MouseEvent event) {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ProjectApplication pa = ProjectApplication.getInstance();
        ArrayList<String> columnOptions = pa.getProjectColumns();
        columnSelectBox.setItems(FXCollections
                                 .observableArrayList(columnOptions));
    }

}
