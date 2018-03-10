module com.github.mtf90 {
    exports com.github.mtf90;
    exports com.github.mtf90.model;
    exports com.github.mtf90.view;

    opens com.github.mtf90 to javafx.fxml;

    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
}