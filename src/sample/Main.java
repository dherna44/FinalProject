package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("Departmental Billing Software");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();

    }


    public static void main(String[] args) throws FileNotFoundException {
        launch(args);

        Scanner user = new Scanner(System.in);
        String outputFileName;
        System.out.print("Customer Phone Number: ");
        outputFileName = user.nextLine().trim();
        PrintWriter output = new PrintWriter(outputFileName);


        Grocery grocery1 = new Grocery("11", "Bread", 1.50, 2, 0);
        Grocery grocery2 = new Grocery("12", "Apple", .75, 6, 1);
        Clothing clothing1 = new Clothing("21", "Jeans", "Levis", 35, 1, 0);
        Clothing clothing2 = new Clothing("22", "Dress Shirt", "Izod", 25, 2, 10);
        Furniture furn1 = new Furniture("23", "Couch", 499.99, 1, 1);
        Furniture furn2 = new Furniture("24", "Chair", 199.99, 2, 0);
        Gadgets tech1 = new Gadgets("25", "Computer", 1999.99, 1, 10);
        Gadgets tech2 = new Gadgets("26", "Monitor", 149.99, 2, 0);
        Utensils utensils1 = new Utensils("28", "Fork", 0.99, 5, 0);
        Utensils utensils2 = new Utensils("29", "Knife", 4.99, 3, 1);


        double totalPrice = 0;
        totalPrice = grocery1.computeTotalPrice() + grocery2.computeTotalPrice() + clothing1.computeTotalPrice() + clothing2.computeTotalPrice();
        grocery1.displayGrocery();
        grocery2.displayGrocery();
        clothing1.displayClothing();
        clothing2.displayClothing();
        furn1.displayFurniture();
        furn2.displayFurniture();
        tech1.displayGadgets();
        tech2.displayGadgets();
        utensils1.displayUtensils();
        utensils2.displayUtensils();

        System.out.println("Total bill amount -- " + totalPrice);

        if (totalPrice >= 1000) {
            output.println(50);
        }

        output.close();
    }
}
