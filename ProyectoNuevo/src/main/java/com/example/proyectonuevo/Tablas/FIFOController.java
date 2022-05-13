package com.example.proyectonuevo.Tablas;

import com.example.proyectonuevo.HelloApplication;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FIFOController implements Initializable {
    ArrayList<Registros> array= new ArrayList<>();
    ObservableList<Registros> lista;
    private int cont = 1;
    int cont_aux=0;
    @FXML
    private TableColumn<Registros,Integer> colNo;
    @FXML
    private TableColumn<Registros, Double> col_aten;
    @FXML
    private TableColumn<Registros, Double> col_llega;
    @FXML
    private TableView<Registros> tableViewLista;

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

        if(cont <= 5) {

            minutos_atencion = hora_llega / 10;

            array.add(new Registros(cont, hora_llega, minutos_atencion));
            lista.add(array.get(cont_aux));
            txtTiempoAtencion.setText("");
            txtTiempoLLegada.setText("");
            cont++;
            cont_aux++;
        }
        if (array.size() == 5) {
            System.out.println("Ya no entan");
            arreglo();
        }

    }

    void arreglo(){
        lista.forEach(System.out::println);
        tableViewLista.setItems(lista);
        array.forEach(registros -> System.out.println(registros));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lista = FXCollections.observableArrayList();
        //colNo.setCellValueFactory(new PropertyValueFactory("noControl"));
        colNo.setCellValueFactory(new PropertyValueFactory("id"));
        col_llega.setCellValueFactory(new PropertyValueFactory("tiempo_llegada"));
        col_aten.setCellValueFactory(new PropertyValueFactory("tiempo_atencion"));

    }
}
