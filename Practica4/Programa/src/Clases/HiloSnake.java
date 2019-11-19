package Clases;

import Forms.PantallaSNAKE;
import static Forms.PantallaSNAKE.Velocidad;
import java.awt.Color;

public class HiloSnake extends Thread
{
    public static Thread hilo_choques;
    public static Thread hilo_tiempo;
    public String posAnt;
    int UltimaColaX;
    int UltimaColaY;
    
    public HiloSnake()
    {
        
    }
    
     public int NumeroRandom()
    {
        return (int) (Math.random()*11+0);
    }
    
        public void ColocarComida() {
        int x=0;
        int y=0;
        while (PantallaSNAKE.Casillas[x][y].getBackground()!=Color.WHITE) {            
            x = NumeroRandom();
            y = NumeroRandom();
        }
        PantallaSNAKE.comida.setPosX(x);
        PantallaSNAKE.comida.setPosY(y);
    }
    
     @Override
    public void run() {
        //INICIO EL SEGUNDO HILO QUE ME SERVIRÁ PARA VALIDAR CHOQUES CONTRA EL CUERPO MISMO Y CONTRA MUROS
        hilo_choques = new Thread(new HiloChoques(),"HiloValidaciones");
        hilo_choques.start();
        hilo_tiempo = new Thread(new HiloTiempo(),"HiloTiempo");
        hilo_tiempo.start();
        posAnt = "arriba";
        ColocarComida();
        while(true){
            MoverSnake();
            VALIDAR_COMIDA();
            ActualizarColores();
        try {
            Thread.currentThread().sleep(Velocidad);
        }catch( InterruptedException e ){}
        }
    }
    
        private void VALIDAR_COMIDA() 
    {
        Nodo c = PantallaSNAKE.comida;
        int x = c.getPosX();
        int y = c.getPosY();
        int xCabeza = PantallaSNAKE.snake.getCabeza().getPosX();
        int yCabeza = PantallaSNAKE.snake.getCabeza().getPosY();
        if (x==xCabeza && y == yCabeza)
        {
            Nodo n = new Nodo();
            n.setPosX(UltimaColaX);
            n.setPosY(UltimaColaY);
            PantallaSNAKE.snake.AddNodo(n);
            Variables.usuarioLoggeado.setPunteo(Variables.usuarioLoggeado.getPunteo()+10);
            ColocarComida();
            PantallaSNAKE.lbl_punteo.setText(""+Variables.usuarioLoggeado.getPunteo());
            
            if(Variables.usuarioLoggeado.getPunteo()==60)
            {
                Velocidad = Velocidad-300;
                PantallaSNAKE.nivel = 2;
            }
            else if(Variables.usuarioLoggeado.getPunteo()==120)
            {
                Velocidad = Velocidad-300;
                PantallaSNAKE.nivel = 3;
            }
        }
    }

    private void MoverSnake() 
    {
        
        //MUEVO EL DEMAS CUERPO
        int tamaño = PantallaSNAKE.snake.getCuerpo().size();
        for (int i = tamaño-1; i > 0; i--)
        {
            Nodo trasero = PantallaSNAKE.snake.getCuerpo().get(i);
            Nodo sup = PantallaSNAKE.snake.getCuerpo().get(i-1);
            
            if(i==tamaño-1)
            {
                UltimaColaX = sup.getPosX();
                UltimaColaY = sup.getPosY();
            }
            
            trasero.setPosX(sup.getPosX());
            trasero.setPosY(sup.getPosY());
            
            //CUANDO ES LA ULTIMA ITERACION MUEVO LA CABEZA DEL SNAKE
            if(i==1)
            {
                Nodo cabeza = PantallaSNAKE.snake.getCabeza();
                int x = PantallaSNAKE.snake.getCabeza().getPosX();
                int y = PantallaSNAKE.snake.getCabeza().getPosY();
                String pos = PantallaSNAKE.Ultima_Pos;
                // MUEVO LA CABEZA DEL SNAKE
                switch(pos)
                {
                    case "arriba":
                        //ESTOS IFS SIRVEN PARA COMPARAR SI ANTES SE HABÍA APACHADO EL CONTRARIO ASÍ SE OMITE EL MOVIMIENTO
                        if (!posAnt.equals("abajo"))
                        {
                            if(x-1!=-1)
                            {
                                cabeza.setPosX(x-1);
                            }
                            else
                            {
                                cabeza.setPosX(11);
                            }
                        }
                        break;
                    case "abajo":
                        if(!posAnt.equals("arriba"))
                        {
                            if (x+1 !=12) 
                            {
                                cabeza.setPosX(x+1);
                            }
                            else
                            {
                                cabeza.setPosX(0);
                            }
                        }
                        break;
                    case "izquierda":
                        if(!posAnt.equals("derecha"))
                        {
                            if (y-1!=-1) {
                                cabeza.setPosY(y-1);
                            }
                            else
                            {
                                cabeza.setPosY(11);
                            }
                        }
                        break;
                    case "derecha":
                        if(!posAnt.equals("izquierda"))
                        {
                            if (y+1!=12) {
                                cabeza.setPosY(y+1);
                            }
                            else
                            {
                                cabeza.setPosY(0);
                            }
                        }
                        break;
                }
                posAnt = pos;
            }
        }
    }

