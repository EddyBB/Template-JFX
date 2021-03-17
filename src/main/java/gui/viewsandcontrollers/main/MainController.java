package gui.viewsandcontrollers.main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Label label;

    public void initialize() {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
    	
    	Stage ventana = new Stage();
    	Parent root = FMXLLoader.load(getClass().getResource(".../modal/Modal.fmxl"));
    	Scene scene = new Scene(root);
    	Label label = (Label)root.getChildrenUnmodifiable().get(0);
    	label.setText(textfield.getText());
    	ventana.setScene(scene);
    	ventana.show();
    }
}