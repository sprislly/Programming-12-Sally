module com.example.finalprojectsally {
    requires javafx.controls;
    requires javafx.fxml;
    requires derby;
    requires java.sql;



    opens com.example.finalprojectsally to javafx.fxml;
    exports com.example.finalprojectsally;
}