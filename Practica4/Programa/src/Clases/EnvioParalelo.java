/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.InputStream;
import java.io.OutputStream;
import javax.comm.CommPortIdentifier;
import javax.comm.ParallelPort;

/**
 *
 * @author di3go
 */
public class EnvioParalelo {
    public CommPortIdentifier idPort;
    public ParallelPort puertoParalelo;
    public OutputStream salida;
    public String nombre;
    public static int PARALELO=0;
    
    public void iniciarPuerto(){
        try {
            nombre= "LPT1";
            idPort = CommPortIdentifier.getPortIdentifier(nombre);
            puertoParalelo=(ParallelPort) idPort.open("CODIGO.JAVA@HOTMAIL.COM", 888);
            salida = puertoParalelo.getOutputStream();
            System.out.println("Puerto "+nombre+" iniciado ...");
        }
        catch (Exception e) {
            System.out.println("Error en iniciarPuerto() \n"+e);
        }
    }

        public void cerrarPuerto(){
            try {
                salida.close();
            } catch (Exception e) {
                System.out.println("Error en cerrarPuerto() \n"+e);
            }
            System.out.println("Puerto "+nombre+" cerrado ...");
        }

        public void escribirEnPuerto(int dato){
            try {
                salida.write(dato);
                System.out.println("Dato "+dato+" escrito en Puerto "+nombre+" ...");
            }
            catch (Exception e) {
                System.out.println("Error en escribirEnPuerto() \n"+e);
            }
        }
}
