
package primerointerfaces;

import java.util.Scanner;

public class Transatlantico implements Barco {

    String nombre;
    boolean estado=false;
    int pasajeros;
    int camas;
    String lugar_atraque;
    int hora_atraque;

    public Transatlantico() {
        this.nombre = "2";
        this.pasajeros = 50;
        this.camas = 60;
        this.lugar_atraque = "puerto";
        this.hora_atraque = 12;
    }
    
    public void CambiarPasajeros() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Cuantos pasajeros entran?");
        pasajeros = sn.nextInt();
    }

    public void CambiarCamas() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Cuantos camas vamos poner?");
        camas = sn.nextInt();

    }

    public boolean undirse() {
        return estado;
    }

    public void atracar(String lugar, int hora) {
        lugar_atraque = lugar;
        hora_atraque = hora;
    }

    public void verDatos() {

        System.out.println("El nombre es " + nombre);
        if (estado) {
            System.out.println("Esta hundido");
        } else {
            System.out.println("Flota");
        }
        System.out.println("Tiene " + pasajeros + " pasajeros");
        System.out.println("Tiene " + camas + " camas");
        System.out.println("Su lugar de atraque es " + lugar_atraque);
        System.out.println("La hora de traque es " + hora_atraque);
    }

    public void alta() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime el nombre");
        nombre=sn.next();
        System.out.println("Cuantos pasajeros tiene?");
        pasajeros=sn.nextInt();
        System.out.println("Cuantas camas tiene?");
        camas=sn.nextInt();
        System.out.println("Cual sera la hora de atraque");
        hora_atraque=sn.nextInt();
    
    }

}
