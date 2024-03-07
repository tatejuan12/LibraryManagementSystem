module com.juanitogalaxy {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.juanitogalaxy to javafx.fxml;

    exports com.juanitogalaxy;
    exports com.juanitogalaxy.library;
    exports com.juanitogalaxy.library.entities;

}
