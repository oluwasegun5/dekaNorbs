package chapter3;

public class PetrolPurchase {
private String location;
private String petrolType;
private int quantityPerLiter;
private double pricePerLiter;
private double percentageDiscount;


    public PetrolPurchase(String location, String petrolType, int quantityPerLiter, double pricePerLiter, double percentageDiscount) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantityPerLiter = quantityPerLiter;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String petrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int quantityPerLiter() {
        return quantityPerLiter;
    }

    public void setQuantityPerLiter(int quantityPerLiter) {
        this.quantityPerLiter = quantityPerLiter;
    }

    public double pricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiterTo(int price) {
        pricePerLiter = price;
    }

    public double percentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscountTo(int discountPrice) {
        percentageDiscount = discountPrice;
    }

    public double getPurchaseAmount() {
        double netPurchaseAmount = (quantityPerLiter * pricePerLiter) *5/100;
        return netPurchaseAmount;
    }
}
