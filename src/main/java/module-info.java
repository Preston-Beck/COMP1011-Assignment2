module com.example.comp1011assignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    exports com.example.comp1011assignment2;
    exports com.example.comp1011assignment2.Controller;
    opens com.example.comp1011assignment2.Controller to javafx.fxml;
    exports com.example.comp1011assignment2.Model;
}