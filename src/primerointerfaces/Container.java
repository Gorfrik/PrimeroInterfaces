
package primerointerfaces;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Container implements Barco {

    String nombre;
    boolean estado=false;
    int max_containers;
    int num_containers;
    String lugar_atraque;
    int hora_atraque;

    public Container() {
        this.nombre = "1";
        this.max_containers = 100;
        this.num_containers = 50;
        this.lugar_atraque = "puerto";
        this.hora_atraque = 12;
    }

    public void CambiarMax() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Cuanto sera el maximo");
        max_containers = sn.nextInt();
    }

    public void CambiarReal() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Cuanto sera los reales");
        num_containers = sn.nextInt();
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
        System.out.println("Tiene " + max_containers + " containers maximos");
        System.out.println("Tiene " + num_containers + " containers alojados");
        System.out.println("Su lugar de atraque es " + lugar_atraque);
        System.out.println("La hora de traque es " + hora_atraque);
    }

    public void alta() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime el nombre");
        nombre = sn.next();
        System.out.println("Cuantos pasajeros tiene?");
        max_containers = sn.nextInt();
        System.out.println("Cuantas camas tiene?");
        num_containers = sn.nextInt();
        System.out.println("Cual sera la hora de atraque");
        hora_atraque = sn.nextInt();
    }

}
