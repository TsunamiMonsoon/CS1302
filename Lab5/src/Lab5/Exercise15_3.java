//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 5

package Lab5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;

public class Exercise15_3 extends Application {

    public void start(Stage primaryStage) {
        Circle circle = new Circle(250, 250, 50);

        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        Button buttonLeft = new Button("LEFT");
        Button buttonRight = new Button("RIGHT");
        Button buttonUp = new Button("UP");
        Button buttonDown = new Button("DOWN");

        buttonLeft.setFont(Font.font(20));
        buttonRight.setFont(Font.font(20));
        buttonUp.setFont(Font.font(20));
        buttonDown.setFont(Font.font(20));

        buttonLeft.setOnMouseClicked(actionEvent -> {
            if (circle.getCenterX() - circle.getRadius() > 0) {
                circle.setCenterX(circle.getCenterX() - circle.getRadius());
            }

        });

        buttonRight.setOnMouseClicked(actionEvent -> {
            if (circle.getCenterX() + circle.getRadius() < 500) {
                circle.setCenterX(circle.getCenterX() + circle.getRadius());
            }

        });

        buttonUp.setOnMouseClicked(actionEvent -> {
            if (circle.getCenterY() - circle.getRadius() > 0) {
                circle.setCenterY(circle.getCenterY() - circle.getRadius());
            }

        });

        buttonDown.setOnMouseClicked(actionEvent -> {
            if (circle.getCenterY() + circle.getRadius() < 500) {
                circle.setCenterY(circle.getCenterY() + circle.getRadius());
            }

        });

        Pane pane = new Pane(circle);

        pane.setMinWidth(500);
        pane.setMinHeight(500);
        pane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        HBox hbox = new HBox(20,buttonLeft, buttonRight, buttonUp, buttonDown);

        hbox.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(5,pane, hbox);



        Scene scene = new Scene(vbox);

        primaryStage.setTitle("Cirlce");
        primaryStage.setScene(scene);
        primaryStage.show();
    }




    public static void main(String[] args) {
        Application.launch(args);

    }
}