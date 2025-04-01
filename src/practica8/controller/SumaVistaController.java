package practica8.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumaVistaController {

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
        int resultado = Integer.parseInt(txtNum1.getText()) + Integer.parseInt(txtNum2.getText());
        txtResult.setText(Integer.toString(resultado));
    }

}
