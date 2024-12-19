/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author PC1
 */
public class MenuP extends javax.swing.JFrame {

    /**
     * Creates new form MenuP
     */
    
    
//    Visitas v= new Visitas();
    Eventos e= new Eventos();
    public MenuP() {
        initComponents();
//        MP.setBackground(new java.awt.Color(255,153,51));
        MEN1.setLineWrap(true);
        MEN1.setWrapStyleWord(true);
        MEN3.setLineWrap(true);
        MEN3.setWrapStyleWord(true);
        this.setLocationRelativeTo(null);
        
    }
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/L4.png"));
        return icono;
    }
    public void IMG(String t, Image i){
        MenuP.IMG1.setIcon((Icon) i);
        MenuP.MEN1.setText(t);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.ButtonGroup();
        PP = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        IMG1 = new javax.swing.JLabel();
        Ayer = new javax.swing.JRadioButton();
        Hoy = new javax.swing.JRadioButton();
        MuyP = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        MEN1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        IMG2 = new javax.swing.JLabel();
        Ayer1 = new javax.swing.JRadioButton();
        Hoy1 = new javax.swing.JRadioButton();
        MuyP1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MEN2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        IMG3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        MEN3 = new javax.swing.JTextArea();
        Ayer2 = new javax.swing.JRadioButton();
        Hoy2 = new javax.swing.JRadioButton();
        MuyP2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        Eventos = new javax.swing.JMenu();
        EVENTOS = new javax.swing.JMenuItem();
        Compras = new javax.swing.JMenu();
        REGIS = new javax.swing.JMenuItem();
        Ventas = new javax.swing.JMenu();
        CUOTAS = new javax.swing.JMenuItem();
        LECTURAS = new javax.swing.JMenuItem();
        Contacto = new javax.swing.JMenu();
        Acerca = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(126, 56, 16));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(126, 56, 16));

        jPanel4.setBackground(new java.awt.Color(238, 131, 73));

        IMG1.setBackground(new java.awt.Color(238, 131, 73));
        IMG1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IMG1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        IMG1.setOpaque(true);

        Ayer.setBackground(new java.awt.Color(255, 102, 0));
        BG.add(Ayer);
        Ayer.setText("Ayer");

        Hoy.setBackground(new java.awt.Color(255, 204, 0));
        BG.add(Hoy);
        Hoy.setText("Hoy");
        Hoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoyActionPerformed(evt);
            }
        });

        MuyP.setBackground(new java.awt.Color(255, 102, 51));
        BG.add(MuyP);
        MuyP.setText("Muy pronto");

        MEN1.setEditable(false);
        MEN1.setColumns(20);
        MEN1.setRows(5);
        jScrollPane5.setViewportView(MEN1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(IMG1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Ayer, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(Hoy)
                        .addGap(89, 89, 89)
                        .addComponent(MuyP))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IMG1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ayer)
                    .addComponent(Hoy)
                    .addComponent(MuyP))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Noticias", jPanel1);

        jPanel2.setBackground(new java.awt.Color(144, 45, 26));

        jPanel5.setBackground(new java.awt.Color(238, 131, 73));

        IMG2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Ayer1.setBackground(new java.awt.Color(255, 102, 0));
        BG.add(Ayer1);
        Ayer1.setText("Ayer");

        Hoy1.setBackground(new java.awt.Color(255, 204, 0));
        BG.add(Hoy1);
        Hoy1.setText("Hoy");

        MuyP1.setBackground(new java.awt.Color(255, 102, 51));
        BG.add(MuyP1);
        MuyP1.setText("Muy pronto");

        MEN2.setEditable(false);
        MEN2.setColumns(20);
        MEN2.setRows(5);
        jScrollPane1.setViewportView(MEN2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(IMG2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Ayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(Hoy1)
                        .addGap(95, 95, 95)
                        .addComponent(MuyP1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IMG2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ayer1)
                    .addComponent(Hoy1)
                    .addComponent(MuyP1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Anuncios", jPanel2);

        jPanel3.setBackground(new java.awt.Color(144, 45, 26));

        jPanel6.setBackground(new java.awt.Color(238, 131, 73));

        IMG3.setBackground(new java.awt.Color(255, 255, 255));
        IMG3.setAutoscrolls(true);
        IMG3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        IMG3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MEN3.setEditable(false);
        MEN3.setColumns(20);
        MEN3.setRows(5);
        jScrollPane3.setViewportView(MEN3);

        Ayer2.setBackground(new java.awt.Color(255, 102, 0));
        BG.add(Ayer2);
        Ayer2.setText("Ayer");

        Hoy2.setBackground(new java.awt.Color(255, 204, 0));
        BG.add(Hoy2);
        Hoy2.setText("Hoy");
        Hoy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hoy2ActionPerformed(evt);
            }
        });

        MuyP2.setBackground(new java.awt.Color(255, 102, 51));
        BG.add(MuyP2);
        MuyP2.setText("Muy pronto");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IMG3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Ayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(Hoy2)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(MuyP2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(IMG3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ayer2)
                    .addComponent(Hoy2)
                    .addComponent(MuyP2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Avisos", jPanel3);

        PP.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 470, 300));

        jLabel1.setBackground(new java.awt.Color(102, 51, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO");
        jLabel1.setOpaque(true);
        PP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 260, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/F6.jpg"))); // NOI18N
        PP.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 700, 480));

        getContentPane().add(PP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        Menu.setBackground(new java.awt.Color(120, 50, 0));

        Eventos.setForeground(new java.awt.Color(255, 255, 255));
        Eventos.setText("Servicios");

        EVENTOS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        EVENTOS.setBackground(new java.awt.Color(255, 153, 102));
        EVENTOS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        EVENTOS.setForeground(new java.awt.Color(0, 0, 0));
        EVENTOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/evento.png"))); // NOI18N
        EVENTOS.setText("Gestión de eventos");
        EVENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVENTOSActionPerformed(evt);
            }
        });
        Eventos.add(EVENTOS);

        Menu.add(Eventos);

        Compras.setForeground(new java.awt.Color(255, 255, 255));
        Compras.setText("Ingreso");

        REGIS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        REGIS.setBackground(new java.awt.Color(255, 153, 102));
        REGIS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        REGIS.setForeground(new java.awt.Color(0, 0, 0));
        REGIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        REGIS.setText("Registro");
        REGIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISActionPerformed(evt);
            }
        });
        Compras.add(REGIS);

        Menu.add(Compras);

        Ventas.setForeground(new java.awt.Color(255, 255, 255));
        Ventas.setText("Administración de Finanzas");

        CUOTAS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        CUOTAS.setBackground(new java.awt.Color(255, 153, 102));
        CUOTAS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CUOTAS.setForeground(new java.awt.Color(0, 0, 0));
        CUOTAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fijo.png"))); // NOI18N
        CUOTAS.setText("Registro de las cuotas");
        CUOTAS.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        CUOTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUOTASActionPerformed(evt);
            }
        });
        Ventas.add(CUOTAS);

        LECTURAS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        LECTURAS.setBackground(new java.awt.Color(255, 153, 102));
        LECTURAS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LECTURAS.setForeground(new java.awt.Color(0, 0, 0));
        LECTURAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bloquear.png"))); // NOI18N
        LECTURAS.setText("Registro de Lecturas");
        LECTURAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LECTURASActionPerformed(evt);
            }
        });
        Ventas.add(LECTURAS);

        Menu.add(Ventas);

        Contacto.setBackground(new java.awt.Color(255, 0, 0));
        Contacto.setForeground(new java.awt.Color(255, 255, 255));
        Contacto.setText("Cuenta");

        Acerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        Acerca.setBackground(new java.awt.Color(255, 153, 102));
        Acerca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Acerca.setForeground(new java.awt.Color(0, 0, 0));
        Acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acerca-de.png"))); // NOI18N
        Acerca.setText("Acerca de");
        Acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaActionPerformed(evt);
            }
        });
        Contacto.add(Acerca);

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Salir.setBackground(new java.awt.Color(204, 0, 0));
        Salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Contacto.add(Salir);

        Menu.add(Contacto);

        setJMenuBar(Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void EVENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVENTOSActionPerformed
        Eventos e = new Eventos();
        e.setVisible(true);
    }//GEN-LAST:event_EVENTOSActionPerformed

    private void REGISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISActionPerformed
        Registros r = new Registros();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_REGISActionPerformed

    private void CUOTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUOTASActionPerformed
        Renta n= new Renta();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_CUOTASActionPerformed

    private void AcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaActionPerformed
        Acerca a= new Acerca();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AcercaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void Hoy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hoy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hoy2ActionPerformed

    private void HoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoyActionPerformed
        String t="Hoy es el cumpleaños del Emilio, Viva, ve a festejar con el a su mansión.";
        if(Hoy.isSelected()){
            MEN1.setText(t);
            IMG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eventos/E3.jpg")));
        }
    }//GEN-LAST:event_HoyActionPerformed

    private void LECTURASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LECTURASActionPerformed
        ServiciosB sb = new ServiciosB();
        sb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LECTURASActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        /*Color c= new Color(0,51,10);
        UIManager.put("Menu", c);
        UIManager.put("JRadioButton.background", c);
        UIManager.put("JLabel.background", c);*/
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Acerca;
    private javax.swing.JRadioButton Ayer;
    private javax.swing.JRadioButton Ayer1;
    private javax.swing.JRadioButton Ayer2;
    private javax.swing.ButtonGroup BG;
    private javax.swing.JMenuItem CUOTAS;
    private javax.swing.JMenu Compras;
    private javax.swing.JMenu Contacto;
    private javax.swing.JMenuItem EVENTOS;
    private javax.swing.JMenu Eventos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JRadioButton Hoy;
    private javax.swing.JRadioButton Hoy1;
    private javax.swing.JRadioButton Hoy2;
    public static javax.swing.JLabel IMG1;
    private javax.swing.JLabel IMG2;
    private javax.swing.JLabel IMG3;
    private javax.swing.JMenuItem LECTURAS;
    public static javax.swing.JTextArea MEN1;
    private javax.swing.JTextArea MEN2;
    private javax.swing.JTextArea MEN3;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JRadioButton MuyP;
    private javax.swing.JRadioButton MuyP1;
    private javax.swing.JRadioButton MuyP2;
    private javax.swing.JPanel PP;
    private javax.swing.JMenuItem REGIS;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenu Ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
