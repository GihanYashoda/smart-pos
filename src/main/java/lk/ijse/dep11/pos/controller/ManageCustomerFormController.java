package lk.ijse.dep11.pos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;


public class ManageCustomerFormController {
    public AnchorPane root;
    public JFXTextField txtCustomerId;
    public JFXTextField txtCustomerName;
    public JFXTextField txtCustomerAddress;
    public JFXButton btnSave;
    public JFXButton btnDelete;
    public TableView tblCustomers;
    public JFXButton btnAddNew;

    public void navigateToHome(MouseEvent mouseEvent) throws IOException {
        MainFormController.navigateToMain(root);
    }


    public void btnAddNew_OnAction(ActionEvent actionEvent) throws IOException {
    }

    public void btnSave_OnAction(ActionEvent actionEvent) {
    }


    public void btnDelete_OnAction(ActionEvent actionEvent) {
    }
}
