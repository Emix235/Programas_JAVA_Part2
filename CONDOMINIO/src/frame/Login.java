/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author PC1
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @Override
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/L4.png"));
        return icono;
    }  //Funcion para obtener un icono nuevo


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        SIGUIENTE = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Contraseña = new javax.swing.JPasswordField();
        f1 = new javax.swing.JLabel();
        CERRAR = new javax.swing.JButton();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(650, 400));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo1.setPreferredSize(new java.awt.Dimension(700, 400));
        Fondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Condominio \"BUENA VISTA\"");
        jLabel1.setOpaque(true);
        Fondo1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 360, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario-de-perfil.png"))); // NOI18N
        Fondo1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 70, 70));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contrasena (1).png"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Fondo1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 50, 50));

        Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        Fondo1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 200, 30));

        SIGUIENTE.setBackground(new java.awt.Color(255, 51, 0));
        SIGUIENTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proximo (1).png"))); // NOI18N
        SIGUIENTE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SIGUIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGUIENTEActionPerformed(evt);
            }
        });
        Fondo1.add(SIGUIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 90, 50));

        Cancelar.setBackground(new java.awt.Color(255, 0, 0));
        Cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        Fondo1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 100, 50));

        Contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Contraseña.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Fondo1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 200, 30));

        f1.setBackground(new java.awt.Color(0,0,0,80));
        f1.setForeground(new java.awt.Color(51, 0, 0));
        f1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(47, 33, 17), 4, true));
        f1.setOpaque(true);
        Fondo1.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 390, 290));

        CERRAR.setBackground(new java.awt.Color(204, 0, 0,100));
        CERRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        CERRAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CERRARActionPerformed(evt);
            }
        });
        Fondo1.add(CERRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 70, 70));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f2.jpg"))); // NOI18N
        Wallpaper.setPreferredSize(new java.awt.Dimension(400, 700));
        Fondo1.add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        getContentPane().add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void SIGUIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGUIENTEActionPerformed
    String [] u= {"Emilio","Edwin","Oscar","Axel"};    
    String [] c= {"12345","EDW$L","OSM?XA","89OA12"};
    Boolean s = false; 
    int n=0; 
    while(s==false){
     if(Usuario.getText().equalsIgnoreCase(u[n]) && Contraseña.getText().equals(c[n]))
         s=true;
     else n++;
        } 
        if(s==true){
           MenuP m= new MenuP();
           m.setVisible(true);
           this.setVisible(false);
       }else{
           JOptionPane.showMessageDialog(null, "Usuario no Valido");
           Usuario.setText("");
           Contraseña.setText("");
       }
    }//GEN-LAST:event_SIGUIENTEActionPerformed

    private void CERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CERRARActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CERRARActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Usuario.setText("");
        Contraseña.setText("");
    }//GEN-LAST:event_CancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CERRAR;
    private javax.swing.JButton Cancelar;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JPanel Fondo1;
    private javax.swing.JButton SIGUIENTE;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
