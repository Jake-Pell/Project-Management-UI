module projectmangement {
    requires javafx.controls;
    requires javafx.fxml;

    opens projectmangement to javafx.fxml;
    exports projectmangement;
}
