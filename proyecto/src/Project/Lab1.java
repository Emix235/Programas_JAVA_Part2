/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Itzayana
 */
public class Lab1 extends javax.swing.JFrame{
String []Datos1= new String[100];
String []Datos2= new String[100];
Formulario1 f= new Formulario1();
    /**
     * Creates new form Lab1
     */
    public Lab1() {
        initComponents();
         this.setLocationRelativeTo(null);
        t= new Timer(10, acciones);
        t1= new Timer(10,acciones1 );
        finish.setEnabled(false);
        finish1.setEnabled(false);
    }
private Timer t,t1;
private String tiempo[]= new String [100];
private int H[]= new int [100];
private int m[]= new int [100];
private int s[]= new int [100];
private int cs[]= new int [100];
private ActionListener acciones = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[0]++;
            if(cs[0]==100){
                cs[0]=0;
                s[0]++;
            }
            if(s[0]==60){
                s[0]=0;
                m[0]++;
            }
            if(m[0]==60){
                m[0]=0;
                H[0]++;
            }
            Actualizar();
        }
        };
private final ActionListener acciones1 = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae) {
        cs[1]++;
            if(cs[1]==100){
                cs[1]=0;
                s[1]++;
            }
            if(s[1]==60){
                s[1]=0;
                m[1]++;
            }
            if(m[1]==60){
                m[1]=0;
                H[1]++;
            }
            Actualizar1();
    }
    
};

public void Actualizar() {
            tiempo[0]=(H[0]<=9?"0":"")+H[0]+"  :  "+(m[0]<=9?"0":"")+m[0]+"  :  "+(s[0]<=9?"0":"")+s[0]+"  :  "+(cs[0]<=9?"0":"")+cs[0];
         Reloj1.setText(tiempo[0]);
        }
public void Actualizar1() {
            tiempo[1]=(H[1]<=9?"0":"")+H[1]+"  :  "+(m[1]<=9?"0":"")+m[1]+"  :  "+(s[1]<=9?"0":"")+s[1]+"  :  "+(cs[1]<=9?"0":"")+cs[1];
         Reloj2.setText(tiempo[1]);
        }
