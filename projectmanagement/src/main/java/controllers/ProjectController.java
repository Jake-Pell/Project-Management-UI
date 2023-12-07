package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
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
        // create a vbox for the column
        VBox columnBox = new VBox();
        columnBox.setAlignment(Pos.TOP_CENTER);


        // add contents of the column
        Label columnLabel = new Label(columnName);
        columnLabel.setPadding(new Insets(0,20,0,20));
        columnBox.getChildren().add(columnLabel);

        // add column to project box
        projectBox.getChildren().add(columnBox);

        //vertical line after
        projectBox.getChildren().add(new Separator(Orientation.VERTICAL));


    }

    
}
