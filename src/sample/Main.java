package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.layout.VBox;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:///C:/Users/BT_1N3_07/IdeaProjects/GUILabDego/src/sample/sample.fxml"));
        Stage stageTest = new Stage();
        stageTest.setWidth(700);
        stageTest.setHeight(500);
        stageTest.setX(650);
        stageTest.setY(300);
        stageTest.setTitle("Test");
        stageTest.initStyle(StageStyle.UTILITY);
        stageTest.show();
        VBox vbox = loader.<VBox>load();
        Scene testScene = new Scene(vbox);
        stageTest.setScene(testScene);
        testScene.setCursor(Cursor.CROSSHAIR);


    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
