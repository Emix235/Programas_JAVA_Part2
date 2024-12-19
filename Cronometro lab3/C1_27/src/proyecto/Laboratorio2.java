/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import javax.swing.*; import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author fredy
 */
public class Laboratorio2 extends javax.swing.JFrame {
 DefaultListModel n1=new DefaultListModel();
DefaultListModel n2=new DefaultListModel();

//Cronometro
int miliseg=0;
int seg=0;
int min=0;
int hor=0;
boolean estado1=true;
boolean estado2=true;
boolean estado3=true;
boolean estado4=true;
boolean estado5=true;
boolean estado6=true;
boolean estado7=true;
boolean estado8=true;
boolean estado9=true;
boolean estado10=true;
boolean estado11=true;
boolean estado12=true;
boolean estado13=true;
boolean estado14=true;
boolean estado15=true;
boolean estado16=true;
boolean estado17=true;
boolean estado18=true;
boolean estado19=true;
boolean estado20=true;
boolean estado21=true;
boolean estado22=true;
boolean estado23=true;
boolean estado24=true;
    /**
     * Creates new form Laboratorio2
     */
    public Laboratorio2() {
        initComponents();
        n1=new DefaultListModel();
         n2=new DefaultListModel();
        jListN.setModel(n1);
        jListC.setModel(n2);
        
        //BOTONES DEL REGISTRO
        txtUsuario.setEnabled(false);
        
        bEliminar.setEnabled(false);
        bRegistrar.setEnabled(false);
        bNuevo.requestFocus();
        
        //BOTONES DE LAS COMPUTADORAS
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);
        b11.setEnabled(false);
        b12.setEnabled(false);
        b13.setEnabled(false);
        b14.setEnabled(false);
        b15.setEnabled(false);
        b16.setEnabled(false);
        b17.setEnabled(false);
        b18.setEnabled(false);
        b19.setEnabled(false);
        b20.setEnabled(false);
        b21.setEnabled(false);
        b22.setEnabled(false);
        b23.setEnabled(false);
        b24.setEnabled(false);
        
