import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WardrobeTest {
    Wardrobe wardrobe = new Wardrobe(5,4);
    PieceOfClothing clothingtype1 = new PieceOfClothing("SomeBrand", "shirt");
    PieceOfClothing clothingtype1vol2 = new PieceOfClothing("SomeBrand", "blouse");
    PieceOfClothing clothingtype2 = new PieceOfClothing("OtherBrand", "skirt");
    SimpleHanger hangerNoBar = new SimpleHanger();
    HangerWithBar hangerBar = new HangerWithBar();

    @Test
    void hangHanger() {
        hangerBar.addClothing(clothingtype1);
        wardrobe.hangHanger(hangerBar);
        assertEquals(hangerBar, wardrobe.getHangersInWardrobe().get(0));
    }

    @Test
    void getOutHanger() {
    }
}