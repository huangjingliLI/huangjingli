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
public class ManagerLoginApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/manager.fxml"));
        primaryStage.setTitle("超市收银系统");
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
