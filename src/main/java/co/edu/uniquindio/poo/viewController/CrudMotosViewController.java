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
import javafx.scene.layout.AnchorPane;

public class CrudMotosViewController{

    @FXML
    private ResourceBundle resources;

    private App app;

    @FXML
    private URL location;

    @FXML
    private TextField txt_añodefabricacionMoto;

    @FXML
    private Label lbl_matriculaMoto;

    @FXML
    private TextField txt_modeloMoto;

    @FXML
    private TextField txt_marcaMoto;

    @FXML
    private Label lbl_caja;

    @FXML
    private TextField txt_matriculaMoto;

    @FXML
    private TableColumn<?, ?> tbc_modeloMoto;

    @FXML
    private Button btn_actualizarMoto;

    @FXML
    private Button btn_limpiarMoto;

    @FXML
    private TableView<?> tb_listCamiones;

    @FXML
    private Button btn_añadirMoto;

    @FXML
    private TableColumn<?, ?> tbc_añoMoto;

    @FXML
    private AnchorPane btn_actualizarAuto;

    @FXML
    private Label lbl_gestionMotos;

    @FXML
    private ImageView img_logo;

    @FXML
    private TableColumn<?, ?> tbc_marcaMoto;

    @FXML
    private Label lbl_añoMoto;

    @FXML
    private ComboBox<?> cb_caja;

    @FXML
    private Label lbl_marcaMoto;

    @FXML
    private TableColumn<?, ?> tbc_caja;

    @FXML
    private Button btn_eliminarMoto;

    @FXML
    private TableColumn<?, ?> tbc_matriculaMoto;

    @FXML
    private Label lbl_modeloMoto;

    public void setApp(App app) {
        this.app = app;
    }


    @FXML
    void initialize() {
        assert txt_añodefabricacionMoto != null : "fx:id=\"txt_añodefabricacionMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert lbl_matriculaMoto != null : "fx:id=\"lbl_matriculaMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert txt_modeloMoto != null : "fx:id=\"txt_modeloMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert txt_marcaMoto != null : "fx:id=\"txt_marcaMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert lbl_caja != null : "fx:id=\"lbl_caja\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert txt_matriculaMoto != null : "fx:id=\"txt_matriculaMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert tbc_modeloMoto != null : "fx:id=\"tbc_modeloMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert btn_actualizarMoto != null : "fx:id=\"btn_actualizarMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert btn_limpiarMoto != null : "fx:id=\"btn_limpiarMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert tb_listCamiones != null : "fx:id=\"tb_listCamiones\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert btn_añadirMoto != null : "fx:id=\"btn_añadirMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert tbc_añoMoto != null : "fx:id=\"tbc_añoMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert btn_actualizarAuto != null : "fx:id=\"btn_actualizarAuto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert lbl_gestionMotos != null : "fx:id=\"lbl_gestionMotos\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert img_logo != null : "fx:id=\"img_logo\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert tbc_marcaMoto != null : "fx:id=\"tbc_marcaMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert lbl_añoMoto != null : "fx:id=\"lbl_añoMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert cb_caja != null : "fx:id=\"cb_caja\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert lbl_marcaMoto != null : "fx:id=\"lbl_marcaMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert tbc_caja != null : "fx:id=\"tbc_caja\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert btn_eliminarMoto != null : "fx:id=\"btn_eliminarMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert tbc_matriculaMoto != null : "fx:id=\"tbc_matriculaMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";
        assert lbl_modeloMoto != null : "fx:id=\"lbl_modeloMoto\" was not injected: check your FXML file 'crudMotos.fxml'.";

    }
}

