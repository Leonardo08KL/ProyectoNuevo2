module com.example.proyectonuevo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectonuevo to javafx.fxml;

    exports com.example.proyectonuevo.Tablas;
    exports com.example.proyectonuevo.Animation;
    exports com.example.proyectonuevo;
    opens com.example.proyectonuevo.Tablas to javafx.fxml;
    opens com.example.proyectonuevo.Animation to javafx.fxml;

}