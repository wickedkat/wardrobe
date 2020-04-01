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
        assertEquals(5, wardrobe.getHangedHangers());
    }

    @Test
    void testWardrobeCapacityValidation() {
        /*nie powinnam tworzyć tu kolejnych obiektach, robię tak teraz żevy szybko uruchomić test z któ®ym był problem, a grzebać będę później */
        Wardrobe wardrobe2 = new Wardrobe(2,2);
        Hanger hanger3 = new SimpleHanger();
        hanger3.addClothing(new PieceOfClothing());
        wardrobe2.hangHanger(hanger3);

        assertFalse(wardrobe2.isHangerInWardrobe(hanger3));
    }

    @Test
    void getOutHanger() {
    }
}