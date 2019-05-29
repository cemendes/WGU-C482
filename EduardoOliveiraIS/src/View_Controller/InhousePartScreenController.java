/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Controller;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXML;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Eduardo
 */
public class InhousePartScreenController implements Initializable {
    
    @FXML
    private AnchorPane InhousePartScreen;

    @FXML
    private RadioButton inHouseRadioButton;

    @FXML
    private RadioButton outsourcedRadioButton;

    @FXML
    private Button saveButton2;

    @FXML
    private Button cancellButton2;

    @FXML
    void inHouseScreen(ActionEvent event) {

    }

    @FXML
    void gotoOutSourcedScreen(ActionEvent event) throws IOException {
       
        Parent outSourcedScreen = FXMLLoader.load(getClass().getClassLoader().getResource("View_Controller/OutsourcedPartScreen.fxml"));
        Scene scene = new Scene(outSourcedScreen);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
        

    }
    
        @FXML
    void goBackMainScreen(ActionEvent event) throws IOException {
        
        Parent mainScreen = FXMLLoader.load(getClass().getClassLoader().getResource("View_Controller/MainScreen.fxml"));
        Scene scene = new Scene(mainScreen);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }

    @FXML
    void savePart(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
