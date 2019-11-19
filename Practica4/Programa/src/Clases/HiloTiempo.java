
package Clases;

import Forms.PantallaSNAKE;

public class HiloTiempo extends Thread{
    public static int tiempo;
    public HiloTiempo()
    {
        tiempo = 0;
    }
     @Override
    public void run() {
        while(true){
            PantallaSNAKE.lbl_tiempo.setText(""+tiempo);
            tiempo ++;
        try {
            Thread.currentThread().sleep(1000);
        }catch( InterruptedException e ){}
        }
    }

    public static int getTiempo() {
        return tiempo;
    }

    public static void setTiempo(int tiempo) {
        HiloTiempo.tiempo = tiempo;
    }
}
