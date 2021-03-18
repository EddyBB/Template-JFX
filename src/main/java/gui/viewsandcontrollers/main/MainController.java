package gui.viewsandcontrollers.main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label label;

    public void initialize() {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
    	
    	Stage dialog = new Stage();
    	
    	Node source = (Node)event.getSource();
    	Stage parent = (Stage)source.getScene().getWindow();
    	
    	dialog.initOwner(parent);
    	dialog.Modality(Modality.APPLICATION_MODAL);
    	
    	Parent root = FMXLLoader.load(getClass.getResource("../modal/Modal.xml"));
    	Scene scene = new Scene(root);
    	Label laber = (Label)root.getChildrenUnmodifiable().get(0);
    	label.setText(textfield.getText());
    	
    	dialog.setScene(scene);
    	dialog.show();
    }
}