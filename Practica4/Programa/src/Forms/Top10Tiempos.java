package Forms;

import Clases.Usuario;
import Clases.Variables;
import javax.swing.JLabel;

public class Top10Tiempos extends javax.swing.JFrame {

    public Top10Tiempos() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        CargarTop();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_toppuntos = new javax.swing.JPanel();
        lbl_Jugador1 = new javax.swing.JLabel();
        lbl_Jugador2 = new javax.swing.JLabel();
        lbl_Jugador3 = new javax.swing.JLabel();
        lbl_Jugador4 = new javax.swing.JLabel();
        lbl_Jugador5 = new javax.swing.JLabel();
        lbl_Jugador6 = new javax.swing.JLabel();
        lbl_Jugador7 = new javax.swing.JLabel();
        lbl_Jugador8 = new javax.swing.JLabel();
        lbl_Jugador9 = new javax.swing.JLabel();
        lbl_Jugador10 = new javax.swing.JLabel();
        lbl_titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_toppuntos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_Jugador1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        lbl_Jugador1.setText("1. Jugador: Jugador(1) ---> Tiempo: 0");

        lbl_Jugador2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        lbl_Jugador2.setText("2. Jugador: Jugador(2) ---> Tiempo: 0");

        lbl_Jugador3.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        lbl_Jugador3.setText("3. Jugador: Jugador(3) ---> Punteo: 0");

        lbl_Jugador4.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        lbl_Jugador4.setText("4. Jugador: Jugador(4) ---> Punteo: 0");

        lbl_Jugador5.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        lbl_Jugador5.setText("5. Jugador: Jugador(5) ---> Punteo: 0");

        lbl_Jugador6.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        lbl_Jugador6.setText("6. Jugador: Jugador(6) ---> Punteo: 0");

        lbl_Jugador7.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        lbl_Jugador7.setText("7. Jugador: Jugador(7) ---> Punteo: 0");

        lbl_Jugador8.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        lbl_Jugador8.setText("8. Jugador: Jugador(8) ---> Punteo: 0");

        lbl_Jugador9.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        lbl_Jugador9.setText("9. Jugador: Jugador(9) ---> Punteo: 0");

        lbl_Jugador10.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        lbl_Jugador10.setText("10. Jugador: Jugador(10) ---> Punteo: 0");

        javax.swing.GroupLayout panel_toppuntosLayout = new javax.swing.GroupLayout(panel_toppuntos);
        panel_toppuntos.setLayout(panel_toppuntosLayout);
        panel_toppuntosLayout.setHorizontalGroup(
            panel_toppuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_toppuntosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_toppuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Jugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Jugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Jugador3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Jugador4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Jugador5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Jugador6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Jugador7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Jugador8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Jugador9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Jugador10, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_toppuntosLayout.setVerticalGroup(
            panel_toppuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_toppuntosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Jugador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Jugador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Jugador3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Jugador4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Jugador5)
                .addGap(11, 11, 11)
                .addComponent(lbl_Jugador6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Jugador7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Jugador8)
                .addGap(11, 11, 11)
                .addComponent(lbl_Jugador9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Jugador10)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lbl_titulo1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        lbl_titulo1.setText("TOP 10 TIEMPOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(panel_toppuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(lbl_titulo1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo1)
                .addGap(18, 18, 18)
                .addComponent(panel_toppuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_Jugador1;
    private javax.swing.JLabel lbl_Jugador10;
    private javax.swing.JLabel lbl_Jugador2;
    private javax.swing.JLabel lbl_Jugador3;
    private javax.swing.JLabel lbl_Jugador4;
    private javax.swing.JLabel lbl_Jugador5;
    private javax.swing.JLabel lbl_Jugador6;
    private javax.swing.JLabel lbl_Jugador7;
    private javax.swing.JLabel lbl_Jugador8;
    private javax.swing.JLabel lbl_Jugador9;
    private javax.swing.JLabel lbl_titulo1;
    public javax.swing.JPanel panel_toppuntos;
    // End of variables declaration//GEN-END:variables
    
    public void CargarTop() {
        //AGREGO LOS JLABELS A UN ARREGLO
        JLabel[] labels = new JLabel[10];
        labels[0] = lbl_Jugador1;
        labels[1] = lbl_Jugador2;
        labels[2] = lbl_Jugador3;
        labels[3] = lbl_Jugador4;
        labels[4] = lbl_Jugador5;
        labels[5] = lbl_Jugador6;
        labels[6] = lbl_Jugador7;
        labels[7] = lbl_Jugador8;
        labels[8] = lbl_Jugador9;
        labels[9] = lbl_Jugador10;
        
        //CREO UN ARREGLO DONDE VOY A GUARDAR LOS USUARIOS
        Usuario[] Ordenados = new Usuario[Variables.Usuarios.size()];
        
        for (int i = 0; i < Variables.Usuarios.size(); i++) {
                Ordenados[i] = Variables.Usuarios.get(i);
        }
        
        //ORDENO ESE ARREGLO
        for (int i = 1; i < Ordenados.length; i++) {
            for (int j = 0; j < Ordenados.length-1; j++) {
                if (Ordenados[j].getPunteo()>Ordenados[j+1].getPunteo()) 
                {
                    Usuario temp = Ordenados[j];
                    Ordenados[j] = Ordenados[j+1];
                    Ordenados[j+1] = temp;
                }
            }
        }
        
        //MUESTRO ESOS JUGADORES
        for (int i = 0; i < Ordenados.length; i++) {
            labels[i].setText(i+". Jugador: "+Ordenados[i].getNombre()+" ---> Punteo: "+Ordenados[i].getTiempo());
            if (i==9) {
                break;
            }
        }
    }

}
