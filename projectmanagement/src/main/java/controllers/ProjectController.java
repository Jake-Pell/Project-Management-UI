package controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import library.App;

public class ProjectController {
   
    @FXML
    private Button home;

    @FXML
    private void getProjectList() throws IOException {
        App.setRoot("projectList");
    }
}
