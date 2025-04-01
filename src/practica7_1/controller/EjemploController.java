package practica7_1.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.util.Optional;

public class EjemploController {

    @FXML
    private Button btnClean;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnSend;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtNombre;

    @FXML
    void btnCleanClick(ActionEvent event) { 
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtNombre.requestFocus();
    }

    @FXML
    void btnExitClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("¿Estás seguro de que quieres salir?");
        Optional<ButtonType> respuesta = alert.showAndWait();
        if (respuesta.get() == ButtonType.OK)
            Platform.exit();
    }

    @FXML
    void btnSendClick(ActionEvent event) {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        Alert alert;

        if (nombre.isEmpty()||apellido.isEmpty()){
            alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Faltan datos por introducir");
            alert.setContentText("Hay que indicar nombre y apellido");
        }else{
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Datos introducidos correctamente.");
            btnCleanClick(new ActionEvent());
        }
        alert.showAndWait();

    }

}
