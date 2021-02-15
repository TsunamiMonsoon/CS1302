//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 7

package Lab7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Program1 extends Application {

    private int factorial;

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(15);
        pane.setVgap(5);
        pane.setPadding(new Insets(10, 10, 10, 10));

        TextField input = new TextField();
        input.setPromptText("Please enter an integer.");
        input.setAlignment(Pos.CENTER_RIGHT);
        TextField output = new TextField();
        output.setAlignment(Pos.CENTER_RIGHT);

        Label o = new Label("x! =");

        pane.add(new Label("Integer x:"), 0, 0);
        pane.add(o, 2, 0);
        pane.add(input, 0, 1);
        pane.add(output, 2, 1);

        Button fButton = new Button("factor ->");
        pane.add(fButton, 1, 1);


        fButton.setOnAction(e -> {
            factorial = factorial(Integer.parseInt(input.getText()));
            output.setText("" + factorial);
        });


        primaryStage.setScene(new Scene(pane, 450, 80));
        primaryStage.setTitle("Factorial");
        primaryStage.show();
    }

    private int factorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * factorial(x-1);
        }
    }
}