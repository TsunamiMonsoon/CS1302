//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 6

package Lab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Program5 extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        Circle c = new Circle(250, 250, 50, Color.color(Math.random(), Math.random(), Math.random()));
        c.setFill(Color.color(Math.random(), Math.random(), Math.random()));

        Slider s = new Slider();
        s.setMin(0);
        s.setMax(100);

        c.radiusProperty().bind(s.valueProperty());

        HBox pane = new HBox();
        pane.getChildren().addAll(c, s);

        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.setTitle("Random Circle");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}