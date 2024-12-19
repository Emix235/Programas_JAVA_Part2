/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC1
 */
public class Renta extends javax.swing.JFrame {

   
    DefaultTableModel mo1= new DefaultTableModel();
    DefaultTableModel mo2= new DefaultTableModel();
    DefaultTableModel mo3= new DefaultTableModel();
    int c, T=0;;
    String a[] = new String[4];
    String a1[] = new String[2];
    String m1="Agua";
    String m2="Gas";
    String m3="Renta";
    Recibo r= new Recibo();
    public Renta() {
        initComponents();
        this.setLocationRelativeTo(null);
        String t[]={"Concepto","Cantidad","Mes/año inicial","Mes/año final"};
        mo1.setColumnIdentifiers(t);
        T1.setModel(mo1);
        String t2[]={"Concepto","Cantidad","Mes/año inicial","Mes/año final"};
        mo2.setColumnIdentifiers(t2);
        T2.setModel(mo2);
        String t3[]={"Mes","Pagos"};
        mo3.setColumnIdentifiers(t3);
        T3.setModel(mo3);
    }
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/L4.png"));
        return icono;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CONCEP = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        agreg = new javax.swing.JButton();
        GENERAR = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        MESI = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        CANT = new javax.swing.JSpinner();
        BORRAR = new javax.swing.JButton();
        pt = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        DESCRIP = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T4 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        T3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        T2 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        ne = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 400));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pagos de Renta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 153));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 215, 190));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Agregar conceptos de pago", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel2.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, -1));

        jLabel5.setText("Clave");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, -1));

        jLabel6.setText("Concepto");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        CONCEP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agua", "Gas", "Renta" }));
        CONCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONCEPActionPerformed(evt);
            }
        });
        jPanel2.add(CONCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, -1));

        jLabel8.setText("Precio/ Por mes");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Concepto", "Cantidad", "Mes/año inicial", "Mes/año Final"
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
        T1.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane5.setViewportView(T1);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 480, 60));

        agreg.setBackground(new java.awt.Color(153, 153, 255));
        agreg.setText("Agregar concepto");
        agreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregActionPerformed(evt);
            }
        });
        jPanel2.add(agreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 140, 30));

        GENERAR.setBackground(new java.awt.Color(255, 0, 0));
        GENERAR.setForeground(new java.awt.Color(255, 255, 255));
        GENERAR.setText("Generar Ficha de Pago");
        GENERAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        GENERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENERARActionPerformed(evt);
            }
        });
        jPanel2.add(GENERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 170, 30));

        jLabel9.setText("Monto Total");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        TOTAL.setEditable(false);
        TOTAL.setBackground(new java.awt.Color(255, 255, 255));
        TOTAL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TOTAL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALActionPerformed(evt);
            }
        });
        jPanel2.add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 150, -1));

        jLabel10.setText("Mes/Inicial");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        MESI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel2.add(MESI, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel15.setText("Cantidad/Meses");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        CANT.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        CANT.setAutoscrolls(true);
        CANT.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CANTStateChanged(evt);
            }
        });
        jPanel2.add(CANT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 50, 30));

        BORRAR.setBackground(new java.awt.Color(153, 0, 51));
        BORRAR.setForeground(new java.awt.Color(255, 255, 255));
        BORRAR.setText("BORRAR");
        BORRAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRARActionPerformed(evt);
            }
        });
        jPanel2.add(BORRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 20));

        pt.setEditable(false);
        pt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pt.setText("TOTAL");
        pt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptActionPerformed(evt);
            }
        });
        jPanel2.add(pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 90, 30));

        precio.setEditable(false);
        precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 90, 30));

        DESCRIP.setBackground(new java.awt.Color(255, 215, 190));
        DESCRIP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DESCRIP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DESCRIP.setText("DESCRIPCIÓN");
        DESCRIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(DESCRIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 200, 90));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, 340));

        jTabbedPane1.addTab("Realizar pago", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setEnabled(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 215, 190));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Consultar mis pagos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel6.setMinimumSize(new java.awt.Dimension(420, 360));
        jPanel6.setPreferredSize(new java.awt.Dimension(420, 360));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Concepto", "Mes", "Pagado", "No pagado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(T4);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 360, 90));

        T3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Mes", "Pagos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(T3);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 430, 70));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Listado por mes");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Pagos a realizar o realizados");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        T2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Concepto", "Cantidad", "Mes/año inicial", "Mes/año Final"
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
        jScrollPane6.setViewportView(T2);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 430, 90));

        jScrollPane2.setViewportView(jPanel6);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 480, 250));

        jLabel11.setText("Clave");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 60, -1));

        c2.setBackground(new java.awt.Color(255, 255, 255));
        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.setEnabled(false);
        c2.setOpaque(true);
        jPanel4.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 130, 20));

        jLabel13.setText("Nombre");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        n2.setBackground(new java.awt.Color(255, 255, 255));
        n2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n2.setEnabled(false);
        n2.setOpaque(true);
        jPanel4.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 140, 20));

        jTabbedPane1.addTab("Pagos", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 380));

        Salir.setBackground(new java.awt.Color(204, 0, 0,100));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/p.png"))); // NOI18N
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 70, 70));

        ne.setBackground(new java.awt.Color(255, 102, 0));
        ne.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ne.setText("NUEVO");
        ne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neActionPerformed(evt);
            }
        });
        jPanel1.add(ne, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 70, 60));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/F2.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        MenuP m= new MenuP();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

    private void agregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregActionPerformed
        
        String añ[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
            "Octubre","Noviembre","Diciembre"};
        int y=2021;
        int g=400;
        int ag=121;
        int re=450;
        int s = 0;
        int i=0,mi=1;
        if(CONCEP.getSelectedItem().toString().equals("Agua")){
        s = ag* c;
        }
        if(CONCEP.getSelectedItem().toString().equals("Gas")){
        s = g* c;
        }
        if(CONCEP.getSelectedItem().toString().equals("Renta")){
        s = re* c;
        }
        a[0]=(String) CONCEP.getSelectedItem();
        a[1]= Integer.toString(c);
        a[2]= (String) MESI.getSelectedItem()+" / 2021";
        a1[0]=a[2];
        a1[1]=" $ "+Integer.toString(s)+" / "+a[2];
        i=c;
        mi= MESI.getSelectedIndex();
        while(i>1){
            mi++;
            if(mi==11){mi=0; y++;}
            i--;
        }
        
        a[3]=añ[mi]+" / "+y;
        mo1.addRow(a);
        mo2.addRow(a);
        mo3.addRow(a1);
        n2.setText(name.getText());
        c2.setText(clave.getText());
        T+=s;
        TOTAL.setText(" $ "+T);
        
    }//GEN-LAST:event_agregActionPerformed

    private void CONCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONCEPActionPerformed
        int m = CONCEP.getSelectedIndex();
        int t=0;
        DESCRIP.setText("");
        if(m == 0){
        precio.setText(" $ 121");
        DESCRIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/servicios/A.jpg")));
        t= 121* (int) CANT.getValue();
        pt.setText(" $ "+t);
        } 
        if(m == 1){
        precio.setText(" $ 400");
        DESCRIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/servicios/G.jpg")));
        t= 400* (int) CANT.getValue();
        pt.setText(" $ "+t);
        } 
        if(m == 2){
        precio.setText(" $ 450");
        DESCRIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/servicios/R.jpg")));
        t= 450* (int) CANT.getValue();
        pt.setText(" $ "+t);
        }
        
    }//GEN-LAST:event_CONCEPActionPerformed

    private void CANTStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CANTStateChanged
        c=(int) CANT.getValue();
        int a = 1;
        if(CONCEP.getSelectedItem().equals("Agua")){
        a=121*c;
        }
        if(CONCEP.getSelectedItem().equals("Gas")){
        a=400*c;
        }
        if(CONCEP.getSelectedItem().equals("Renta")){
        a=450*c;
        }
        pt.setText(" $ "+Integer.toString(a));
    }//GEN-LAST:event_CANTStateChanged

    private void GENERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENERARActionPerformed
        
        int t= T1.getColumnCount();
        int tt= T1.getRowCount();
        Object cc[]= new Object[t];
        for(int j=0;j<tt;j++){
            for(int i=0;i<t;i++){
             cc[i]= T1.getValueAt(j, i);
            }
            r.mo1.addRow(cc);
        }
        
        String TE= Integer.toString(T);
        r.Texto(name.getText(), clave.getText(),TOTAL.getText());
        r.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_GENERARActionPerformed

    private void neActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neActionPerformed
        name.setText("");
        clave.setText("");
        TOTAL.setText("");
        n2.setText("");
        c2.setText("");
        int tf= mo1.getRowCount();
        int t2= mo2.getRowCount();
        int t3= mo3.getRowCount();
        for(int i=0;i<tf;i++){
            mo1.removeRow(0);
        }
        for(int i=0;i<tf;i++){
            mo2.removeRow(0);
        }
        for(int i=0;i<tf;i++){
            mo3.removeRow(0);
        }
        
    }//GEN-LAST:event_neActionPerformed

    private void BORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRARActionPerformed
        String vf;
        int f1,f2,f3;
        int g=400,ag=121,re=450, s = 0;
        int rb;
        f1=T1.getSelectedRow();
        f2=T1.getSelectedRow();
        f3=T1.getSelectedRow();
        vf= (String) T1.getValueAt(T1.getSelectedRow(), 1);
        rb=Integer.parseInt(vf);
        if(T1.getValueAt(T1.getSelectedRow(), 0).toString().equals("Agua")){
        s = ag* rb;
        }
        if(T1.getValueAt(T1.getSelectedRow(), 0).toString().equals("Gas")){
        s = g* rb;
        }
        if(T1.getValueAt(T1.getSelectedRow(), 0).toString().equals("Renta")){
        s = re* rb;
        }
        T=T-s;
        TOTAL.setText(" $ "+T);
        if(f1>=0){
            mo1.removeRow(f1);
            mo2.removeRow(f2);
            mo3.removeRow(f3);
        }
        else
            
           JOptionPane.showMessageDialog(null,"Selecciona una fila de la tabla para borrar la informacion.");
        
    }//GEN-LAST:event_BORRARActionPerformed

    private void TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TOTALActionPerformed

    private void ptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Renta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BORRAR;
    private javax.swing.JSpinner CANT;
    private javax.swing.JComboBox<String> CONCEP;
    private javax.swing.JLabel DESCRIP;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton GENERAR;
    private javax.swing.JComboBox<String> MESI;
    private javax.swing.JButton Salir;
    private javax.swing.JTable T1;
    private javax.swing.JTable T2;
    private javax.swing.JTable T3;
    private javax.swing.JTable T4;
    private javax.swing.JTextField TOTAL;
    private javax.swing.JButton agreg;
    private javax.swing.JLabel c2;
    private javax.swing.JTextField clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel n2;
    private javax.swing.JTextField name;
    private javax.swing.JButton ne;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField pt;
    // End of variables declaration//GEN-END:variables
}
