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
    private VBox mainVBox;

    @FXML
    void goToNewProject(ActionEvent event) throws IOException {
        App.setRoot("newProject");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        ProjectApplication pa = ProjectApplication.getInstance();
        welcome.setText("Welcome, " + pa.getCurrentUserFirstName());
        ArrayList<Project> projects = pa.getUserProjects();
        mainVBox.setAlignment(Pos.CENTER);
        mainVBox.setSpacing(20);
        for (int i = 0; i < projects.size();) {
            HBox currHBox = new HBox();
            HBox newHBox;
            for (int j = 0; j < 3 && i < projects.size(); ++j) {

                newHBox = createHBox(projects.get(i).getName());
                currHBox.getChildren().add(newHBox);
                ++i;
            }
            mainVBox.getChildren().add(currHBox);
            // Label pNameLabel = new Label(projects.get(i).getName());
            // newVBox.getChildren().add(pNameLabel);
        }
    }

    private HBox createHBox(String projectName) {
        HBox hbox = new HBox();
        Button button = new Button(projectName);
        hbox.getChildren().add(button);
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
        button.setMinSize(100, 50);
        return hbox;
    }


    @FXML
    private void addButton(ActionEvent event) throws IOException {
        App.setRoot("newProject");
        
    }
}
