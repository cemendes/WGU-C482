/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.*;
import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Eduardo
 */

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("View_Controller/MainScreen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
 
public static void main(String[] args) {
   // launch(args);
   
   //Part[] partArray = new Part[10];
 //  System.out.println(partArray);
 
   Inventory inv = new Inventory();
   
   inv.addProduct(1,"Tire",52.00,1,50,100);
   
//      ArrayList<int> list = new ArrayList<int>();
//      list.add("A");
//      list.add("B");
//      System.out.println(list);
}
}
