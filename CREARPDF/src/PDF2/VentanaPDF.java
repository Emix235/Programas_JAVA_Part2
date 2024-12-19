/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF2;

import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC1
 */
public class VentanaPDF extends javax.swing.JFrame {

    List<Persona> personas; 
    DefaultTableModel mo1 = new DefaultTableModel();
    public VentanaPDF() {
        initComponents();
        personas = new ArrayList<>();
        mo1 = (DefaultTableModel) T1.getModel();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        NDirector = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        GENR = new javax.swing.JButton();
        ABRIR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Dirección");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabel2.setText("Edad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel5.setText("Nombre del Director");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 150, 30));

        Telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 170, 30));

        Edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, 30));

        Direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 170, 30));

        NDirector.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(NDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 30));

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 490, 40));

        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre ", "Edad", "Telefono", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(T1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 490, 140));

        GENR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        GENR.setText("Generar PDF");
        GENR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENRActionPerformed(evt);
            }
        });
        jPanel1.add(GENR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 190, 40));

        ABRIR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ABRIR.setText("Abrir PDF");
        ABRIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABRIRActionPerformed(evt);
            }
        });
        jPanel1.add(ABRIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 190, 40));

        jLabel6.setText("Cedula");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        Cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String getFecha(){
        GregorianCalendar gcal= new GregorianCalendar();
        int dia = gcal.get(Calendar.DAY_OF_MONTH);
        int mes = gcal.get(Calendar.MONTH);
        int ani = gcal.get(Calendar.YEAR);
        return dia+" / "+mes+" / "+ani;
    }
    public String generarNombreArchivo(){
        String nombreArchivo = "";
            String[] cadenas = NDirector.getText().split(" ");
            nombreArchivo = cadenas[0].toUpperCase() + "_" + Cedula.getText().toUpperCase();
        return nombreArchivo;
    }
    
    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        this.Cedula.setEditable(false);
        Persona persona = new Persona();
        persona.setNombre(Name.getText());
        persona.setEdad(Integer.parseInt(Edad.getText()));
        persona.setTelefono(Telefono.getText());
        persona.setDireccion(Direccion.getText());
        
        personas.add(persona);        
        mo1.addRow(new Object[]{persona.getNombre(),persona.getEdad(), persona.getTelefono(), persona.getDireccion()});
    }//GEN-LAST:event_RegistrarActionPerformed

    private void GENRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENRActionPerformed
       Plantilla plantilla = new Plantilla(NDirector.getText(),
                getFecha(),"C:\\Users\\PC1\\Pictures\\tarjeta-de-identificacion.png",
//                "C:\\Users\\Navi\\Pictures\\logooooo.png",
//                "C:\\Users\\PC1\\Documents\\NetBeansProjects\\PlantillaPdfMain\\src\\plantillapdfmain\\Imagenes\\tarjeta-de-identificacion.png"
                this.personas,Cedula.getText());
        plantilla.crearPlantilla();
    }//GEN-LAST:event_GENRActionPerformed

    private void ABRIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABRIRActionPerformed
        abrir(generarNombreArchivo());
    }//GEN-LAST:event_ABRIRActionPerformed

    public void abrir(String nombreDirector) {
        try {
            File path = new File(nombreDirector + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Atención", 2);
        }
    }
    
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
            java.util.logging.Logger.getLogger(VentanaPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPDF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABRIR;
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Edad;
    private javax.swing.JButton GENR;
    private javax.swing.JTextField NDirector;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Registrar;
    private javax.swing.JTable T1;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
