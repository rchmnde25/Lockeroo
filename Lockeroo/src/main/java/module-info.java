module com.example.lockeroo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;
    requires javafx.base;

    opens com.example.lockeroo to javafx.fxml;
    exports com.example.lockeroo;
}