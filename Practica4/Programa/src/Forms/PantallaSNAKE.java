
package Forms;

import Clases.Culebra;
import Clases.HiloSnake;
import Clases.Nodo;
import Clases.Variables;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
/**
 *
 * @author user
 */
public class PantallaSNAKE extends javax.swing.JFrame{

    public static Nodo comida;
    public static JButton[][] Casillas = new JButton[12][12];
    public static ArrayList<Nodo> MurosNivel1 = new ArrayList<>();
    public static ArrayList<Nodo> MurosNivel2 = new ArrayList<>();
    public static ArrayList<Nodo> MurosNivel3 = new ArrayList<>();
    public static Culebra snake;
    public static Thread hilosnake;
    public static int Velocidad;
    public static String Ultima_Pos = "";
    public static int nivel;
    public static boolean[][] matriz_logica = new boolean[12][12];
    public static void GuardarDatosJugador() {
        int punteo = Integer.parseInt(lbl_punteo.getText());
        Variables.usuarioLoggeado.setPunteo(punteo);
        Variables.usuarioLoggeado.setTiempo(Integer.parseInt(lbl_tiempo.getText()));
    }
    
    public PantallaSNAKE() {
        nivel = 1;
        comida = new Nodo();
        snake = new Culebra();
        initComponents();
        CargarTableroNivel1();
    }
    
