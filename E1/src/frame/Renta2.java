/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author PC1
 */
public class Renta2 extends javax.swing.JFrame {

    /**
     * Creates new form Renta2
     */
    public Renta2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/bloquear.png"));
        return icono;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        DESCRIPCION = new javax.swing.JLabel();
        PRECIO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CONCEPTO = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/p.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 60, -1));

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DESCRIPCION.setBackground(new java.awt.Color(255, 204, 102));
        DESCRIPCION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DESCRIPCION.setText("DESCRIPCIÓN");
        DESCRIPCION.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        DESCRIPCION.setOpaque(true);
        jPanel4.add(DESCRIPCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 200, 120));

        PRECIO.setEditable(false);
        PRECIO.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PRECIO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PRECIO.setText("Precio por mes");
        jPanel4.add(PRECIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 159, -1));

        jLabel2.setText("Concepto");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        CONCEPTO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agua", "Gas", "Renta" }));
        CONCEPTO.setSelectedIndex(-1);
        CONCEPTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONCEPTOActionPerformed(evt);
            }
        });
        jPanel4.add(CONCEPTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 90, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 410, 220));

        Fondo.setBackground(new java.awt.Color(102, 102, 102));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/F2.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void CONCEPTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONCEPTOActionPerformed
        int m = CONCEPTO.getSelectedIndex();
        DESCRIPCION.setText("");
        if(m == 0){
        PRECIO.setText(" $ 121");
        DESCRIPCION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/servicios/A.jpg")));
        } 
        if(m == 1){
        PRECIO.setText(" $ 400");
        DESCRIPCION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/servicios/G.jpg")));
        } 
        if(m == 2){
        PRECIO.setText(" $ 450");
        DESCRIPCION.setIcon(new javax.swing.ImageIcon(getClass().getResource("/servicios/R.jpg")));
        }
    }//GEN-LAST:event_CONCEPTOActionPerformed

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
            java.util.logging.Logger.getLogger(Renta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Renta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Renta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Renta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Renta2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CONCEPTO;
    private javax.swing.JLabel DESCRIPCION;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField PRECIO;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
