package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class iniciarSesionClienteViewController {

    @FXML
    private ResourceBundle resources;

    App app;
    @FXML
    private URL location;

    @FXML
    private TextField txt_correoCliente;

    @FXML
    private Label lbl_apellidoCliente;

    @FXML
    private TextField txt_telefonoClinete;

    @FXML
    private TextField txt_edadCliente;

    @FXML
    private Label lbl_telefonoCliente;

    @FXML
    private TextField txt_cedulaCliente;

    @FXML
    private Label lbl_nombreCliente;

    @FXML
    private Label lbl_edadCliente;

    @FXML
    private Button btn_iniciarSesion;

    @FXML
    private ImageView img_logo;

    @FXML
    private TextField txt_nombreCliente;

    @FXML
    private Label lbl_cedulaCliente;

    @FXML
    private TextField txt_apellidoCliente;

    @FXML
    private Label lbl_correoCliente;

    @FXML
    void onOpenClienteHacerReserva() {
        app.openClienteHacerReserva();

    }

    @FXML
    void onLimpiar() {
        limpiarCamposCliente();

    }

    public void setApp(App app) {
        this.app = app;
    }


    private void limpiarCamposCliente() {
        txt_nombreCliente.clear();
        txt_apellidoCliente.clear();
        txt_cedulaCliente.clear();
        txt_edadCliente.clear();
        txt_correoCliente.clear();
        txt_telefonoClinete.clear();
    }

    @FXML
    void initialize() {

    }
}

