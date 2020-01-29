package exercises.technology;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Program {
    Smartphone smartPhone;
    Laptop lapTop;

    @Before
    public void createSampleSmartPhone() {
        smartPhone = new Smartphone(AbstractEntity.numIds,"iphone", 500, 32, "high quality");
        lapTop = new Laptop(AbstractEntity.numIds,"Chromebook", 1000, 128, 14);
    }

    @Test
    public void phoneCanStorePicturesReturnsEquals() {
        assertEquals(smartPhone.numPictures(smartPhone.storage), 16, .001);
    }

    @Test
    public void smartPhoneInheritsBrandReturnsTrue() {
        assertEquals(smartPhone.brand, "iphone");
    }

    @Test
    public void smartPhoneUsesComputerMethod() {
        assertEquals(smartPhone.store(32, 2), "The file can be stored.");
    }

    @Test
    public void lapTopInheritsBrandReturnsTrue() {
        assertEquals(lapTop.brand, "Chromebook");
    }

    @Test
    public void lapTopBagReturnsUseOldBag() {
        assertEquals(lapTop.laptopBag(14), "Use the old laptop bag");
    }

    @Test
    public void lapTopInheritsComputerBuyMethod() {
        assertEquals(lapTop.buy(lapTop.price, 1000), "do not buy");
    }

    @Test
    public void objIdsReturnsNotEquals() {
        assertNotEquals(smartPhone.id, lapTop.id);
    }

}
