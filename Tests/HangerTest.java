import static org.junit.jupiter.api.Assertions.*;

class HangerTest {

    PieceOfClothing clothingtype1 = new PieceOfClothing("SomeBrand", "shirt");
    PieceOfClothing clothingtype1vol2 = new PieceOfClothing("SomeBrand", "blouse");
    PieceOfClothing clothingtype2 = new PieceOfClothing("OtherBrand", "skirt");
    SimpleHanger hangerNoBar = new SimpleHanger();
    HangerWithBar hangerBar = new HangerWithBar();

    @org.junit.jupiter.api.Test
    void addClothing() {
        hangerNoBar.addClothing(clothingtype1);
        assertEquals(clothingtype1, hangerNoBar.getClothing1());
        hangerNoBar.addClothing(clothingtype1vol2);
        assertNotEquals(clothingtype1vol2, hangerNoBar.getClothing1());
    }

    @org.junit.jupiter.api.Test
    void checkRightClothingType(){
        SimpleHanger hangerNoBar2 = new SimpleHanger();
        hangerNoBar2.addClothing(clothingtype2);
        assertFalse(hangerNoBar2.isClothingTypeSimpleOccupied());

    }

    @org.junit.jupiter.api.Test
    void isThereSpaceForSimpleCl() {
        assertFalse(hangerNoBar.isClothingTypeSimpleOccupied());
    }




    }

