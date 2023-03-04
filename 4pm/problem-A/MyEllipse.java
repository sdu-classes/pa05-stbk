import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class MyEllipse extends Application {
    public void start(Stage primaryStage) {
        Group group = new Group();
        
        Ellipse ellipse = new Ellipse(200, 200, 200, 100);
        group.getChildren().add(ellipse);
        
        Scene scene = new Scene(group, 200, 200);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("My Ellipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
