package controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import library.App;
import model.ProjectApplication;

public class LoginController {

    @FXML
    private TextField password;

    @FXML
    private TextField username;

    @FXML
    private void switchToProjectList() throws IOException {
        ProjectApplication pa = ProjectApplication.getInstance();
        String pword = password.getText();
        String uname = username.getText();
        if (pa.login(uname, pword))
            App.setRoot("projectList");
    }
}
