package co.edu.uniquindio.poo.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class CrudClientesViewController{

    @FXML
    private ResourceBundle resources;

    private App app;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> tbc_telefono;

    @FXML
    private TableColumn<?, ?> tbc_edad;

    @FXML
    private TableColumn<?, ?> tbc_apellido;

    @FXML
    private Label lbl_telefonoCliente;

    @FXML
    private TextField txt_email;

    @FXML
    private TableColumn<?, ?> tbc_email;

    @FXML
    private TextField txt_aedad;

    @FXML
    private TableColumn<?, ?> tbc_nombre;

    @FXML
    private AnchorPane btn_actualizarAuto;

    @FXML
    private TextField txt_nombreCliente;

    @FXML
    private Label lbl_cedulaCliente;

    @FXML
    private TextField txt_cedula;

    @FXML
    private TableView<?> tb_listClientes;

    @FXML
    private TableColumn<?, ?> tbc_cedula;

    @FXML
    private Button btn_actualizarCliente;

    @FXML
    private Button btn_limpiarCliente;

    @FXML
    private Label lbl_apellidoCliente;

    @FXML
    private TextField txt_apellido;

    @FXML
    private TextField txt_telefono;

    @FXML
    private Label lbl_nombreCliente;

    @FXML
    private Label lbl_emailCliente;

    @FXML
    private Button btn_añadirCliente;

    @FXML
    private Label lbl_edadCliente;

    @FXML
    private Label lbl_gestionMotos;

    @FXML
    private ImageView img_logo;

    @FXML
    private Button btn_eliminarCliente;

    public void setApp(App app) {
        this.app = app;
    }


    @FXML
    void initialize() {
        assert tbc_telefono != null : "fx:id=\"tbc_telefono\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert tbc_edad != null : "fx:id=\"tbc_edad\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert tbc_apellido != null : "fx:id=\"tbc_apellido\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert lbl_telefonoCliente != null : "fx:id=\"lbl_telefonoCliente\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert txt_email != null : "fx:id=\"txt_email\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert tbc_email != null : "fx:id=\"tbc_email\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert txt_aedad != null : "fx:id=\"txt_aedad\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert tbc_nombre != null : "fx:id=\"tbc_nombre\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert btn_actualizarAuto != null : "fx:id=\"btn_actualizarAuto\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert txt_nombreCliente != null : "fx:id=\"txt_nombreCliente\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert lbl_cedulaCliente != null : "fx:id=\"lbl_cedulaCliente\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert txt_cedula != null : "fx:id=\"txt_cedula\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert tb_listClientes != null : "fx:id=\"tb_listClientes\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert tbc_cedula != null : "fx:id=\"tbc_cedula\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert btn_actualizarCliente != null : "fx:id=\"btn_actualizarCliente\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert btn_limpiarCliente != null : "fx:id=\"btn_limpiarCliente\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert lbl_apellidoCliente != null : "fx:id=\"lbl_apellidoCliente\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert txt_apellido != null : "fx:id=\"txt_apellido\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert txt_telefono != null : "fx:id=\"txt_telefono\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert lbl_nombreCliente != null : "fx:id=\"lbl_nombreCliente\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert lbl_emailCliente != null : "fx:id=\"lbl_emailCliente\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert btn_añadirCliente != null : "fx:id=\"btn_añadirCliente\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert lbl_edadCliente != null : "fx:id=\"lbl_edadCliente\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert lbl_gestionMotos != null : "fx:id=\"lbl_gestionMotos\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert img_logo != null : "fx:id=\"img_logo\" was not injected: check your FXML file 'crudClientes.fxml'.";
        assert btn_eliminarCliente != null : "fx:id=\"btn_eliminarCliente\" was not injected: check your FXML file 'crudClientes.fxml'.";

    }
}

