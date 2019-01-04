package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.Timer;

public class Main extends Application {
    int count = 0;
    private int timeleft = 1000;
    boolean x = false;

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:///C:/Users/BT_1N3_07/IdeaProjects/GUILabDego/src/sample/sample.fxml"));
        Stage stageTest = new Stage();
        stageTest.setWidth(700);
        stageTest.setHeight(500);
        stageTest.setX(650);
        stageTest.setY(300);
        stageTest.setTitle("FAST CLICKER");
        stageTest.initStyle(StageStyle.UTILITY);
        stageTest.show();
        Pane pane = loader.load();
        Scene testScene = new Scene(pane);
        stageTest.setScene(testScene);
        testScene.setCursor(Cursor.CROSSHAIR);

        Button clicker = new Button();

        Text curScore = new Text("Score: 0");
        clicker.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                count++;
                curScore.setText("Score: " + count);
            }
        });
       AnimationTimer time = new AnimationTimer() {

           @Override
           public void handle(long now) {

           }
       };time.start();



    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
