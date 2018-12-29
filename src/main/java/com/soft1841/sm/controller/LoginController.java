package com.soft1841.sm.controller;

import com.soft1841.sm.service.AdminService;
import com.soft1841.sm.service.SellerService;
import com.soft1841.sm.utils.ServiceFactory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController  {
        @FXML
        private TextField accountField;
        @FXML
        private PasswordField passwordField;
        @FXML
        private ToggleGroup user;

        private SellerService sellerService = ServiceFactory.getSellerServiceInstance();
        private AdminService adminService = ServiceFactory.getAdminServiceInstance();

        public void login() throws Exception {
            String account = accountField.getText().trim();
            String password = passwordField.getText().trim();
            if (user.getSelectedToggle().getUserData() == null) {
                //调用service的登录功能
                boolean flag = sellerService.login(account, password);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("提示");
                if (flag) {
                    //读入主布局文件
                    Stage mainStage = new Stage();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/cashHomepage1.fxml"));
                    BorderPane root = fxmlLoader.load();
                    Scene scene = new Scene(root);
                    scene.getStylesheets().add("/css/style.css");
                    mainStage.setTitle("收银系统");
                    mainStage.setMaximized(true);
                    mainStage.setScene(scene);
                    mainStage.show();
                    Stage loginStage = (Stage) accountField.getScene().getWindow();
                    loginStage.close();
                } else {
                    alert.setContentText("账号或密码错误，登录失败!");
                    alert.showAndWait();
                }
            }else {
                //调用service的登录 功能
                boolean flag = adminService.login(account, password);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("提示");
                if (flag) {
                    Stage mainStage = new Stage();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/managerHomepage.fxml"));
                    BorderPane root = fxmlLoader.load();
                    Scene scene = new Scene(root);
                    scene.getStylesheets().add("/css/style.css");
                    mainStage.setTitle("收银管理系统");
                    mainStage.setMaximized(true);
                    mainStage.setScene(scene);
                    mainStage.show();
                    Stage loginStage = (Stage) accountField.getScene().getWindow();
                    loginStage.close();
                } else {
                    alert.setContentText("账号或密码错误，登录失败!");
                    alert.showAndWait();
                }
            }
        }
    }