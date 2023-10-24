module com.github.mtf90 {
    exports com.github.mtf90;

    opens com.github.mtf90.view to javafx.fxml;
    opens com.github.mtf90.view.controller to javafx.fxml;
    opens com.github.mtf90.view.component to javafx.fxml;

    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
}