/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author RUANO
 */
public class Culebra {
    
    ArrayList<Nodo> Cuerpo;
    Nodo cabeza;
    Nodo cola;

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCola() {
        return cola;
    }

    public void setCola(Nodo cola) {
        this.cola = cola;
    }
    
    public void AddNodo(Nodo n)
    {
        Cuerpo.add(n);
        this.setCola(n);
    }
    
    public Culebra()
    {
        Cuerpo = new ArrayList<>();
        
        //AGREGO LAS PRIMERAS 3 CHIBOLAS DEL CUERPO DEL SNAKE
        for (int i = 4; i < 7; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(9);
            if (i==4) {
                n.setCabeza(true);
                this.cabeza = n;
            }
            else if(i==6)
            {
                this.cola = n;
            }
            Cuerpo.add(n);
        }
    }

    public ArrayList<Nodo> getCuerpo() {
        return this.Cuerpo;
    }

    public void setCuerpo(ArrayList<Nodo> Cuerpo) {
        this.Cuerpo = Cuerpo;
    }

    
    
}
