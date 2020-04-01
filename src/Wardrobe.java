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


    }}

    public void getOutHanger(Hanger hanger){
        hangersInWardrobe.remove(hanger);
        hangedHangers -=1;
    }

    public List<Hanger> getHangersInWardrobe() {
        return hangersInWardrobe;
    }

}