    public void CargarMuros()
    {
        //CARGO LOS MUROS DEL NIVEL 1-----------------------------------------------------------------------
        for (int i = 0; i < 4; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(0);
            MurosNivel1.add(n);
        }
        for (int i = 7; i < 12; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(0);
            MurosNivel1.add(n);
        }
        for (int i = 0; i < 4; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(11);
            MurosNivel1.add(n);
        }
        for (int i = 7; i < 12; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(11);
            MurosNivel1.add(n);
        }
        for (int j = 4; j < 8; j++) {
            Nodo n = new Nodo();
            n.setPosX(2);
            n.setPosY(j);
            MurosNivel1.add(n);
        }
        for (int j = 4; j < 8; j++) {
            Nodo n = new Nodo();
            n.setPosX(9);
            n.setPosY(j);
            MurosNivel1.add(n);
        }
        //CARGO LOS MUROS DEL NIVEL 2-----------------------------------------------------------------------
        for (int j = 0; j < 4; j++) {
            Nodo n = new Nodo();
            n.setPosX(0);
            n.setPosY(j);
            MurosNivel2.add(n);
        }
        for (int j = 0; j < 4; j++) {
            Nodo n = new Nodo();
            n.setPosX(11);
            n.setPosY(j);
            MurosNivel2.add(n);
        }
        for (int i = 0; i < 4; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(0);
            MurosNivel2.add(n);
        }
        for (int i = 8; i < 12; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(0);
            MurosNivel2.add(n);
        }
        
        for (int j = 8; j < 11; j++) {
            Nodo n = new Nodo();
            n.setPosX(0);
            n.setPosY(j);
            MurosNivel2.add(n);
        }
        for (int j = 8; j < 11; j++) {
            Nodo n = new Nodo();
            n.setPosX(11);
            n.setPosY(j);
            MurosNivel2.add(n);
        }
        for (int i = 0; i < 4; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(11);
            MurosNivel2.add(n);
        }
        for (int i = 8; i < 12; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(11);
            MurosNivel2.add(n);
        }
       
        //CARGO LOS MUROS DEL NIVEL 3------------------------
        for (int i = 3; i < 9; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(8);
            MurosNivel3.add(n);
        }
        for (int i = 3; i < 9; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(3);
            MurosNivel3.add(n);
        }
                for (int j = 0; j < 4; j++) {
            Nodo n = new Nodo();
            n.setPosX(0);
            n.setPosY(j);
            MurosNivel3.add(n);
        }
        for (int j = 0; j < 4; j++) {
            Nodo n = new Nodo();
            n.setPosX(11);
            n.setPosY(j);
            MurosNivel3.add(n);
        }
        for (int i = 0; i < 4; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(0);
            MurosNivel3.add(n);
        }
        for (int i = 8; i < 12; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(0);
            MurosNivel3.add(n);
        }
        
        for (int j = 8; j < 11; j++) {
            Nodo n = new Nodo();
            n.setPosX(0);
            n.setPosY(j);
            MurosNivel3.add(n);
        }
        for (int j = 8; j < 11; j++) {
            Nodo n = new Nodo();
            n.setPosX(11);
            n.setPosY(j);
            MurosNivel3.add(n);
        }
        for (int i = 0; i < 4; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(11);
            MurosNivel3.add(n);
        }
        for (int i = 8; i < 12; i++) {
            Nodo n = new Nodo();
            n.setPosX(i);
            n.setPosY(11);
            MurosNivel3.add(n);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        PanelSnake = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_INICIAR = new javax.swing.JButton();
        btn_IZQUIERDA = new javax.swing.JButton();
        btn_ARRIBA = new javax.swing.JButton();
        btn_ABAJO = new javax.swing.JButton();
        btn_DERECHA = new javax.swing.JButton();
        lbl_punteo = new javax.swing.JLabel();
        lbl_tiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel7.setText("Tiempo:");

        PanelSnake.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelSnake.setPreferredSize(new java.awt.Dimension(540, 540));

        javax.swing.GroupLayout PanelSnakeLayout = new javax.swing.GroupLayout(PanelSnake);
        PanelSnake.setLayout(PanelSnakeLayout);
        PanelSnakeLayout.setHorizontalGroup(
            PanelSnakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        PanelSnakeLayout.setVerticalGroup(
            PanelSnakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel8.setText("Punteo:");

        btn_INICIAR.setText("INICIAR");
        btn_INICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_INICIARActionPerformed(evt);
            }
        });

        btn_IZQUIERDA.setText(" ◄");
        btn_IZQUIERDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IZQUIERDAActionPerformed(evt);
            }
        });

        btn_ARRIBA.setText("▲");
        btn_ARRIBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ARRIBAActionPerformed(evt);
            }
        });

        btn_ABAJO.setText("▼");
        btn_ABAJO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ABAJOActionPerformed(evt);
            }
        });

        btn_DERECHA.setText("►");
        btn_DERECHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DERECHAActionPerformed(evt);
            }
        });

        lbl_punteo.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        lbl_punteo.setText("0");

        lbl_tiempo.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        lbl_tiempo.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(PanelSnake, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(lbl_punteo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_INICIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_tiempo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_IZQUIERDA)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_ABAJO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_DERECHA))
                            .addComponent(btn_ARRIBA))
                        .addGap(48, 48, 48))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel8)
                    .addContainerGap(481, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelSnake, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_INICIAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ARRIBA)
                            .addComponent(lbl_punteo))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_IZQUIERDA)
                            .addComponent(btn_ABAJO)
                            .addComponent(btn_DERECHA))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbl_tiempo))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(630, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(56, 56, 56)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_INICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_INICIARActionPerformed
        hilosnake = new Thread(new HiloSnake(),"HiloSnake");
        hilosnake.start();
    }//GEN-LAST:event_btn_INICIARActionPerformed

    private void btn_ARRIBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ARRIBAActionPerformed
        
        Ultima_Pos = "arriba";
      //  System.out.println("ARRIBA");
    }//GEN-LAST:event_btn_ARRIBAActionPerformed

    private void btn_IZQUIERDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IZQUIERDAActionPerformed
        
        Ultima_Pos = "izquierda";
        //System.out.println("IZQUIERDA");
    }//GEN-LAST:event_btn_IZQUIERDAActionPerformed

    private void btn_ABAJOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ABAJOActionPerformed
        
        Ultima_Pos = "abajo";
       // System.out.println("ABAJO");
    }//GEN-LAST:event_btn_ABAJOActionPerformed

    private void btn_DERECHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DERECHAActionPerformed
        
        Ultima_Pos = "derecha";
       // System.out.println("DERECHA");
    }//GEN-LAST:event_btn_DERECHAActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaSNAKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaSNAKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaSNAKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaSNAKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaSNAKE().setVisible(true);
            }
        });
    }

    private void CargarTableroNivel1() {
        
        //CARGO TODOS LOS MUROS DE LOS NIVELES
        CargarMuros();
        
        Velocidad = 1000; //CADA 1 SEGUNDOS SE MUEVE EL SNAKE PARA EL PRIMER NIVEL
        Ultima_Pos = "arriba"; //empieza yendo para arriba
        
        //CREO LOS COMPONENTES QUE REPRESENTAN EL TABLERO
        int dimension = 540/12; //     540/12
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                JButton btn = new JButton();
                btn.setBackground(Color.WHITE);
                btn.setBounds(PanelSnake.getX() + dimension*j, PanelSnake.getY() + dimension*i, dimension, dimension);
                PanelSnake.add(btn);
                Casillas[i][j] = btn;
            }
        }
        
        //PONGO BLANCO TODO
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                Casillas[i][j].setBackground(Color.WHITE);
            }
        }
        
        //CARGO LOS MUROS DEL NIVEL 1
        for (int i = 0; i < MurosNivel1.size(); i++) {
            Nodo n = MurosNivel1.get(i);
            Casillas[n.getPosX()][n.getPosY()].setBackground(Color.GREEN);
        }
        
        //COLOCO EL SNAKE EN LA POSICION QUE LE TOQUE
        for (int i = 0; i < snake.getCuerpo().size(); i++) {
            int x = snake.getCuerpo().get(i).getPosX();
            int y = snake.getCuerpo().get(i).getPosY();
            Casillas[x][y].setBackground(Color.BLUE);
        }

        //COLOCO LA COMIDA
        //ColocarComida();
        //CARGAMOS LA MATRIZ LOGICA
        for (int i=0; i <12;i++){
            for (int j=0; j<12;j++){
                if(Casillas[i][j].getBackground()!=Color.WHITE){
                    matriz_logica[i][j] = true;
                }
            }
        }
    }
    
    public int NumeroRandom()
    {
        return (int) (Math.random()*11+0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelSnake;
    private javax.swing.JButton btn_ABAJO;
    private javax.swing.JButton btn_ARRIBA;
    private javax.swing.JButton btn_DERECHA;
    private javax.swing.JButton btn_INICIAR;
    private javax.swing.JButton btn_IZQUIERDA;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel lbl_punteo;
    public static javax.swing.JLabel lbl_tiempo;
    // End of variables declaration//GEN-END:variables

    public void ColocarComida() {
        int x=0;
        int y=0;
        while (Casillas[x][y].getBackground()!=Color.WHITE) {            
            x = NumeroRandom();
            y = NumeroRandom();
        }
        Casillas[x][y].setBackground(Color.ORANGE);
    }

}
