package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import library.App;
import model.ProjectApplication;
import java.util.ArrayList;


public class ProjectController implements javafx.fxml.Initializable {
   
    @FXML
    private Button home;

    @FXML
    private Label projectName;

    @FXML
    private HBox projectBox;

    @FXML
    private Button saveButton;

    @FXML
    private void getProjectList() throws IOException {
        App.setRoot("projectList");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        projectBox.getChildren().add(new Separator(Orientation.VERTICAL));
        ProjectApplication pa = ProjectApplication.getInstance();
        projectName.setText(pa.getCurrentProjectName());

        ArrayList<String> columns = pa.getProjectColumns();
        for (String name : columns) {
            pa.setCurrentColumn(name);
            addColumn(name);
        }
    }

    private void addColumn(String columnName) {
        ProjectApplication pa = ProjectApplication.getInstance();
        // create a vbox for the column
        VBox columnBox = new VBox();
        columnBox.setAlignment(Pos.TOP_CENTER);


        // add contents of the column
        TextField columnText = new TextField(columnName);
        columnText.textProperty().addListener((observable, oldValue, newValue) -> {
            pa.editColumnName(newValue);
        });
        //columnText.setPadding(new Insets(0,25,0,25));
        columnText.setAlignment(Pos.CENTER);
        columnBox.getChildren().add(columnText);

        // add column to project box
        projectBox.getChildren().add(columnBox);

        //vertical line after
        projectBox.getChildren().add(new Separator(Orientation.VERTICAL));


    }

    
    @FXML
    private void saveProject(ActionEvent event) {
        ProjectApplication pa = ProjectApplication.getInstance();
        pa.saveProjects();
    }
    
}
