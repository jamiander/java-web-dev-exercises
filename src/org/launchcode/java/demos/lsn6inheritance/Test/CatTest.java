package org.launchcode.java.demos.lsn6inheritance.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

public class CatTest {

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(),.001);
    }

    @Test
    public void secondConstructorIsUsed() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertEquals(13, keyboardCat.getWeight(), .001);
    }

    @Test
    public void isNotInitiallyTired() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertFalse(keyboardCat.isHungry());
        assertFalse(keyboardCat.isTired());
        keyboardCat.eat();
        assertTrue(keyboardCat.isTired());
    }
}
