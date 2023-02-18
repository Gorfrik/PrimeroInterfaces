package primerointerfaces;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class PrimeroInterfaces {

    public static void MENU() {
        System.out.println();
        System.out.println("1).Dar Transatlantico de alta");
        System.out.println("2).Dar Container de alta");
        System.out.println("3).Ver datos");
        System.out.println("4).Atracar");
        System.out.println("5).Esta undido");
        System.out.println("6).Cambiar maximo de contenedores");
        System.out.println("7).Cambiar el numero de contenedores real");
        System.out.println("8).Cambiar pasajeros");
        System.out.println("9).Cambiar camas");
        System.out.println("-------------------------------------------");
        System.out.println("10).Dar de alta hidroavion");
        System.out.println("11).Puede despegar?");
        System.out.println("12).Puede aterrizar?");
        System.out.println("13).Cambiar potencia");
        System.out.println("14).Cambiar distancia");
        System.out.println("15).Ver peso");
        System.out.println("16).Salir");
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ArrayList<Barco> barcos = new ArrayList();
        barcos.add(new Transatlantico());
        barcos.add(new Container());
        int caso;
        int buscar;
        do {
            MENU();
            caso = sn.nextInt();
            switch (caso) {
                case 1:
                    Transatlantico tr = new Transatlantico();
                    tr.alta();
                    barcos.add(tr);
                    break;
                case 2:
                    Container con = new Container();
                    con.alta();
                    barcos.add(con);
                    break;
                case 3:
                    buscar = buscarBarco(barcos);
                    if (buscar != -1) {
                        barcos.get(buscar).verDatos();
                    } else {
                        System.out.println("No se encontro barco");
                    }
                    break;
                case 4:
                    buscar = buscarBarco(barcos);
                    System.out.println("Donde atraca?");
                    String lugar = sn.next();
                    System.out.println("Hora atraque");
                    int hora = sn.nextInt();
                    barcos.get(buscar).atracar(lugar, hora);
                    break;
                case 5:
                    buscar = buscarBarco(barcos);
                    barcos.get(buscar).undirse();
                    break;
                case 6:
                    buscar = buscarBarco(barcos);
                    if (buscar != -1) {
                        if (barcos.get(buscar) instanceof Container cont) {
                            cont.CambiarMax();
                        } else {
                            System.out.println("No es un barco Container");
                        }
                    }
                    break;
                case 7:
                    buscar = buscarBarco(barcos);
                    if (buscar != -1) {
                        if (barcos.get(buscar) instanceof Container cont) {
                            cont.CambiarReal();
                        } else {
                            System.out.println("No es un barco Container");
                        }
                    }
                    break;
                case 8:
                    buscar = buscarBarco(barcos);
                    if (buscar != -1) {
                        if (barcos.get(buscar) instanceof Transatlantico tra) {
                            tra.CambiarPasajeros();
                        } else {
                            System.out.println("No es un barco Transatlantico");
                        }
                    }

                    break;
                case 9:
                    buscar = buscarBarco(barcos);
                    if (buscar != -1) {
                        if (barcos.get(buscar) instanceof Transatlantico tra) {
                            tra.CambiarCamas();
                        } else {
                            System.out.println("No es un barco Transatlantico");
                        }
                    }

                    break;
                case 10:
                    buscar = buscarBarco(barcos);
                    if (buscar != -1) {
                        if (barcos.get(buscar) instanceof HidroAvion hidro) {
                            hidro.alta();
                            barcos.add(hidro);
                        } else {
                            System.out.println("No es un HidroAvion");
                        }
                    }
                    break;
                case 11:
                    buscar = buscarBarco(barcos);
                    if (barcos.get(buscar) instanceof HidroAvion hidro) {
                        System.out.println("cual es la distancia minima?");
                        int dismin = sn.nextInt();
                        System.out.println("Cual es la potencia minima?");
                        int potmin = sn.nextInt();
                        System.out.println("cual es la velociada del viento?(k/h)");
                        int viento = sn.nextInt();
                        System.out.println("Cual es el peso?");
                        int peso = sn.nextInt();
                        boolean resp = hidro.despegar(dismin, viento, potmin, peso);
                        if (resp) {
                            System.out.println("puede aterrizar");
                        } else {
                            System.out.println("No puede aterrizar");
                        }
                    } else {
                        System.out.println("No es un HidroAvion");
                    }
                    break;
                case 12:
                    buscar = buscarBarco(barcos);
                    if (barcos.get(buscar) instanceof HidroAvion hidro) {

                    } else {
                        System.out.println("No es un HidroAvion");
                    }
                    break;
                case 13:
                    buscar = buscarBarco(barcos);
                    if (barcos.get(buscar) instanceof HidroAvion hidro) {

                    } else {
                        System.out.println("No es un HidroAvion");
                    }
                    break;
                case 14:
                    buscar = buscarBarco(barcos);
                    if (barcos.get(buscar) instanceof HidroAvion hidro) {

                    } else {
                        System.out.println("No es un HidroAvion");
                    }
                    break;
                case 15:
                    buscar = buscarBarco(barcos);
                    if (barcos.get(buscar) instanceof HidroAvion hidro) {

                    } else {
                        System.out.println("No es un HidroAvion");
                    }
                    break;
                case 16:
                    break;
            }
        } while (caso != 5);
        System.out.println("Fin");
    }

    public static int buscarBarco(ArrayList<Barco> barcos) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nombre del barco");
        String buscar = sn.next();
        int devolver = -1;

        for (int i = 0; i < barcos.size(); i++) {
            if (barcos.get(i) instanceof Container cont) {
                if (buscar.equalsIgnoreCase(cont.nombre)) {

                    return i;
                }
            } else if (barcos.get(i) instanceof Transatlantico tran) {
                if (buscar.equalsIgnoreCase(tran.nombre)) {

                    return i;
                }
            }

        }
        return devolver;
    }
}
