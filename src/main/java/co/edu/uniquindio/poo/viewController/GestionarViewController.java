package co.edu.uniquindio.poo.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class GestionarViewController {

    @FXML
    private ResourceBundle resources;

    private App app;
    @FXML
    private URL location;

    @FXML
    private ImageView img_logo;

    @FXML
    private Label lbl_accion;

    @FXML
    private Button btn_vehiculos;

    @FXML
    private Button btn_clientes;

    @FXML
    private Button btn_reservas;

    @FXML
    void onOpenTipoVehiculo() {
        app.openTipoDeVehiculo();

    }

    @FXML
    void onOpenCrudClientes() {
        app.openCrudClientes();

    }

    @FXML
    void onOpenCrudReservas() {
        app.openCrudReservas();

    }

    public void setApp(App app) {
        this.app = app;
    }
    

    @FXML
    void initialize() {
        assert img_logo != null : "fx:id=\"img_logo\" was not injected: check your FXML file 'gestionar.fxml'.";
        assert lbl_accion != null : "fx:id=\"lbl_accion\" was not injected: check your FXML file 'gestionar.fxml'.";
        assert btn_vehiculos != null : "fx:id=\"btn_vehiculos\" was not injected: check your FXML file 'gestionar.fxml'.";
        assert btn_clientes != null : "fx:id=\"btn_clientes\" was not injected: check your FXML file 'gestionar.fxml'.";
        assert btn_reservas != null : "fx:id=\"btn_reservas\" was not injected: check your FXML file 'gestionar.fxml'.";

    }
}

