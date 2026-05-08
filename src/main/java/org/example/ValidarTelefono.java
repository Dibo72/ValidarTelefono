package org.example;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class ValidarTelefono extends Application {
    public void start(Stage stage){
        TextField telefono = new TextField();

        Label informacion = new Label("Telefono:");

        Label etiqueta = new Label();

        Button validar = new Button("Validar");

        validar.setOnAction(e -> {
            String numero = telefono.getText();
            if(numero.matches("\\d{9}")){
                etiqueta.setText("Valido");
            }else{
                etiqueta.setText("Invalido");
            }
        });

        VBox contenedor = new VBox(10, informacion, telefono, validar, etiqueta);

        Scene escena = new Scene(contenedor, 300, 200);
        stage.setScene(escena);
        stage.setTitle("Validar Telefono");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}