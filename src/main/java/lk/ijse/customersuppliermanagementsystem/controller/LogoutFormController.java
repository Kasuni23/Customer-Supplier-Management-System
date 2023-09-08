package lk.ijse.customersuppliermanagementsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LogoutFormController {
    public AnchorPane root;

    public void btnNoOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        Scene scene = new Scene(root);
        Stage stage= (Stage) this.root.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("DashBoard");
        stage.centerOnScreen();
    }

    public void btnYesOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(root);
        Stage stage= (Stage) this.root.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Login");
        stage.centerOnScreen();
    }
}
