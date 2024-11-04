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

public class CrudCamionesViewController{

    @FXML
    private ResourceBundle resources;

    private App app;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> tbc_modeloCamion;

    @FXML
    private TableColumn<?, ?> tbc_añoCamion;

    @FXML
    private Button btn_añadirCamion;

    @FXML
    private TableColumn<?, ?> tbc_marcaCamion;

    @FXML
    private Label lbl_marcaCamion;

    @FXML
    private Label lbl_matriculaCamion;

    @FXML
    private TableColumn<?, ?> tbc_capacidadCarga;

    @FXML
    private TableColumn<?, ?> tbc_matriculaCamion;

    @FXML
    private TextField txt_numeroPuertas;

    @FXML
    private TextField txt_modeloAuto;

    @FXML
    private TableView<?> tb_listCamiones;

    @FXML
    private Label lbl_modeloCamion;

    @FXML
    private Label lbl_añoCamion;

    @FXML
    private Button btn_eliminarCamion;

    @FXML
    private Button btn_limpiarCamion;

    @FXML
    private Button btn_actualizarCamion;

    @FXML
    private AnchorPane btn_actualizarAuto;

    @FXML
    private TextField txt_marcaAuto;

    @FXML
    private ImageView img_logo;

    @FXML
    private Label lbl_capacidad;

    @FXML
    private TextField txt_añodefabricacionAuto;

    @FXML
    private TextField txt_matriculaAuto;

    public void setApp(App app) {
        this.app = app;
    }



    @FXML
    void initialize() {
        assert tbc_modeloCamion != null : "fx:id=\"tbc_modeloCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert tbc_añoCamion != null : "fx:id=\"tbc_añoCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert btn_añadirCamion != null : "fx:id=\"btn_añadirCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert tbc_marcaCamion != null : "fx:id=\"tbc_marcaCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert lbl_marcaCamion != null : "fx:id=\"lbl_marcaCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert lbl_matriculaCamion != null : "fx:id=\"lbl_matriculaCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert tbc_capacidadCarga != null : "fx:id=\"tbc_capacidadCarga\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert tbc_matriculaCamion != null : "fx:id=\"tbc_matriculaCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert txt_numeroPuertas != null : "fx:id=\"txt_numeroPuertas\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert txt_modeloAuto != null : "fx:id=\"txt_modeloAuto\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert tb_listCamiones != null : "fx:id=\"tb_listCamiones\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert lbl_modeloCamion != null : "fx:id=\"lbl_modeloCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert lbl_añoCamion != null : "fx:id=\"lbl_añoCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert btn_eliminarCamion != null : "fx:id=\"btn_eliminarCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert btn_limpiarCamion != null : "fx:id=\"btn_limpiarCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert btn_actualizarCamion != null : "fx:id=\"btn_actualizarCamion\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert btn_actualizarAuto != null : "fx:id=\"btn_actualizarAuto\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert txt_marcaAuto != null : "fx:id=\"txt_marcaAuto\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert img_logo != null : "fx:id=\"img_logo\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert lbl_capacidad != null : "fx:id=\"lbl_capacidad\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert txt_añodefabricacionAuto != null : "fx:id=\"txt_añodefabricacionAuto\" was not injected: check your FXML file 'crudCamiones.fxml'.";
        assert txt_matriculaAuto != null : "fx:id=\"txt_matriculaAuto\" was not injected: check your FXML file 'crudCamiones.fxml'.";

    }
}

