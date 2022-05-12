package com.example.proyectonuevo.Tablas;

import com.example.proyectonuevo.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FIFOController implements Initializable {
    ArrayList<Registros> array= new ArrayList<>();
    private int cont = 1;

    @FXML
    private TextField txtTiempoLLegada;

    @FXML
    private TextField txtTiempoAtencion;

        @FXML
    void regresar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/proyectonuevo/PantallaPrincipal.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
    }

    @FXML
    private void Insertar(ActionEvent event) throws IOException {
        Double hora_llega = Double.parseDouble(txtTiempoLLegada.getText());
        Double minutos_atencion = Double.parseDouble(txtTiempoAtencion.getText());

        if(array.size() < 5) {

            minutos_atencion = hora_llega / 10;

            array.add(new Registros(cont, hora_llega, minutos_atencion));

            txtTiempoAtencion.setText("");
            txtTiempoLLegada.setText("");

            cont++;
        }
        else
            System.out.println("Ya no entan");
        arreglo();
    }

    void arreglo(){
        array.forEach(registros -> System.out.println(registros));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
