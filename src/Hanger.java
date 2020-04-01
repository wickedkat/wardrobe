public abstract class Hanger {
    private boolean clothingTypeSimple;
    private PieceOfClothing clothing1;


    public Hanger() {
        clothingTypeSimple = false;
    }

    public abstract void addClothing(PieceOfClothing clothing);

    public void setClothing1(PieceOfClothing clothing1) {
        this.clothing1 = clothing1;
    }

    public boolean isThereSpaceForSimpleCl(){
        if (clothingTypeSimple == false){
            return true;                       /* this reversion will be logicalle easier to operate later */
        }
        else{
            return false;
        }

    }

    public void setClothingTypeSimple(boolean clothingTypeSimple) {
        this.clothingTypeSimple = clothingTypeSimple;
    }

    public PieceOfClothing getClothing1() {
        return clothing1;
    }

    public boolean isClothingTypeSimpleOccupied() {
        return clothingTypeSimple;
    }
}

