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

public class EditTaskController implements javafx.fxml.Initializable {

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
    private void saveTask(ActionEvent event) throws IOException {
        ProjectApplication pa = ProjectApplication.getInstance();
        String name = taskName.getText();
        String desc = description.getText();
        int priority =  priorityBox.getValue();
        String column = columnSelectBox.getValue();
        pa.setCurrentColumn(column);

        if (pa.editTaskName(name) && pa.editTaskDescription(desc) && pa.editTaskPriority(priority) && pa.moveTask(column))
            App.setRoot("project");


    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ProjectApplication pa = ProjectApplication.getInstance();
        ArrayList<String> columnOptions = pa.getProjectColumns();
        columnSelectBox.setItems(FXCollections
                                 .observableArrayList(columnOptions));

        // auto populate task details
        taskName.setText(pa.getCurrentTaskName());
        description.setText(pa.getCurrentTaskDescription());
        priorityBox.setValue(pa.getCurrentTaskPriority());
        columnSelectBox.setValue(pa.getCurrentColumnName());

    }


}
