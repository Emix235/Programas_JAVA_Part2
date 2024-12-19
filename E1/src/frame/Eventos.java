package frame;


import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author PC1
 */
public class Eventos extends javax.swing.JFrame {

    /**
     * Creates new form Eventos
     */
    String f="";
    int d,m,a;
    
    public Eventos() {
        initComponents();
        DESCRIPCION.setLineWrap(true);
        DESCRIPCION.setWrapStyleWord(true);
        this.setLocationRelativeTo(null);
        
        
    }
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/LOGO.png"));
        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Eventos = new javax.swing.JComboBox<>();
        FECHA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DESCRIPCION = new javax.swing.JTextArea();
        LUGAR = new javax.swing.JComboBox<>();
        NAMES = new javax.swing.JTextField();
        M = new javax.swing.JSpinner();
        D = new javax.swing.JSpinner();
        GUARDAR2 = new javax.swing.JButton();
        M1 = new javax.swing.JSpinner();
        ENVIAR2 = new javax.swing.JButton();
        ENVIAR = new javax.swing.JButton();
        IMAGEN = new javax.swing.JLabel();
        AÑO = new javax.swing.JComboBox<>();
        Salida = new javax.swing.JButton();
        F1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 102, 102));
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(550, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gestión de eventos en Áreas comunes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Lugar del evento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Descripción ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, 20));

        jLabel3.setText("Evento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel4.setText("Fecha");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel5.setText("Organizadores");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        Eventos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reunión", "Boda", "Cumpleaños", "Fiesta Religiosa", "Fiesta" }));
        Eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventosActionPerformed(evt);
            }
        });
        jPanel1.add(Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 140, 30));

        FECHA.setEditable(false);
        FECHA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(FECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 140, 30));

        jLabel6.setText("Casa");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 206, 40, 20));

        DESCRIPCION.setEditable(false);
        DESCRIPCION.setColumns(20);
        DESCRIPCION.setRows(5);
        DESCRIPCION.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(DESCRIPCION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 280, 90));

        LUGAR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Parque", "Estacionamiento", "Edificio (Privado)", " " }));
        LUGAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LUGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LUGARActionPerformed(evt);
            }
        });
        jPanel1.add(LUGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 110, -1));

        NAMES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(NAMES, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 20));

        M.setModel(new javax.swing.SpinnerNumberModel(1, 1, 41, 1));
        M.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        M.setEnabled(false);
        jPanel1.add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 50, 30));

        D.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        D.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        D.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DStateChanged(evt);
            }
        });
        jPanel1.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 50, 30));

        GUARDAR2.setBackground(new java.awt.Color(255, 153, 0));
        GUARDAR2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GUARDAR2.setText("Guardar");
        GUARDAR2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        GUARDAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDAR2ActionPerformed(evt);
            }
        });
        jPanel1.add(GUARDAR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, 40));

        M1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        M1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        M1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                M1StateChanged(evt);
            }
        });
        jPanel1.add(M1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 50, 30));

        ENVIAR2.setBackground(new java.awt.Color(255, 102, 0));
        ENVIAR2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ENVIAR2.setText("Enviar");
        ENVIAR2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ENVIAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENVIAR2ActionPerformed(evt);
            }
        });
        jPanel1.add(ENVIAR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 30));

        ENVIAR.setBackground(new java.awt.Color(0, 204, 204));
        ENVIAR.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ENVIAR.setText("Enviar");
        ENVIAR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ENVIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENVIARActionPerformed(evt);
            }
        });
        jPanel1.add(ENVIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, 40));

        IMAGEN.setBackground(new java.awt.Color(255, 153, 102));
        IMAGEN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        IMAGEN.setText("      DESCRIPCIÓN");
        IMAGEN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        IMAGEN.setOpaque(true);
        jPanel1.add(IMAGEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 190, 150));
        IMAGEN.getAccessibleContext().setAccessibleParent(jPanel2);

        AÑO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AÑO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026" }));
        jPanel1.add(AÑO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 450, 360));
        jPanel1.getAccessibleContext().setAccessibleParent(jPanel1);

        Salida.setBackground(new java.awt.Color(255, 0, 0,80));
        Salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/p.png"))); // NOI18N
        Salida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        jPanel2.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 70, 80));

        F1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/F1.jpg"))); // NOI18N
        F1.setOpaque(true);
        jPanel2.add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 460));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalidaActionPerformed

    private void DStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DStateChanged
       d = (int) D.getValue();
       
    }//GEN-LAST:event_DStateChanged

    private void M1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_M1StateChanged
        m =(int) M1.getValue();
       
    }//GEN-LAST:event_M1StateChanged

    private void ENVIAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENVIAR2ActionPerformed
        a=Integer.parseInt((String) AÑO.getSelectedItem()); 
        f=" Dia: "+d+" Mes: "+m+" Año: "+a;
        FECHA.setText(f);
    }//GEN-LAST:event_ENVIAR2ActionPerformed

    private void LUGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LUGARActionPerformed
        
        if(LUGAR.getSelectedItem().toString().equals("Casa")){
            M.setEnabled(true);
            
        }else M.setEnabled(false);
    }//GEN-LAST:event_LUGARActionPerformed

    private void GUARDAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDAR2ActionPerformed
        String c="";
        int i=0;
        String añ[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
            "Octubre","Noviembre","Diciembre"};
       
        if(LUGAR.getSelectedItem().toString().equals("Casa")){
            c=NAMES.getText()+" organizarán un(a) "+ (String)Eventos.getSelectedItem()+
                " ,en su "+(String)LUGAR.getSelectedItem()+ " No."+M.getValue()+".\n"+
                    "El Dia: "+d+" de "+añ[m-1]+" del año: "+a+"\n";
        }else{
        c=NAMES.getText()+" organizarán una "+ (String)Eventos.getSelectedItem()+
                " ,en el "+(String)LUGAR.getSelectedItem()+".\n"+
                    "El Dia: "+d+" de "+añ[m-1]+" del año: "+a+"\n";
        }
        
        DESCRIPCION.setText(c);
    }//GEN-LAST:event_GUARDAR2ActionPerformed

    private void EventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventosActionPerformed
       
        int m1 =  Eventos.getSelectedIndex();
        if(m1 == 0){
            IMAGEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eventos/E1.jpg/")));
        }
        if(m1 == 1){
            IMAGEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eventos/E2.jpeg/")));
        }
        if(m1 ==2){
            IMAGEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eventos/E3.jpg/")));
        }
        if(m1 ==3){
            IMAGEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eventos/E4.jpg/")));
        }
        if(m1 ==4){
            IMAGEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eventos/E5.jpg/")));
        } 
        
    }//GEN-LAST:event_EventosActionPerformed

    private void ENVIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENVIARActionPerformed
//       ImageIcon imagen = (ImageIcon) IMAGEN.getIcon();
       String text= DESCRIPCION.getText();
//       this.dispose();
    }//GEN-LAST:event_ENVIARActionPerformed

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
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AÑO;
    private javax.swing.JSpinner D;
    public static javax.swing.JTextArea DESCRIPCION;
    private javax.swing.JButton ENVIAR;
    private javax.swing.JButton ENVIAR2;
    private javax.swing.JComboBox<String> Eventos;
    private javax.swing.JLabel F1;
    private javax.swing.JTextField FECHA;
    private javax.swing.JButton GUARDAR2;
    public static javax.swing.JLabel IMAGEN;
    private javax.swing.JComboBox<String> LUGAR;
    private javax.swing.JSpinner M;
    private javax.swing.JSpinner M1;
    private javax.swing.JTextField NAMES;
    private javax.swing.JButton Salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
