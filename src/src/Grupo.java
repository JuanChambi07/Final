import java.util.ArrayList;

public class Grupo extends EtapaMundial{
    private ArrayList<Equipo> grupo1;
    private ArrayList<Equipo> grupo2;
    private ArrayList<Equipo> grupo3;
    private ArrayList<Equipo> grupo4;
    private ArrayList<Equipo> grupo5;
    private ArrayList<Equipo> grupo6;
    private ArrayList<Equipo> grupo7;
    private ArrayList<Equipo> grupo8;



    private ArrayList<Equipo> equiposQueAvanzan;



    public ArrayList<Equipo> getEquiposQueAvanzan(){
        return equiposQueAvanzan;
    }

    public ArrayList<Equipo> getGrupo1() {
        return grupo1;
    }

    public void setGrupo1(ArrayList<Equipo> grupo1) {
        this.grupo1 = grupo1;
    }

    public ArrayList<Equipo> getGrupo2() {
        return grupo2;
    }

    public void setGrupo2(ArrayList<Equipo> grupo2) {
        this.grupo2 = grupo2;
    }

    public ArrayList<Equipo> getGrupo3() {
        return grupo3;
    }

    public void setGrupo3(ArrayList<Equipo> grupo3) {
        this.grupo3 = grupo3;
    }

    public ArrayList<Equipo> getGrupo4() {
        return grupo4;
    }

    public void setGrupo4(ArrayList<Equipo> grupo4) {
        this.grupo4 = grupo4;
    }

    public ArrayList<Equipo> getGrupo5() {
        return grupo5;
    }

    public void setGrupo5(ArrayList<Equipo> grupo5) {
        this.grupo5 = grupo5;
    }

    public ArrayList<Equipo> getGrupo6() {
        return grupo6;
    }

    public void setGrupo6(ArrayList<Equipo> grupo6) {
        this.grupo6 = grupo6;
    }

    public ArrayList<Equipo> getGrupo7() {
        return grupo7;
    }

    public void setGrupo7(ArrayList<Equipo> grupo7) {
        this.grupo7 = grupo7;
    }

    public ArrayList<Equipo> getGrupo8() {
        return grupo8;
    }

    public void setGrupo8(ArrayList<Equipo> grupo8) {
        this.grupo8 = grupo8;
    }
    public void addGrupo1(Equipo equipo){
        this.grupo1.add(equipo);
    }
    public void addGrupo2(Equipo equipo){
        this.grupo2.add(equipo);
    }
    public void addGrupo3(Equipo equipo){
        this.grupo3.add(equipo);
    }
    public void addGrupo4(Equipo equipo){
        this.grupo4.add(equipo);
    }
    public void addGrupo5(Equipo equipo){
        this.grupo5.add(equipo);
    }
    public void addGrupo6(Equipo equipo){
        this.grupo6.add(equipo);
    }
    public void addGrupo7(Equipo equipo){
        this.grupo7.add(equipo);
    }
    public void addGrupo8(Equipo equipo){
        this.grupo8.add(equipo);
    }

    Grupo(){
        this.setGrupo1(new ArrayList<Equipo>());
        this.setGrupo2(new ArrayList<Equipo>());
        this.setGrupo3(new ArrayList<Equipo>());
        this.setGrupo4(new ArrayList<Equipo>());
        this.setGrupo5(new ArrayList<Equipo>());
        this.setGrupo6(new ArrayList<Equipo>());
        this.setGrupo7(new ArrayList<Equipo>());
        this.setGrupo8(new ArrayList<Equipo>());
        this.setEquiposQueAvanzan(new ArrayList<Equipo>());
        setPartidos(new ArrayList<Partido>());

    }


    public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
        this.equiposQueAvanzan = equiposQueAvanzan;
    }
    public void addEquiposQueAvanzan(Equipo equipo){
        this.equiposQueAvanzan.add(equipo);
        return;
    }
}
