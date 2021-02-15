//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 5

package Lab5;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class RandomCircle extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Circle c = new Circle(250, 250, 50, Color.color(Math.random(), Math.random(), Math.random()));

        c.setOnMouseEntered(actionEntered -> {
            c.setCursor(Cursor.HAND);
        });

        c.setOnMouseClicked(actionEntered -> {
            c.setCenterX(50 + (Math.random() * 400));
            c.setCenterY(50 + (Math.random() * 400));
            c.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        });

        Pane p = new Pane(c);

        primaryStage.setScene(new Scene(p, 500, 500));
        primaryStage.setTitle("Random Circle");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}