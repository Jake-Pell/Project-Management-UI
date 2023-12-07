package controllers;
import java.io.IOException;
import javafx.fxml.FXML;
import library.App;
public class NewTaskController {
    



    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("newTask");
    }
}
