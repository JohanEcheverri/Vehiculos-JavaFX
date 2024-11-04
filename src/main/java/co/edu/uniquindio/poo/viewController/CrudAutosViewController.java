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

public class CrudAutosViewController {

    @FXML
    private ResourceBundle resources;
    private App app;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> tbc_matriculaAutos;

    @FXML
    private Button btn_añadirAuto;

    @FXML
    private Label lbl_marcaAuto;

    @FXML
    private TableView<?> tb_listAutos;

    @FXML
    private TableColumn<?, ?> tbc_numeroPuertas;

    @FXML
    private Label lbl_puertas;

    @FXML
    private TextField txt_numeroPuertas;

    @FXML
    private Label lbl_matriculaAuto;

    @FXML
    private Button btn_eliminarAuto;

    @FXML
    private TextField txt_modeloAuto;

    @FXML
    private Label lbl_modeloAuto;

    @FXML
    private Button btn_actualizarAuto;

    @FXML
    private TextField txt_marcaAuto;

    @FXML
    private TableColumn<?, ?> tbc_añoAutos;

    @FXML
    private ImageView img_logo;

    @FXML
    private Button btn_limpiarAuto;

    @FXML
    private TextField txt_añodefabricacionAuto;

    @FXML
    private Label lbl_añoAuto;

    @FXML
    private TableColumn<?, ?> tbc_marcaAutos;

    @FXML
    private TextField txt_matriculaAuto;

    @FXML
    private TableColumn<?, ?> tbc_modeloAutos;

    public void setApp(App app) {
        this.app = app;
    }


    @FXML
    void initialize() {
        assert tbc_matriculaAutos != null : "fx:id=\"tbc_matriculaAutos\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert btn_añadirAuto != null : "fx:id=\"btn_añadirAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert lbl_marcaAuto != null : "fx:id=\"lbl_marcaAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert tb_listAutos != null : "fx:id=\"tb_listAutos\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert tbc_numeroPuertas != null : "fx:id=\"tbc_numeroPuertas\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert lbl_puertas != null : "fx:id=\"lbl_puertas\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert txt_numeroPuertas != null : "fx:id=\"txt_numeroPuertas\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert lbl_matriculaAuto != null : "fx:id=\"lbl_matriculaAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert btn_eliminarAuto != null : "fx:id=\"btn_eliminarAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert txt_modeloAuto != null : "fx:id=\"txt_modeloAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert lbl_modeloAuto != null : "fx:id=\"lbl_modeloAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert btn_actualizarAuto != null : "fx:id=\"btn_actualizarAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert txt_marcaAuto != null : "fx:id=\"txt_marcaAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert tbc_añoAutos != null : "fx:id=\"tbc_añoAutos\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert img_logo != null : "fx:id=\"img_logo\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert btn_limpiarAuto != null : "fx:id=\"btn_limpiarAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert txt_añodefabricacionAuto != null : "fx:id=\"txt_añodefabricacionAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert lbl_añoAuto != null : "fx:id=\"lbl_añoAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert tbc_marcaAutos != null : "fx:id=\"tbc_marcaAutos\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert txt_matriculaAuto != null : "fx:id=\"txt_matriculaAuto\" was not injected: check your FXML file 'crudAutos.fxml'.";
        assert tbc_modeloAutos != null : "fx:id=\"tbc_modeloAutos\" was not injected: check your FXML file 'crudAutos.fxml'.";

    }
}

