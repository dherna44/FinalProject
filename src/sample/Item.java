package sample;

import javafx.beans.property.SimpleStringProperty;

public class Item {

    private String itemCode;
    private String name;

    public Item(String itemCode, String name) {
        this.itemCode = itemCode;
        this.name = name;
    }

    /*public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name.get();
    }

    public String nameProperty() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getBrand() {
        return brand.get();
    }

    public String brandProperty() {
        return brand.get();
    }

    public void setBrand(String brand) {
        this.brand.set(brand);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

     */

    public void display(){
        System.out.println("Item Code -- " + this.itemCode);
        System.out.println("Name -- " + this.name);
    }

    /*public String convertToString(){
        return String.format("%s %s",itemCode, brand, q);
    }
     */

}