//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 5

package Lab5;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RaceCar extends Application {

    private final ImageView racecar = new ImageView(new Image
            ("http://www.clker.com/cliparts/C/x/A/F/S/1/gray-car-top-view-170-md.png"));
    private Timeline animation;

    private Pane trackPane;
    private Ellipse track;

    private double theta = 0;

    private boolean resumeAnimation;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        racecar.setFitWidth(100);
        racecar.setPreserveRatio(true);
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(10, 20, 10, 50));

        VBox buttons = new VBox(10);

        Button resume = new Button("RESUME");
        Button stop = new Button("STOP");

        buttons.getChildren().addAll(resume, stop);

        resume.setOnAction(e -> resumeAnimation = true);
        stop.setOnAction(e -> resumeAnimation = false);

        pane.setRight(buttons);

        setupRaceTrack();

        pane.setCenter(trackPane);

        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.setTitle("Race Car Animation");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void setupRaceTrack() {
        trackPane = new Pane();
        track = new Ellipse(150, 150, 140, 75);

        track.setFill(null);
        track.setStroke(Color.MAROON);
        track.setStrokeWidth(25.0);

        trackPane.getChildren().add(track);
        racecar.setX(track.getCenterX() - track.getRadiusX());
        racecar.setY(track.getCenterY() - track.getRadiusY());
        trackPane.getChildren().add(racecar);

        animation = new Timeline( new KeyFrame(Duration.millis(400), e -> move()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }



    public void move() {
        if (resumeAnimation) {
            racecar.setX(racecar.getX() - 2 + Math.cos(theta) * track.getRadiusX());
            racecar.setY(racecar.getY() - 2 + Math.sin(theta) * track.getRadiusY());

            if (theta > 360) {
                theta = 1;
            } else {
                theta++;
            }
        }
    }
}