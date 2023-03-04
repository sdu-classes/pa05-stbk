import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.shape.*;

public class ProblemB extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();

        Ellipse ellipse = new Ellipse();
        ellipse.setFill(Color.DARKOLIVEGREEN);
        ellipse.setStroke(Color.rgb(200, 30, 40));
        ellipse.setStrokeWidth(20);
        ellipse.setCenterX(200);
        ellipse.setCenterY(200);
        ellipse.setRadiusX(200);
        ellipse.setRadiusY(100);
        group.getChildren().add(ellipse);
        
        // first way
        Font font = new Font("Georgia", 50);
        // second way
        Font font2 = Font.font("Georgia", FontWeight.THIN, FontPosture.ITALIC, 40);

        Text text = new Text();
        text.setFill(Color.AQUAMARINE);
        text.setText("This is my ellipse");
        text.setFont(font2);
        text.setX(15);
        text.setY(180);
        group.getChildren().add(text);

        // for (String family: Font.getFamilies()) {
        //     System.out.println(family);
        // }

        Scene scene = new Scene(group, 600, 600);
        primaryStage.setTitle("Text, Font, Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
