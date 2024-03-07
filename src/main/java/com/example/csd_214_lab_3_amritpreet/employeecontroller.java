package com.example.csd_214_lab_3_amritpreet;

import com.almasb.fxgl.net.Connection;
import com.mysql.cj.jdbc.DatabaseMetaData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class employeecontroller  implements Initializable {
    @FXML
    private TableView<employeecontroller> tableView;
    @FXML
    private TableColumn<employeecontroller, Integer> id;
    @FXML
    private TableColumn<employeecontroller, String> name;
    @FXML
    private TableColumn<employeecontroller, Integer> salary;

    ObservableList<employeecontroller> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new
                PropertyValueFactory<employeecontroller, Integer>("id"));

        name.setCellValueFactory(new
                PropertyValueFactory<employeecontroller, String>("name"));
        salary.setCellValueFactory(new
                PropertyValueFactory<employeecontroller, Integer>("salary"));


        tableView.setItems(list);
    }

}
