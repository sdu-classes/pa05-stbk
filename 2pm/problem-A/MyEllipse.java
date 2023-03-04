import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;


public class MyEllipse extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();

        for (int i = 0; i < 10; i++) {
            Ellipse ellipse = new Ellipse();
            ellipse.setCenterX(50 * i);
            ellipse.setCenterY(50 * i);
            ellipse.setRadiusX(10);
            ellipse.setRadiusY(10);
            group.getChildren().add(ellipse);
        }
        
        Scene scene = new Scene(group, 600, 600);
        primaryStage.setTitle("My Ellipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
