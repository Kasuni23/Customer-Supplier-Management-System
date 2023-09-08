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

    public void btnItemOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));
        this.node.getChildren().clear();
        this.node.getChildren().add(root);
    }

    public void btnSupplierOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/supplier_form.fxml"));
        this.node.getChildren().clear();
        this.node.getChildren().add(root);
    }

    public void btnLogoutOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/logout_form.fxml"));
        this.node.getChildren().clear();
        this.node.getChildren().add(root);



    }
}
