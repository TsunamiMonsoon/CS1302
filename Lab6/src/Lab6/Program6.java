//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 6

package Lab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Program6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage PrimaryStage){

        VBox button_pane = new VBox();

        Button coffee = new Button("Coffee");
        Button sandwhich = new Button("Sandwich");
        Button desert = new Button("Desert");

        button_pane.getChildren().addAll(coffee, sandwhich, desert);

        TextArea text = new TextArea("");

        SplitPane sp = new SplitPane(text, button_pane);
        sp.setMinWidth(500);
        sp.setMinHeight(500);

        coffee.setOnAction(e -> {
            text.appendText("Coffee\n");
        });

        sandwhich.setOnAction(e -> {
            text.appendText("Sandwhich\n");
        });

        desert.setOnAction(e -> {
            text.appendText("Desert\n");
        });

        PrimaryStage.setScene(new Scene(sp));
        PrimaryStage.show();
    }
}