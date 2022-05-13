package com.example.proyectonuevo.Animation;

import com.example.proyectonuevo.HelloApplication;
import com.example.proyectonuevo.Tablas.Registros;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FIFOAnimation implements Initializable {
    @FXML
    private TableView TablaFIFO;

    @FXML
    private Circle US1,US2,US3,US4,US5,Lugar4,Lugar3,Lugar2,Lugar1;

    double RegistrosLlega[] = {9.02,9.13,9.14,9.18};
    double RegistrosEntra[] = {9.02,9.13,9.33,9.40};
    double RegistrosSale[] = {9.07,9.33,9.4,9.43};
    double RegistrosEspera[] = {0,0,9,19};

    int lugar = 0;
    @FXML
    private void regresar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/proyectonuevo/FIFO.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
        ( (Node) (event.getSource() ) ).getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(RegistrosEntra.length == 1){
            US1.setFill(Color.BLUE);
        }
        if(RegistrosEntra.length == 2){
            US1.setFill(Color.BLUE);
            US2.setFill(Color.BLUE);
        }
        if(RegistrosEntra.length == 3){
            US1.setFill(Color.BLUE);
            US2.setFill(Color.BLUE);
            US3.setFill(Color.BLUE);
        }
        if(RegistrosEntra.length == 4){
            US1.setFill(Color.BLUE);
            US2.setFill(Color.BLUE);
            US3.setFill(Color.BLUE);
            US4.setFill(Color.BLUE);
        }
        if(RegistrosEntra.length == 5){
            US1.setFill(Color.BLUE);
            US2.setFill(Color.BLUE);
            US3.setFill(Color.BLUE);
            US4.setFill(Color.BLUE);
            US5.setFill(Color.BLUE);
        }
    }

    @FXML
    private void SimulacionUs(ActionEvent event) throws IOException {
        lugar++;

        if(lugar == 1){
            PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 350, 0), US1);
            pathTransition.setCycleCount(1);
            pathTransition.play();
        }
        if(lugar == 2){
            if(RegistrosLlega[1] < RegistrosSale[0]){
                PathTransition pathTransition2 = new PathTransition(Duration.seconds(1), new Line(0, 0, 350, 0), US2);
                pathTransition2.setCycleCount(1);
                pathTransition2.play();
            }else{
                US1.setFill(Color.TRANSPARENT);
                Lugar1.setFill(Color.BLUE);
                PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 100, 0), Lugar1);
                pathTransition.setCycleCount(1);
                pathTransition.play();

                PathTransition pathTransition2 = new PathTransition(Duration.seconds(1), new Line(0, 0, 350, 0), US2);
                pathTransition2.setCycleCount(1);
                pathTransition2.play();
            }
        }
        if(lugar == 3){
            PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 350, 0), US3);
            pathTransition.setCycleCount(1);
            pathTransition.play();
        }
        if(lugar == 4){
            PathTransition pathTransition = new PathTransition(Duration.seconds(1), new Line(0, 0, 350, 0), US4);
            pathTransition.setCycleCount(1);
            pathTransition.play();
        }
    }
}
