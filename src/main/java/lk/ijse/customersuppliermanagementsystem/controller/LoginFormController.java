package lk.ijse.customersuppliermanagementsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.customersuppliermanagementsystem.db.db;

import java.io.IOException;

public class LoginFormController {
    public TextField txtpw;
    public TextField txtuser;
    public AnchorPane root;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {

        String user = txtuser.getText();
        String pw = txtpw.getText();
        if (user.equals(db.user) && pw.equals(db.pw)){
            //dash board --> go
            navigate();
        }else {
            new Alert(Alert.AlertType.ERROR,"Invalid Login.Try Again").show();
        }
    }
    public void navigate() throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        Scene scene = new Scene(root);
        Stage stage= (Stage) this.root.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("DashBoard");
        stage.centerOnScreen();


    }

    public void eventrejister(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/register_form.fxml"));

        Scene scene = new Scene(root);
        Stage stage= (Stage) this.root.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Register Form");
        stage.centerOnScreen();
    }
}
