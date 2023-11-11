package lk.ijse.dep11.pos.controller;

import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SearchOrdersFormController {
    public TextField txtSearch;
    public TableView tblOrders;
    public AnchorPane root;

    public void tblOrders_OnMouseClicked(MouseEvent mouseEvent) {
    }

    public void navigateToHome(MouseEvent mouseEvent) throws IOException {
        MainFormController.navigateToMain(root);
    }
}
