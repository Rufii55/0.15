module com.empresa.javafx_sp2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;
    requires java.sql;


    opens com.empresa.javafx_sp2 to javafx.fxml;
    exports com.empresa.javafx_sp2;
}