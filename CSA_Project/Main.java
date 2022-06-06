import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 实例化按钮
        Button button = new Button("+1");

        // 创建布局控件
        StackPane stackPane = new StackPane();

        // 将button添加到布局
        stackPane.getChildren().add(button);

        // 创建场景 宽=400 高=400
        Scene scene = new Scene(stackPane, 400, 400);

        // 将场景添加到窗口
        primaryStage.setScene(scene);

        // 显示窗口
        primaryStage.show();
    }
}