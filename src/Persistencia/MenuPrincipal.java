package Persistencia;

/**
 *
 * @author Kmylho
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBtnJugadores = new javax.swing.JButton();
        jBtnPistas = new javax.swing.JButton();
        jBtnCarros = new javax.swing.JButton();
        jBtnPodio = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText(" Menu Principal");
        jLabel1.setMaximumSize(new java.awt.Dimension(161, 30));

        jBtnJugadores.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jBtnJugadores.setText("Jugadores");
        jBtnJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnJugadoresActionPerformed(evt);
            }
        });

        jBtnPistas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnPistas.setText("Pistas");
        jBtnPistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPistasActionPerformed(evt);
            }
        });

        jBtnCarros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnCarros.setText("Carros");
        jBtnCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCarrosActionPerformed(evt);
            }
        });

        jBtnPodio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnPodio.setText("Podio");
        jBtnPodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPodioActionPerformed(evt);
            }
        });

        jBtnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtnJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnPodio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBtnJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBtnCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBtnPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBtnPodio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnJugadoresActionPerformed
        //desactivar la ventana previa
        dispose();
        //crea el nuevo menu
        MenuJugadores MJ = new MenuJugadores();
        //vuelve visible el menu
        MJ.setVisible(true);
    }//GEN-LAST:event_jBtnJugadoresActionPerformed

    private void jBtnPistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPistasActionPerformed
        //desactivar la ventana previa
        dispose();
        //crea el nuevo menu
        MenuPistas MP = new MenuPistas();
        //vuelve visible el menu
        MP.setVisible(true);
    }//GEN-LAST:event_jBtnPistasActionPerformed

    private void jBtnCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCarrosActionPerformed
        //desactivar la ventana previa
        dispose();
        //crea el nuevo menu
        MenuCarros MC = new MenuCarros();
        //vuelve visible el menu
        MC.setVisible(true);
    }//GEN-LAST:event_jBtnCarrosActionPerformed

    private void jBtnPodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPodioActionPerformed
        //desactivar la ventana previa
        dispose();
        //creacion y vizualizacion del menu
        MenuPodio MP = new MenuPodio();
        MP.setVisible(true);
    }//GEN-LAST:event_jBtnPodioActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        //cerrar el menu
        dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCarros;
    private javax.swing.JButton jBtnJugadores;
    private javax.swing.JButton jBtnPistas;
    private javax.swing.JButton jBtnPodio;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
