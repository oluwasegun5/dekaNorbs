package tddClass;

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
}
