module com.juanitogalaxy {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.juanitogalaxy to javafx.fxml;
    opens com.juanitogalaxy.library.entities.controllers to javafx.fxml;

    exports com.juanitogalaxy;
    exports com.juanitogalaxy.library;
    exports com.juanitogalaxy.library.entities;
    exports com.juanitogalaxy.library.entities.controllers;

}
