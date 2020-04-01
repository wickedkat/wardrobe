public class HangerWithBar extends Hanger {
    private boolean clothingType2;
    private PieceOfClothing clothing2;

    @Override
    public void addClothing(PieceOfClothing clothing) {
        if (clothing.getType() == "shirt" || clothing.getType() == "blouse"){
            if(isThereSpaceForSimpleCl()){
                setClothing1(clothing);
                setClothingTypeSimple(true);
            }
            }
        else if (clothing.getType() =="trousers" || clothing.getType() =="skirt"){
            if(clothingType2 ==false){
                clothing2= clothing;
                clothingType2=true;
            }
        }
        else{
            System.out.println("Unknown clothing type");
        }

    }

    public boolean isClothingType2Occupied() {
        return clothingType2;
    }

    public PieceOfClothing getClothing2() {
        return clothing2;
    }
}
