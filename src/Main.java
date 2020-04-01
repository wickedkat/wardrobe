public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(5,4);
        PieceOfClothing clothingtype1 = new PieceOfClothing("SomeBrand", "shirt");
        PieceOfClothing clothingtype1vol2 = new PieceOfClothing("SomeBrand", "blouse");
        PieceOfClothing clothingtype2 = new PieceOfClothing("OtherBrand", "skirt");
        SimpleHanger hangerNoBar = new SimpleHanger();
        HangerWithBar hangerBar = new HangerWithBar();
        hangerNoBar.addClothing(clothingtype1);
        wardrobe.hangHanger(hangerNoBar);
        wardrobe.getClothesfromWardrobe(hangerNoBar);

        System.out.println(wardrobe.getHangedHangers());
        System.out.println(wardrobe.isHangerInWardrobe(hangerBar));
        wardrobe.hangHanger(hangerBar);
        System.out.println(wardrobe.isHangerInWardrobe(hangerBar));

    }

}