        //BOTONES DEL CRONOMETRO
        //Computadora 1
        bStop1.setEnabled(false);
        tm1.setEnabled(false);
        seg1.setEnabled(false);
        //-------------------------------
       //Computadora 2
        bStop2.setEnabled(false);
        tm2.setEnabled(false);
        seg2.setEnabled(false);
         //-------------------------------
         //Computadora 3
        bStop3.setEnabled(false);
        tm3.setEnabled(false);
        seg3.setEnabled(false);
        //-------------------------------
       //Computadora 4
        bStop4.setEnabled(false);
        tm4.setEnabled(false);
        seg4.setEnabled(false);
        //-------------------------------
         //Computadora 5
        bStop5.setEnabled(false);
        tm5.setEnabled(false);
        seg5.setEnabled(false);
        //-------------------------------
        //Computadora 6
        bStop6.setEnabled(false);
        tm6.setEnabled(false);
        seg6.setEnabled(false);
        //-------------------------------
         //Computadora 7
        bStop7.setEnabled(false);
        tm7.setEnabled(false);
        seg7.setEnabled(false);
        //-------------------------------
          //Computadora 8
        bStop8.setEnabled(false);
        tm8.setEnabled(false);
        seg8.setEnabled(false);
        //-------------------------------
         //Computadora 9
        bStop9.setEnabled(false);
        tm9.setEnabled(false);
        seg9.setEnabled(false);
        //-------------------------------
        //Computadora 10
        bStop10.setEnabled(false);
        tm10.setEnabled(false);
        seg10.setEnabled(false);
        //-------------------------------
         //Computadora 11
        bStop11.setEnabled(false);
        tm11.setEnabled(false);
        seg11.setEnabled(false);
        //-------------------------------
         //Computadora 12
        bStop12.setEnabled(false);
        tm12.setEnabled(false);
        seg12.setEnabled(false);
        //-------------------------------
         //Computadora 13
        bStop13.setEnabled(false);
        tm13.setEnabled(false);
        seg13.setEnabled(false);
        //-------------------------------
          //Computadora 14
        bStop14.setEnabled(false);
        tm14.setEnabled(false);
        seg14.setEnabled(false);
        //-------------------------------
        //Computadora 15
        bStop15.setEnabled(false);
        tm15.setEnabled(false);
        seg15.setEnabled(false);
        //-------------------------------
          //Computadora 16
        bStop16.setEnabled(false);
        tm16.setEnabled(false);
        seg16.setEnabled(false);
        //-------------------------------
           //Computadora 17
        bStop17.setEnabled(false);
        tm17.setEnabled(false);
        seg17.setEnabled(false);
        //-------------------------------
           //Computadora 18
        bStop18.setEnabled(false);
        tm18.setEnabled(false);
        seg18.setEnabled(false);
        //-------------------------------
            //Computadora 19
        bStop19.setEnabled(false);
        tm19.setEnabled(false);
        seg19.setEnabled(false);
        //-------------------------------
         //Computadora 20
        bStop20.setEnabled(false);
        tm20.setEnabled(false);
        seg20.setEnabled(false);
        //-------------------------------
       //Computadora 21
        bStop21.setEnabled(false);
        tm21.setEnabled(false);
        seg21.setEnabled(false);
        //-------------------------------
         //Computadora 22
        bStop22.setEnabled(false);
        tm22.setEnabled(false);
        seg22.setEnabled(false);
        //-------------------------------
         //Computadora 23
        bStop23.setEnabled(false);
        tm23.setEnabled(false);
        seg23.setEnabled(false);
        //-------------------------------
        //Computadora 24
        bStop24.setEnabled(false);
        tm24.setEnabled(false);
        seg24.setEnabled(false);
        //-------------------------------
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        bStop1 = new javax.swing.JButton();
        tm1 = new javax.swing.JLabel();
        seg1 = new javax.swing.JLabel();
        seg2 = new javax.swing.JLabel();
        tm2 = new javax.swing.JLabel();
        bStop2 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        bStop3 = new javax.swing.JButton();
        tm3 = new javax.swing.JLabel();
        seg3 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        tm4 = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        seg4 = new javax.swing.JLabel();
        bStop4 = new javax.swing.JButton();
        bStop5 = new javax.swing.JButton();
        seg5 = new javax.swing.JLabel();
        b5 = new javax.swing.JButton();
        tm5 = new javax.swing.JLabel();
        tm6 = new javax.swing.JLabel();
        seg6 = new javax.swing.JLabel();
        bStop6 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        bStop7 = new javax.swing.JButton();
        seg7 = new javax.swing.JLabel();
        tm7 = new javax.swing.JLabel();
        tm8 = new javax.swing.JLabel();
        seg8 = new javax.swing.JLabel();
        bStop8 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        tm9 = new javax.swing.JLabel();
        b9 = new javax.swing.JButton();
        bStop9 = new javax.swing.JButton();
        seg9 = new javax.swing.JLabel();
        seg10 = new javax.swing.JLabel();
        bStop10 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        tm10 = new javax.swing.JLabel();
        tm11 = new javax.swing.JLabel();
        b11 = new javax.swing.JButton();
        bStop11 = new javax.swing.JButton();
        seg11 = new javax.swing.JLabel();
        seg12 = new javax.swing.JLabel();
        bStop12 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        tm12 = new javax.swing.JLabel();
        tm13 = new javax.swing.JLabel();
        b13 = new javax.swing.JButton();
        bStop13 = new javax.swing.JButton();
        seg13 = new javax.swing.JLabel();
        tm14 = new javax.swing.JLabel();
        bStop14 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        seg14 = new javax.swing.JLabel();
        seg15 = new javax.swing.JLabel();
        b15 = new javax.swing.JButton();
        bStop15 = new javax.swing.JButton();
        tm15 = new javax.swing.JLabel();
        tm16 = new javax.swing.JLabel();
        bStop16 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        seg16 = new javax.swing.JLabel();
        b17 = new javax.swing.JButton();
        bStop17 = new javax.swing.JButton();
        tm17 = new javax.swing.JLabel();
        seg17 = new javax.swing.JLabel();
        tm18 = new javax.swing.JLabel();
        bStop18 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        seg18 = new javax.swing.JLabel();
        seg19 = new javax.swing.JLabel();
        b19 = new javax.swing.JButton();
        bStop19 = new javax.swing.JButton();
        tm19 = new javax.swing.JLabel();
        seg20 = new javax.swing.JLabel();
        tm20 = new javax.swing.JLabel();
        bStop20 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        tm21 = new javax.swing.JLabel();
        seg21 = new javax.swing.JLabel();
        b21 = new javax.swing.JButton();
        bStop21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        seg22 = new javax.swing.JLabel();
        tm22 = new javax.swing.JLabel();
        bStop22 = new javax.swing.JButton();
        bStop23 = new javax.swing.JButton();
        tm23 = new javax.swing.JLabel();
        seg23 = new javax.swing.JLabel();
        b23 = new javax.swing.JButton();
        bStop24 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        seg24 = new javax.swing.JLabel();
        tm24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        bNuevo = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListN = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListC = new javax.swing.JList();
        bRegistrar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel1.setText("   LABORATORIO 2");

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        bStop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop1ActionPerformed(evt);
            }
        });

        tm1.setText(" 00 : 00 : 00 :");

        seg1.setText("0000");

        seg2.setText("0000");

        tm2.setText(" 00 : 00 : 00 :");

        bStop2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop2ActionPerformed(evt);
            }
        });

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        bStop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop3ActionPerformed(evt);
            }
        });

        tm3.setText(" 00 : 00 : 00 :");

        seg3.setText("0000");

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        tm4.setText(" 00 : 00 : 00 :");

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        seg4.setText("0000");

        bStop4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop4ActionPerformed(evt);
            }
        });

        bStop5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop5ActionPerformed(evt);
            }
        });

        seg5.setText("0000");

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        tm5.setText(" 00 : 00 : 00 :");

        tm6.setText(" 00 : 00 : 00 :");

        seg6.setText("0000");

        bStop6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop6ActionPerformed(evt);
            }
        });

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        bStop7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop7ActionPerformed(evt);
            }
        });

        seg7.setText("0000");

        tm7.setText(" 00 : 00 : 00 :");

        tm8.setText(" 00 : 00 : 00 :");

        seg8.setText("0000");

        bStop8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop8ActionPerformed(evt);
            }
        });

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        tm9.setText(" 00 : 00 : 00 :");

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bStop9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop9ActionPerformed(evt);
            }
        });

        seg9.setText("0000");

        seg10.setText("0000");

        bStop10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop10ActionPerformed(evt);
            }
        });

        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b10.setText("10");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        tm10.setText(" 00 : 00 : 00 :");

        tm11.setText(" 00 : 00 : 00 :");

        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b11.setText("11");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        bStop11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop11ActionPerformed(evt);
            }
        });

        seg11.setText("0000");

        seg12.setText("0000");

        bStop12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop12ActionPerformed(evt);
            }
        });

        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b12.setText("12");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        tm12.setText(" 00 : 00 : 00 :");

        tm13.setText(" 00 : 00 : 00 :");

        b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b13.setText("13");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        bStop13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop13ActionPerformed(evt);
            }
        });

        seg13.setText("0000");

        tm14.setText(" 00 : 00 : 00 :");

        bStop14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop14ActionPerformed(evt);
            }
        });

        b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b14.setText("14");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        seg14.setText("0000");

        seg15.setText("0000");

        b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b15.setText("15");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        bStop15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop15ActionPerformed(evt);
            }
        });

        tm15.setText(" 00 : 00 : 00 :");

        tm16.setText(" 00 : 00 : 00 :");

        bStop16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop16ActionPerformed(evt);
            }
        });

        b16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b16.setText("16");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        seg16.setText("0000");

        b17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b17.setText("17");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });

        bStop17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop17ActionPerformed(evt);
            }
        });

        tm17.setText(" 00 : 00 : 00 :");

        seg17.setText("0000");

        tm18.setText(" 00 : 00 : 00 :");

        bStop18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop18ActionPerformed(evt);
            }
        });

        b18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b18.setText("18");
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });

        seg18.setText("0000");

        seg19.setText("0000");

        b19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b19.setText("19");
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });

        bStop19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop19ActionPerformed(evt);
            }
        });

        tm19.setText(" 00 : 00 : 00 :");

        seg20.setText("0000");

        tm20.setText(" 00 : 00 : 00 :");

        bStop20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop20ActionPerformed(evt);
            }
        });

        b20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b20.setText("20");
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });

        tm21.setText(" 00 : 00 : 00 :");

        seg21.setText("0000");

        b21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b21.setText("21");
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        bStop21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop21ActionPerformed(evt);
            }
        });

        b22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b22.setText("22");
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        seg22.setText("0000");

        tm22.setText(" 00 : 00 : 00 :");

        bStop22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop22ActionPerformed(evt);
            }
        });

        bStop23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop23ActionPerformed(evt);
            }
        });

        tm23.setText(" 00 : 00 : 00 :");

        seg23.setText("0000");

        b23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b23.setText("23");
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });

        bStop24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/stop_timer.png"))); // NOI18N
        bStop24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStop24ActionPerformed(evt);
            }
        });

        b24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        b24.setText("24");
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });

        seg24.setText("0000");

        tm24.setText(" 00 : 00 : 00 :");

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        bNuevo.setText("NUEVO");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bSalir.setText("SALIR");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListN);

        jScrollPane2.setViewportView(jListC);

        bRegistrar.setText("REGISTRAR");
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });

        bEliminar.setText("ELIMINAR");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        jLabel5.setText("Desocupada");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/disponible.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/ocupada.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/computer.png"))); // NOI18N
        jLabel8.setText("Ocupada");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/sin_servicio.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bStop1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tm1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(seg1))
                                            .addComponent(b1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bStop6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tm6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(seg6))
                                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bStop16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tm16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(seg16))
                                                    .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bStop21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tm21, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(seg21))
                                                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)))
                                        .addGap(6, 6, 6)))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bStop2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tm2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(seg2))
                                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bStop7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tm7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(seg7))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(bStop17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(tm17, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(seg17))))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(bStop22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(tm22, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(seg22)))
                                                        .addGap(3, 3, 3)))
                                                .addGap(6, 6, 6)))
                                        .addGap(3, 3, 3))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bStop11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tm11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seg11))
                                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(bStop12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tm12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seg12))
                                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bStop18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tm18, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(seg18))
                                            .addComponent(b18, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bStop23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tm23, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(seg23))
                                            .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3)))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bStop19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tm19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(seg19))
                                            .addComponent(b19, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bStop24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tm24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(seg24)))
                                        .addGap(3, 3, 3)))
                                .addGap(6, 6, 6)
                                .addComponent(bStop20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tm20, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seg20))
                                    .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(526, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bStop3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tm3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(seg3))
                                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bStop8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tm8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(seg8))
                                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)))
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bStop4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tm4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(seg4))
                                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bStop9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tm9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(seg9))
                                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)))
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bStop5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tm5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(seg5))
                                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bStop10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(tm10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(seg10))
                                                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3)))
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bStop13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tm13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(seg13))
                                            .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bStop14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tm14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(seg14)
                                                .addGap(8, 8, 8)))
                                        .addGap(6, 6, 6)
                                        .addComponent(bStop15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tm15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(seg15))
                                            .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(bNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(bSalir)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bRegistrar, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b13)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(bStop13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tm13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seg13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(bStop14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tm14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seg14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(bStop15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tm15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seg15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(b11)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(bStop11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tm11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(seg11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(b12)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(bStop12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tm12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(seg12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(b2)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(bStop2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(tm2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(seg2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(b1)
                                                            .addComponent(bStop1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(20, 20, 20)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(tm1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(seg1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(b6)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(bStop6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(tm6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(seg6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(b7)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(bStop7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(tm7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(seg7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(b3)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(bStop3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(tm3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(seg3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(b4)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(bStop4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(tm4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(seg4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(b8)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(bStop8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(tm8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(seg8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(b9)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(bStop9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(tm9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(seg9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(b10)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(bStop10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(tm10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(seg10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGap(50, 50, 50))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(b5)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(bNuevo)
                                                .addComponent(bSalir))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(bStop5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(tm5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(seg5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(bEliminar)
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b16)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bStop16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tm16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seg16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b17)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bStop17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tm17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seg17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b18)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bStop18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tm18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seg18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b19)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bStop19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tm19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seg19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b20)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bStop20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tm20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seg20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b21)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bStop21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tm21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seg21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b22)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bStop22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tm22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seg22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b23)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bStop23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tm23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seg23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bStop24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b24))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tm24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seg24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        // TODO add your handling code here:
        txtUsuario.setEnabled(true);
        bEliminar.setEnabled(false);
        bRegistrar.setEnabled(true);
        txtUsuario.requestFocus();
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
        // TODO add your handling code here:
          if (evt.getSource()==bRegistrar){
            
    
        String nombre=txtUsuario.getText();
        txtUsuario.setText("");
        n1.addElement(nombre);
        
      
       
        b1.setEnabled(true);
         b1.setBackground(Color.green); //color
        b2.setEnabled(true);
         b2.setBackground(Color.green); //color
        b3.setEnabled(true);
         b3.setBackground(Color.green); //color
        b4.setEnabled(true);
         b4.setBackground(Color.green); //color
        b5.setEnabled(true);
         b5.setBackground(Color.green); //color
        b6.setEnabled(true);
         b6.setBackground(Color.green); //color
        b7.setEnabled(true); 
         b7.setBackground(Color.green); //color
        b8.setEnabled(true);
         b8.setBackground(Color.green); //color
        b9.setEnabled(true); 
         b9.setBackground(Color.green); //color
        b10.setEnabled(true);
         b10.setBackground(Color.green); //color
        b11.setEnabled(true);
         b11.setBackground(Color.green); //color
        b12.setEnabled(true); 
         b12.setBackground(Color.green); //color
        b13.setEnabled(true); 
         b13.setBackground(Color.green); //color
        b14.setEnabled(true);
         b14.setBackground(Color.green); //color
        b15.setEnabled(true);
         b15.setBackground(Color.green); //color
        b16.setEnabled(true);
         b16.setBackground(Color.green); //color
        b17.setEnabled(true);
         b17.setBackground(Color.green); //color
        b18.setEnabled(true);
         b18.setBackground(Color.green); //color
        b19.setEnabled(true);
         b19.setBackground(Color.green); //color
        b20.setEnabled(true);
         b20.setBackground(Color.green); //color
        b21.setEnabled(true);
         b21.setBackground(Color.green); //color
        b22.setEnabled(true);
         b22.setBackground(Color.green); //color
        b23.setEnabled(true);
         b23.setBackground(Color.green); //color
        b24.setEnabled(true);
         b24.setBackground(Color.green); //color
         
         //botones
        txtUsuario.setEnabled(false);
        bEliminar.setEnabled(true);
        bNuevo.setEnabled(true);
        bRegistrar.setEnabled(false);
         }
    }//GEN-LAST:event_bRegistrarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
        if (evt.getSource()==bSalir){
        Bienvenido salir=new Bienvenido();
        salir.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_bSalirActionPerformed

    private void bStop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop1ActionPerformed

        estado1=false;
    }//GEN-LAST:event_bStop1ActionPerformed

    private void bStop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop2ActionPerformed
        // TODO add your handling code here:
        estado2=false;
    }//GEN-LAST:event_bStop2ActionPerformed

    private void bStop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop3ActionPerformed
        // TODO add your handling code here:
        estado3=false;
    }//GEN-LAST:event_bStop3ActionPerformed

    private void bStop4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop4ActionPerformed
        // TODO add your handling code here:
        estado4=false;
    }//GEN-LAST:event_bStop4ActionPerformed

    private void bStop5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop5ActionPerformed
        // TODO add your handling code here:
        estado5=false;
    }//GEN-LAST:event_bStop5ActionPerformed

    private void bStop6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop6ActionPerformed
        // TODO add your handling code here:
        estado6=false;
    }//GEN-LAST:event_bStop6ActionPerformed

    private void bStop7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop7ActionPerformed
        // TODO add your handling code here:
        estado7=false;
    }//GEN-LAST:event_bStop7ActionPerformed

    private void bStop8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop8ActionPerformed
        // TODO add your handling code here:
        estado8=false;
    }//GEN-LAST:event_bStop8ActionPerformed

    private void bStop9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop9ActionPerformed
        // TODO add your handling code here:
        estado9=false;
    }//GEN-LAST:event_bStop9ActionPerformed

    private void bStop10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop10ActionPerformed
        // TODO add your handling code here:
        estado10=false;
    }//GEN-LAST:event_bStop10ActionPerformed

    private void bStop11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop11ActionPerformed
        // TODO add your handling code here:
        estado11=false;
    }//GEN-LAST:event_bStop11ActionPerformed

    private void bStop12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop12ActionPerformed
        // TODO add your handling code here:
        estado12=false;
    }//GEN-LAST:event_bStop12ActionPerformed

    private void bStop13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop13ActionPerformed
        // TODO add your handling code here:
        estado13=false;
    }//GEN-LAST:event_bStop13ActionPerformed

    private void bStop14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop14ActionPerformed
        // TODO add your handling code here:
        estado14=false;
    }//GEN-LAST:event_bStop14ActionPerformed

    private void bStop15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop15ActionPerformed
        // TODO add your handling code here:
        estado15=false;
    }//GEN-LAST:event_bStop15ActionPerformed

    private void bStop16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop16ActionPerformed
        // TODO add your handling code here:
        estado16=false;
    }//GEN-LAST:event_bStop16ActionPerformed

    private void bStop17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop17ActionPerformed
        // TODO add your handling code here:
        estado17=false;
    }//GEN-LAST:event_bStop17ActionPerformed

    private void bStop18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop18ActionPerformed
        // TODO add your handling code here:
        estado18=false;
    }//GEN-LAST:event_bStop18ActionPerformed

    private void bStop19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop19ActionPerformed
        // TODO add your handling code here:
        estado19=false;
    }//GEN-LAST:event_bStop19ActionPerformed

    private void bStop20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop20ActionPerformed
        // TODO add your handling code here:
        estado20=false;
    }//GEN-LAST:event_bStop20ActionPerformed

    private void bStop21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop21ActionPerformed
        // TODO add your handling code here:
        estado21=false;
    }//GEN-LAST:event_bStop21ActionPerformed

    private void bStop22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop22ActionPerformed
        // TODO add your handling code here:
        estado22=false;
    }//GEN-LAST:event_bStop22ActionPerformed

    private void bStop23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop23ActionPerformed
        // TODO add your handling code here:
        estado23=false;
    }//GEN-LAST:event_bStop23ActionPerformed

    private void bStop24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStop24ActionPerformed
        // TODO add your handling code here:
        estado24=false;
    }//GEN-LAST:event_bStop24ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource()==b1){
       miliseg=0; seg=0; min=0; hor=0;

       b1.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(1);
            
            
            //BOTONES DEL CRONOMETRO
        bStop1.setEnabled(true);
        tm1.setEnabled(true);
        seg1.setEnabled(true);
         // Start
        bStop1.setEnabled(true);
          estado1=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado1==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm1.setText(hor + " : " + min + " : " + seg + " : ");
                         seg1.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b2){
       miliseg=0; seg=0; min=0; hor=0;

       b2.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(2);
            
            
            //BOTONES DEL CRONOMETRO
        bStop2.setEnabled(true);
        tm2.setEnabled(true);
        seg2.setEnabled(true);
         // Start
        bStop2.setEnabled(true);
          estado2=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado2==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm2.setText(hor + " : " + min + " : " + seg + " : ");
                         seg2.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b3){
       miliseg=0; seg=0; min=0; hor=0;

       b3.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(3);
            
            
            //BOTONES DEL CRONOMETRO
        bStop3.setEnabled(true);
        tm3.setEnabled(true);
        seg3.setEnabled(true);
         // Start
        bStop3.setEnabled(true);
          estado3=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado3==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm3.setText(hor + " : " + min + " : " + seg + " : ");
                         seg3.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b4){
       miliseg=0; seg=0; min=0; hor=0;

       b4.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(4);
            
            
            //BOTONES DEL CRONOMETRO
        bStop4.setEnabled(true);
        tm4.setEnabled(true);
        seg4.setEnabled(true);
         // Start
        bStop4.setEnabled(true);
          estado4=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado4==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm4.setText(hor + " : " + min + " : " + seg + " : ");
                         seg4.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b5){
       miliseg=0; seg=0; min=0; hor=0;

       b5.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(5);
            
            
            //BOTONES DEL CRONOMETRO
        bStop5.setEnabled(true);
        tm5.setEnabled(true);
        seg5.setEnabled(true);
         // Start
        bStop5.setEnabled(true);
          estado5=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado5==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm5.setText(hor + " : " + min + " : " + seg + " : ");
                         seg5.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b6){
       miliseg=0; seg=0; min=0; hor=0;

       b6.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(6);
            
            
            //BOTONES DEL CRONOMETRO
        bStop6.setEnabled(true);
        tm6.setEnabled(true);
        seg6.setEnabled(true);
         // Start
        bStop6.setEnabled(true);
          estado6=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado6==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm6.setText(hor + " : " + min + " : " + seg + " : ");
                         seg6.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b7){
       miliseg=0; seg=0; min=0; hor=0;

       b7.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(7);
            
            
            //BOTONES DEL CRONOMETRO
        bStop7.setEnabled(true);
        tm7.setEnabled(true);
        seg7.setEnabled(true);
         // Start
        bStop7.setEnabled(true);
          estado7=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado7==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm7.setText(hor + " : " + min + " : " + seg + " : ");
                         seg7.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b8){
       miliseg=0; seg=0; min=0; hor=0;

       b8.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(8);
            
            
            //BOTONES DEL CRONOMETRO
        bStop8.setEnabled(true);
        tm8.setEnabled(true);
        seg8.setEnabled(true);
         // Start
        bStop8.setEnabled(true);
          estado8=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado8==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm8.setText(hor + " : " + min + " : " + seg + " : ");
                         seg8.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b9){
       miliseg=0; seg=0; min=0; hor=0;

       b9.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(9);
            
            
            //BOTONES DEL CRONOMETRO
        bStop9.setEnabled(true);
        tm9.setEnabled(true);
        seg9.setEnabled(true);
         // Start
        bStop9.setEnabled(true);
          estado9=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado9==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm9.setText(hor + " : " + min + " : " + seg + " : ");
                         seg9.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b10){
       miliseg=0; seg=0; min=0; hor=0;

       b10.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(10);
            
            
            //BOTONES DEL CRONOMETRO
        bStop10.setEnabled(true);
        tm10.setEnabled(true);
        seg10.setEnabled(true);
         // Start
        bStop10.setEnabled(true);
          estado1=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado10==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm10.setText(hor + " : " + min + " : " + seg + " : ");
                         seg10.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b11){
       miliseg=0; seg=0; min=0; hor=0;

       b11.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(11);
            
            
            //BOTONES DEL CRONOMETRO
        bStop11.setEnabled(true);
        tm11.setEnabled(true);
        seg11.setEnabled(true);
         // Start
        bStop11.setEnabled(true);
          estado11=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado11==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm11.setText(hor + " : " + min + " : " + seg + " : ");
                         seg11.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b12){
       miliseg=0; seg=0; min=0; hor=0;

       b12.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(12);
            
            
            //BOTONES DEL CRONOMETRO
        bStop12.setEnabled(true);
        tm12.setEnabled(true);
        seg12.setEnabled(true);
         // Start
        bStop12.setEnabled(true);
          estado12=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado12==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm12.setText(hor + " : " + min + " : " + seg + " : ");
                         seg12.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b13){
       miliseg=0; seg=0; min=0; hor=0;

       b13.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(13);
            
            
            //BOTONES DEL CRONOMETRO
        bStop13.setEnabled(true);
        tm13.setEnabled(true);
        seg13.setEnabled(true);
         // Start
        bStop13.setEnabled(true);
          estado13=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado13==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm13.setText(hor + " : " + min + " : " + seg + " : ");
                         seg13.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b14){
       miliseg=0; seg=0; min=0; hor=0;

       b14.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(14);
            
            
            //BOTONES DEL CRONOMETRO
        bStop14.setEnabled(true);
        tm14.setEnabled(true);
        seg14.setEnabled(true);
         // Start
        bStop14.setEnabled(true);
          estado14=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado14==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm14.setText(hor + " : " + min + " : " + seg + " : ");
                         seg14.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b15){
       miliseg=0; seg=0; min=0; hor=0;

       b15.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(15);
            
            
            //BOTONES DEL CRONOMETRO
        bStop15.setEnabled(true);
        tm15.setEnabled(true);
        seg15.setEnabled(true);
         // Start
        bStop15.setEnabled(true);
          estado15=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado15==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm15.setText(hor + " : " + min + " : " + seg + " : ");
                         seg15.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b16){
       miliseg=0; seg=0; min=0; hor=0;

       b16.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(16);
            
            
            //BOTONES DEL CRONOMETRO
        bStop16.setEnabled(true);
        tm16.setEnabled(true);
        seg16.setEnabled(true);
         // Start
        bStop16.setEnabled(true);
          estado16=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado16==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm16.setText(hor + " : " + min + " : " + seg + " : ");
                         seg16.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b17){
       miliseg=0; seg=0; min=0; hor=0;

       b17.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(17);
            
            
            //BOTONES DEL CRONOMETRO
        bStop17.setEnabled(true);
        tm17.setEnabled(true);
        seg17.setEnabled(true);
         // Start
        bStop17.setEnabled(true);
          estado17=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado17==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm17.setText(hor + " : " + min + " : " + seg + " : ");
                         seg17.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b17ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b18){
       miliseg=0; seg=0; min=0; hor=0;

       b18.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(18);
            
            
            //BOTONES DEL CRONOMETRO
        bStop18.setEnabled(true);
        tm18.setEnabled(true);
        seg18.setEnabled(true);
         // Start
        bStop18.setEnabled(true);
          estado18=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado18==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm18.setText(hor + " : " + min + " : " + seg + " : ");
                         seg18.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b18ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b19){
       miliseg=0; seg=0; min=0; hor=0;

       b19.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(19);
            
            
            //BOTONES DEL CRONOMETRO
        bStop19.setEnabled(true);
        tm19.setEnabled(true);
        seg19.setEnabled(true);
         // Start
        bStop19.setEnabled(true);
          estado19=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado19==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm19.setText(hor + " : " + min + " : " + seg + " : ");
                         seg19.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b19ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b20){
       miliseg=0; seg=0; min=0; hor=0;

       b20.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(20);
            
            
            //BOTONES DEL CRONOMETRO
        bStop20.setEnabled(true);
        tm20.setEnabled(true);
        seg20.setEnabled(true);
         // Start
        bStop20.setEnabled(true);
          estado20=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado20==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm20.setText(hor + " : " + min + " : " + seg + " : ");
                         seg20.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b20ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b21){
       miliseg=0; seg=0; min=0; hor=0;

       b21.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(21);
            
            
            //BOTONES DEL CRONOMETRO
        bStop21.setEnabled(true);
        tm21.setEnabled(true);
        seg21.setEnabled(true);
         // Start
        bStop21.setEnabled(true);
          estado21=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado21==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm21.setText(hor + " : " + min + " : " + seg + " : ");
                         seg21.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b21ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        // TODO add your handling code here:
         if (evt.getSource()==b22){
       miliseg=0; seg=0; min=0; hor=0;

       b22.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(22);
            
            
            //BOTONES DEL CRONOMETRO
        bStop22.setEnabled(true);
        tm22.setEnabled(true);
        seg22.setEnabled(true);
         // Start
        bStop22.setEnabled(true);
          estado22=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado22==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm22.setText(hor + " : " + min + " : " + seg + " : ");
                         seg22.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b22ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource()==b23){
       miliseg=0; seg=0; min=0; hor=0;

       b23.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(23);
            
            
            //BOTONES DEL CRONOMETRO
        bStop23.setEnabled(true);
        tm23.setEnabled(true);
        seg23.setEnabled(true);
         // Start
        bStop23.setEnabled(true);
          estado23=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado23==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm23.setText(hor + " : " + min + " : " + seg + " : ");
                         seg23.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b23ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource()==b24){
       miliseg=0; seg=0; min=0; hor=0;

       b24.setBackground(Color.red);
        String nc=txtUsuario.getText();
       
        n2.addElement(24);
            
            
            //BOTONES DEL CRONOMETRO
        bStop24.setEnabled(true);
        tm24.setEnabled(true);
        seg24.setEnabled(true);
         // Start
        bStop24.setEnabled(true);
          estado24=true;
          Thread hilo=new Thread(){
             public void run() {
                 for(;;){
                     if (estado24==true){
                       try{
                           sleep(1);
                           if (miliseg>=1000){
                           miliseg=0;
                           seg++;
                           }
                          if(seg>=60){
                            miliseg=0;
                            seg=0;
                            min++;
                         }
                         if(min>=60){
                             miliseg=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         tm24.setText(hor + " : " + min + " : " + seg + " : ");
                         seg24.setText(""+miliseg);
                         miliseg++;
                       }catch(Exception e)  {
                           
                       }
                     }else{
                         break;
                     }
                 }
             }
          };
        hilo.start();

        }
    }//GEN-LAST:event_b24ActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        if (evt.getSource()==bEliminar){
        int eli=jListN.getSelectedIndex();
        n1.remove(eli);
        
        int eli2=jListC.getSelectedIndex();
        n2.remove(eli2);
        }
        
    }//GEN-LAST:event_bEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Laboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboratorio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laboratorio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bRegistrar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bStop1;
    private javax.swing.JButton bStop10;
    private javax.swing.JButton bStop11;
    private javax.swing.JButton bStop12;
    private javax.swing.JButton bStop13;
    private javax.swing.JButton bStop14;
    private javax.swing.JButton bStop15;
    private javax.swing.JButton bStop16;
    private javax.swing.JButton bStop17;
    private javax.swing.JButton bStop18;
    private javax.swing.JButton bStop19;
    private javax.swing.JButton bStop2;
    private javax.swing.JButton bStop20;
    private javax.swing.JButton bStop21;
    private javax.swing.JButton bStop22;
    private javax.swing.JButton bStop23;
    private javax.swing.JButton bStop24;
    private javax.swing.JButton bStop3;
    private javax.swing.JButton bStop4;
    private javax.swing.JButton bStop5;
    private javax.swing.JButton bStop6;
    private javax.swing.JButton bStop7;
    private javax.swing.JButton bStop8;
    private javax.swing.JButton bStop9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListC;
    private javax.swing.JList jListN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel seg1;
    private javax.swing.JLabel seg10;
    private javax.swing.JLabel seg11;
    private javax.swing.JLabel seg12;
    private javax.swing.JLabel seg13;
    private javax.swing.JLabel seg14;
    private javax.swing.JLabel seg15;
    private javax.swing.JLabel seg16;
    private javax.swing.JLabel seg17;
    private javax.swing.JLabel seg18;
    private javax.swing.JLabel seg19;
    private javax.swing.JLabel seg2;
    private javax.swing.JLabel seg20;
    private javax.swing.JLabel seg21;
    private javax.swing.JLabel seg22;
    private javax.swing.JLabel seg23;
    private javax.swing.JLabel seg24;
    private javax.swing.JLabel seg3;
    private javax.swing.JLabel seg4;
    private javax.swing.JLabel seg5;
    private javax.swing.JLabel seg6;
    private javax.swing.JLabel seg7;
    private javax.swing.JLabel seg8;
    private javax.swing.JLabel seg9;
    private javax.swing.JLabel tm1;
    private javax.swing.JLabel tm10;
    private javax.swing.JLabel tm11;
    private javax.swing.JLabel tm12;
    private javax.swing.JLabel tm13;
    private javax.swing.JLabel tm14;
    private javax.swing.JLabel tm15;
    private javax.swing.JLabel tm16;
    private javax.swing.JLabel tm17;
    private javax.swing.JLabel tm18;
    private javax.swing.JLabel tm19;
    private javax.swing.JLabel tm2;
    private javax.swing.JLabel tm20;
    private javax.swing.JLabel tm21;
    private javax.swing.JLabel tm22;
    private javax.swing.JLabel tm23;
    private javax.swing.JLabel tm24;
    private javax.swing.JLabel tm3;
    private javax.swing.JLabel tm4;
    private javax.swing.JLabel tm5;
    private javax.swing.JLabel tm6;
    private javax.swing.JLabel tm7;
    private javax.swing.JLabel tm8;
    private javax.swing.JLabel tm9;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
