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
public class Registros extends javax.swing.JFrame {

    /**
     * Creates new form Registros
     */
    DefaultTableModel mo1= new DefaultTableModel();
    DefaultTableModel mo2= new DefaultTableModel();
    Visitas v= new Visitas();
    public Registros() {
        initComponents();
        this.setLocationRelativeTo(null);
         mo1.addColumn("Nombre");
         mo1.addColumn("Apellidos");
         mo1.addColumn("No.Visita");
         mo1.addColumn("Fecha");
        this.T1.setModel(mo1);
         mo2.addColumn("Nombre");
         mo2.addColumn("Apellidos");
         mo2.addColumn("No.Espacio");
         mo2.addColumn("Fecha");
        this.T2.setModel(mo2);
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
        Salida = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Contenido1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        No1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        N1 = new javax.swing.JTextField();
        A1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        AÑ1 = new javax.swing.JTextField();
        SEND1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        M1 = new javax.swing.JTextField();
        D1 = new javax.swing.JTextField();
        Contenido = new javax.swing.JPanel();
        A2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AÑ2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SEND2 = new javax.swing.JButton();
        N2 = new javax.swing.JTextField();
        EV2 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        T2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        M2 = new javax.swing.JTextField();
        D2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 400));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salida.setBackground(new java.awt.Color(204, 0, 0,100));
        Salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/p.png"))); // NOI18N
        Salida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        jPanel1.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 60, 70));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Registros");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 40));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

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

        No1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Contenido1.add(No1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 120, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nombre");
        Contenido1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Apellidos");
        Contenido1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 70, 30));

        N1.setColumns(2);
        N1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Contenido1.add(N1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 120, 30));

        A1.setColumns(2);
        A1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        Contenido1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 150, 30));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("No.Visita");
        Contenido1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Fecha ");
        Contenido1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 70, 30));

        AÑ1.setColumns(2);
        AÑ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AÑ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AÑ1ActionPerformed(evt);
            }
        });
        Contenido1.add(AÑ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 40, 30));

        SEND1.setBackground(new java.awt.Color(204, 0, 0));
        SEND1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SEND1.setForeground(new java.awt.Color(255, 255, 255));
        SEND1.setText("Enviar");
        SEND1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SEND1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEND1ActionPerformed(evt);
            }
        });
        Contenido1.add(SEND1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 80, 30));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        jScrollPane4.setViewportView(T1);

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setText("BORRAR");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        Contenido1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 560, 110));

        M1.setColumns(2);
        M1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        M1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1ActionPerformed(evt);
            }
        });
        Contenido1.add(M1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 40, 30));

        D1.setColumns(2);
        D1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        Contenido1.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 40, 30));

        jTabbedPane1.addTab("Registro de visitas", Contenido1);

        Contenido.setBackground(new java.awt.Color(51, 51, 51));
        Contenido.setForeground(new java.awt.Color(0, 153, 204));
        Contenido.setPreferredSize(new java.awt.Dimension(577, 330));
        Contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A2.setColumns(2);
        A2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        Contenido.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 150, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellidos");
        Contenido.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 70, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha ");
        Contenido.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 60, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        Contenido.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, 30));

        AÑ2.setColumns(2);
        AÑ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AÑ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AÑ2ActionPerformed(evt);
            }
        });
        Contenido.add(AÑ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 60, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No.Espacio");
        Contenido.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registros del estacionamiento");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Contenido.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 420, 40));

        SEND2.setBackground(new java.awt.Color(102, 0, 102));
        SEND2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SEND2.setForeground(new java.awt.Color(255, 255, 255));
        SEND2.setText("Enviar");
        SEND2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SEND2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEND2ActionPerformed(evt);
            }
        });
        Contenido.add(SEND2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 70, 40));

        N2.setColumns(2);
        N2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Contenido.add(N2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 130, 30));

        EV2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", " " }));
        Contenido.add(EV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        T2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        T2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(T2);

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setText("BORRAR");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        Contenido.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 130));

        M2.setColumns(2);
        M2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        M2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2ActionPerformed(evt);
            }
        });
        Contenido.add(M2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 40, 30));

        D2.setColumns(2);
        D2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        Contenido.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 40, 30));

        jTabbedPane1.addTab("Registro del estacionamiento", Contenido);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 590, 320));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tablas de Datos");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 180, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/F4.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AÑ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AÑ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AÑ1ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1ActionPerformed

    private void AÑ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AÑ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AÑ2ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A2ActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        MenuP m= new MenuP();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalidaActionPerformed

    private void SEND1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEND1ActionPerformed
        String ag[]= new String [4];
        ag[0]= N1.getText();
        ag[1]= A1.getText();
        ag[2]= No1.getText();
        ag[3]= D1.getText()+"/"+M1.getText()+"/"+AÑ1.getText();
        mo1.addRow(ag);
        v.mo1.addRow(ag);
        N1.setText("");
        A1.setText("");
        No1.setText("");
        D1.setText("");
        M1.setText("");
        AÑ1.setText("");
    }//GEN-LAST:event_SEND1ActionPerformed

    private void SEND2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEND2ActionPerformed
        String ag[]= new String [6];
        ag[0]= N2.getText();
        ag[1]= A2.getText();
        ag[2]= (String) EV2.getSelectedItem();
        ag[3]= D2.getText()+"/"+M2.getText()+"/"+AÑ2.getText();
        mo2.addRow(ag);
        v.mo2.addRow(ag);
        N2.setText("");
        A2.setText("");
        D2.setText("");
        M2.setText("");
        AÑ2.setText("");
    }//GEN-LAST:event_SEND2ActionPerformed

    private void M1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void M2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException{
//        Color c= new Color(0,51,102);
//        UIManager.put("nimbusBase", c);
//        UIManager.put("control", c);
        
//        UIManager.put("Table.alternateRowColor", Color.orange);
//        UIManager.put("nimbusSelectionBackground", new Color(255,51,51));
//        UIManager.put("Table.ascendingSortIcon", Icon 7 x 7);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1;
    private javax.swing.JTextField A2;
    private javax.swing.JTextField AÑ1;
    private javax.swing.JTextField AÑ2;
    private javax.swing.JPanel Contenido;
    private javax.swing.JPanel Contenido1;
    private javax.swing.JTextField D1;
    private javax.swing.JTextField D2;
    private javax.swing.JComboBox<String> EV2;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField M1;
    private javax.swing.JTextField M2;
    private javax.swing.JTextField N1;
    private javax.swing.JTextField N2;
    private javax.swing.JTextField No1;
    private javax.swing.JButton SEND1;
    private javax.swing.JButton SEND2;
    private javax.swing.JButton Salida;
    private javax.swing.JTable T1;
    private javax.swing.JTable T2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}