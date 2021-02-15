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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Program4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage PrimaryStage){

        VBox button_pane = new VBox();

        Button apple = new Button("Apple");
        Button orange = new Button("Orange");
        Button banana = new Button("Banana");

        button_pane.getChildren().addAll(apple, orange, banana);

        ImageView image = new ImageView();
        image.setFitWidth(250);
        image.setFitHeight(250);

        SplitPane sp = new SplitPane(button_pane, image);
        sp.setMinWidth(500);
        sp.setMinHeight(500);

        apple.setOnAction(e -> {
            image.setImage(new Image("https://www.organicfacts.net/wp-content/uploads/2013/05/Apple4.jpg"));
        });

        orange.setOnAction(e -> {
            image.setImage(new Image("https://media.istockphoto.com/photos/orange-fruit-isolated-on-white-picture-id477836156?k=6&m=477836156&s=612x612&w=0&h=so0IENCIE95_bgdadhstzVSBoAOqEyAnwr1TirAXdsY="));
        });

        banana.setOnAction(e -> {
            image.setImage(new Image("https://www.organicfacts.net/wp-content/uploads/2013/05/Banana3.jpg"));
        });

        PrimaryStage.setScene(new Scene(sp));
        PrimaryStage.show();
    }
}