package co.edu.uniquindio.poo.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class TipoDeVehiculoViewController{

    @FXML
    private ResourceBundle resources;

    private App app;
    @FXML
    private URL location;

    @FXML
    private Button btn_gestionarCamiones;

    @FXML
    private ImageView img_logo;

    @FXML
    private Label lbl_accion;

    @FXML
    private Button btn_gestionarMotos;

    @FXML
    private Button btn_gestionarAutos;

    @FXML
    void onOpenCrudAutos(){
        app.openCrudAutos();

    }

    @FXML
    void onOpenCrudCamiones() {
        app.openCrudCamiones();

    }

    @FXML
    void onOpenCrudMotos() {
        app.openCrudMotos();

    }

    public void setApp(App app) {
        this.app = app;
    }


    

    @FXML
    void initialize() {
        assert btn_gestionarCamiones != null : "fx:id=\"btn_gestionarCamiones\" was not injected: check your FXML file 'tipoDeVehiculo.fxml'.";
        assert img_logo != null : "fx:id=\"img_logo\" was not injected: check your FXML file 'tipoDeVehiculo.fxml'.";
        assert lbl_accion != null : "fx:id=\"lbl_accion\" was not injected: check your FXML file 'tipoDeVehiculo.fxml'.";
        assert btn_gestionarMotos != null : "fx:id=\"btn_gestionarMotos\" was not injected: check your FXML file 'tipoDeVehiculo.fxml'.";
        assert btn_gestionarAutos != null : "fx:id=\"btn_gestionarAutos\" was not injected: check your FXML file 'tipoDeVehiculo.fxml'.";

    }
}
