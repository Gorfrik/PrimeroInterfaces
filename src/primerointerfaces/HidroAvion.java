
package primerointerfaces;

import java.util.Scanner;

public class HidroAvion implements Barco, Avion {

    int id;
    boolean estado = false;
    int potencia;
    int dist_min;
    String lugar_atraque;
    int hora_atraque;
    int peso;
    int peso_max;

    public boolean undirse() {
        return estado;
    }

    public void atracar(String lugar, int hora) {
        lugar_atraque = lugar;
        hora_atraque = hora;
    }

    public void verDatos() {
        System.out.println("El id es " + id);
        if (estado) {
            System.out.println("Esta hundido");
        } else {
            System.out.println("Flota");
        }
        System.out.println("Tiene " + potencia + " de potencia");
        System.out.println("Tiene una distancia minima de despegue de" + dist_min);
        System.out.println("Su lugar de atraque es " + lugar_atraque);
        System.out.println("La hora de traque es " + hora_atraque);
        System.out.println("Tiene un peso maximo de " + peso_max);
    }

    public void alta() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime el id");
        id = sn.nextInt();
        System.out.println("Cuanta potencia tiene?");
        potencia = sn.nextInt();
        System.out.println("Cual es la distancia minima de despegue?");
        dist_min = sn.nextInt();
        System.out.println("Cual sera la hora de atraque");
        hora_atraque = sn.nextInt();
        System.out.println("Cual es su lugar de atraque");
        lugar_atraque = sn.next();
        System.out.println("Cual es su peso maximo");
        peso_max = sn.nextInt();

    }

    public boolean despegar(int distanciaMin, int velozViento, int poten_min, int peso) {
        boolean despegar = true;
        if (velozViento > 70) {
            if ((peso_max / 10) > peso) {
                despegar = false;
            }
        }

        return despegar;
    }

    public boolean aterrizar(int distanciaMin, int velozViento) {
        boolean aterrizar = true;
        
        
        
        
        
        return aterrizar;
    }

    public void cambiarPotencia() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Cual es la potencia?");
        potencia = sn.nextInt();
    }

    public void cambiarDistancia() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Cual es la distancia?");
        dist_min = sn.nextInt();
    }

    public int VerPeso() {
        return peso_max;
    }

}
