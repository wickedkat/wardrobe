import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private int hangerCapacity;
    private int hangedHangers;
    private List<Hanger> hangersInWardrobe;

    public Wardrobe(int hangerCapacity, int hangedHangers) {
        this.hangerCapacity = hangerCapacity;
        this.hangedHangers = hangedHangers;
        this.hangersInWardrobe = new ArrayList<>();

    }

    public Wardrobe() {
        this.hangerCapacity = 30;
        this.hangedHangers = 0;
        this.hangersInWardrobe = new ArrayList<>();
    }


    public int getHangerCapacity() {
        return hangerCapacity;
    }

    public int getHangedHangers() {
        return hangedHangers;
    }

    public void hangHanger(Hanger hanger){
        if(hangedHangers < hangerCapacity){
        hangersInWardrobe.add(hanger);
        hangedHangers+=1;
    }
    else{
            System.out.println("Not enough space in wardrobe");}
    }

    public void getOutHanger(Hanger hanger){
        if(isHangerInWardrobe(hanger)){
        hangersInWardrobe.remove(hanger);
        hangedHangers -=1;
    }}

    public List<Hanger> getHangersInWardrobe() {
        return hangersInWardrobe;
    }

    public PieceOfClothing getClothesfromWardrobe(Hanger hanger){
        if(hanger instanceof HangerWithBar){
            /*tu bym napisała piekna komunikacje z userem z pytaniem co chce zdjac z wieszaka, jesli wisza 2 ubrania
            * póki co zwracam tylko drugi typ ciuchów */
            return ((HangerWithBar) hanger).getClothing2();
        }
        System.out.println(hanger.getClothing1().getType());
        return hanger.getClothing1();




    }

    public boolean isHangerInWardrobe(Hanger hanger){
        if(hangersInWardrobe.contains(hanger)){
            return  true;
        }
        else{
            return false;
        }

    }

}
