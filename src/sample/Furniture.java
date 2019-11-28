package sample;

public class Furniture extends Item implements Discount, Tax {
    private double price;
    private double units;
    private double discount;
    final double taxp = 8.5;

    public Furniture(String itemCode, String name, double price, double units, double discount)
    {
        super(itemCode, name);
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
        return (units * price)*(discount / 100.00);
    }

    public double computeTotalPrice(){
        double discount = computeDiscount();
        if(price>=2000)
            return ((units*price) - discount + computeTax())*.85;
        else
            return (units*price) - discount + computeTax();

    }

    public void displayFurniture()
    {
        super.display();
        System.out.println("Units -- " + this.units);
        System.out.println("Price -- $" + this.price);
        System.out.println("Discount -- " + this.discount + "%");
        System.out.println("Tax -- $0");
    }
}