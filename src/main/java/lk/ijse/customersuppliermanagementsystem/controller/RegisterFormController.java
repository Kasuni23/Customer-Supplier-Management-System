package lk.ijse.customersuppliermanagementsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterFormController {
    public AnchorPane root;
    public TextField txtuser;
    public TextField txtpw;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        Scene scene = new Scene(root);
        Stage stage= (Stage) this.root.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("DashBoard");
        stage.centerOnScreen();
    }

    public void eventrejister(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(root);
        Stage stage= (Stage) this.root.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Login");
        stage.centerOnScreen();
    }
}
