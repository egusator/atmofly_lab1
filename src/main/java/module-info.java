module com.example.atmofly_lab1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atmofly_lab1 to javafx.fxml;
    exports com.example.atmofly_lab1;
}