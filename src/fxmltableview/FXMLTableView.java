/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmltableview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author alban
 */
public class FXMLTableView extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       primaryStage.setTitle("FXML TableView Example");
       Pane myPane = (Pane)FXMLLoader.load(getClass().getResource
    ("fxml_tableview.fxml"));
       Scene myScene = new Scene(myPane,600, 500);
       primaryStage.setScene(myScene);
       primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
