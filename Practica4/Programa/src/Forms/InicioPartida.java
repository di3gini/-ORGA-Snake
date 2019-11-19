
package Forms;

import Clases.Variables;

public class InicioPartida extends javax.swing.JFrame {

    public InicioPartida() {
        initComponents();
        lbl_nombre.setText("BIENVENIDO "+Variables.usuarioLoggeado.getNombre()+"!");
        lbl_user.setText(Variables.usuarioLoggeado.getUser());
        lbl_tiempo.setText(Variables.usuarioLoggeado.getTiempo()+"");
        lbl_puntos.setText(Variables.usuarioLoggeado.getPunteo()+"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_tiempo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_nivel = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_puntos = new javax.swing.JLabel();
        btn_iniciarJuego = new javax.swing.JButton();
        btn_salirJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_nombre.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        lbl_nombre.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel2.setText("Nivel:");

        lbl_tiempo.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        lbl_tiempo.setText("0");

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel5.setText("Puntos:");

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel6.setText("Tiempo:");

        lbl_nivel.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        lbl_nivel.setText("0");

        lbl_user.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        lbl_user.setText("name");

        lbl_puntos.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        lbl_puntos.setText("0");

        btn_iniciarJuego.setText("INICIAR JUEGO");
        btn_iniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarJuegoActionPerformed(evt);
            }
        });

        btn_salirJuego.setText("SALIR DEL JUEGO");
        btn_salirJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lbl_nombre)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_puntos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_user)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(lbl_nivel)))
                    .addComponent(lbl_tiempo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(173, 173, 173))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salirJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iniciarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nombre)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tiempo)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_puntos))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_nivel))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_user))
                .addGap(37, 37, 37)
                .addComponent(btn_iniciarJuego)
                .addGap(18, 18, 18)
                .addComponent(btn_salirJuego)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirJuegoActionPerformed
        // TODO add your handling code here:
        this.hide();
        Login l = new Login();
        l.show();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_salirJuegoActionPerformed

    private void btn_iniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarJuegoActionPerformed
        // TODO add your handling code here:
        Variables.usuarioLoggeado.setPunteo(0);
        Variables.usuarioLoggeado.setTiempo(0);
        
        PantallaSNAKE p = new PantallaSNAKE();
        p.show();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_iniciarJuegoActionPerformed

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
            java.util.logging.Logger.getLogger(InicioPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioPartida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciarJuego;
    private javax.swing.JButton btn_salirJuego;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel lbl_nivel;
    private javax.swing.JLabel lbl_nombre;
    public static javax.swing.JLabel lbl_puntos;
    public static javax.swing.JLabel lbl_tiempo;
    private javax.swing.JLabel lbl_user;
    // End of variables declaration//GEN-END:variables
}
