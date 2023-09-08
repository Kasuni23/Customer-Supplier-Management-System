package lk.ijse.customersuppliermanagementsystem.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashboardFormController {
    public AnchorPane node;
    public AnchorPane rootNode;

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));


        this.node.getChildren().clear();
        this.node.getChildren().add(root);
    }

    public void btnItemOnAction(ActionEvent actionEvent) {
    }

    public void btnSupplierOnAction(ActionEvent actionEvent) {
    }

    public void btnLogoutOnAction(ActionEvent actionEvent) {
    }
}
