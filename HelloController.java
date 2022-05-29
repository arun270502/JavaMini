package com.example.movies;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    public static Label mov;

    @FXML
    private Label tot;
    @FXML
    private static int TotalCost = 0;
    @FXML
    private static String TC = "0.00";
    @FXML
    protected void Button() throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("snacks.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 500);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle("PVR Cinemas");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void Check() throws IOException {
        double cost=0;
        double gst=0;
        FXMLLoader fxmlLoad = new FXMLLoader(HelloApplication.class.getResource("checkout.fxml"));
        Scene scene = new Scene(fxmlLoad.load(), 750, 500);
        Stage stage = new Stage();
        stage.setResizable(false);
        cost = 400+55.5+TotalCost;
        gst=cost*0.28;
        TotalCost= (int) (gst+cost);
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");
        Label lblData = (Label) scene.lookup("#totalLabel");
        if (lblData!=null) lblData.setText(TC);
        stage.setTitle("PVR Cinemas");
        stage.setScene(scene);
        stage.show();
        System.out.println(cost);
//        System.out.println(tot.getText());
//        tot.setText(TC);
//        System.out.println(tot.getText());
    }

    @FXML
    protected void ty() throws IOException {
        FXMLLoader fxmlLoad = new FXMLLoader(HelloApplication.class.getResource("thanks.fxml"));
        Scene scene = new Scene(fxmlLoad.load(), 750, 500);
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle("PVR Cinemas");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void pepsi() {
        TotalCost = TotalCost + 80;
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");
    }

    @FXML
    protected void popM() {
        TotalCost = TotalCost + 140;
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");
    }

    @FXML
    protected void popL() {
        TotalCost = TotalCost + 200;
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");
    }

    @FXML
    protected void sprite() {
        TotalCost = TotalCost + 80;
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");
    }
    @FXML
    protected void mirinda() {
        TotalCost = TotalCost + 80;
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");
    }

    @FXML
    protected void veg() {
        TotalCost = TotalCost + 220;
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");
    }

    @FXML
    protected void nonveg() {
        TotalCost = TotalCost + 260;
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");
    }
    @FXML
    protected void nachos() {
        TotalCost = TotalCost + 150;
        TC = new String(String.valueOf(TotalCost)).concat(" ₹");
    }

}