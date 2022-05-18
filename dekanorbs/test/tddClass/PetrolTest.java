package tddClass;

import chapter3.PetrolPurchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PetrolTest {
    private PetrolPurchase fueling;
    @Test
    @BeforeEach
    public void petrol(){
        fueling = new PetrolPurchase("lagos","Fuel",5,150,4.5);
    }


}
