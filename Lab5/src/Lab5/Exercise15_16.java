//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 5

package Lab5;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Exercise15_16 extends Application {

    static double DeltaX = 0;
    static double DeltaY = 0;

    public void start(Stage primaryStage) {
        Circle circle = new Circle(200, 200, 50);
        Circle circle2 = new Circle(400, 400, 50);

        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        circle2.setFill(Color.TRANSPARENT);
        circle2.setStroke(Color.BLACK);
        circle2.setStrokeWidth(2);

        Line line = new Line();

        line.setStartX(circle.getCenterX() + (circle.getRadius() * Math.cos(Math.atan2(circle2.getCenterY() - circle.getCenterY(), circle2.getCenterX() - circle.getCenterX()))));
        line.setStartY(circle.getCenterY() + (circle.getRadius() * Math.cos(Math.atan2(circle2.getCenterX() - circle.getCenterX(), circle2.getCenterY() - circle.getCenterY()))));
        line.setEndX(circle2.getCenterX() + (circle2.getRadius() * Math.cos(Math.atan2(circle.getCenterY() - circle2.getCenterY(), circle.getCenterX() - circle2.getCenterX()))));
        line.setEndY(circle2.getCenterY() + (circle2.getRadius() * Math.cos(Math.atan2(circle.getCenterX() - circle2.getCenterX(), circle.getCenterY() - circle2.getCenterY()))));

        Label label = new Label();

        label.setFont(Font.font(null, FontWeight.BOLD, 22));
        label.setText(Integer.toString((int)Math.pow(Math.pow(line.getEndX() - line.getStartX(), 2) + Math.pow(line.getEndY() - line.getStartY(), 2), 0.5)));
        label.layout();
        Platform.runLater(() -> {
            label.setLayoutX((line.getStartX() + line.getEndX() - label.getWidth()) / 2);
            label.setLayoutY((line.getStartY() + line.getEndY() - label.getWidth()) / 2);
        });
        label.setRotate((Math.atan2(line.getEndY() - line.getStartY(), line.getEndX() - line.getStartX()) * 180) / Math.PI);
        label.setStyle("-fx-background-color: white;");

        circle.setOnMouseEntered(actionEntered -> {
            circle.setCursor(Cursor.HAND);
        });

        circle.setOnMousePressed(actionEntered -> {
            Exercise15_16.DeltaX = circle.getCenterX() - actionEntered.getSceneX();
            Exercise15_16.DeltaY = circle.getCenterY() - actionEntered.getSceneY();
        });

        circle.setOnMouseDragged(actionEntered -> {
            circle.setCenterX(actionEntered.getSceneX() + DeltaX);
            circle.setCenterY(actionEntered.getSceneY() + DeltaY);

            line.setStartX(circle.getCenterX() + (circle.getRadius() * Math.cos(Math.atan2(circle2.getCenterY() - circle.getCenterY(), circle2.getCenterX() - circle.getCenterX()))));
            line.setStartY(circle.getCenterY() + (circle.getRadius() * Math.cos(Math.atan2(circle2.getCenterX() - circle.getCenterX(), circle2.getCenterY() - circle.getCenterY()))));
            line.setEndX(circle2.getCenterX() + (circle2.getRadius() * Math.cos(Math.atan2(circle.getCenterY() - circle2.getCenterY(), circle.getCenterX() - circle2.getCenterX()))));
            line.setEndY(circle2.getCenterY() + (circle2.getRadius() * Math.cos(Math.atan2(circle.getCenterX() - circle2.getCenterX(), circle.getCenterY() - circle2.getCenterY()))));

            label.setText(Integer.toString((int)Math.pow(Math.pow(line.getEndX() - line.getStartX(), 2) + Math.pow(line.getEndY() - line.getStartY(), 2), 0.5)));
            label.layout();
            Platform.runLater(() -> {
                label.setLayoutX((line.getStartX() + line.getEndX() - label.getWidth()) / 2);
                label.setLayoutY((line.getStartY() + line.getEndY() - label.getWidth()) / 2);
            });
            label.setRotate((Math.atan2(line.getEndY() - line.getStartY(), line.getEndX() - line.getStartX()) * 180) / Math.PI);
        });

        circle2.setOnMouseEntered(actionEntered -> {
            circle2.setCursor(Cursor.HAND);
        });

        circle2.setOnMousePressed(actionEntered -> {
            Exercise15_16.DeltaX = circle2.getCenterX() - actionEntered.getSceneX();
            Exercise15_16.DeltaY = circle2.getCenterY() - actionEntered.getSceneY();
        });

        circle2.setOnMouseDragged(actionEntered -> {
            circle2.setCenterX(actionEntered.getSceneX() + DeltaX);
            circle2.setCenterY(actionEntered.getSceneY() + DeltaY);

            line.setStartX(circle.getCenterX() + (circle.getRadius() * Math.cos(Math.atan2(circle2.getCenterY() - circle.getCenterY(), circle2.getCenterX() - circle.getCenterX()))));
            line.setStartY(circle.getCenterY() + (circle.getRadius() * Math.cos(Math.atan2(circle2.getCenterX() - circle.getCenterX(), circle2.getCenterY() - circle.getCenterY()))));
            line.setEndX(circle2.getCenterX() + (circle2.getRadius() * Math.cos(Math.atan2(circle.getCenterY() - circle2.getCenterY(), circle.getCenterX() - circle2.getCenterX()))));
            line.setEndY(circle2.getCenterY() + (circle2.getRadius() * Math.cos(Math.atan2(circle.getCenterX() - circle2.getCenterX(), circle.getCenterY() - circle2.getCenterY()))));

            label.setText(Integer.toString((int)Math.pow(Math.pow(line.getEndX() - line.getStartX(), 2) + Math.pow(line.getEndY() - line.getStartY(), 2), 0.5)));
            label.layout();
            Platform.runLater(() -> {
                label.setLayoutX((line.getStartX() + line.getEndX() - label.getWidth()) / 2);
                label.setLayoutY((line.getStartY() + line.getEndY() - label.getWidth()) / 2);
            });
            label.setRotate((Math.atan2(line.getEndY() - line.getStartY(), line.getEndX() - line.getStartX()) * 180) / Math.PI);
        });

        Pane pane = new Pane(circle, circle2, line, label);




        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setTitle("Cirlce");
        primaryStage.setScene(scene);
        primaryStage.show();
    }




    public static void main(String[] args) {
        Application.launch(args);

    }
}