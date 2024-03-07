module com.example.csd_214_lab_3_amritpreet {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires mysql.connector.j;

    opens com.example.csd_214_lab_3_amritpreet to javafx.fxml;
    exports com.example.csd_214_lab_3_amritpreet;
}