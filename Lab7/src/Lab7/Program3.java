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

public class Program3 extends Application{

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(15);
        pane.setVgap(5);
        pane.setPadding(new Insets(10, 10, 10, 10));

        TextField integer = new TextField();
        integer.setPromptText("Enter a valid Integer.");
        integer.setAlignment(Pos.TOP_RIGHT);
        integer.setMaxWidth(200);


        TextField sum = new TextField();
        sum.setAlignment(Pos.TOP_RIGHT);
        integer.setMaxWidth(200);

        pane.add(new Label("Integer:"), 0, 0);
        pane.add(new Label("Sum of Digits:"), 2,0);
        pane.add(integer, 0, 1);
        pane.add(sum, 2, 1);

        Button add = new Button("Compute Sum");
        pane.add(add, 1,1);

        add.setOnAction(e -> {
            int sumDigits = sum(Integer.parseInt(integer.getText()));
            sum.setText("" + sumDigits);
        });

        primaryStage.setTitle("Sum Digits");
        primaryStage.setScene(new Scene(pane, 500, 100));
        primaryStage.show();

    }

    private int sum(int x) {

        if (x == 0) {
            return 0;
        }
        return (x % 10) + sum(x / 10);
    }
}