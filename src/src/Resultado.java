import java.util.ArrayList;

public class Resultado {

    private int golesLocal;
    private int GolesVisitante;
    private ArrayList<Integer> puntos1;
    private ArrayList<Integer> puntos2;
    private ArrayList<Integer> puntos3;
    private ArrayList<Integer> puntos4;
    private ArrayList<Integer> puntos5;
    private ArrayList<Integer> puntos6;
    private ArrayList<Integer> puntos7;
    private ArrayList<Integer> puntos8;

    public int indi = 1;
    public int indice=0,indice1=0,indice2=0,indice3=0,indice4=0,indice5=0,indice6=0,indice7=0,indice8=0,indice9=0,indice10=0,indice11=0,indice12=0,indice13=0,indice14=0,indice15=0,indice16=0,indice17=0,indice18=0;
    public int min=-1,min2=-1,min3=-1,min4=-1,min5=-1,min6=-1,min7=-1,min8=-1,min9=-1,min10=-1,min11=-1,min12=-1,min13=-1,min14=-1,min15=-1,min16=-1,min17=-1,min18=-1;
    public int puntosPB;
    public int puntosSe;
    public int puntosEc ;
    public int puntosQT;
    public int puntosIN;
    public int puntosEU;
    public int puntosIr;
    public int puntosGa;
    public int puntosARGENTINAGANADORA = 100;
    public int puntosPo;
    public int puntosMx;
    public int puntosAS =-1;
    public int puntosFr;
    public int puntosAu;
    public int puntosTu;
    public int puntosDi;
    public int puntosJa;
    public int puntosEs;
    public int puntosAl;
    public int puntosCR;
    public int puntosMa;
    public int puntosCr;
    public int puntosBe;
    public int puntosCa;
    public int puntosBr;
    public int puntosSu;
    public int puntosCam;
    public int puntosSer;
    public int puntosPor;
    public int puntosRc = -1;
    public int puntosUr;
    public int puntosGh;


