package controllers;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.ProjectApplication;

public class ProjectListController implements javafx.fxml.Initializable {
    
    @FXML
    private Label welcome;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ProjectApplication pa = ProjectApplication.getInstance();
        welcome.setText("Welcome, " + pa.getCurrentUserFirstName());
    }
}
