package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ClienteHacerReservaViewController {

    @FXML
    private ResourceBundle resources;

    private App app;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tb_listReservaCliente;

    @FXML
    private ImageView img_logo;

    @FXML
    private TableColumn<?, ?> tbc_dias;

    @FXML
    private TextField txt_dias;

    @FXML
    private ComboBox<?> cb_vehiculo;

    @FXML
    private Button tbn_calcularCosto;

    @FXML
    private Label txt_preguntarVehiculo;

    @FXML
    private Button tbn_resercar;

    @FXML
    private Button tbn_resercar1;

    @FXML
    private TableColumn<?, ?> tbc_vehiculo;

    @FXML
    private TableColumn<?, ?> tbc_costo;

    @FXML
    private Button tbn_calcularCosto1;

    public void setApp(App app) {
        this.app = app;
    }


    @FXML
    void initialize() {
        assert tb_listReservaCliente != null : "fx:id=\"tb_listReservaCliente\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";
        assert img_logo != null : "fx:id=\"img_logo\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";
        assert tbc_dias != null : "fx:id=\"tbc_dias\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";
        assert txt_dias != null : "fx:id=\"txt_dias\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";
        assert cb_vehiculo != null : "fx:id=\"cb_vehiculo\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";
        assert tbn_calcularCosto != null : "fx:id=\"tbn_calcularCosto\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";
        assert txt_preguntarVehiculo != null : "fx:id=\"txt_preguntarVehiculo\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";
        assert tbn_resercar != null : "fx:id=\"tbn_resercar\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";
        assert tbn_resercar1 != null : "fx:id=\"tbn_resercar1\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";
        assert tbc_vehiculo != null : "fx:id=\"tbc_vehiculo\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";
        assert tbc_costo != null : "fx:id=\"tbc_costo\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";
        assert tbn_calcularCosto1 != null : "fx:id=\"tbn_calcularCosto1\" was not injected: check your FXML file 'clienteHacerReserva.fxml'.";

    }
}
