package com.example.graphics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class GraphicsController implements Initializable {

    private Rectangular rect;

    @FXML
    public Label circumResult;
    @FXML
    public Label areaResult;
    @FXML
    public TextField widthField;
    @FXML
    public TextField heightField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        widthField.setTextFormatter(new DecimalTextFormatter(0,10));
        heightField.setTextFormatter(new DecimalTextFormatter(0,10));
    }

    public void onComputeClicked() {
        rect = new Rectangular(1,1,getWidthField(),getHeightField());
        areaResult.setText(String.valueOf(rect.computeArea()));
        circumResult.setText(String.valueOf(rect.computeCircumference()));
    }

    private double getWidthField(){
        return Double.parseDouble(widthField.getText());
    }

    private double getHeightField(){
        return Double.parseDouble(heightField.getText());
    }
}
