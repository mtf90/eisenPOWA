module com.github.mtf90 {
    exports com.github.mtf90;

    opens com.github.mtf90 to javafx.fxml;

    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
}