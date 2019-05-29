/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Eduardo
 */
public class MainScreenController implements Initializable {
    
    @FXML
    private AnchorPane mainScreen;

    @FXML
    private Button searchButton1;

    @FXML
    private Button addButton1;

    @FXML
    private Button modifyButton1;

    @FXML
    private Button deleteButton1;

    @FXML
    private Button searchButton2;

    @FXML
    private Button addButton2;

    @FXML
    private Button modifyButton2;

    @FXML
    private Button deleteButton2;

    @FXML
    void addParts(ActionEvent event) throws IOException {
       
        Parent addParts = FXMLLoader.load(getClass().getClassLoader().getResource("View_Controller/InhousePartScreen.fxml"));
        Scene scene = new Scene(addParts);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }

    @FXML
    void addProducts(ActionEvent event) throws IOException {
         
       

    }

    @FXML
    void deleteParts(ActionEvent event) {

    }

    @FXML
    void deleteProduct(ActionEvent event) {

    }

    @FXML
    void modifyParts(ActionEvent event) {

    }

    @FXML
    void modifyProduct(ActionEvent event) {

    }

    @FXML
    void searchParts(ActionEvent event) {

    }

    @FXML
    void searchProduct(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