    public boolean decision;


    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return GolesVisitante;
    }

    public void setGolesVisitante(int getGolesVisintante) {
        this.GolesVisitante = getGolesVisintante;
    }

    public void sumarPuntos(String equipo) {
        if (equipo.equalsIgnoreCase("Países Bajos")) {
            puntosPB+=2;
        } else if (equipo.equalsIgnoreCase("Senegal")) {
            puntosSe+=2;
        } else if (equipo.equalsIgnoreCase("Ecuador")) {
            puntosEc+=2;
        } else if (equipo.equalsIgnoreCase("Catar")) {
            puntosQT+=2;
        } else if (equipo.equalsIgnoreCase("Inglaterra")) {
            puntosIN+=2;
        } else if (equipo.equalsIgnoreCase("Estados Unidos")) {
            puntosEU+=2;
        } else if (equipo.equalsIgnoreCase("Irán")) {
            puntosIr+=2;
        } else if (equipo.equalsIgnoreCase("Gales")) {
            puntosGa+=2;
        } else if (equipo.equalsIgnoreCase("Argentina")) {
            puntosARGENTINAGANADORA+=2;
        } else if (equipo.equalsIgnoreCase("Polonia")) {
            puntosPo+=2;
        } else if (equipo.equalsIgnoreCase("México")) {
            puntosMx+=2;
        } else if (equipo.equalsIgnoreCase("Arabia Saudí")) {
            puntosAS+=2;
        } else if (equipo.equalsIgnoreCase("Francia")) {
            puntosFr+=2;
        } else if (equipo.equalsIgnoreCase("Australia")) {
            puntosAu+=2;
        } else if (equipo.equalsIgnoreCase("Túnez")) {
            puntosTu+=2;
        } else if (equipo.equalsIgnoreCase("Dinamarca")) {
            puntosDi+=2;
        } else if (equipo.equalsIgnoreCase("Japón")) {
            puntosJa+=2;
        } else if (equipo.equalsIgnoreCase("España")) {
            puntosEs+=2;
        } else if (equipo.equalsIgnoreCase("Alemania")) {
            puntosAl+=2;
        } else if (equipo.equalsIgnoreCase("Costa Rica")) {
            puntosCR+=2;
        } else if (equipo.equalsIgnoreCase("Marruecos")) {
            puntosMa+=2;
        } else if (equipo.equalsIgnoreCase("Croacia")) {
            puntosCr+=2;
        } else if (equipo.equalsIgnoreCase("Bélgica")) {
            puntosBe+=2;
        } else if (equipo.equalsIgnoreCase("Canadá")) {
            puntosCa+=2;
        } else if (equipo.equalsIgnoreCase("Brasil")) {
            puntosBr+=2;
        } else if (equipo.equalsIgnoreCase("Suiza")) {
            puntosSu+=2;
        } else if (equipo.equalsIgnoreCase("Camerún")) {
            puntosCam+=2;
        } else if (equipo.equalsIgnoreCase("Serbia")) {
            puntosSer+=2;
        } else if (equipo.equalsIgnoreCase("Portugal")) {
            puntosPor+=2;
        } else if (equipo.equalsIgnoreCase("República de Corea")) {
            puntosRc+=2;
        } else if (equipo.equalsIgnoreCase("Uruguay")) {
            puntosUr+=2;
        } else if (equipo.equalsIgnoreCase("Ghana")) {
            puntosGh+=2;
        }


    }

   /* public void restarPuntos(String equipo){
        if (equipo.equalsIgnoreCase("Países Bajos")) {
            puntosPB--;
        } else if (equipo.equalsIgnoreCase("Senegal")) {
            puntosSe--;
        } else if (equipo.equalsIgnoreCase("Ecuador")) {
            puntosEc--;
        } else if (equipo.equalsIgnoreCase("Catar")) {
            puntosQT--;
        } else if (equipo.equalsIgnoreCase("Inglaterra")) {
            puntosIN--;
        } else if (equipo.equalsIgnoreCase("Estados Unidos")) {
            puntosEU--;
        } else if (equipo.equalsIgnoreCase("Irán")) {
            puntosIr--;
        } else if (equipo.equalsIgnoreCase("Gales")) {
            puntosGa--;
        } else if (equipo.equalsIgnoreCase("Argentina")) {
            puntosARGENTINAGANADORA--;
        } else if (equipo.equalsIgnoreCase("Polonia")) {
            puntosPo--;
        } else if (equipo.equalsIgnoreCase("México")) {
            puntosMx--;
        } else if (equipo.equalsIgnoreCase("Arabia Saudí")) {
            puntosAS--;
        } else if (equipo.equalsIgnoreCase("Francia")) {
            puntosFr--;
        } else if (equipo.equalsIgnoreCase("Australia")) {
            puntosAu--;
        } else if (equipo.equalsIgnoreCase("Túnez")) {
            puntosTu--;
        } else if (equipo.equalsIgnoreCase("Dinamarca")) {
            puntosDi--;
        } else if (equipo.equalsIgnoreCase("Japón")) {
            puntosJa--;
        } else if (equipo.equalsIgnoreCase("España")) {
            puntosEs--;
        } else if (equipo.equalsIgnoreCase("Alemania")) {
            puntosAl--;
        } else if (equipo.equalsIgnoreCase("Costa Rica")) {
            puntosCR--;
        } else if (equipo.equalsIgnoreCase("Marruecos")) {
            puntosMa--;
        } else if (equipo.equalsIgnoreCase("Croacia")) {
            puntosCr--;
        } else if (equipo.equalsIgnoreCase("Bélgica")) {
            puntosBe--;
        } else if (equipo.equalsIgnoreCase("Canadá")) {
            puntosCa--;
        } else if (equipo.equalsIgnoreCase("Brasil")) {
            puntosBr--;
        } else if (equipo.equalsIgnoreCase("Suiza")) {
            puntosSu--;
        } else if (equipo.equalsIgnoreCase("Camerún")) {
            puntosCam--;
        } else if (equipo.equalsIgnoreCase("Serbia")) {
            puntosSer--;
        } else if (equipo.equalsIgnoreCase("Portugal")) {
            puntosPor--;
        } else if (equipo.equalsIgnoreCase("República de Corea")) {
            puntosRc--;
        } else if (equipo.equalsIgnoreCase("Uruguay")) {
            puntosUr--;
        } else if (equipo.equalsIgnoreCase("Ghana")) {
            puntosGh--;
        }
    }*/

    public boolean ganoLocal(String equipo1, String equipo2 ) {

        this.setGolesLocal((int) (Math.random() * 20));
        this.setGolesVisitante((int) (Math.random() * 20));


        if (getGolesLocal() > getGolesVisitante()&&equipo1 != equipo2) {

            System.out.println(String.format(" %s %d %s %s %d", equipo1, getGolesLocal(), " -", equipo2, getGolesVisitante()));
            sumarPuntos(equipo1);

            decision = true;

        } else if (getGolesLocal() < getGolesVisitante()&&equipo1 != equipo2)  {
            System.out.println(String.format(" %s %d %s %s %d", equipo1, getGolesLocal(), " -", equipo2, getGolesVisitante()));
            sumarPuntos(equipo2);

            decision = false;
        }

        return decision;

    }

    public boolean empate(String equipo1, String equipo2) {

        if ((getGolesLocal() == getGolesVisitante()&&equipo1 != equipo2) ) {
            System.out.println(String.format(" %s %d %s %s %d", equipo1, getGolesLocal(), " -", equipo2, getGolesVisitante()));
            sumarPuntos(equipo1);

            decision = true;
        } else {
        }
        return decision;
    }

    public void agregarEquipos(Grupo grupo) {
        addPuntos1(puntosPB);
        addPuntos1(puntosSe);
        addPuntos1(puntosEc);
        addPuntos1(puntosQT);
        addPuntos2(puntosIN);
        addPuntos2(puntosEU);
        addPuntos2(puntosIr);
        addPuntos2(puntosGa);
        addPuntos3(puntosARGENTINAGANADORA);
        addPuntos3(puntosPo);
        addPuntos3(puntosMx);
        addPuntos3(puntosAS);
        addPuntos4(puntosFr);
        addPuntos4(puntosAu);
        addPuntos4(puntosTu);
        addPuntos4(puntosJa);
        addPuntos5(puntosEs);
        addPuntos5(puntosAl);
        addPuntos5(puntosCR);
        addPuntos5(puntosMa);
        addPuntos6(puntosCr);
        addPuntos6(puntosBe);
        addPuntos6(puntosCa);
        addPuntos6(puntosBr);
        addPuntos7(puntosSu);
        addPuntos7(puntosCam);
        addPuntos7(puntosSer);
        addPuntos7(puntosBr);
        addPuntos8(puntosPor);
        addPuntos8(puntosRc);
        addPuntos8(puntosUr);
        addPuntos8(puntosGh);

        for (int i = 0; i < puntos1.size(); i++) {
            if (getPuntos1().get(i) >min) {
                indice=i;
                min=getPuntos1().get(i);
            }


        }
        for (int i = 0; i <puntos1.size() ; i++) {

            if (getPuntos1().get(i)>min2 && getPuntos1().get(i)!=min) {
                indice2=i;
                min2=getPuntos1().get(i);
            }
        }
        for (int i = 0; i < puntos2.size(); i++) {
            if (getPuntos2().get(i) >min3) {
                indice3=i;
                min3=getPuntos1().get(i);
            }


        }
        for (int i = 0; i <puntos2.size() ; i++) {

            if (getPuntos1().get(i)>min4 && getPuntos1().get(i)!=min3) {
                indice4=i;
                min4=getPuntos1().get(i);
            }

        }
        for (int i = 0; i < puntos3.size(); i++) {
            if (getPuntos1().get(i) >min5) {
                indice5=i;
                min5=getPuntos1().get(i);
            }


        }
        for (int i = 0; i <puntos3.size() ; i++) {

            if (getPuntos1().get(i)>min6 && getPuntos1().get(i)!=min5) {
                indice6=i;
                min6=getPuntos1().get(i);
            }
        }
        for (int i = 0; i < puntos4.size(); i++) {
            if (getPuntos1().get(i) >min7) {
                indice7=i;
                min7=getPuntos1().get(i);
            }


        }
        for (int i = 0; i <puntos4.size() ; i++) {

            if (getPuntos1().get(i)>min8 && getPuntos1().get(i)!=min7) {
                indice8=i;
                min8=getPuntos1().get(i);
            }

        } for (int i = 0; i < puntos5.size(); i++) {
            if (getPuntos1().get(i) >min9) {
                indice9=i;
                min9=getPuntos1().get(i);
            }


        }
        for (int i = 0; i <puntos5.size() ; i++) {

            if (getPuntos1().get(i)>min10 && getPuntos1().get(i)!=min9) {
                indice10=i;
                min10=getPuntos1().get(i);
            }
        }
        for (int i = 0; i < puntos6.size(); i++) {
            if (getPuntos1().get(i) >min11) {
                indice11=i;
                min11=getPuntos1().get(i);
            }


        }
        for (int i = 0; i <puntos6.size() ; i++) {

            if (getPuntos1().get(i)>min12 && getPuntos1().get(i)!=min11) {
                indice12=i;
                min12=getPuntos1().get(i);
            }
        }
        for (int i = 0; i < puntos7.size(); i++) {
            if (getPuntos1().get(i) >min13) {
                indice13=i;
                min13=getPuntos1().get(i);
            }


        }
        for (int i = 0; i <puntos7.size() ; i++) {

            if (getPuntos1().get(i)>min14 && getPuntos1().get(i)!=min13) {
                indice14=i;
                min14=getPuntos1().get(i);
            }
        }
        for (int i = 0; i < puntos8.size(); i++) {
            if (getPuntos1().get(i) >min15) {
                indice15=i;
                min15=getPuntos1().get(i);
            }


        }
        for (int i = 0; i <puntos8.size() ; i++) {

            if (getPuntos1().get(i)>min16 && getPuntos1().get(i)!=min15) {
                indice16=i;
                min16=getPuntos1().get(i);
            }
        }
        grupo.addEquiposQueAvanzan(grupo.getGrupo1().get(indice));
        grupo.addEquiposQueAvanzan(grupo.getGrupo1().get(indice2));
        grupo.addEquiposQueAvanzan(grupo.getGrupo2().get(indice3));
        grupo.addEquiposQueAvanzan(grupo.getGrupo2().get(indice4));
        grupo.addEquiposQueAvanzan(grupo.getGrupo3().get(indice5));
        grupo.addEquiposQueAvanzan(grupo.getGrupo3().get(indice6));
        grupo.addEquiposQueAvanzan(grupo.getGrupo4().get(indice7));
        grupo.addEquiposQueAvanzan(grupo.getGrupo4().get(indice8));
        grupo.addEquiposQueAvanzan(grupo.getGrupo5().get(indice9));
        grupo.addEquiposQueAvanzan(grupo.getGrupo5().get(indice10));
        grupo.addEquiposQueAvanzan(grupo.getGrupo6().get(indice11));
        grupo.addEquiposQueAvanzan(grupo.getGrupo6().get(indice12));
        grupo.addEquiposQueAvanzan(grupo.getGrupo7().get(indice13));
        grupo.addEquiposQueAvanzan(grupo.getGrupo7().get(indice14));
        grupo.addEquiposQueAvanzan(grupo.getGrupo8().get(indice15));
        grupo.addEquiposQueAvanzan(grupo.getGrupo8().get(indice16));

        System.out.println("EQUIPOS QUE AVANZAN");
        for (int i = 0; i < grupo.getEquiposQueAvanzan().size(); i++) {
            System.out.println(grupo.getEquiposQueAvanzan().get(i).getNombre());
        }
    }




    public ArrayList<Integer> getPuntos1() {
        return puntos1;
    }

    public void setPuntos1(ArrayList<Integer> puntos) {
        this.puntos1 = puntos;
    }

    public void addPuntos1(Integer puntos) {
        this.puntos1.add(puntos);
        return;
    }
    public ArrayList<Integer> getPuntos2() {
        return puntos2;
    }

    public void setPuntos2(ArrayList<Integer> puntos) {
        this.puntos2 = puntos;
    }

    public void addPuntos2(Integer puntos) {
        this.puntos2.add(puntos);
        return;
    }
    public ArrayList<Integer> getPuntos3() {
        return puntos3;
    }

    public void setPuntos3(ArrayList<Integer> puntos) {
        this.puntos3 = puntos;
    }

    public void addPuntos3(Integer puntos) {
        this.puntos3.add(puntos);
        return;
    }
    public ArrayList<Integer> getPuntos4() {
        return puntos4;
    }

    public void setPuntos4(ArrayList<Integer> puntos) {
        this.puntos4 = puntos;
    }

    public void addPuntos4(Integer puntos) {
        this.puntos4.add(puntos);
        return;
    }
    public ArrayList<Integer> getPuntos5() {
        return puntos5;
    }

    public void setPuntos5(ArrayList<Integer> puntos) {
        this.puntos5 = puntos;
    }

    public void addPuntos5(Integer puntos) {
        this.puntos5.add(puntos);
        return;
    }
    public ArrayList<Integer> getPuntos6() {
        return puntos6;
    }

    public void setPuntos6(ArrayList<Integer> puntos) {
        this.puntos6 = puntos;
    }

    public void addPuntos6(Integer puntos) {
        this.puntos6.add(puntos);
        return;
    }
    public ArrayList<Integer> getPuntos7() {
        return puntos7;
    }

    public void setPuntos7(ArrayList<Integer> puntos) {
        this.puntos7 = puntos;
    }

    public void addPuntos7(Integer puntos) {
        this.puntos7.add(puntos);
        return;
    }
    public ArrayList<Integer> getPuntos8() {
        return puntos8;
    }

    public void setPuntos8(ArrayList<Integer> puntos) {
        this.puntos8 = puntos;
    }

    public void addPuntos8(Integer puntos) {
        this.puntos8.add(puntos);
        return;
    }

    Resultado(){
        this.setPuntos1(new ArrayList<Integer>());
        this.setPuntos2(new ArrayList<Integer>());
        this.setPuntos3(new ArrayList<Integer>());
        this.setPuntos4(new ArrayList<Integer>());
        this.setPuntos5(new ArrayList<Integer>());
        this.setPuntos6(new ArrayList<Integer>());
        this.setPuntos7(new ArrayList<Integer>());
        this.setPuntos8(new ArrayList<Integer>());
    }



}

   /* public void EquiposgrupoA(Grupo grupo){
        if (puntosPB>=puntosSe&&puntosSe>puntosEc&&puntosSe>puntosQT||puntosSe>puntosPB&&puntosPB>puntosEc&&puntosPB>puntosQT) {
            grupo.addEquiposQueAvanzan(grupo.getGrupo1().get(0));
            grupo.addEquiposQueAvanzan(grupo.getGrupo1().get(1));
        } else if (puntosPB>=puntosEc&&puntosEc>puntosSe&&puntosEc>puntosQT||puntosEc>puntosPB&&puntosPB>puntosSe&&puntosPB>puntosQT) {
            grupo.addEquiposQueAvanzan(grupo.getGrupo1().get(0));
            grupo.addEquiposQueAvanzan(grupo.getGrupo1().get(2));
        }else if (puntosPB>=puntosEc&&puntosEc>puntosSe&&puntosEc>puntosQT||puntosEc>puntosPB&&puntosPB>puntosSe&&puntosPB>puntosQT) {
            grupo.addEquiposQueAvanzan(grupo.getGrupo1().get(0));
            grupo.addEquiposQueAvanzan(grupo.getGrupo1().get(2));
        }


    }*/