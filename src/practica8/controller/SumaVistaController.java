package practica8.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SumaVistaController implements Initializable {

    @FXML
    private Button btnSumar;

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private TextField txtResult;

    @FXML
    void btnSumarClick(ActionEvent event) {
        double resultado;

        try {
            resultado = Double.parseDouble(txtNum1.getText()) + Double.parseDouble(txtNum2.getText());
            txtResult.setText(Double.toString(resultado));
        } catch (NumberFormatException e) {
            mostrarAlertaError("Error al hacer la suma", "Los operandos deben ser números");
        }
    }

    private void mostrarAlertaError(String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnSumar.setOnAction(this::btnSumarClick);
    }
}
