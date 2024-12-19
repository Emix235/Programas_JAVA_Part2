import com.sun.awt.AWTUtilities;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio Corona
 */
public class Setup extends javax.swing.JFrame {

    /**
     * Creates new form Setup
     */
    public Setup() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    public void generar(String nombre) throws FileNotFoundException, DocumentException{
        if(!(Name.getText().isEmpty() || Apellido.getText().isEmpty() || Edad.getText().isEmpty() || Email.getText().isEmpty())){
            FileOutputStream a= new FileOutputStream(nombre + ".pdf");
            Document d= new Document();
            PdfWriter.getInstance(d, a);
            d.open();
            Paragraph p= new Paragraph("Datos Personales");
            p.setAlignment(1);
            d.add(p);
            
            d.add(new Paragraph(" Nombre: "+Name.getText()));
            d.add(new Paragraph(" Apellidos: "+Apellido.getText()));
            d.add(new Paragraph(" Edad: "+Edad.getText()));
            d.add(new Paragraph(" Correo Electronico: "+Email.getText()));
            d.close();
            JOptionPane.showMessageDialog(null, "Archivo PDF creado correctamente","Información",1);
        } else{
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","Atención",2);
        }
    }
    
    public void abrir (String nombre){
        try {
            File path = new File(nombre+".pdf");
            Desktop.getDesktop().open(path);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex,"Atención",2);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P1 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        Generar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Abrir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        P1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        P1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Generar.setText("Generar PDF");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });
        P1.add(Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        P1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        Abrir.setText("Abrir PDF");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        P1.add(Abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel1.setText("Email:");
        P1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel2.setText("Edad:");
        P1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel3.setText("Apellidos:");
        P1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jLabel4.setText("Nombre:");
        P1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        P1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 200, 30));

        Edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        P1.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 200, 30));

        Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        P1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 200, 30));

        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        P1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 30));

        Fondo.setBackground(new java.awt.Color(204, 204, 255));
        Fondo.setOpaque(true);
        P1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        try {
            generar(Name.getText());
        } catch (FileNotFoundException ex){
        Logger.getLogger(Setup.class.getName()).log(Level.SEVERE,null, ex);
        
        } catch (DocumentException ex){
        Logger.getLogger(Setup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GenerarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Name.setText("");
        Apellido.setText("");
        Edad.setText("");
        Email.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        if(!Name.getText().isEmpty()){
            abrir(Name.getText());
        }else{
            JOptionPane.showMessageDialog(null, " ** Campo nombre vacio\n ** No se encuentra el archivo con ese nombre\n");
        }
    }//GEN-LAST:event_AbrirActionPerformed

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
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir;
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Edad;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Generar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Name;
    private javax.swing.JPanel P1;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
