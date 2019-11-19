/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author Andree
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            System.loadLibrary("rxtxSerial");
            System.out.println("Se ha cargado la librería nativa correctamente");
            new Interfaz().show();

        } catch (UnsatisfiedLinkError u) {
            System.err.println("No se ha encontrado la librería nativa de puerto serie");

            
        }
    }
}
