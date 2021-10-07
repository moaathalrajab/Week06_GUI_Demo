package com.mycompany.week6_guiapp_lab_btntf_action;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage stage) {
        int size=10;
        Button[] btnGrp= new Button[size];// btnGrp is a ref to the array object
        var label = new Label("Hello, Moaath Alrajab ");
        Button btn2= new Button("Click me");
              btn2.setLayoutX(10);
            btn2.setLayoutY(20 );
         
        
        Group gp = new Group(label, btn2);
        for(int i=0; i<size; i++){
            btnGrp[i] = new Button(""+ (size-i) );
            btnGrp[i].setLayoutX(50 + ((i%5)*40));
            btnGrp[i].setLayoutY(50 + (i/5)*50 );
            btnGrp[i].setOnAction( v -> {
                label.setText( ((Button)v.getSource()).getText() );
            });
            gp.getChildren().add(btnGrp[i]);
        }
        
        var scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}