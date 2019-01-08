package sample;


import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class Controller {
    private @FXML
    Button clicker;
    private @FXML
    Label timeLabel;
    private @FXML
    Label count;
    private int countdown = 10000;
    private int seconds = 10;
    private int countNum = 0;
    Text curScore = new Text("Score: 0");

    //IT STARTS AUTOMATICALLY

    public void initialize() {


        AnimationTimer time = new AnimationTimer() {

            @Override
            public void handle(long now) {
                if (countdown > 0) {
                    countdown -= 15;
                    seconds = countdown/1000;
                    timeLabel.setText(seconds + " seconds remaining");
                } else {


                }

            }
        };
        time.start();


    }

    @FXML
    private void handleButton(ActionEvent event) {
        if (event.getSource() == clicker) {
            countNum++;
            count.setText("COUNT: " + countNum);
        }
    }

}
