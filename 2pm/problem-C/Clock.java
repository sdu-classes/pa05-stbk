import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;

public class Clock extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        ClockPane clock = new ClockPane(10, 15, 30);

        Scene scene = new Scene(clock, 600, 600);
        primaryStage.setTitle("My Ellipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
