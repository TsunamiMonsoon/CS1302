//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 5

package Lab5;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Airplane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ImageView airplane = new ImageView("http://www.clker.com/cliparts/C/j/N/v/s/B/flying-cartoon-plane-hi.png");

        airplane.setFitWidth(100);
        airplane.setPreserveRatio(true);
        airplane.setLayoutX(0);
        airplane.setLayoutY(0);

        Pane pane = new Pane(airplane);

        pane.setMinWidth(500);
        pane.setMinHeight(500);

        Button resume = new Button("START");
        Button stop = new Button("STOP");

        VBox buttons = new VBox(10, resume, stop);

        Path p = new Path();

        p.getElements().add(new MoveTo(50, 20));
        p.getElements().add(new LineTo(450, 480));

        PathTransition pt = new PathTransition();

        pt.setDuration(Duration.millis(1500));
        pt.setPath(p);
        pt.setNode(airplane);


        resume.setOnAction(e -> {
            pt.play();
        });

        stop.setOnAction(e -> {
            pt.pause();
        });

        HBox buttons1 = new HBox (pane, buttons);

        primaryStage.setScene(new Scene(buttons1));
        primaryStage.setTitle("Airplane Animation");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}