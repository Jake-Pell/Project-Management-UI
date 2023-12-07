package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import library.App;
import model.ProjectApplication;


public class ProjectController implements javafx.fxml.Initializable {
   
    @FXML
    private Button home;

    @FXML
    private Label projectName;

    @FXML
    private void getProjectList() throws IOException {
        App.setRoot("projectList");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ProjectApplication pa = ProjectApplication.getInstance();
        projectName.setText(pa.getCurrentProjectName());
    }

    
}