    private void ActualizarColores() {
        //PONGO BLANCO TODO
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                PantallaSNAKE.Casillas[i][j].setBackground(Color.WHITE);
            }
        }
        
        switch(PantallaSNAKE.nivel)
        {
            case 1:
                 //CARGO LOS MUROS DEL NIVEL 1
                for (int i = 0; i < PantallaSNAKE.MurosNivel1.size(); i++) {
                    Nodo n = PantallaSNAKE.MurosNivel1.get(i);
                    PantallaSNAKE.Casillas[n.getPosX()][n.getPosY()].setBackground(Color.GREEN);
                }
                break;
            case 2:
                 //CARGO LOS MUROS DEL NIVEL 2
                for (int i = 0; i < PantallaSNAKE.MurosNivel2.size(); i++) {
                    Nodo n = PantallaSNAKE.MurosNivel2.get(i);
                    PantallaSNAKE.Casillas[n.getPosX()][n.getPosY()].setBackground(Color.GREEN);
                }
                break;
            case 3:
                 //CARGO LOS MUROS DEL NIVEL 3
                for (int i = 0; i < PantallaSNAKE.MurosNivel3.size(); i++) {
                    Nodo n = PantallaSNAKE.MurosNivel3.get(i);
                    PantallaSNAKE.Casillas[n.getPosX()][n.getPosY()].setBackground(Color.GREEN);
                }
                break;
        }
        
        //COLOCO EL SNAKE EN LA POSICION QUE LE TOQUE
        for (int i = 0; i < PantallaSNAKE.snake.getCuerpo().size(); i++) {
            int x = PantallaSNAKE.snake.getCuerpo().get(i).getPosX();
            int y = PantallaSNAKE.snake.getCuerpo().get(i).getPosY();
            PantallaSNAKE.Casillas[x][y].setBackground(Color.BLUE);
        }
        
        //REPINTO LA COMIDA
        PantallaSNAKE.Casillas[PantallaSNAKE.comida.getPosX()][PantallaSNAKE.comida.getPosY()].setBackground(Color.ORANGE);
        //REFRESCAMOS LA MATRIZ LOGICA
        for (int i=0; i <12;i++){
            for (int j=0; j<12;j++){
                if(PantallaSNAKE.Casillas[i][j].getBackground()!=Color.WHITE){
                    PantallaSNAKE.matriz_logica[i][j] = true;
                }
                else{
                    PantallaSNAKE.matriz_logica[i][j] = false;
                }
            }
        }
        
        //VALIDACIÓN PARA EL ENVIO DE LAS FILAS Y COLUMNAS A LA MATRIZ DE LED POR MEDIO DEL PUERTO PARALELO
        String salida ="";
        for (int i=0; i<12; i++){
            for (int j=0; j<12; j++){
                if(PantallaSNAKE.matriz_logica[i][j]){
                    salida = salida + "1";
                    break;
                }
                else{
                    if(j==11 && PantallaSNAKE.matriz_logica[i][j]==false){
                        salida = salida + "0";
                    }
                }
            }
        }
        
        for (int i=0; i<12; i++){
            for (int j=0; j<12; j++){
                if(PantallaSNAKE.matriz_logica[j][i]){
                    salida = salida + "0";
                    break;
                }
                else{
                    if(j==11 && PantallaSNAKE.matriz_logica[j][i]==false){
                        salida = salida + "1";
                    }
                }
            }
        }
        
        System.out.println("La cadena de salida generada es: "+ salida);
    }




}
