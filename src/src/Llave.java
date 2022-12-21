import java.util.ArrayList;

public class Llave extends EtapaMundial{
    private ArrayList<Equipo> equiposQueAvanzan;

    public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
        this.equiposQueAvanzan = equiposQueAvanzan;
    }
    public ArrayList<Equipo> getEquiposQueAvanzan(){
        return equiposQueAvanzan;
    }
    public void addEquiposQueAvanzan(Equipo equipo){
        this.equiposQueAvanzan.add(equipo);
        return;
    }
    Llave(){
        setPartidos(new ArrayList<Partido>());
        setEquiposQueAvanzan(new ArrayList<Equipo>());
    }



}
