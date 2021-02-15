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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Program2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(15);
        pane.setVgap(5);
        pane.setPadding(new Insets(10, 10, 10, 10));

        TextField stringTextField = new TextField();
        stringTextField.setPromptText("Enter a string.");
        stringTextField.setPrefColumnCount(30);
        stringTextField.setAlignment(Pos.TOP_LEFT);

        TextField charTextField = new TextField();
        charTextField.setPromptText("Enter a single char value.");
        charTextField.setAlignment(Pos.TOP_LEFT);
        charTextField.setPrefColumnCount(5);

        TextField charCount = new TextField();
        charCount.setPromptText("The char count is...");
        charCount.setAlignment(Pos.TOP_LEFT);

        VBox input = new VBox(10);
        input.setAlignment(Pos.CENTER);
        input.getChildren().addAll(stringTextField, charTextField);

        HBox output = new HBox(10);
        output.setAlignment(Pos.CENTER);
        output.getChildren().addAll(new Label("Char Count:"), charCount);

        pane.add(input, 0, 0);
        pane.add(output, 2, 0);

        Button cButton = new Button("count ->");

        pane.add(cButton, 1, 0);

        cButton.setOnAction(e -> {
            if (charTextField.getText().length() < 2) {
                int count = count(stringTextField.getText(), charTextField.getText().charAt(0));
                charCount.setText("char count: " + count);
            }
        });

        primaryStage.setTitle("Character Counter");
        primaryStage.setScene(new Scene(pane, 550, 80));
        primaryStage.show();

    }

    private int count(String s, char c) {
        int l = s.length();
        if (l == 0) {
            return 0;
        } else if (s.substring(0,1).charAt(0) == c) {
            return 1 + count(s.substring(1), c);
        }
        return count(s.substring(1), c);
    }
}