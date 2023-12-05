package controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import library.App;

public class SignupController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("login");
    }
}