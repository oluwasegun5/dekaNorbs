package chapter3;

public class PetrolPurchase {
    private  String stationLocation;
    private  String petrolType;
    private int quantityPurchasedInLiters;
    private double priceInLiter;
    private double percentageDiscount;

    public  void setStationLocation(String stationLocation){this.stationLocation = stationLocation;}
    public void setPetrolType(String petrolType){this.petrolType = petrolType;}
    public void  setQuantityPurchasedInLiters(int quantityPurchasedInLiters){this.quantityPurchasedInLiters = quantityPurchasedInLiters;}
    public void setPriceInLiter(double priceInLiter) {this.priceInLiter = priceInLiter;}
    public void setPercentageDiscount(double percentageDiscount) {this.percentageDiscount = percentageDiscount;}


    public String getStationLocation() {return stationLocation;}
    public String getPetrolType() {return petrolType;}
    public int getQuantityPurchasedInLiters() {return quantityPurchasedInLiters;}
    public double getPriceInLiter() {return priceInLiter;}
    public double getPercentageDiscount() {return percentageDiscount;}
}
