import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Clock extends Application {
    public void start(Stage primaryStage) {
        ClockPane clock1 = new ClockPane(5, 18, 32);
        ClockPane clock2 = new ClockPane(2, 55, 21);

        HBox clockPane = new HBox();
        clockPane.getChildren().addAll(clock1, clock2);

        Scene scene = new Scene(clockPane, 600, 600);

        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
