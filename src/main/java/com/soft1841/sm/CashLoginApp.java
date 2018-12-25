package com.soft1841.sm;
/**
 * 收银登录窗口
 * @author 黄敬理
 * date 2018-12-25
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CashLoginApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("收银员登录");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/cash.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root,500,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
