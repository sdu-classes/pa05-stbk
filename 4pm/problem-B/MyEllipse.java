import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class MyEllipse extends Application {
    public void start(Stage primaryStage) {
        // for (String family: Font.getFamilies()) {
        //     System.out.println(family);
        // }

        Group group = new Group();
        
        Ellipse ellipse = new Ellipse(200, 200, 200, 100);
        ellipse.setFill(Color.LAVENDERBLUSH);
        ellipse.setFill(LinearGradient.valueOf("linear-gradient(from 0% 0% to 100% 100%, red  0% , blue 30%,  black 100%)"));
        ellipse.setRotate(45);
        
        Font font = new Font(50);
        Font font2 = Font.font("Informal Roman", FontWeight.BOLD, FontPosture.ITALIC, 50);
        
        Text text = new Text();
        text.setUnderline(true);
        text.setText("This is my ellipse");
        text.setX(10);
        text.setY(80);
        text.setFont(font2);
        text.setFill(Color.DARKSEAGREEN);
        text.setFill(LinearGradient.valueOf("linear-gradient(from 0% 0% to 100% 100%, red  0% , green 30%,  purple 100%)"));
        
        group.getChildren().add(ellipse);
        group.getChildren().add(text);
        
        Scene scene = new Scene(group, 200, 200);
        
        // ellipse.centerXProperty().bind(scene.widthProperty().divide(2));
        // ellipse.centerYProperty().bind(scene.heightProperty().divide(2));
        ellipse.rotateProperty().bind(scene.widthProperty());
        
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("My Ellipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
