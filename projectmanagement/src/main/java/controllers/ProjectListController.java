package controllers;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
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
    private Button createProject;

    @FXML
    private HBox mainHBox;

    @FXML
    void goToNewProject(ActionEvent event) throws IOException {
        App.setRoot("newProject");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ProjectApplication pa = ProjectApplication.getInstance();
        welcome.setText("Welcome, " + pa.getCurrentUserFirstName());
        ArrayList<Project> projects = pa.getUserProjects();
        mainHBox.setAlignment(Pos.CENTER);
        mainHBox.setSpacing(20);
        for (int i = 0; i < projects.size(); ++i) {
            VBox newVBox = createVBox(projects.get(i).getName());
            // Label pNameLabel = new Label(projects.get(i).getName());
            // newVBox.getChildren().add(pNameLabel);
            mainHBox.getChildren().add(newVBox);

        }
    }

    private VBox createVBox(String projectName) {
        VBox vbox = new VBox();
        Button button = new Button(projectName);
        vbox.getChildren().add(button);
        button.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent arg0){
                ProjectApplication pa = ProjectApplication.getInstance();
                pa.setCurrentProject(projectName);
                try {
                    App.setRoot("project");
                } catch (IOException e) {
                    e.printStackTrace();
                }    
            }
        }); 
        return vbox;
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
