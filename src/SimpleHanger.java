public class SimpleHanger extends Hanger {

    @Override
    public void addClothing(PieceOfClothing clothing) {
     if(validateType1(clothing.getType()))
        if(isThereSpaceForSimpleCl()){
            setClothing1(clothing);
            setClothingTypeSimple(true);
        }
     else{
            System.out.println("Can't hang this type");
        }


    }

    public boolean validateType1(String type){
        if(type == "shirt" || type == "blouse"){
            return true;
        }
        else{
            return false;
        }
    }
}
