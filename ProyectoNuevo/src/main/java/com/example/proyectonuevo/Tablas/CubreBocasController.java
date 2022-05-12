package com.example.proyectonuevo.Tablas;

import com.example.proyectonuevo.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CubreBocasController {


    @FXML
    private void regresar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/proyectonuevo/Cubrebocas.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
    }
}
