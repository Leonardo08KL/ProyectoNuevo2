package com.example.proyectonuevo.Tablas;

import com.example.proyectonuevo.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CubreBocasController implements Initializable {
    ObservableList<Registros> lista;
    private int cont = 1;
    int cont_aux=0;

    @FXML
    private TableColumn<?, ?> colNo;
    @FXML
    private TableColumn<?, ?> col_Cubrebocas;
    @FXML
    private TableColumn<?, ?> col_aten;
    @FXML
    private TableColumn<?, ?> col_llega;
    @FXML
    private ComboBox<String> comboCubre;
    @FXML
    private TableView<Registros> tablrviewLLegada;
    @FXML
    private TextField txtTiempoAtencion;
    @FXML
    private TextField txtTiempoLLegada;

    @FXML
    private void regresar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/proyectonuevo/PantallaPrincipal.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
    }

    @FXML
    void Insertar(ActionEvent event) {
        String hora_llego = txtTiempoLLegada.getText();
        String hora_aten = txtTiempoAtencion.getText();
        String cubre = comboCubre.getSelectionModel().getSelectedItem().toString();

        if(cont_aux < 5) {
            lista.add(new Registros(cont,hora_llego,hora_aten,cubre));
            cont++;
            cont_aux++;
        }
        else
            arreglo();

    }
    void arreglo(){
        lista.forEach(System.out::println);
        tablrviewLLegada.setItems(lista);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lista = FXCollections.observableArrayList();
        colNo.setCellValueFactory(new PropertyValueFactory("id"));
        col_llega.setCellValueFactory(new PropertyValueFactory("tiempo_llegada"));
        col_aten.setCellValueFactory(new PropertyValueFactory("tiempo_atencion"));
        col_Cubrebocas.setCellValueFactory(new PropertyValueFactory("cubrebocas"));


        ObservableList<String> listaCombo = FXCollections.observableArrayList("Si tiene", "No tiene");
        comboCubre.setItems(listaCombo);
    }
}
