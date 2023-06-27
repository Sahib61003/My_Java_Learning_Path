import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MovingBannerApp extends Application {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 100;
    private static final String BANNER_TEXT = "Hello, World!";
    private static final int FONT_SIZE = 24;

    private int xCoordinate = 0;
    private int yCoordinate = HEIGHT / 2;

    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text(BANNER_TEXT);
        text.setFont(new Font("Arial", FONT_SIZE));
        text.setFill(Color.WHITE);
        pane.getChildren().add(text);

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10), e -> moveBanner(text)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

        Scene scene = new Scene(pane, WIDTH, HEIGHT, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Moving Banner");
        primaryStage.show();
    }

    private void moveBanner(Text text) {
        xCoordinate = (xCoordinate + 1) % WIDTH;
        text.relocate(xCoordinate, yCoordinate);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
