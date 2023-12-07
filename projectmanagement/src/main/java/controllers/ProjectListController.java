package controllers;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import library.App;
import model.ProjectApplication;
import model.Project;

public class ProjectListController implements javafx.fxml.Initializable {
    
    @FXML
    private Label welcome;

    @FXML
    private HBox mainHBox;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ProjectApplication pa = ProjectApplication.getInstance();
        welcome.setText("Welcome, " + pa.getCurrentUserFirstName());
        ArrayList<Project> projects = pa.getUserProjects();
        for (int i = 0; i < projects.size(); ++i) {
            VBox newVBox = new VBox();
        }
    }

    @FXML
    private void addButton(ActionEvent event) throws IOException {
        App.setRoot("newProject");
        // VBox newVBox = new VBox();
        // Label textLabel = new Label("NEW VBOX");
        // newVBox.getChildren().add(textLabel);
        // mainHBox.getChildren().add(newVBox);
    }
}
