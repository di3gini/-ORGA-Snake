/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Clases.Variables;

/**
 *
 * @author user
 */
public class VistaSontay extends javax.swing.JFrame {

    /**
     * Creates new form VistaSontay
     */
    public VistaSontay() {
        initComponents();
        lbl_nombre.setText("Bienvenido "+Variables.usuarioLoggeado.getNombre()+ "!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nombre = new javax.swing.JLabel();
        btn_top10puntos = new javax.swing.JButton();
        btn_top10tiempos = new javax.swing.JButton();
        btn_verUsuarios = new javax.swing.JButton();
        btn_eliminarUsuarios = new javax.swing.JButton();
        btn_cerrarsesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_nombre.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        lbl_nombre.setText("Nombre");

        btn_top10puntos.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btn_top10puntos.setText("Top 10 puntos");
        btn_top10puntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_top10puntosActionPerformed(evt);
            }
        });

        btn_top10tiempos.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btn_top10tiempos.setText("Top 10 tiempos");
        btn_top10tiempos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_top10tiemposActionPerformed(evt);
            }
        });

        btn_verUsuarios.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btn_verUsuarios.setText("Ver Usuarios");
        btn_verUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verUsuariosActionPerformed(evt);
            }
        });

        btn_eliminarUsuarios.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btn_eliminarUsuarios.setText("Eliminar Usuarios");
        btn_eliminarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarUsuariosActionPerformed(evt);
            }
        });

        btn_cerrarsesion.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btn_cerrarsesion.setText("Cerrar Sesion");
        btn_cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarsesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cerrarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_verUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(lbl_nombre))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_top10tiempos, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_top10puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nombre)
                .addGap(35, 35, 35)
                .addComponent(btn_top10puntos)
                .addGap(44, 44, 44)
                .addComponent(btn_top10tiempos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btn_verUsuarios)
                .addGap(47, 47, 47)
                .addComponent(btn_eliminarUsuarios)
                .addGap(48, 48, 48)
                .addComponent(btn_cerrarsesion)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarsesionActionPerformed
        // TODO add your handling code here:
        this.hide();
        Login l = new Login();
        l.show();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_cerrarsesionActionPerformed

    private void btn_verUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verUsuariosActionPerformed
        // TODO add your handling code here:
        MostrarUsuarios m = new MostrarUsuarios();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_verUsuariosActionPerformed

    private void btn_eliminarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarUsuariosActionPerformed
        // TODO add your handling code here:
        EliminarUsuarios m = new EliminarUsuarios();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_eliminarUsuariosActionPerformed

    private void btn_top10puntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_top10puntosActionPerformed
        // TODO add your handling code here:
        Top10Puntos t = new Top10Puntos();
        t.setVisible(true);
        t.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_top10puntosActionPerformed

    private void btn_top10tiemposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_top10tiemposActionPerformed
        // TODO add your handling code here:
        Top10Tiempos t = new Top10Tiempos();
    }//GEN-LAST:event_btn_top10tiemposActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VistaSontay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSontay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSontay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSontay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaSontay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrarsesion;
    private javax.swing.JButton btn_eliminarUsuarios;
    private javax.swing.JButton btn_top10puntos;
    private javax.swing.JButton btn_top10tiempos;
    private javax.swing.JButton btn_verUsuarios;
    private javax.swing.JLabel lbl_nombre;
    // End of variables declaration//GEN-END:variables
}
