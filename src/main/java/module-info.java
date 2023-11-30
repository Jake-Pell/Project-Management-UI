module projectmanagement {
    requires javafx.controls;
    requires javafx.fxml;

    opens projectmanagement to javafx.fxml;
    exports projectmanagement;
}
