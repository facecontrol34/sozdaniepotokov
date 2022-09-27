module com.example.statistika {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.statistika to javafx.fxml;
    exports com.example.statistika;
}