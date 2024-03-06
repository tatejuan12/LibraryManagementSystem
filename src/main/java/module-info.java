module com.juanitogalaxy {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.juanitogalaxy to javafx.fxml;
    exports com.juanitogalaxy;
}
