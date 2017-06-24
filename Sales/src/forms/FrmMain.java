package forms;

import clases.User;

/**
 *
 * @author Luis Ureña
 */
public class FrmMain extends javax.swing.JFrame {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnMain = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuClientes = new javax.swing.JMenuItem();
        mnuProductos = new javax.swing.JMenuItem();
        mnuSuplidores = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuCerrarSesion = new javax.swing.JMenuItem();
        mnuMovimientos = new javax.swing.JMenu();
        mnuCompras = new javax.swing.JMenuItem();
        mnuVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales");

        dpnMain.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout dpnMainLayout = new javax.swing.GroupLayout(dpnMain);
        dpnMain.setLayout(dpnMainLayout);
        dpnMainLayout.setHorizontalGroup(
            dpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 977, Short.MAX_VALUE)
        );
        dpnMainLayout.setVerticalGroup(
            dpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        mnuFile.setText("File");

        mnuClientes.setText("Clientes");
        mnuFile.add(mnuClientes);

        mnuProductos.setText("Productos");
        mnuFile.add(mnuProductos);

        mnuSuplidores.setText("Suplidores");
        mnuFile.add(mnuSuplidores);

        mnuUsuarios.setText("Usuarios");
        mnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuariosActionPerformed(evt);
            }
        });
        mnuFile.add(mnuUsuarios);
        mnuFile.add(jSeparator1);

        mnuCerrarSesion.setText("Salir");
        mnuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCerrarSesionActionPerformed(evt);
            }
        });
        mnuFile.add(mnuCerrarSesion);

        jMenuBar1.add(mnuFile);

        mnuMovimientos.setText("Movimientos");

        mnuCompras.setText("Compras");
        mnuMovimientos.add(mnuCompras);

        mnuVentas.setText("Ventas");
        mnuMovimientos.add(mnuVentas);

        jMenuBar1.add(mnuMovimientos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCerrarSesionActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuCerrarSesionActionPerformed

    private void mnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuariosActionPerformed
        // TODO add your handling code here:
        FrmUsers form = new FrmUsers();
        this.dpnMain.add(form);
        form.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnMain;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuCerrarSesion;
    private javax.swing.JMenuItem mnuClientes;
    private javax.swing.JMenuItem mnuCompras;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuMovimientos;
    private javax.swing.JMenuItem mnuProductos;
    private javax.swing.JMenuItem mnuSuplidores;
    private javax.swing.JMenuItem mnuUsuarios;
    private javax.swing.JMenuItem mnuVentas;
    // End of variables declaration//GEN-END:variables
}
