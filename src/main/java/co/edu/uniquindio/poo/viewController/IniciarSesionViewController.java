package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class IniciarSesionViewController{

    @FXML
    private ResourceBundle resources;

    App app;
    @FXML
    private URL location;

    @FXML
    private Button btn_cliente;

    @FXML
    private ImageView img_logo;

    @FXML
    private Label lbl_iniciarSesion;

    @FXML
    private Button btn_administrador;

    @FXML
    void OnOpenGestionar() {
        app.openGestionar();

    }

    @FXML
    void onOpenIniciarSesionCliente() {
        app.openIniciarSesionCliente();

    }

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {

    }
}


