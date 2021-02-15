//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 6

package Lab6;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.util.Duration;

public class Program3 extends Application {
    protected Button btStart = new Button("Start");
    protected Button btClear = new Button("Clear");

    @Override
    public void start(Stage primaryStage) {

        HBox paneForButtons = new HBox(5);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.getChildren().addAll(btStart, btClear);


        StopWatch stopWatch = new StopWatch();


        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);
        pane.setCenter(stopWatch);


        btStart.setOnAction(e -> {
            if (btStart.getText().equals("Start") ||
                    btStart.getText().equals("Resume")) {
                stopWatch.play();
                btStart.setText("Pause");
            } else {
                stopWatch.pause();
                btStart.setText("Resume");
            }
        });

        btClear.setOnAction(e -> {
            stopWatch.clear();
        });


        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise_16_20");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}