public void Recuperar(){
    Datos1[0]=Pocision.getText();
     Datos1[1]=Nombre.getText();
     Datos1[2]=Int.getText();
}
public void Recuperar1(){
    Datos2[0]=Pocision1.getText();
     Datos2[1]=Nombre1.getText();
     Datos2[2]=Int1.getText();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Pocision = new javax.swing.JTextField();
        Icono = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Int = new javax.swing.JTextField();
        Reloj1 = new javax.swing.JTextField();
        comenzar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Pause = new javax.swing.JButton();
        estado = new javax.swing.JButton();
        finish = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mayor = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Pocision1 = new javax.swing.JTextField();
        Icono1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Int1 = new javax.swing.JTextField();
        Reloj2 = new javax.swing.JTextField();
        comenzar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Pause1 = new javax.swing.JButton();
        estado1 = new javax.swing.JButton();
        finish1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(210000000, 210000000));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 300));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(1200000000, 1200000000));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Equipo; ");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 30));

        Pocision.setEditable(false);
        Pocision.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision.setText("1");
        jPanel1.add(Pocision, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 30, 30));

        Icono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 120));

        Nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 150, 30));

        jLabel4.setBackground(new java.awt.Color(102, 102, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Nombre del Usuario; ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, 30));

        jLabel5.setBackground(new java.awt.Color(255, 102, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 230, 30));

        Int.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 60, 30));

        Reloj1.setEditable(false);
        Reloj1.setBackground(new java.awt.Color(0, 0, 0));
        Reloj1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj1.setForeground(new java.awt.Color(0, 255, 0));
        Reloj1.setText("00 :  00  :  00  :  00");
        Reloj1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 130, -1));

        comenzar.setBackground(new java.awt.Color(255, 255, 0));
        comenzar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar.setText("COMENZAR");
        comenzar.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 120, -1));

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("H   :  Min:    S  :  CS");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 20));

        Pause.setBackground(new java.awt.Color(255, 153, 0));
        Pause.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause.setText("PAUSAR");
        Pause.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseActionPerformed(evt);
            }
        });
        jPanel1.add(Pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 120, 20));

        estado.setBackground(new java.awt.Color(0, 255, 0));
        estado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado.setText("Normal");
        estado.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 160, 50));

        finish.setBackground(new java.awt.Color(0, 255, 255));
        finish.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish.setText("Finalizar ");
        finish.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        jPanel1.add(finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 130, 40));

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        mayor.setBackground(new java.awt.Color(255, 51, 153));
        mayor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mayor.setText("Para mayor informacion");
        mayor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 204), new java.awt.Color(102, 0, 102), new java.awt.Color(255, 51, 255), new java.awt.Color(255, 0, 255)));
        mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayorActionPerformed(evt);
            }
        });
        jPanel1.add(mayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 40));

        jLabel7.setBackground(new java.awt.Color(51, 255, 255));
        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setText("Equipo; ");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 30));

        Pocision1.setEditable(false);
        Pocision1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision1.setText("2");
        jPanel1.add(Pocision1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 30, 30));

        Icono1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 100, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 140, 120));

        Nombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 150, 30));

        jLabel9.setBackground(new java.awt.Color(102, 102, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Nombre del Usuario; ");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 140, 30));

        jLabel10.setBackground(new java.awt.Color(255, 102, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 230, 30));

        Int1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 60, 30));

        Reloj2.setEditable(false);
        Reloj2.setBackground(new java.awt.Color(0, 0, 0));
        Reloj2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj2.setForeground(new java.awt.Color(0, 255, 0));
        Reloj2.setText("00 :  00  :  00  :  00");
        Reloj2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 130, -1));

        comenzar1.setBackground(new java.awt.Color(255, 255, 0));
        comenzar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar1.setText("COMENZAR");
        comenzar1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar1ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 120, -1));

        jLabel11.setBackground(new java.awt.Color(0, 204, 204));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("H   :  Min:    S  :  CS");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 130, 20));

        Pause1.setBackground(new java.awt.Color(255, 153, 0));
        Pause1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause1.setText("PAUSAR");
        Pause1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause1ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 120, 20));

        estado1.setBackground(new java.awt.Color(0, 255, 0));
        estado1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado1.setText("Normal");
        estado1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel1.add(estado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 160, 50));

        finish1.setBackground(new java.awt.Color(0, 255, 255));
        finish1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish1.setText("Finalizar ");
        finish1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish1ActionPerformed(evt);
            }
        });
        jPanel1.add(finish1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 130, 40));

        jLabel12.setBackground(new java.awt.Color(153, 51, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarActionPerformed

     t.start();
     Nombre.setBackground(Color.yellow);
     Nombre.setEditable(false);
     Int.setBackground(Color.yellow);
     Int.setEditable(false);
     Icono.setText("OCUPADA");
     comenzar.setEnabled(false);
     Pause.setEnabled(true);
    }//GEN-LAST:event_comenzarActionPerformed

    private void PauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseActionPerformed
        t.stop();
        Pause.setEnabled(false);
        comenzar.setText("Reanudar");
        finish.setEnabled(true);
        comenzar.setEnabled(true);
        
    }//GEN-LAST:event_PauseActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
  
     t.stop();
     Datos1[0]=Pocision.getText();
     Datos1[1]=Nombre.getText();
     Datos1[2]=Int.getText();
     Datos1[3]=Reloj1.getText();
     f.dtm.addRow(Datos1);
     Nombre.setEditable(true);
     Nombre.setBackground(Color.WHITE);
     Nombre.setText("");
     Int.setEditable(true);
     Int.setBackground(Color.WHITE);
     Int.setText("");
     comenzar.setEnabled(true);
     Pause.setEnabled(false);
     finish.setEnabled(false);
     H[0]=0;m[0]=0;s[0]=0;cs[0]=0;
     Actualizar();
     Icono.setBackground(null);
     Icono.setText("");
    }//GEN-LAST:event_finishActionPerformed

    private void mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayorActionPerformed
        f.setVisible(true);
        
    }//GEN-LAST:event_mayorActionPerformed

    private void comenzar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar1ActionPerformed
      t1.start();
     Nombre1.setBackground(Color.yellow);
     Int1.setBackground(Color.yellow);
     Icono1.setText("OCUPADA");
     comenzar1.setEnabled(false);
     Pause1.setEnabled(true);  
    }//GEN-LAST:event_comenzar1ActionPerformed

    private void Pause1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause1ActionPerformed
       t1.stop();
        Pause1.setEnabled(false);
        comenzar1.setText("Reanudar");
        finish1.setEnabled(true);
        comenzar1.setEnabled(true); 
    }//GEN-LAST:event_Pause1ActionPerformed

    private void finish1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish1ActionPerformed
         t1.stop();
     Datos2[0]=Pocision1.getText();
     Datos2[1]=Nombre1.getText();
     Datos2[2]=Int1.getText();
     Datos2[3]=Reloj2.getText();
     f.dtm.addRow(Datos2);
     Nombre1.setBackground(Color.WHITE);
     Nombre.setText("");
     Int1.setBackground(Color.WHITE);
     Int1.setText("");
     comenzar1.setEnabled(true);
     Pause1.setEnabled(false);
     finish1.setEnabled(false);
     H[1]=0;m[1]=0;s[1]=0;cs[1]=0;
     Actualizar1();
     Icono1.setBackground(null);
     Icono1.setText("");
    }//GEN-LAST:event_finish1ActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Lab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Icono1;
    private javax.swing.JTextField Int;
    private javax.swing.JTextField Int1;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Nombre1;
    private javax.swing.JButton Pause;
    private javax.swing.JButton Pause1;
    private javax.swing.JTextField Pocision;
    private javax.swing.JTextField Pocision1;
    private javax.swing.JTextField Reloj1;
    private javax.swing.JTextField Reloj2;
    private javax.swing.JButton comenzar;
    private javax.swing.JButton comenzar1;
    private javax.swing.JButton estado;
    private javax.swing.JButton estado1;
    private javax.swing.JButton finish;
    private javax.swing.JButton finish1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mayor;
    // End of variables declaration//GEN-END:variables
}
