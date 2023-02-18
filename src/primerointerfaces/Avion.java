/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package primerointerfaces;

/**
 *
 * @author usuario
 */
public interface Avion {
    
    boolean despegar(int distanciaMin,int velozViento,int poten_min,int peso);
    boolean aterrizar(int distanciaMin,int velozViento);
    void alta();
    
    
}
