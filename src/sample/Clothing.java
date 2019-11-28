package sample;

public class Clothing extends Item implements Discount, Tax {
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp = 8.5;

    public Clothing(String itemCode, String name, String brand, double price, double units, double discount){
        super(itemCode, name);
        this.brand = brand;
        this.price = price;
        this.units = units;
        this.discount = discount;
    }

    @Override
    public double computeTax(){
        return ((units*price) -computeDiscount()) * taxp / 100;
    }

    @Override
    public double computeDiscount(){
        return (units*price) * (discount / 100.00);
    }

    double computeTotalPrice() {
        if(brand=="Levi's")
            return (units*price) - computeDiscount() + computeTax();
        else
            return ((units*price) - computeDiscount() + computeTax())*.75;
    }

    public void displayClothing() {
        super.display();
        System.out.println("Units -- " + this.units);
        System.out.println("Price -- $" + this.price);
        System.out.println("Brand -- " + this.brand);
        System.out.println("Discount -- " + this.discount + "%");
    }

}
