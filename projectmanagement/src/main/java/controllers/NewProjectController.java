package controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import library.App;
import model.ProjectApplication;

public class NewProjectController {
    @FXML
    private TextField projectName;
    
    @FXML
    private void CreateProject() throws IOException {
       String pName = projectName.getText();
       ProjectApplication pa = ProjectApplication.getInstance();
       pa.addProject(pName);
       App.setRoot("projectList");
    }
}
