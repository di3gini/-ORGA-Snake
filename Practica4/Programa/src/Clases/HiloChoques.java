/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Forms.InicioPartida;
import Forms.PantallaSNAKE;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HiloChoques extends Thread{
    public HiloChoques()
    {
        
    }
     @Override
    public void run() {
        while(true){
            VALIDAR_CHOQUE_CONTRA_MURO();
        try {
            Thread.currentThread().sleep(PantallaSNAKE.Velocidad);
        }catch( InterruptedException e ){}
        }
    }
    
    private void VALIDAR_CHOQUE_CONTRA_MURO() {
        
            int posXSnake = PantallaSNAKE.snake.getCabeza().getPosX();
            int posYSnake = PantallaSNAKE.snake.getCabeza().getPosY();
            ArrayList<Nodo> muros = new ArrayList<>();
            switch(PantallaSNAKE.nivel)
            {
                case 1:
                    muros = PantallaSNAKE.MurosNivel1;
                    break;
                case 2:
                    muros = PantallaSNAKE.MurosNivel2;
                    break;
                case 3:
                    muros = PantallaSNAKE.MurosNivel3;
                    break;
            }
        for (int i = 0; i < muros.size(); i++) {
            Nodo muro = muros.get(i);
            int posXMuro = muro.getPosX();
            int posYMuro = muro.getPosY();
                    
            if (posXSnake==posXMuro && posYSnake==posYMuro) {
                //HUBO UN CHOQUE
                GameOver();
            }
        }
    }

    private static void GameOver() {
                PantallaSNAKE.GuardarDatosJugador();
                PantallaSNAKE.hilosnake.stop();
                HiloSnake.hilo_tiempo.stop();
                InicioPartida.lbl_nivel.setText(String.valueOf(PantallaSNAKE.nivel));
                InicioPartida.lbl_puntos.setText(String.valueOf(PantallaSNAKE.lbl_punteo.getText()));
                InicioPartida.lbl_tiempo.setText(String.valueOf(PantallaSNAKE.lbl_tiempo.getText()));
                JOptionPane.showMessageDialog(null, "Perdiste prro :'v \n GAME OVER \n Sale en vacas");
                HiloSnake.hilo_choques.stop();
                HiloSnake.hilo_choques.suspend();
    }


}
