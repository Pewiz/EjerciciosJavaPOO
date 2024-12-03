module com.cine {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.cine.controller to javafx.fxml;
    exports com.cine;
}
