module com.example.comp1011assignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;

    exports com.example.comp1011assignment2.Controller;
    opens com.example.comp1011assignment2.Model to javafx.fxml, com.google.gson;
    opens com.example.comp1011assignment2.Controller to javafx.fxml;
    exports com.example.comp1011assignment2.Model;
}