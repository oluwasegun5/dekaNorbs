package chapter3Test;

import org.junit.jupiter.api.Test;
import chapter3.PetrolPurchase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
    @Test
    public void testThatClassIsNotEmpty(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        assertNotNull(station);
    }
    @Test
    public void getLocationTest(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        assertEquals("lagos",station.getLocation());
    }
    @Test
    public void setLocationTest(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        assertEquals("lagos",station.getLocation());

        station.setLocation("ikeja");
        assertEquals("ikeja",station.getLocation());
    }

    @Test
    public void testForPetrolType(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        assertEquals("fuel",station.petrolType());
    }
    @Test
    public void setPetrolTypeTest(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        assertEquals("fuel",station.petrolType());

        station.setPetrolType("kerosine");
        assertEquals("kerosine",station.petrolType());
    }

    @Test
    public void quantityPerLiterTest(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        assertEquals(5,station.quantityPerLiter());

    }

    @Test
    public void setQuantityPerLiterTest(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        assertEquals(5,station.quantityPerLiter());

        station.setQuantityPerLiter(78);
        assertEquals(78,station.quantityPerLiter());
    }
    @Test
    public void getPricePerLiterTest(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        assertEquals(50.0,station.pricePerLiter());
    }

    @Test
    public void setPricePerLiterTest(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        assertEquals(50.0,station.pricePerLiter());

        station.setPricePerLiterTo(30);
        assertEquals(30,station.pricePerLiter());
    }

    @Test
    public void getPercentageDiscountTest(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        assertEquals(5.0,station.percentageDiscount());
    }

    @Test
    public void setPercentageDiscountTest(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        assertEquals(5.0,station.percentageDiscount());

        station.setPercentageDiscountTo(30);
        assertEquals(30,station.percentageDiscount());
    }

    @Test
    public void getPurchaseAmountTest(){
        PetrolPurchase station = new PetrolPurchase("lagos","fuel",5,50.0,5.0);
        double purchaseAmount = station.getPurchaseAmount();
        assertEquals(2,purchaseAmount);
    }

}
