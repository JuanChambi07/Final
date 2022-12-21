import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Grupo fase = new Grupo();
        Resultado calcular = new Resultado();
        fase.addGrupo1(new Equipo("Países Bajos"));
        fase.addGrupo1(new Equipo("Senegal"));
        fase.addGrupo1(new Equipo("Ecuador"));
        fase.addGrupo1(new Equipo("Catar"));
        fase.addGrupo2(new Equipo("Inglaterra"));
        fase.addGrupo2(new Equipo("Estados Unidos"));
        fase.addGrupo2(new Equipo("Irán"));
        fase.addGrupo2(new Equipo("Gales"));
        fase.addGrupo3(new Equipo("Argentina"));
        fase.addGrupo3(new Equipo("Polonia"));
        fase.addGrupo3(new Equipo("México"));
        fase.addGrupo3(new Equipo("Arabia Saudí"));
        fase.addGrupo4(new Equipo("Francia"));
        fase.addGrupo4(new Equipo("Australia"));
        fase.addGrupo4(new Equipo("Túnez"));
        fase.addGrupo4(new Equipo("Dinamarca"));
        fase.addGrupo5(new Equipo("Japón"));
        fase.addGrupo5(new Equipo("España"));
        fase.addGrupo5(new Equipo("Alemania"));
        fase.addGrupo5(new Equipo("Costa Rica"));
        fase.addGrupo6(new Equipo("Marruecos"));
        fase.addGrupo6(new Equipo("Croacia"));
        fase.addGrupo6(new Equipo("Bélgica"));
        fase.addGrupo6(new Equipo("Canadá"));
        fase.addGrupo7(new Equipo("Brasil"));
        fase.addGrupo7(new Equipo("Suiza"));
        fase.addGrupo7(new Equipo("Camerún"));
        fase.addGrupo7(new Equipo("Serbia"));
        fase.addGrupo8(new Equipo("Portugal"));
        fase.addGrupo8(new Equipo("República de Corea"));
        fase.addGrupo8(new Equipo("Uruguay"));
        fase.addGrupo8(new Equipo("Ghana"));
        ArrayList<Partido> partidosFase = new ArrayList<Partido>();


        fase.setDescripcionEtapa("Fase de grupos");


        System.out.println(fase.getDescripcionEtapa());

        System.out.println("GRUPO A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {

                partidosFase.add(new Partido(new Date(04 / 7 / 2 + i), fase.getGrupo1().get(i), fase.getGrupo1().get(j)));
                if (calcular.ganoLocal(fase.getGrupo1().get(i).getNombre(), fase.getGrupo1().get(j).getNombre())) {
                } else if (calcular.empate(fase.getGrupo1().get(i).getNombre(), fase.getGrupo1().get(j).getNombre())) ;
            }
        }
        System.out.println("GRUPO B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {

                partidosFase.add(new Partido(new Date(04 / 7 / 3 + i), fase.getGrupo2().get(i), fase.getGrupo2().get(j)));
                if (calcular.ganoLocal(fase.getGrupo2().get(i).getNombre(), fase.getGrupo2().get(j).getNombre())) {
                } else if (calcular.empate(fase.getGrupo2().get(i).getNombre(), fase.getGrupo2().get(j).getNombre())) ;
            }
        }
        System.out.println("GRUPO C:");
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {

                partidosFase.add(new Partido(new Date(04 / 7 / 3 + i), fase.getGrupo3().get(i), fase.getGrupo3().get(j)));
                if (calcular.ganoLocal(fase.getGrupo3().get(i).getNombre(), fase.getGrupo3().get(j).getNombre())) {
                } else if (calcular.empate(fase.getGrupo3().get(i).getNombre(), fase.getGrupo3().get(j).getNombre())) ;
            }
        }
        System.out.println("GRUPO D:");
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {

                partidosFase.add(new Partido(new Date(04 / 7 / 3 + i), fase.getGrupo4().get(i), fase.getGrupo4().get(j)));
                if (calcular.ganoLocal(fase.getGrupo4().get(i).getNombre(), fase.getGrupo4().get(j).getNombre())) {
                } else if (calcular.empate(fase.getGrupo4().get(i).getNombre(), fase.getGrupo4().get(j).getNombre())) ;
            }
        }
        System.out.println("GRUPO E:");
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {

                partidosFase.add(new Partido(new Date(04 / 7 / 4 + i), fase.getGrupo5().get(i), fase.getGrupo5().get(j)));
                if (calcular.ganoLocal(fase.getGrupo5().get(i).getNombre(), fase.getGrupo5().get(j).getNombre())) {
                } else if (calcular.empate(fase.getGrupo5().get(i).getNombre(), fase.getGrupo5().get(j).getNombre())) ;
            }
        }
        System.out.println("GRUPO F:");
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {

                partidosFase.add(new Partido(new Date(04 / 7 / 5 + i), fase.getGrupo6().get(i), fase.getGrupo6().get(j)));
                if (calcular.ganoLocal(fase.getGrupo6().get(i).getNombre(), fase.getGrupo6().get(j).getNombre())) {
                } else if (calcular.empate(fase.getGrupo6().get(i).getNombre(), fase.getGrupo6().get(j).getNombre())) ;
            }
        }
        System.out.println("GRUPO G:");
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {

                partidosFase.add(new Partido(new Date(04 / 7 / 8 + i), fase.getGrupo7().get(i), fase.getGrupo7().get(j)));
                if (calcular.ganoLocal(fase.getGrupo7().get(i).getNombre(), fase.getGrupo7().get(j).getNombre())) {
                } else if (calcular.empate(fase.getGrupo7().get(i).getNombre(), fase.getGrupo7().get(j).getNombre())) ;
            }

        }System.out.println("GRUPO H:");
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {

                partidosFase.add(new Partido(new Date(04 / 7 / 10 + i), fase.getGrupo8().get(i), fase.getGrupo8().get(j)));
                if (calcular.ganoLocal(fase.getGrupo8().get(i).getNombre(), fase.getGrupo8().get(j).getNombre())) {
                } else if (calcular.empate(fase.getGrupo8().get(i).getNombre(), fase.getGrupo8().get(j).getNombre())) ;
            }
        }calcular.agregarEquipos(fase);


        Llave octavos = new Llave();
        ArrayList<Partido> octavosPartidos = new ArrayList<Partido>();
        octavos.setDescripcionEtapa("OCTAVOS DE FINAL");

        System.out.println(octavos.getDescripcionEtapa());

        for (int i = 0; i < 16; i++) {
            octavos.addEquiposQueAvanzan(fase.getEquiposQueAvanzan().get(i));

        }

        Llave cuartos = new Llave();
        for (int i = 0; i <16; i+=2) {
            octavosPartidos.add(new Partido(new Date(1/7/15+i),octavos.getEquiposQueAvanzan().get(i),octavos.getEquiposQueAvanzan().get(i+1)));

            if (calcular.ganoLocal(octavos.getEquiposQueAvanzan().get(i).getNombre(),octavos.getEquiposQueAvanzan().get(i+1).getNombre())){
                cuartos.addEquiposQueAvanzan(octavos.getEquiposQueAvanzan().get(i));
              } else if (calcular.decision== false) {
                cuartos.addEquiposQueAvanzan(octavos.getEquiposQueAvanzan().get(i + 1));
            }
            if (calcular.empate(octavos.getEquiposQueAvanzan().get(i).getNombre(),octavos.getEquiposQueAvanzan().get(i+1).getNombre()));



            }
        System.out.println("EQUIPOS QUE PASAN A CUARTOS");
        for (int i = 0; i < cuartos.getEquiposQueAvanzan().size() ; i++) {
            System.out.println(cuartos.getEquiposQueAvanzan().get(i).getNombre());
            
        }

        Llave semifinales = new Llave();
        ArrayList<Partido> cuartosPartidos = new ArrayList<Partido>();
        cuartos.setDescripcionEtapa("CUARTOS DE FINAL");
        System.out.println(cuartos.getDescripcionEtapa());
        for (int i = 0; i <8; i+=2) {
            cuartosPartidos.add(new Partido(new Date(1/9/2+i),cuartos.getEquiposQueAvanzan().get(i),cuartos.getEquiposQueAvanzan().get(i+1)));

            if (calcular.ganoLocal(cuartos.getEquiposQueAvanzan().get(i).getNombre(),cuartos.getEquiposQueAvanzan().get(i+1).getNombre())){
                semifinales.addEquiposQueAvanzan(cuartos.getEquiposQueAvanzan().get(i));
            } else if (calcular.decision== false) {
                semifinales.addEquiposQueAvanzan(cuartos.getEquiposQueAvanzan().get(i + 1));
            }
            if (calcular.empate(cuartos.getEquiposQueAvanzan().get(i).getNombre(),cuartos.getEquiposQueAvanzan().get(i+1).getNombre()));



        }
        System.out.println("EQUIPOS QUE PASAN A SEMIFINALES");
        for (int i = 0; i < semifinales.getEquiposQueAvanzan().size() ; i++) {
            System.out.println(semifinales.getEquiposQueAvanzan().get(i).getNombre());

        }
        Llave finales = new Llave();
        ArrayList<Partido> semifinalPartidos = new ArrayList<Partido>();
        semifinales.setDescripcionEtapa("SEMIFINALES");
        System.out.println(semifinales.getDescripcionEtapa());
        for (int i = 0; i <4; i+=2) {
            semifinalPartidos.add(new Partido(new Date(1/9/10+i),semifinales.getEquiposQueAvanzan().get(i),semifinales.getEquiposQueAvanzan().get(i+1)));

            if (calcular.ganoLocal(semifinales.getEquiposQueAvanzan().get(i).getNombre(),semifinales.getEquiposQueAvanzan().get(i+1).getNombre())){
                finales.addEquiposQueAvanzan(semifinales.getEquiposQueAvanzan().get(i));
            } else if (calcular.decision== false) {
                finales.addEquiposQueAvanzan(semifinales.getEquiposQueAvanzan().get(i + 1));
            }
            if (calcular.empate(semifinales.getEquiposQueAvanzan().get(i).getNombre(),semifinales.getEquiposQueAvanzan().get(i+1).getNombre()));



        }
        System.out.println("EQUIPOS QUE PASAN A FINAL");
        for (int i = 0; i < finales.getEquiposQueAvanzan().size() ; i++) {
            System.out.println(finales.getEquiposQueAvanzan().get(i).getNombre());

        }

        Llave ganador = new Llave();
        ArrayList<Partido> finalesPartidos = new ArrayList<Partido>();
        finales.setDescripcionEtapa("FINALLLLLLLLLLLLLLLLL");
        System.out.println(finales.getDescripcionEtapa());
        for (int i = 0; i <1; i++) {
            semifinalPartidos.add(new Partido(new Date(1/12/17),finales.getEquiposQueAvanzan().get(i),finales.getEquiposQueAvanzan().get(i+1)));

            if (calcular.ganoLocal(finales.getEquiposQueAvanzan().get(i).getNombre(),finales.getEquiposQueAvanzan().get(i+1).getNombre())){
                ganador.addEquiposQueAvanzan(finales.getEquiposQueAvanzan().get(i));
            } else if (calcular.decision== false) {
                ganador.addEquiposQueAvanzan(finales.getEquiposQueAvanzan().get(i + 1));
            }
            if (calcular.empate(finales.getEquiposQueAvanzan().get(i).getNombre(),finales.getEquiposQueAvanzan().get(i+1).getNombre()));



        }

        for (int i = 0; i < ganador.getEquiposQueAvanzan().size() ; i++) {
            System.out.println(ganador.getEquiposQueAvanzan().get(i).getNombre());
            System.out.println(String.format("%s %s" ,"primer puesto : ", ganador.getEquiposQueAvanzan().get(i).getNombre()));
        }

        }

    }


