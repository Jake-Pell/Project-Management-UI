package controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import library.App;
import model.ProjectApplication;

public class NewProjectController {
    @FXML
    private TextField projectName;

    @FXML
    private Button backButton;
    
    @FXML
    private void CreateProject() throws IOException {
       String pName = projectName.getText();
       ProjectApplication pa = ProjectApplication.getInstance();
       if (pa.addProject(pName)) {
        pa.saveAll();
        App.setRoot("projectList");
       } 
    }

    @FXML
    private void backToProjects() throws IOException {
        App.setRoot("projectList");
    }
}
