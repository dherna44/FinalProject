package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML private TableView<Item> tableView;
    @FXML private TableColumn<Item, Integer> itemCodeColumn;
    @FXML private TableColumn<Item, String> itemNameColumn;
    @FXML private TableColumn<Item, String> brandColumn;
    @FXML private TableColumn<Item, Integer> quantityColumn;
    @FXML private TableColumn<Item, Double> priceColumn;






    public void addButtonClicked(ActionEvent event ) throws IOException {

        try {

            FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("addButtonWindow.fxml"));
            Parent MainWindow = fxmlloader.load();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene (MainWindow));
            primaryStage.show();

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public void UpdateButtonClicked(ActionEvent event) throws IOException{

        try {

            FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("updateButtonWindow.fxml"));
            Parent MainWindow = fxmlloader.load();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene (MainWindow));
            primaryStage.show();

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void RemoveButtonClicked(ActionEvent event) throws IOException{

        try {

            FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("removeButtonWindow.fxml"));
            Parent MainWindow = fxmlloader.load();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene (MainWindow));
            primaryStage.show();

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void PrintButtonClicked(ActionEvent event) throws IOException{

         //different way of opening new window from main window but replaces main window.
        /* Parent MainWindow = FXMLLoader.load(getClass().getResource("printButtonWindow.fxml"));
        Scene printWindow = new Scene(MainWindow);
        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(printWindow);
        primaryStage.show(); */
        try {

            FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("printButtonWindow.fxml"));
            Parent MainWindow = fxmlloader.load();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene (MainWindow));
            primaryStage.show();

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*//Sets up columns in the main window table
        itemCodeColumn.setCellValueFactory(new PropertyValueFactory<Item, Integer>("itemCodeColumn"));
        itemNameColumn.setCellValueFactory(new PropertyValueFactory<Item, String>("itemCodeColumn"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<Item, String>("brandColumn"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<Item, Integer>("quantityColumn"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<Item, Double>("priceColumn"));

        tableView.setItems(getItems());

         */


    }

    /* //Fills the items added table
    private ObservableList<Item> getItems(){
        ObservableList<Item> items = FXCollections.observableArrayList();
        items.add(new Item(11,"Bread", "Nature's Own", 1, 1.50));
        items.add(new Item(12,"Sweater", "Hollister", 1, 29.99));
        items.add(new Item(13,"Phone Case", "Otterbox", 2, 19.99));
        items.add(new Item(14,"Computer", "Apple", 1, 1999.99));
        items.add(new Item(15,"Silverware", "Oneida", 5, 4.99));

        return items;
    }

     */
}
