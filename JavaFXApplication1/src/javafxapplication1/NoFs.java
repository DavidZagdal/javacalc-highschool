/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;



/**
 *
 * @author david
 */
public class NoFs {
    
    public static void setupButton(Button button, double x, double y, double maxMinX, double maxMinY, String ID){
    
    
            button.setLayoutX(x);
            button.setLayoutY(y);
            button.setMaxSize(maxMinX,maxMinY);
            button.setMinSize(maxMinX,maxMinY);
            button.setId(ID);
    
    
    };
    
    private double xOffset = 0; 
    private double yOffset = 0;
    
    
    public static Button closeButton = new Button();
    
    
    public NoFs (Stage secondaryStage){
        
       
        
        
        Group root2 = new Group();
        Scene scene = new Scene(root2, 610, 405, Color.rgb(13, 13, 13));
        scene.getStylesheets().add(getClass().getResource("david.css").toExternalForm());
        
        setupButton(closeButton, scene.getWidth()-41, 0, 40, 40, "btnCLOSE");

        closeButton.setText("✘");//✖╳✕
        
        closeButton.setOnAction((ActionEvent event) -> {
            
            //secondaryStage.close();
            secondaryStage.hide();
        });
        
        
        
        Label info = new Label();
        info.setId("lightGrayLabelHelp");
        info.setText(" Help");
        info.setLayoutX((scene.getWidth()/2)-60);
        
       
        
        
        
        Label infoText = new Label();
        infoText.setId("lightGrayLabelSmallestHelp");
        infoText.setText(" To use the binary or other systems you just have to click the circle\n"
                + " button above the button of the system you want to be in.\n "
                + "When you do that you will be in that system, and when you want to  \n "
                + "parse to the other system you just click the big button\n "
                + "on which is its name.\n "
                + "Click the CE button to get back to the regular calculator.\n  \n"
                + "If some features do not work as intended please use\n "
                + "java version: 1.8.0_281\n"
                + "Production started in September 2019.\n"
                + "Made by: David Gulić");
        
        infoText.setLayoutY(65);
        
        root2.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        root2.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                secondaryStage.setX(event.getScreenX() - xOffset);
                secondaryStage.setY(event.getScreenY() - yOffset);
            }
        });
        
        root2.getChildren().addAll(info,infoText,closeButton);
        
        secondaryStage.initStyle(StageStyle.TRANSPARENT);
        secondaryStage.setX(0);
        secondaryStage.setY(0);
        secondaryStage.setFullScreenExitHint("");
        secondaryStage.setTitle("");
        secondaryStage.setResizable(false);
        secondaryStage.setScene(scene);
        secondaryStage.show();
        
    }
    
}
