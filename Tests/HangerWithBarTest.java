import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HangerWithBarTest {
    HangerWithBar hangerBar1 = new HangerWithBar();
    PieceOfClothing clothingtype1 = new PieceOfClothing("SomeBrand", "shirt");
    PieceOfClothing clothingtype1vol2 = new PieceOfClothing("SomeBrand", "blouse");
    PieceOfClothing clothingtype2 = new PieceOfClothing("OtherBrand", "skirt");

    @org.junit.jupiter.api.Test
    void addClothing2Test() {
        hangerBar1.addClothing(clothingtype2);
        assertTrue(hangerBar1.isClothingType2Occupied());
        assertFalse(hangerBar1.isClothingTypeSimpleOccupied());

    }
}