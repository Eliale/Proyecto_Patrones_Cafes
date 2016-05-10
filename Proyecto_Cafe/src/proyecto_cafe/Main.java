/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_cafe;

import Singleton.SingletonAcerca;
import Singleton.SingletonContruyeCafe;
import Singleton.SingletonEligeCafes;
import javax.swing.JOptionPane;

/**
 *
 * @author Eli
 */
public final class Main extends javax.swing.JFrame {

    public static boolean abierta_ec;
    public static boolean abierta_cc;

    /**
     * Creates new form Desarrollador
     */
    public Main() {
        initComponents();
        setTitle("Cafeteria ");
        abierta_ec = false;
        abierta_cc = false;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEligeCafe = new javax.swing.JButton();
        btnConstruye = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaInforme = new javax.swing.JTextArea();
        imagenD = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acerca de");
        setForeground(java.awt.Color.red);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEligeCafe.setBackground(new java.awt.Color(51, 51, 51));
        btnEligeCafe.setForeground(new java.awt.Color(255, 153, 0));
        btnEligeCafe.setText("Elige tu cafe");
        btnEligeCafe.setToolTipText("Presione para salir");
        btnEligeCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEligeCafeActionPerformed(evt);
            }
        });
        getContentPane().add(btnEligeCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 100, -1));

        btnConstruye.setText("Arma tu cafe");
        btnConstruye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstruyeActionPerformed(evt);
            }
        });
        getContentPane().add(btnConstruye, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, -1));

        areaInforme.setColumns(20);
        areaInforme.setRows(5);
        jScrollPane1.setViewportView(areaInforme);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 160, 250));

        imagenD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cafe.jpg"))); // NOI18N
        imagenD.setToolTipText("");
        getContentPane().add(imagenD, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1000, 560));

        jMenu1.setText("Ayuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Acerca de");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleName("Acercade");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEligeCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEligeCafeActionPerformed
        if (abierta_cc == false) {
            try {
                SingletonEligeCafes instancia1 = SingletonEligeCafes.getInstancia();
                imagenD.add(instancia1);
                instancia1.toFront();
                instancia1.setLocation(15, 1);
                abierta_ec = true;
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Operacion Crear Cafe en Curso");
        }
    }//GEN-LAST:event_btnEligeCafeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            SingletonAcerca acerca = SingletonAcerca.getInstancia();
            imagenD.add(acerca);
            acerca.toFront();
            acerca.setLocation(15, 40);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnConstruyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstruyeActionPerformed
        if (abierta_ec == false) {
            try {
                SingletonContruyeCafe instancia = SingletonContruyeCafe.getInstancia();
                imagenD.add(instancia);
                instancia.toFront();
                instancia.setLocation(15, 1);
                abierta_cc = true;
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Operacion Elegir Cafe en curso");
        }
    }//GEN-LAST:event_btnConstruyeActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea areaInforme;
    private javax.swing.JButton btnConstruye;
    private javax.swing.JButton btnEligeCafe;
    private javax.swing.JLabel imagenD;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}