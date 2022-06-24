module com.example.finalprojectsally {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalprojectsally to javafx.fxml;
    exports com.example.finalprojectsally;
}