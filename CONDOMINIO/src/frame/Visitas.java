/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC1
 */
public class Visitas extends javax.swing.JFrame {

    /**
     * Creates new form Visitas
     */
    DefaultTableModel mo1= new DefaultTableModel();
    DefaultTableModel mo2= new DefaultTableModel();
    
    public Visitas() {
        initComponents();
        this.setLocationRelativeTo(null);
         String titulos[]={"Nombre", "Apellido","No.Visita","Fecha"};
         mo1.setColumnIdentifiers(titulos);
         this.T1.setModel(mo1);
         String t2[]={"Nombre", "Apellido","No.ESpacio","Fecha"};
         mo2.setColumnIdentifiers(t2);
         this.T2.setModel(mo2);
//         this.T2.setModel(mo2);
    }
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/L4.png"));
        return icono;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        Contenido1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        Contenido = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        T2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        F1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(204, 0, 0,80));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/p.png"))); // NOI18N
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 70, 70));

        jTabbedPane5.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane5.setForeground(new java.awt.Color(255, 255, 255));

        Contenido1.setBackground(new java.awt.Color(51, 51, 51));
        Contenido1.setForeground(new java.awt.Color(0, 153, 204));
        Contenido1.setPreferredSize(new java.awt.Dimension(577, 330));
        Contenido1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Registros de Visitas");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Contenido1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 250, 50));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("BORRAR");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contenido1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 89, 38));

        jPanel6.setBackground(new java.awt.Color(70, 109, 203));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "No.Visita", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(T1);

        jPanel6.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 120));

        Contenido1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 610, 160));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(Contenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Tablas de Visitas", jPanel14);

        jPanel15.setOpaque(false);

        Contenido.setBackground(new java.awt.Color(51, 51, 51));
        Contenido.setForeground(new java.awt.Color(0, 153, 204));
        Contenido.setPreferredSize(new java.awt.Dimension(577, 330));
        Contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registros del estacionamiento");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Contenido.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 390, 40));

        jPanel16.setBackground(new java.awt.Color(0, 102, 153));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setForeground(new java.awt.Color(0, 0, 0));

        T2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        T2.setForeground(new java.awt.Color(0, 0, 0));
        T2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre ", "Apellidos", "No.Espacio", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(T2);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Contenido.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 620, 170));

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("BORRAR");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contenido.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 80, 35));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Registro del estacionamiento", jPanel15);

        jPanel1.add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 660, 280));

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/F3.jpg"))); // NOI18N
        jPanel1.add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException{
//        Color c= new Color(0,51,102);
//        UIManager.put("nimbusBase", c);
//        UIManager.put("nimbusBlueGrey", c);
//        UIManager.put("control", c);
        
//        UIManager.put("Table.alternateRowColor", Color.orange);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenido;
    private javax.swing.JPanel Contenido1;
    private javax.swing.JLabel F1;
    private javax.swing.JButton Salir;
    private javax.swing.JTable T1;
    private javax.swing.JTable T2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane5;
    // End of variables declaration//GEN-END:variables
}