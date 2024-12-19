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
 * @author BHAdmin
 */
public class lab2 extends javax.swing.JFrame {
String []Datos1= new String[100];
String []Datos2= new String[100];
String []Datos3= new String[100];
String []Datos4= new String[100];
String []Datos5= new String[100];
String []Datos6= new String[100];
String []Datos7= new String[100];
String []Datos8= new String[100];
String []Datos9= new String[100];
String []Datos10= new String[100];
String []Datos11= new String[100];
String []Datos12= new String[100];
String []Datos13= new String[100];
String []Datos14= new String[100];
String []Datos15= new String[100];
String []Datos16= new String[100];
String []Datos17= new String[100];
String []Datos18= new String[100];
String []Datos19= new String[100];
String []Datos20= new String[100];
String []Datos21= new String[100];
String []Datos22= new String[100];
String []Datos23= new String[100];
String []Datos24= new String[100];
Formulario1 f= new Formulario1();
    /**
     * Creates new form lab2
     */
    public lab2() {
        initComponents();
        this.setLocationRelativeTo(null);
        t= new Timer(10, acciones);
        t1= new Timer(10,acciones1 );
        t2=new Timer (10,acciones2);
        t3= new Timer(10, acciones3);
        t4= new Timer(10,acciones4 );
        t5=new Timer (10,acciones5);
        t6= new Timer(10, acciones6);
        t7= new Timer(10,acciones7);
        t8=new Timer (10,acciones8);
        t9= new Timer(10, acciones9);
        t10= new Timer(10,acciones10);
        t11=new Timer (10,acciones11);
        t12= new Timer(10, acciones12);
        t13= new Timer(10,acciones13);
        t14=new Timer (10,acciones14);
        t15= new Timer(10, acciones15);
        t16= new Timer(10,acciones16);
        t17=new Timer (10,acciones17);
        t18= new Timer(10, acciones18);
        t19= new Timer(10,acciones19);
        t20=new Timer (10,acciones20);
        t21= new Timer(10, acciones21);
        t22= new Timer(10,acciones22);
        t23=new Timer (10,acciones23);
        finish.setEnabled(false);
        finish1.setEnabled(false);
    }
private Timer t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23;
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
private ActionListener acciones1 = new ActionListener(){
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
private ActionListener acciones2= new ActionListener(){
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
private ActionListener acciones3= new ActionListener(){
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
private ActionListener acciones4 = new ActionListener(){
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
private ActionListener acciones5= new ActionListener(){
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
        };private ActionListener acciones6= new ActionListener(){
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
        private ActionListener acciones7= new ActionListener(){
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
        private ActionListener acciones8= new ActionListener(){
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
        private ActionListener acciones9= new ActionListener(){
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
        private ActionListener acciones10= new ActionListener(){
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
        private ActionListener acciones11 = new ActionListener(){
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
        private ActionListener acciones12 = new ActionListener(){
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
        private ActionListener acciones13= new ActionListener(){
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
        private ActionListener acciones14 = new ActionListener(){
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
        private ActionListener acciones15 = new ActionListener(){
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
        private ActionListener acciones16 = new ActionListener(){
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
        private ActionListener acciones17= new ActionListener(){
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
        private ActionListener acciones18= new ActionListener(){
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
        private ActionListener acciones19= new ActionListener(){
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
        private ActionListener acciones20= new ActionListener(){
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
        private ActionListener acciones21= new ActionListener(){
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
        private ActionListener acciones22= new ActionListener(){
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
        private ActionListener acciones23 = new ActionListener(){
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel13 = new javax.swing.JLabel();
        Pocision2 = new javax.swing.JTextField();
        Icono2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Int2 = new javax.swing.JTextField();
        Reloj3 = new javax.swing.JTextField();
        comenzar2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Pause2 = new javax.swing.JButton();
        estado2 = new javax.swing.JButton();
        finish2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Pocision3 = new javax.swing.JTextField();
        Icono3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Nombre3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Int3 = new javax.swing.JTextField();
        Reloj4 = new javax.swing.JTextField();
        comenzar3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        Pause3 = new javax.swing.JButton();
        estado3 = new javax.swing.JButton();
        finish3 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Pocision4 = new javax.swing.JTextField();
        Icono4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Nombre4 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Int4 = new javax.swing.JTextField();
        Reloj5 = new javax.swing.JTextField();
        comenzar4 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        Pause4 = new javax.swing.JButton();
        estado4 = new javax.swing.JButton();
        finish4 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Pocision5 = new javax.swing.JTextField();
        Icono5 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Nombre5 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Int5 = new javax.swing.JTextField();
        Reloj6 = new javax.swing.JTextField();
        comenzar5 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        Pause5 = new javax.swing.JButton();
        estado5 = new javax.swing.JButton();
        finish5 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Pocision6 = new javax.swing.JTextField();
        Icono6 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Nombre6 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Int6 = new javax.swing.JTextField();
        Reloj7 = new javax.swing.JTextField();
        comenzar6 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        Pause6 = new javax.swing.JButton();
        estado6 = new javax.swing.JButton();
        finish6 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        Pocision7 = new javax.swing.JTextField();
        Icono7 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Nombre7 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        Int7 = new javax.swing.JTextField();
        Reloj8 = new javax.swing.JTextField();
        comenzar7 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        Pause7 = new javax.swing.JButton();
        estado7 = new javax.swing.JButton();
        finish7 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Pocision14 = new javax.swing.JTextField();
        Icono14 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Nombre8 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Int8 = new javax.swing.JTextField();
        Reloj15 = new javax.swing.JTextField();
        comenzar14 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        Pause14 = new javax.swing.JButton();
        estado14 = new javax.swing.JButton();
        finish14 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        Pocision15 = new javax.swing.JTextField();
        Icono15 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        Nombre9 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        Int9 = new javax.swing.JTextField();
        Reloj16 = new javax.swing.JTextField();
        comenzar15 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        Pause15 = new javax.swing.JButton();
        estado15 = new javax.swing.JButton();
        finish15 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        Pocision22 = new javax.swing.JTextField();
        Icono22 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        Nombre10 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        Int10 = new javax.swing.JTextField();
        Reloj23 = new javax.swing.JTextField();
        comenzar22 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        Pause22 = new javax.swing.JButton();
        estado22 = new javax.swing.JButton();
        finish22 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        Pocision23 = new javax.swing.JTextField();
        Icono23 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        Nombre11 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        Int11 = new javax.swing.JTextField();
        Reloj24 = new javax.swing.JTextField();
        comenzar23 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        Pause23 = new javax.swing.JButton();
        estado23 = new javax.swing.JButton();
        finish23 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        Pocision12 = new javax.swing.JTextField();
        Icono12 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        Nombre12 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        Int12 = new javax.swing.JTextField();
        Reloj13 = new javax.swing.JTextField();
        comenzar12 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        Pause12 = new javax.swing.JButton();
        estado12 = new javax.swing.JButton();
        finish12 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        Pocision13 = new javax.swing.JTextField();
        Icono13 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        Nombre13 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        Int13 = new javax.swing.JTextField();
        Reloj14 = new javax.swing.JTextField();
        comenzar13 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        Pause13 = new javax.swing.JButton();
        estado13 = new javax.swing.JButton();
        finish13 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        Pocision10 = new javax.swing.JTextField();
        Icono10 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        Nombre14 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        Int14 = new javax.swing.JTextField();
        Reloj11 = new javax.swing.JTextField();
        comenzar10 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        Pause10 = new javax.swing.JButton();
        estado10 = new javax.swing.JButton();
        finish10 = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        Pocision11 = new javax.swing.JTextField();
        Icono11 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        Nombre15 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        Int15 = new javax.swing.JTextField();
        Reloj12 = new javax.swing.JTextField();
        comenzar11 = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        Pause11 = new javax.swing.JButton();
        estado11 = new javax.swing.JButton();
        finish11 = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        Pocision8 = new javax.swing.JTextField();
        Icono8 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        Nombre16 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        Int16 = new javax.swing.JTextField();
        Reloj9 = new javax.swing.JTextField();
        comenzar8 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        Pause8 = new javax.swing.JButton();
        estado8 = new javax.swing.JButton();
        finish8 = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        Pocision9 = new javax.swing.JTextField();
        Icono9 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        Nombre17 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        Int17 = new javax.swing.JTextField();
        Reloj10 = new javax.swing.JTextField();
        comenzar9 = new javax.swing.JButton();
        jLabel107 = new javax.swing.JLabel();
        Pause9 = new javax.swing.JButton();
        estado9 = new javax.swing.JButton();
        finish9 = new javax.swing.JButton();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        Pocision16 = new javax.swing.JTextField();
        Icono16 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        Nombre18 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        Int18 = new javax.swing.JTextField();
        Reloj17 = new javax.swing.JTextField();
        comenzar16 = new javax.swing.JButton();
        jLabel113 = new javax.swing.JLabel();
        Pause16 = new javax.swing.JButton();
        estado16 = new javax.swing.JButton();
        finish16 = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        Pocision17 = new javax.swing.JTextField();
        Icono17 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        Nombre19 = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        Int19 = new javax.swing.JTextField();
        Reloj18 = new javax.swing.JTextField();
        comenzar17 = new javax.swing.JButton();
        jLabel119 = new javax.swing.JLabel();
        Pause17 = new javax.swing.JButton();
        estado17 = new javax.swing.JButton();
        finish17 = new javax.swing.JButton();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        Pocision18 = new javax.swing.JTextField();
        Icono18 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        Nombre20 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        Int20 = new javax.swing.JTextField();
        Reloj19 = new javax.swing.JTextField();
        comenzar18 = new javax.swing.JButton();
        jLabel125 = new javax.swing.JLabel();
        Pause18 = new javax.swing.JButton();
        estado18 = new javax.swing.JButton();
        finish18 = new javax.swing.JButton();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        Pocision19 = new javax.swing.JTextField();
        Icono19 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        Nombre21 = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        Int21 = new javax.swing.JTextField();
        Reloj20 = new javax.swing.JTextField();
        comenzar19 = new javax.swing.JButton();
        jLabel131 = new javax.swing.JLabel();
        Pause19 = new javax.swing.JButton();
        estado19 = new javax.swing.JButton();
        finish19 = new javax.swing.JButton();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        Pocision20 = new javax.swing.JTextField();
        Icono20 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        Nombre22 = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        Int22 = new javax.swing.JTextField();
        Reloj21 = new javax.swing.JTextField();
        comenzar20 = new javax.swing.JButton();
        jLabel137 = new javax.swing.JLabel();
        Pause20 = new javax.swing.JButton();
        estado20 = new javax.swing.JButton();
        finish20 = new javax.swing.JButton();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        Pocision21 = new javax.swing.JTextField();
        Icono21 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        Nombre23 = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        Int23 = new javax.swing.JTextField();
        Reloj22 = new javax.swing.JTextField();
        comenzar21 = new javax.swing.JButton();
        jLabel143 = new javax.swing.JLabel();
        Pause21 = new javax.swing.JButton();
        estado21 = new javax.swing.JButton();
        finish21 = new javax.swing.JButton();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        jPanel2.setFocusCycleRoot(true);
        jPanel2.setMaximumSize(new java.awt.Dimension(1200000000, 1200000000));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 300));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Equipo; ");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 30));

        Pocision.setEditable(false);
        Pocision.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision.setText("1");
        jPanel2.add(Pocision, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 30, 30));

        Icono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 120));

        Nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 150, 30));

        jLabel4.setBackground(new java.awt.Color(102, 102, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Nombre del Usuario; ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, 30));

        jLabel5.setBackground(new java.awt.Color(255, 102, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 230, 30));

        Int.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 60, 30));

        Reloj1.setEditable(false);
        Reloj1.setBackground(new java.awt.Color(0, 0, 0));
        Reloj1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj1.setForeground(new java.awt.Color(0, 255, 0));
        Reloj1.setText("00 :  00  :  00  :  00");
        Reloj1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 130, -1));

        comenzar.setBackground(new java.awt.Color(255, 255, 0));
        comenzar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar.setText("COMENZAR");
        comenzar.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 120, -1));

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("H   :  Min:    S  :  CS");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 20));

        Pause.setBackground(new java.awt.Color(255, 153, 0));
        Pause.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause.setText("PAUSAR");
        Pause.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseActionPerformed(evt);
            }
        });
        jPanel2.add(Pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 120, 20));

        estado.setBackground(new java.awt.Color(0, 255, 0));
        estado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado.setText("Normal");
        estado.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 160, 50));

        finish.setBackground(new java.awt.Color(0, 255, 255));
        finish.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish.setText("Finalizar ");
        finish.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        jPanel2.add(finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 130, 40));

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        mayor.setBackground(new java.awt.Color(255, 51, 153));
        mayor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mayor.setText("Para mayor informacion");
        mayor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 204), new java.awt.Color(102, 0, 102), new java.awt.Color(255, 51, 255), new java.awt.Color(255, 0, 255)));
        mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayorActionPerformed(evt);
            }
        });
        jPanel2.add(mayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 40));

        jLabel7.setBackground(new java.awt.Color(51, 255, 255));
        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setText("Equipo; ");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 30));

        Pocision1.setEditable(false);
        Pocision1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision1.setText("2");
        jPanel2.add(Pocision1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 30, 30));

        Icono1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 100, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 140, 120));

        Nombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 150, 30));

        jLabel9.setBackground(new java.awt.Color(102, 102, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Nombre del Usuario; ");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 140, 30));

        jLabel10.setBackground(new java.awt.Color(255, 102, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 230, 30));

        Int1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 60, 30));

        Reloj2.setEditable(false);
        Reloj2.setBackground(new java.awt.Color(0, 0, 0));
        Reloj2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj2.setForeground(new java.awt.Color(0, 255, 0));
        Reloj2.setText("00 :  00  :  00  :  00");
        Reloj2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 130, -1));

        comenzar1.setBackground(new java.awt.Color(255, 255, 0));
        comenzar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar1.setText("COMENZAR");
        comenzar1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar1ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 120, -1));

        jLabel11.setBackground(new java.awt.Color(0, 204, 204));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("H   :  Min:    S  :  CS");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 130, 20));

        Pause1.setBackground(new java.awt.Color(255, 153, 0));
        Pause1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause1.setText("PAUSAR");
        Pause1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause1ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 120, 20));

        estado1.setBackground(new java.awt.Color(0, 255, 0));
        estado1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado1.setText("Normal");
        estado1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 160, 50));

        finish1.setBackground(new java.awt.Color(0, 255, 255));
        finish1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish1.setText("Finalizar ");
        finish1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish1ActionPerformed(evt);
            }
        });
        jPanel2.add(finish1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 130, 40));

        jLabel12.setBackground(new java.awt.Color(153, 51, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel13.setBackground(new java.awt.Color(51, 255, 255));
        jLabel13.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel13.setText("Equipo; ");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, 30));

        Pocision2.setEditable(false);
        Pocision2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision2.setText("3");
        jPanel2.add(Pocision2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 30, 30));

        Icono2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 100, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 140, 120));

        Nombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 150, 30));

        jLabel15.setBackground(new java.awt.Color(102, 102, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Nombre del Usuario; ");
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel15.setOpaque(true);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 140, 30));

        jLabel16.setBackground(new java.awt.Color(255, 102, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel16.setOpaque(true);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 230, 30));

        Int2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 60, 30));

        Reloj3.setEditable(false);
        Reloj3.setBackground(new java.awt.Color(0, 0, 0));
        Reloj3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj3.setForeground(new java.awt.Color(0, 255, 0));
        Reloj3.setText("00 :  00  :  00  :  00");
        Reloj3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 130, -1));

        comenzar2.setBackground(new java.awt.Color(255, 255, 0));
        comenzar2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar2.setText("COMENZAR");
        comenzar2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar2ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 120, -1));

        jLabel17.setBackground(new java.awt.Color(0, 204, 204));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("H   :  Min:    S  :  CS");
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel17.setOpaque(true);
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 130, 20));

        Pause2.setBackground(new java.awt.Color(255, 153, 0));
        Pause2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause2.setText("PAUSAR");
        Pause2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause2ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 120, 20));

        estado2.setBackground(new java.awt.Color(0, 255, 0));
        estado2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado2.setText("Normal");
        estado2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 160, 50));

        finish2.setBackground(new java.awt.Color(0, 255, 255));
        finish2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish2.setText("Finalizar ");
        finish2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish2ActionPerformed(evt);
            }
        });
        jPanel2.add(finish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 130, 40));

        jLabel18.setBackground(new java.awt.Color(153, 51, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel19.setBackground(new java.awt.Color(51, 255, 255));
        jLabel19.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel19.setText("Equipo; ");
        jLabel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel19.setOpaque(true);
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, -1, 30));

        Pocision3.setEditable(false);
        Pocision3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision3.setText("4");
        jPanel2.add(Pocision3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 720, 30, 30));

        Icono3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 750, 100, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 710, 140, 120));

        Nombre3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 720, 150, 30));

        jLabel21.setBackground(new java.awt.Color(102, 102, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("Nombre del Usuario; ");
        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel21.setOpaque(true);
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, 140, 30));

        jLabel22.setBackground(new java.awt.Color(255, 102, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel22.setOpaque(true);
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 750, 230, 30));

        Int3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 750, 60, 30));

        Reloj4.setEditable(false);
        Reloj4.setBackground(new java.awt.Color(0, 0, 0));
        Reloj4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj4.setForeground(new java.awt.Color(0, 255, 0));
        Reloj4.setText("00 :  00  :  00  :  00");
        Reloj4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 780, 130, -1));

        comenzar3.setBackground(new java.awt.Color(255, 255, 0));
        comenzar3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar3.setText("COMENZAR");
        comenzar3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar3ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 780, 120, -1));

        jLabel23.setBackground(new java.awt.Color(0, 204, 204));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("H   :  Min:    S  :  CS");
        jLabel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel23.setOpaque(true);
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 800, 130, 20));

        Pause3.setBackground(new java.awt.Color(255, 153, 0));
        Pause3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause3.setText("PAUSAR");
        Pause3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause3ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 800, 120, 20));

        estado3.setBackground(new java.awt.Color(0, 255, 0));
        estado3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado3.setText("Normal");
        estado3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 830, 160, 50));

        finish3.setBackground(new java.awt.Color(0, 255, 255));
        finish3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish3.setText("Finalizar ");
        finish3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish3ActionPerformed(evt);
            }
        });
        jPanel2.add(finish3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 840, 130, 40));

        jLabel24.setBackground(new java.awt.Color(153, 51, 0));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, -1, -1));

        jLabel25.setBackground(new java.awt.Color(51, 255, 255));
        jLabel25.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel25.setText("Equipo; ");
        jLabel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel25.setOpaque(true);
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 910, -1, 30));

        Pocision4.setEditable(false);
        Pocision4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision4.setText("5");
        jPanel2.add(Pocision4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 910, 30, 30));

        Icono4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 940, 100, 40));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 900, 140, 120));

        Nombre4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 910, 150, 30));

        jLabel27.setBackground(new java.awt.Color(102, 102, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setText("Nombre del Usuario; ");
        jLabel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel27.setOpaque(true);
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 910, 140, 30));

        jLabel28.setBackground(new java.awt.Color(255, 102, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel28.setOpaque(true);
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 940, 230, 30));

        Int4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 940, 60, 30));

        Reloj5.setEditable(false);
        Reloj5.setBackground(new java.awt.Color(0, 0, 0));
        Reloj5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj5.setForeground(new java.awt.Color(0, 255, 0));
        Reloj5.setText("00 :  00  :  00  :  00");
        Reloj5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 970, 130, -1));

        comenzar4.setBackground(new java.awt.Color(255, 255, 0));
        comenzar4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar4.setText("COMENZAR");
        comenzar4.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar4ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 970, 120, -1));

        jLabel29.setBackground(new java.awt.Color(0, 204, 204));
        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setText("H   :  Min:    S  :  CS");
        jLabel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel29.setOpaque(true);
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 990, 130, 20));

        Pause4.setBackground(new java.awt.Color(255, 153, 0));
        Pause4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause4.setText("PAUSAR");
        Pause4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause4ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 990, 120, 20));

        estado4.setBackground(new java.awt.Color(0, 255, 0));
        estado4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado4.setText("Normal");
        estado4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1020, 160, 50));

        finish4.setBackground(new java.awt.Color(0, 255, 255));
        finish4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish4.setText("Finalizar ");
        finish4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish4ActionPerformed(evt);
            }
        });
        jPanel2.add(finish4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1030, 130, 40));

        jLabel30.setBackground(new java.awt.Color(153, 51, 0));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel30.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 890, -1, -1));

        jLabel31.setBackground(new java.awt.Color(51, 255, 255));
        jLabel31.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel31.setText("Equipo; ");
        jLabel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel31.setOpaque(true);
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1110, -1, 30));

        Pocision5.setEditable(false);
        Pocision5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision5.setText("6");
        jPanel2.add(Pocision5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1110, 30, 30));

        Icono5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1140, 100, 40));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1100, 140, 120));

        Nombre5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1110, 150, 30));

        jLabel33.setBackground(new java.awt.Color(102, 102, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel33.setText("Nombre del Usuario; ");
        jLabel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel33.setOpaque(true);
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1110, 140, 30));

        jLabel34.setBackground(new java.awt.Color(255, 102, 255));
        jLabel34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel34.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel34.setOpaque(true);
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1140, 230, 30));

        Int5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1140, 60, 30));

        Reloj6.setEditable(false);
        Reloj6.setBackground(new java.awt.Color(0, 0, 0));
        Reloj6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj6.setForeground(new java.awt.Color(0, 255, 0));
        Reloj6.setText("00 :  00  :  00  :  00");
        Reloj6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1170, 130, -1));

        comenzar5.setBackground(new java.awt.Color(255, 255, 0));
        comenzar5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar5.setText("COMENZAR");
        comenzar5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar5ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1170, 120, -1));

        jLabel35.setBackground(new java.awt.Color(0, 204, 204));
        jLabel35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel35.setText("H   :  Min:    S  :  CS");
        jLabel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel35.setOpaque(true);
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1190, 130, 20));

        Pause5.setBackground(new java.awt.Color(255, 153, 0));
        Pause5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause5.setText("PAUSAR");
        Pause5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause5ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1190, 120, 20));

        estado5.setBackground(new java.awt.Color(0, 255, 0));
        estado5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado5.setText("Normal");
        estado5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1220, 160, 50));

        finish5.setBackground(new java.awt.Color(0, 255, 255));
        finish5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish5.setText("Finalizar ");
        finish5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish5ActionPerformed(evt);
            }
        });
        jPanel2.add(finish5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1230, 130, 40));

        jLabel36.setBackground(new java.awt.Color(153, 51, 0));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel36.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1090, -1, -1));

        jLabel37.setBackground(new java.awt.Color(51, 255, 255));
        jLabel37.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel37.setText("Equipo; ");
        jLabel37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel37.setOpaque(true);
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1300, -1, 30));

        Pocision6.setEditable(false);
        Pocision6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision6.setText("7");
        jPanel2.add(Pocision6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1300, 30, 30));

        Icono6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1330, 100, 40));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1290, 140, 120));

        Nombre6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1300, 150, 30));

        jLabel39.setBackground(new java.awt.Color(102, 102, 255));
        jLabel39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel39.setText("Nombre del Usuario; ");
        jLabel39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel39.setOpaque(true);
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1300, 140, 30));

        jLabel40.setBackground(new java.awt.Color(255, 102, 255));
        jLabel40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel40.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel40.setOpaque(true);
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1330, 230, 30));

        Int6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1330, 60, 30));

        Reloj7.setEditable(false);
        Reloj7.setBackground(new java.awt.Color(0, 0, 0));
        Reloj7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj7.setForeground(new java.awt.Color(0, 255, 0));
        Reloj7.setText("00 :  00  :  00  :  00");
        Reloj7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1360, 130, -1));

        comenzar6.setBackground(new java.awt.Color(255, 255, 0));
        comenzar6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar6.setText("COMENZAR");
        comenzar6.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar6ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1360, 120, -1));

        jLabel41.setBackground(new java.awt.Color(0, 204, 204));
        jLabel41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel41.setText("H   :  Min:    S  :  CS");
        jLabel41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel41.setOpaque(true);
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1380, 130, 20));

        Pause6.setBackground(new java.awt.Color(255, 153, 0));
        Pause6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause6.setText("PAUSAR");
        Pause6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause6ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1380, 120, 20));

        estado6.setBackground(new java.awt.Color(0, 255, 0));
        estado6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado6.setText("Normal");
        estado6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1410, 160, 50));

        finish6.setBackground(new java.awt.Color(0, 255, 255));
        finish6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish6.setText("Finalizar ");
        finish6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish6ActionPerformed(evt);
            }
        });
        jPanel2.add(finish6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1420, 130, 40));

        jLabel42.setBackground(new java.awt.Color(153, 51, 0));
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel42.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1280, -1, -1));

        jLabel43.setBackground(new java.awt.Color(51, 255, 255));
        jLabel43.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel43.setText("Equipo; ");
        jLabel43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel43.setOpaque(true);
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1500, -1, 30));

        Pocision7.setEditable(false);
        Pocision7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision7.setText("8");
        Pocision7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pocision7ActionPerformed(evt);
            }
        });
        jPanel2.add(Pocision7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1500, 30, 30));

        Icono7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1530, 100, 40));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1490, 140, 120));

        Nombre7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1500, 150, 30));

        jLabel45.setBackground(new java.awt.Color(102, 102, 255));
        jLabel45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel45.setText("Nombre del Usuario; ");
        jLabel45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel45.setOpaque(true);
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1500, 140, 30));

        jLabel46.setBackground(new java.awt.Color(255, 102, 255));
        jLabel46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel46.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel46.setOpaque(true);
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1530, 230, 30));

        Int7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1530, 60, 30));

        Reloj8.setEditable(false);
        Reloj8.setBackground(new java.awt.Color(0, 0, 0));
        Reloj8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj8.setForeground(new java.awt.Color(0, 255, 0));
        Reloj8.setText("00 :  00  :  00  :  00");
        Reloj8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1560, 130, -1));

        comenzar7.setBackground(new java.awt.Color(255, 255, 0));
        comenzar7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar7.setText("COMENZAR");
        comenzar7.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar7ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1560, 120, -1));

        jLabel47.setBackground(new java.awt.Color(0, 204, 204));
        jLabel47.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel47.setText("H   :  Min:    S  :  CS");
        jLabel47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel47.setOpaque(true);
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1580, 130, 20));

        Pause7.setBackground(new java.awt.Color(255, 153, 0));
        Pause7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause7.setText("PAUSAR");
        Pause7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause7ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1580, 120, 20));

        estado7.setBackground(new java.awt.Color(0, 255, 0));
        estado7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado7.setText("Normal");
        estado7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1610, 160, 50));

        finish7.setBackground(new java.awt.Color(0, 255, 255));
        finish7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish7.setText("Finalizar ");
        finish7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish7ActionPerformed(evt);
            }
        });
        jPanel2.add(finish7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1620, 130, 40));

        jLabel48.setBackground(new java.awt.Color(153, 51, 0));
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel48.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1480, -1, -1));

        jLabel49.setBackground(new java.awt.Color(51, 255, 255));
        jLabel49.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel49.setText("Equipo; ");
        jLabel49.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel49.setOpaque(true);
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 1300, -1, 30));

        Pocision14.setEditable(false);
        Pocision14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision14.setText("15");
        jPanel2.add(Pocision14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 1300, 30, 30));

        Icono14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 1330, 100, 40));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1290, 140, 120));

        Nombre8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1300, 150, 30));

        jLabel51.setBackground(new java.awt.Color(102, 102, 255));
        jLabel51.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel51.setText("Nombre del Usuario; ");
        jLabel51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel51.setOpaque(true);
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1300, 140, 30));

        jLabel52.setBackground(new java.awt.Color(255, 102, 255));
        jLabel52.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel52.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel52.setOpaque(true);
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1330, 230, 30));

        Int8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1330, 60, 30));

        Reloj15.setEditable(false);
        Reloj15.setBackground(new java.awt.Color(0, 0, 0));
        Reloj15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj15.setForeground(new java.awt.Color(0, 255, 0));
        Reloj15.setText("00 :  00  :  00  :  00");
        Reloj15.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1360, 130, -1));

        comenzar14.setBackground(new java.awt.Color(255, 255, 0));
        comenzar14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar14.setText("COMENZAR");
        comenzar14.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar14ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1360, 120, -1));

        jLabel53.setBackground(new java.awt.Color(0, 204, 204));
        jLabel53.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel53.setText("H   :  Min:    S  :  CS");
        jLabel53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel53.setOpaque(true);
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1380, 130, 20));

        Pause14.setBackground(new java.awt.Color(255, 153, 0));
        Pause14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause14.setText("PAUSAR");
        Pause14.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause14ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1380, 120, 20));

        estado14.setBackground(new java.awt.Color(0, 255, 0));
        estado14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado14.setText("Normal");
        estado14.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1410, 160, 50));

        finish14.setBackground(new java.awt.Color(0, 255, 255));
        finish14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish14.setText("Finalizar ");
        finish14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish14ActionPerformed(evt);
            }
        });
        jPanel2.add(finish14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1420, 130, 40));

        jLabel54.setBackground(new java.awt.Color(153, 51, 0));
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel54.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1280, -1, -1));

        jLabel55.setBackground(new java.awt.Color(51, 255, 255));
        jLabel55.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel55.setText("Equipo; ");
        jLabel55.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel55.setOpaque(true);
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 1500, -1, 30));

        Pocision15.setEditable(false);
        Pocision15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision15.setText("16");
        jPanel2.add(Pocision15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 1500, 30, 30));

        Icono15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 1530, 100, 40));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1490, 140, 120));

        Nombre9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1500, 150, 30));

        jLabel57.setBackground(new java.awt.Color(102, 102, 255));
        jLabel57.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel57.setText("Nombre del Usuario; ");
        jLabel57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel57.setOpaque(true);
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1500, 140, 30));

        jLabel58.setBackground(new java.awt.Color(255, 102, 255));
        jLabel58.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel58.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel58.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel58.setOpaque(true);
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1530, 230, 30));

        Int9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1530, 60, 30));

        Reloj16.setEditable(false);
        Reloj16.setBackground(new java.awt.Color(0, 0, 0));
        Reloj16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj16.setForeground(new java.awt.Color(0, 255, 0));
        Reloj16.setText("00 :  00  :  00  :  00");
        Reloj16.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1560, 130, -1));

        comenzar15.setBackground(new java.awt.Color(255, 255, 0));
        comenzar15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar15.setText("COMENZAR");
        comenzar15.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar15ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1560, 120, -1));

        jLabel59.setBackground(new java.awt.Color(0, 204, 204));
        jLabel59.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel59.setText("H   :  Min:    S  :  CS");
        jLabel59.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel59.setOpaque(true);
        jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1580, 130, 20));

        Pause15.setBackground(new java.awt.Color(255, 153, 0));
        Pause15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause15.setText("PAUSAR");
        Pause15.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause15ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1580, 120, 20));

        estado15.setBackground(new java.awt.Color(0, 255, 0));
        estado15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado15.setText("Normal");
        estado15.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1610, 160, 50));

        finish15.setBackground(new java.awt.Color(0, 255, 255));
        finish15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish15.setText("Finalizar ");
        finish15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish15ActionPerformed(evt);
            }
        });
        jPanel2.add(finish15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1620, 130, 40));

        jLabel60.setBackground(new java.awt.Color(153, 51, 0));
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel60.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1480, -1, -1));

        jLabel61.setBackground(new java.awt.Color(51, 255, 255));
        jLabel61.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel61.setText("Equipo; ");
        jLabel61.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel61.setOpaque(true);
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1300, -1, 30));

        Pocision22.setEditable(false);
        Pocision22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision22.setText("23");
        jPanel2.add(Pocision22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 1300, 30, 30));

        Icono22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono22, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1330, 100, 40));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1290, 140, 120));

        Nombre10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 1300, 150, 30));

        jLabel63.setBackground(new java.awt.Color(102, 102, 255));
        jLabel63.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel63.setText("Nombre del Usuario; ");
        jLabel63.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel63.setOpaque(true);
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1300, 140, 30));

        jLabel64.setBackground(new java.awt.Color(255, 102, 255));
        jLabel64.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel64.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel64.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel64.setOpaque(true);
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1330, 230, 30));

        Int10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 1330, 60, 30));

        Reloj23.setEditable(false);
        Reloj23.setBackground(new java.awt.Color(0, 0, 0));
        Reloj23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj23.setForeground(new java.awt.Color(0, 255, 0));
        Reloj23.setText("00 :  00  :  00  :  00");
        Reloj23.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1360, 130, -1));

        comenzar22.setBackground(new java.awt.Color(255, 255, 0));
        comenzar22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar22.setText("COMENZAR");
        comenzar22.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar22ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1360, 120, -1));

        jLabel65.setBackground(new java.awt.Color(0, 204, 204));
        jLabel65.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel65.setText("H   :  Min:    S  :  CS");
        jLabel65.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel65.setOpaque(true);
        jPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1380, 130, 20));

        Pause22.setBackground(new java.awt.Color(255, 153, 0));
        Pause22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause22.setText("PAUSAR");
        Pause22.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause22ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1380, 120, 20));

        estado22.setBackground(new java.awt.Color(0, 255, 0));
        estado22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado22.setText("Normal");
        estado22.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado22, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1410, 160, 50));

        finish22.setBackground(new java.awt.Color(0, 255, 255));
        finish22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish22.setText("Finalizar ");
        finish22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish22ActionPerformed(evt);
            }
        });
        jPanel2.add(finish22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1420, 130, 40));

        jLabel66.setBackground(new java.awt.Color(153, 51, 0));
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel66.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1280, -1, -1));

        jLabel67.setBackground(new java.awt.Color(51, 255, 255));
        jLabel67.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel67.setText("Equipo; ");
        jLabel67.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel67.setOpaque(true);
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1500, -1, 30));

        Pocision23.setEditable(false);
        Pocision23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision23.setText("24");
        jPanel2.add(Pocision23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 1500, 30, 30));

        Icono23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono23, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1530, 100, 40));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1490, 140, 120));

        Nombre11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 1500, 150, 30));

        jLabel69.setBackground(new java.awt.Color(102, 102, 255));
        jLabel69.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel69.setText("Nombre del Usuario; ");
        jLabel69.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel69.setOpaque(true);
        jPanel2.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1500, 140, 30));

        jLabel70.setBackground(new java.awt.Color(255, 102, 255));
        jLabel70.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel70.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel70.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel70.setOpaque(true);
        jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1530, 230, 30));

        Int11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 1530, 60, 30));

        Reloj24.setEditable(false);
        Reloj24.setBackground(new java.awt.Color(0, 0, 0));
        Reloj24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj24.setForeground(new java.awt.Color(0, 255, 0));
        Reloj24.setText("00 :  00  :  00  :  00");
        Reloj24.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1560, 130, -1));

        comenzar23.setBackground(new java.awt.Color(255, 255, 0));
        comenzar23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar23.setText("COMENZAR");
        comenzar23.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar23ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1560, 120, -1));

        jLabel71.setBackground(new java.awt.Color(0, 204, 204));
        jLabel71.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel71.setText("H   :  Min:    S  :  CS");
        jLabel71.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel71.setOpaque(true);
        jPanel2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1580, 130, 20));

        Pause23.setBackground(new java.awt.Color(255, 153, 0));
        Pause23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause23.setText("PAUSAR");
        Pause23.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause23ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1580, 120, 20));

        estado23.setBackground(new java.awt.Color(0, 255, 0));
        estado23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado23.setText("Normal");
        estado23.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado23, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1610, 160, 50));

        finish23.setBackground(new java.awt.Color(0, 255, 255));
        finish23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish23.setText("Finalizar ");
        finish23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish23ActionPerformed(evt);
            }
        });
        jPanel2.add(finish23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1620, 130, 40));

        jLabel72.setBackground(new java.awt.Color(153, 51, 0));
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel72.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1480, -1, -1));

        jLabel73.setBackground(new java.awt.Color(51, 255, 255));
        jLabel73.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel73.setText("Equipo; ");
        jLabel73.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel73.setOpaque(true);
        jPanel2.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 910, -1, 30));

        Pocision12.setEditable(false);
        Pocision12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision12.setText("13");
        jPanel2.add(Pocision12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 910, 30, 30));

        Icono12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 940, 100, 40));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 900, 140, 120));

        Nombre12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 910, 150, 30));

        jLabel75.setBackground(new java.awt.Color(102, 102, 255));
        jLabel75.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel75.setText("Nombre del Usuario; ");
        jLabel75.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel75.setOpaque(true);
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 910, 140, 30));

        jLabel76.setBackground(new java.awt.Color(255, 102, 255));
        jLabel76.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel76.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel76.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel76.setOpaque(true);
        jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 940, 230, 30));

        Int12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 940, 60, 30));

        Reloj13.setEditable(false);
        Reloj13.setBackground(new java.awt.Color(0, 0, 0));
        Reloj13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj13.setForeground(new java.awt.Color(0, 255, 0));
        Reloj13.setText("00 :  00  :  00  :  00");
        Reloj13.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 970, 130, -1));

        comenzar12.setBackground(new java.awt.Color(255, 255, 0));
        comenzar12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar12.setText("COMENZAR");
        comenzar12.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar12ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 970, 120, -1));

        jLabel77.setBackground(new java.awt.Color(0, 204, 204));
        jLabel77.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel77.setText("H   :  Min:    S  :  CS");
        jLabel77.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel77.setOpaque(true);
        jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 990, 130, 20));

        Pause12.setBackground(new java.awt.Color(255, 153, 0));
        Pause12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause12.setText("PAUSAR");
        Pause12.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause12ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 990, 120, 20));

        estado12.setBackground(new java.awt.Color(0, 255, 0));
        estado12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado12.setText("Normal");
        estado12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1020, 160, 50));

        finish12.setBackground(new java.awt.Color(0, 255, 255));
        finish12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish12.setText("Finalizar ");
        finish12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish12ActionPerformed(evt);
            }
        });
        jPanel2.add(finish12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1030, 130, 40));

        jLabel78.setBackground(new java.awt.Color(153, 51, 0));
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel78.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 890, -1, -1));

        jLabel79.setBackground(new java.awt.Color(51, 255, 255));
        jLabel79.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel79.setText("Equipo; ");
        jLabel79.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel79.setOpaque(true);
        jPanel2.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 1110, -1, 30));

        Pocision13.setEditable(false);
        Pocision13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision13.setText("14");
        jPanel2.add(Pocision13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 1110, 30, 30));

        Icono13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 1140, 100, 40));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1100, 140, 120));

        Nombre13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1110, 150, 30));

        jLabel81.setBackground(new java.awt.Color(102, 102, 255));
        jLabel81.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel81.setText("Nombre del Usuario; ");
        jLabel81.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel81.setOpaque(true);
        jPanel2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1110, 140, 30));

        jLabel82.setBackground(new java.awt.Color(255, 102, 255));
        jLabel82.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel82.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel82.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel82.setOpaque(true);
        jPanel2.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1140, 230, 30));

        Int13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1140, 60, 30));

        Reloj14.setEditable(false);
        Reloj14.setBackground(new java.awt.Color(0, 0, 0));
        Reloj14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj14.setForeground(new java.awt.Color(0, 255, 0));
        Reloj14.setText("00 :  00  :  00  :  00");
        Reloj14.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1170, 130, -1));

        comenzar13.setBackground(new java.awt.Color(255, 255, 0));
        comenzar13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar13.setText("COMENZAR");
        comenzar13.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar13ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1170, 120, -1));

        jLabel83.setBackground(new java.awt.Color(0, 204, 204));
        jLabel83.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel83.setText("H   :  Min:    S  :  CS");
        jLabel83.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel83.setOpaque(true);
        jPanel2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1190, 130, 20));

        Pause13.setBackground(new java.awt.Color(255, 153, 0));
        Pause13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause13.setText("PAUSAR");
        Pause13.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause13ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1190, 120, 20));

        estado13.setBackground(new java.awt.Color(0, 255, 0));
        estado13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado13.setText("Normal");
        estado13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1220, 160, 50));

        finish13.setBackground(new java.awt.Color(0, 255, 255));
        finish13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish13.setText("Finalizar ");
        finish13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish13ActionPerformed(evt);
            }
        });
        jPanel2.add(finish13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1230, 130, 40));

        jLabel84.setBackground(new java.awt.Color(153, 51, 0));
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel84.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1090, -1, -1));

        jLabel85.setBackground(new java.awt.Color(51, 255, 255));
        jLabel85.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel85.setText("Equipo; ");
        jLabel85.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel85.setOpaque(true);
        jPanel2.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, -1, 30));

        Pocision10.setEditable(false);
        Pocision10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision10.setText("11");
        jPanel2.add(Pocision10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 30, 30));

        Icono10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 100, 40));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 140, 120));

        Nombre14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, 150, 30));

        jLabel87.setBackground(new java.awt.Color(102, 102, 255));
        jLabel87.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel87.setText("Nombre del Usuario; ");
        jLabel87.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel87.setOpaque(true);
        jPanel2.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 140, 30));

        jLabel88.setBackground(new java.awt.Color(255, 102, 255));
        jLabel88.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel88.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel88.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel88.setOpaque(true);
        jPanel2.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 230, 30));

        Int14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 60, 30));

        Reloj11.setEditable(false);
        Reloj11.setBackground(new java.awt.Color(0, 0, 0));
        Reloj11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj11.setForeground(new java.awt.Color(0, 255, 0));
        Reloj11.setText("00 :  00  :  00  :  00");
        Reloj11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 130, -1));

        comenzar10.setBackground(new java.awt.Color(255, 255, 0));
        comenzar10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar10.setText("COMENZAR");
        comenzar10.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar10ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 120, -1));

        jLabel89.setBackground(new java.awt.Color(0, 204, 204));
        jLabel89.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel89.setText("H   :  Min:    S  :  CS");
        jLabel89.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel89.setOpaque(true);
        jPanel2.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, 130, 20));

        Pause10.setBackground(new java.awt.Color(255, 153, 0));
        Pause10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause10.setText("PAUSAR");
        Pause10.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause10ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 120, 20));

        estado10.setBackground(new java.awt.Color(0, 255, 0));
        estado10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado10.setText("Normal");
        estado10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 160, 50));

        finish10.setBackground(new java.awt.Color(0, 255, 255));
        finish10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish10.setText("Finalizar ");
        finish10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish10ActionPerformed(evt);
            }
        });
        jPanel2.add(finish10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 640, 130, 40));

        jLabel90.setBackground(new java.awt.Color(153, 51, 0));
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel90.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        jLabel91.setBackground(new java.awt.Color(51, 255, 255));
        jLabel91.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel91.setText("Equipo; ");
        jLabel91.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel91.setOpaque(true);
        jPanel2.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 720, -1, 30));

        Pocision11.setEditable(false);
        Pocision11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision11.setText("12");
        jPanel2.add(Pocision11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 720, 30, 30));

        Icono11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 750, 100, 40));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 710, 140, 120));

        Nombre15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 720, 150, 30));

        jLabel93.setBackground(new java.awt.Color(102, 102, 255));
        jLabel93.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel93.setText("Nombre del Usuario; ");
        jLabel93.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel93.setOpaque(true);
        jPanel2.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 720, 140, 30));

        jLabel94.setBackground(new java.awt.Color(255, 102, 255));
        jLabel94.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel94.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel94.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel94.setOpaque(true);
        jPanel2.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 750, 230, 30));

        Int15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 750, 60, 30));

        Reloj12.setEditable(false);
        Reloj12.setBackground(new java.awt.Color(0, 0, 0));
        Reloj12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj12.setForeground(new java.awt.Color(0, 255, 0));
        Reloj12.setText("00 :  00  :  00  :  00");
        Reloj12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 780, 130, -1));

        comenzar11.setBackground(new java.awt.Color(255, 255, 0));
        comenzar11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar11.setText("COMENZAR");
        comenzar11.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar11ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 780, 120, -1));

        jLabel95.setBackground(new java.awt.Color(0, 204, 204));
        jLabel95.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel95.setText("H   :  Min:    S  :  CS");
        jLabel95.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel95.setOpaque(true);
        jPanel2.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 800, 130, 20));

        Pause11.setBackground(new java.awt.Color(255, 153, 0));
        Pause11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause11.setText("PAUSAR");
        Pause11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause11ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 800, 120, 20));

        estado11.setBackground(new java.awt.Color(0, 255, 0));
        estado11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado11.setText("Normal");
        estado11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 830, 160, 50));

        finish11.setBackground(new java.awt.Color(0, 255, 255));
        finish11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish11.setText("Finalizar ");
        finish11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish11ActionPerformed(evt);
            }
        });
        jPanel2.add(finish11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 840, 130, 40));

        jLabel96.setBackground(new java.awt.Color(153, 51, 0));
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel96.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 700, -1, -1));

        jLabel97.setBackground(new java.awt.Color(51, 255, 255));
        jLabel97.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel97.setText("Equipo; ");
        jLabel97.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel97.setOpaque(true);
        jPanel2.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, 30));

        Pocision8.setEditable(false);
        Pocision8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision8.setText("9");
        jPanel2.add(Pocision8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 30, 30));

        Icono8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 100, 40));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 140, 120));

        Nombre16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 150, 30));

        jLabel99.setBackground(new java.awt.Color(102, 102, 255));
        jLabel99.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel99.setText("Nombre del Usuario; ");
        jLabel99.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel99.setOpaque(true);
        jPanel2.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 140, 30));

        jLabel100.setBackground(new java.awt.Color(255, 102, 255));
        jLabel100.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel100.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel100.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel100.setOpaque(true);
        jPanel2.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 230, 30));

        Int16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int16, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 60, 30));

        Reloj9.setEditable(false);
        Reloj9.setBackground(new java.awt.Color(0, 0, 0));
        Reloj9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj9.setForeground(new java.awt.Color(0, 255, 0));
        Reloj9.setText("00 :  00  :  00  :  00");
        Reloj9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 130, -1));

        comenzar8.setBackground(new java.awt.Color(255, 255, 0));
        comenzar8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar8.setText("COMENZAR");
        comenzar8.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar8ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 120, -1));

        jLabel101.setBackground(new java.awt.Color(0, 204, 204));
        jLabel101.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel101.setText("H   :  Min:    S  :  CS");
        jLabel101.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel101.setOpaque(true);
        jPanel2.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 130, 20));

        Pause8.setBackground(new java.awt.Color(255, 153, 0));
        Pause8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause8.setText("PAUSAR");
        Pause8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause8ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 120, 20));

        estado8.setBackground(new java.awt.Color(0, 255, 0));
        estado8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado8.setText("Normal");
        estado8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado8ActionPerformed(evt);
            }
        });
        jPanel2.add(estado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 160, 50));

        finish8.setBackground(new java.awt.Color(0, 255, 255));
        finish8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish8.setText("Finalizar ");
        finish8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish8ActionPerformed(evt);
            }
        });
        jPanel2.add(finish8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 130, 40));

        jLabel102.setBackground(new java.awt.Color(153, 51, 0));
        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel102.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jLabel103.setBackground(new java.awt.Color(51, 255, 255));
        jLabel103.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel103.setText("Equipo; ");
        jLabel103.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel103.setOpaque(true);
        jPanel2.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, 30));

        Pocision9.setEditable(false);
        Pocision9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision9.setText("10");
        jPanel2.add(Pocision9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 30, 30));

        Icono9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 100, 40));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 140, 120));

        Nombre17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre17, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 150, 30));

        jLabel105.setBackground(new java.awt.Color(102, 102, 255));
        jLabel105.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel105.setText("Nombre del Usuario; ");
        jLabel105.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel105.setOpaque(true);
        jPanel2.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 140, 30));

        jLabel106.setBackground(new java.awt.Color(255, 102, 255));
        jLabel106.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel106.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel106.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel106.setOpaque(true);
        jPanel2.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 230, 30));

        Int17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int17, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 60, 30));

        Reloj10.setEditable(false);
        Reloj10.setBackground(new java.awt.Color(0, 0, 0));
        Reloj10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj10.setForeground(new java.awt.Color(0, 255, 0));
        Reloj10.setText("00 :  00  :  00  :  00");
        Reloj10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 130, -1));

        comenzar9.setBackground(new java.awt.Color(255, 255, 0));
        comenzar9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar9.setText("COMENZAR");
        comenzar9.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar9ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 120, -1));

        jLabel107.setBackground(new java.awt.Color(0, 204, 204));
        jLabel107.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel107.setText("H   :  Min:    S  :  CS");
        jLabel107.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel107.setOpaque(true);
        jPanel2.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 130, 20));

        Pause9.setBackground(new java.awt.Color(255, 153, 0));
        Pause9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause9.setText("PAUSAR");
        Pause9.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause9ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 120, 20));

        estado9.setBackground(new java.awt.Color(0, 255, 0));
        estado9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado9.setText("Normal");
        estado9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 160, 50));

        finish9.setBackground(new java.awt.Color(0, 255, 255));
        finish9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish9.setText("Finalizar ");
        finish9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish9ActionPerformed(evt);
            }
        });
        jPanel2.add(finish9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 130, 40));

        jLabel108.setBackground(new java.awt.Color(153, 51, 0));
        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel108.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel109.setBackground(new java.awt.Color(51, 255, 255));
        jLabel109.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel109.setText("Equipo; ");
        jLabel109.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel109.setOpaque(true);
        jPanel2.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, -1, 30));

        Pocision16.setEditable(false);
        Pocision16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision16.setText("17");
        jPanel2.add(Pocision16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 30, 30));

        Icono16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono16, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 160, 100, 40));

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, 140, 120));

        Nombre18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 130, 150, 30));

        jLabel111.setBackground(new java.awt.Color(102, 102, 255));
        jLabel111.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel111.setText("Nombre del Usuario; ");
        jLabel111.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel111.setOpaque(true);
        jPanel2.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 130, 140, 30));

        jLabel112.setBackground(new java.awt.Color(255, 102, 255));
        jLabel112.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel112.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel112.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel112.setOpaque(true);
        jPanel2.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 160, 230, 30));

        Int18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 160, 60, 30));

        Reloj17.setEditable(false);
        Reloj17.setBackground(new java.awt.Color(0, 0, 0));
        Reloj17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj17.setForeground(new java.awt.Color(0, 255, 0));
        Reloj17.setText("00 :  00  :  00  :  00");
        Reloj17.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 190, 130, -1));

        comenzar16.setBackground(new java.awt.Color(255, 255, 0));
        comenzar16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar16.setText("COMENZAR");
        comenzar16.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar16ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 190, 120, -1));

        jLabel113.setBackground(new java.awt.Color(0, 204, 204));
        jLabel113.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel113.setText("H   :  Min:    S  :  CS");
        jLabel113.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel113.setOpaque(true);
        jPanel2.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 210, 130, 20));

        Pause16.setBackground(new java.awt.Color(255, 153, 0));
        Pause16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause16.setText("PAUSAR");
        Pause16.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause16ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 210, 120, 20));

        estado16.setBackground(new java.awt.Color(0, 255, 0));
        estado16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado16.setText("Normal");
        estado16.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado16, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 240, 160, 50));

        finish16.setBackground(new java.awt.Color(0, 255, 255));
        finish16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish16.setText("Finalizar ");
        finish16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish16ActionPerformed(evt);
            }
        });
        jPanel2.add(finish16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 250, 130, 40));

        jLabel114.setBackground(new java.awt.Color(153, 51, 0));
        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel114.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, -1, -1));

        jLabel115.setBackground(new java.awt.Color(51, 255, 255));
        jLabel115.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel115.setText("Equipo; ");
        jLabel115.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel115.setOpaque(true);
        jPanel2.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 330, -1, 30));

        Pocision17.setEditable(false);
        Pocision17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision17.setText("18");
        jPanel2.add(Pocision17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 330, 30, 30));

        Icono17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono17, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 360, 100, 40));

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 140, 120));

        Nombre19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 330, 150, 30));

        jLabel117.setBackground(new java.awt.Color(102, 102, 255));
        jLabel117.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel117.setText("Nombre del Usuario; ");
        jLabel117.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel117.setOpaque(true);
        jPanel2.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 330, 140, 30));

        jLabel118.setBackground(new java.awt.Color(255, 102, 255));
        jLabel118.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel118.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel118.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel118.setOpaque(true);
        jPanel2.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 360, 230, 30));

        Int19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 360, 60, 30));

        Reloj18.setEditable(false);
        Reloj18.setBackground(new java.awt.Color(0, 0, 0));
        Reloj18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj18.setForeground(new java.awt.Color(0, 255, 0));
        Reloj18.setText("00 :  00  :  00  :  00");
        Reloj18.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 390, 130, -1));

        comenzar17.setBackground(new java.awt.Color(255, 255, 0));
        comenzar17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar17.setText("COMENZAR");
        comenzar17.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar17ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 390, 120, -1));

        jLabel119.setBackground(new java.awt.Color(0, 204, 204));
        jLabel119.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel119.setText("H   :  Min:    S  :  CS");
        jLabel119.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel119.setOpaque(true);
        jPanel2.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 410, 130, 20));

        Pause17.setBackground(new java.awt.Color(255, 153, 0));
        Pause17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause17.setText("PAUSAR");
        Pause17.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause17ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 410, 120, 20));

        estado17.setBackground(new java.awt.Color(0, 255, 0));
        estado17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado17.setText("Normal");
        estado17.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado17, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, 160, 50));

        finish17.setBackground(new java.awt.Color(0, 255, 255));
        finish17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish17.setText("Finalizar ");
        finish17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish17ActionPerformed(evt);
            }
        });
        jPanel2.add(finish17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 450, 130, 40));

        jLabel120.setBackground(new java.awt.Color(153, 51, 0));
        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel120.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 310, -1, -1));

        jLabel121.setBackground(new java.awt.Color(51, 255, 255));
        jLabel121.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel121.setText("Equipo; ");
        jLabel121.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel121.setOpaque(true);
        jPanel2.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 520, -1, 30));

        Pocision18.setEditable(false);
        Pocision18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision18.setText("19");
        jPanel2.add(Pocision18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 520, 30, 30));

        Icono18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono18, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, 100, 40));

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, 140, 120));

        Nombre20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 520, 150, 30));

        jLabel123.setBackground(new java.awt.Color(102, 102, 255));
        jLabel123.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel123.setText("Nombre del Usuario; ");
        jLabel123.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel123.setOpaque(true);
        jPanel2.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 520, 140, 30));

        jLabel124.setBackground(new java.awt.Color(255, 102, 255));
        jLabel124.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel124.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel124.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel124.setOpaque(true);
        jPanel2.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 550, 230, 30));

        Int20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 550, 60, 30));

        Reloj19.setEditable(false);
        Reloj19.setBackground(new java.awt.Color(0, 0, 0));
        Reloj19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj19.setForeground(new java.awt.Color(0, 255, 0));
        Reloj19.setText("00 :  00  :  00  :  00");
        Reloj19.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 580, 130, -1));

        comenzar18.setBackground(new java.awt.Color(255, 255, 0));
        comenzar18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar18.setText("COMENZAR");
        comenzar18.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar18ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 580, 120, -1));

        jLabel125.setBackground(new java.awt.Color(0, 204, 204));
        jLabel125.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel125.setText("H   :  Min:    S  :  CS");
        jLabel125.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel125.setOpaque(true);
        jPanel2.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 600, 130, 20));

        Pause18.setBackground(new java.awt.Color(255, 153, 0));
        Pause18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause18.setText("PAUSAR");
        Pause18.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause18ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 600, 120, 20));

        estado18.setBackground(new java.awt.Color(0, 255, 0));
        estado18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado18.setText("Normal");
        estado18.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado18, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, 160, 50));

        finish18.setBackground(new java.awt.Color(0, 255, 255));
        finish18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish18.setText("Finalizar ");
        finish18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish18ActionPerformed(evt);
            }
        });
        jPanel2.add(finish18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 640, 130, 40));

        jLabel126.setBackground(new java.awt.Color(153, 51, 0));
        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel126.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 500, -1, -1));

        jLabel127.setBackground(new java.awt.Color(51, 255, 255));
        jLabel127.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel127.setText("Equipo; ");
        jLabel127.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel127.setOpaque(true);
        jPanel2.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 720, -1, 30));

        Pocision19.setEditable(false);
        Pocision19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision19.setText("20");
        jPanel2.add(Pocision19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 720, 30, 30));

        Icono19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono19, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 750, 100, 40));

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 710, 140, 120));

        Nombre21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 720, 150, 30));

        jLabel129.setBackground(new java.awt.Color(102, 102, 255));
        jLabel129.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel129.setText("Nombre del Usuario; ");
        jLabel129.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel129.setOpaque(true);
        jPanel2.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 720, 140, 30));

        jLabel130.setBackground(new java.awt.Color(255, 102, 255));
        jLabel130.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel130.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel130.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel130.setOpaque(true);
        jPanel2.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 750, 230, 30));

        Int21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 750, 60, 30));

        Reloj20.setEditable(false);
        Reloj20.setBackground(new java.awt.Color(0, 0, 0));
        Reloj20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj20.setForeground(new java.awt.Color(0, 255, 0));
        Reloj20.setText("00 :  00  :  00  :  00");
        Reloj20.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 780, 130, -1));

        comenzar19.setBackground(new java.awt.Color(255, 255, 0));
        comenzar19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar19.setText("COMENZAR");
        comenzar19.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar19ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 780, 120, -1));

        jLabel131.setBackground(new java.awt.Color(0, 204, 204));
        jLabel131.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel131.setText("H   :  Min:    S  :  CS");
        jLabel131.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel131.setOpaque(true);
        jPanel2.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 800, 130, 20));

        Pause19.setBackground(new java.awt.Color(255, 153, 0));
        Pause19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause19.setText("PAUSAR");
        Pause19.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause19ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 800, 120, 20));

        estado19.setBackground(new java.awt.Color(0, 255, 0));
        estado19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado19.setText("Normal");
        estado19.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado19, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 830, 160, 50));

        finish19.setBackground(new java.awt.Color(0, 255, 255));
        finish19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish19.setText("Finalizar ");
        finish19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish19ActionPerformed(evt);
            }
        });
        jPanel2.add(finish19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 840, 130, 40));

        jLabel132.setBackground(new java.awt.Color(153, 51, 0));
        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel132.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 700, -1, -1));

        jLabel133.setBackground(new java.awt.Color(51, 255, 255));
        jLabel133.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel133.setText("Equipo; ");
        jLabel133.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel133.setOpaque(true);
        jPanel2.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 910, -1, 30));

        Pocision20.setEditable(false);
        Pocision20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision20.setText("21");
        jPanel2.add(Pocision20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 910, 30, 30));

        Icono20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono20, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 940, 100, 40));

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 900, 140, 120));

        Nombre22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 910, 150, 30));

        jLabel135.setBackground(new java.awt.Color(102, 102, 255));
        jLabel135.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel135.setText("Nombre del Usuario; ");
        jLabel135.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel135.setOpaque(true);
        jPanel2.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 910, 140, 30));

        jLabel136.setBackground(new java.awt.Color(255, 102, 255));
        jLabel136.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel136.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel136.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel136.setOpaque(true);
        jPanel2.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 940, 230, 30));

        Int22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 940, 60, 30));

        Reloj21.setEditable(false);
        Reloj21.setBackground(new java.awt.Color(0, 0, 0));
        Reloj21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj21.setForeground(new java.awt.Color(0, 255, 0));
        Reloj21.setText("00 :  00  :  00  :  00");
        Reloj21.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 970, 130, -1));

        comenzar20.setBackground(new java.awt.Color(255, 255, 0));
        comenzar20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar20.setText("COMENZAR");
        comenzar20.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar20ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 970, 120, -1));

        jLabel137.setBackground(new java.awt.Color(0, 204, 204));
        jLabel137.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel137.setText("H   :  Min:    S  :  CS");
        jLabel137.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel137.setOpaque(true);
        jPanel2.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 990, 130, 20));

        Pause20.setBackground(new java.awt.Color(255, 153, 0));
        Pause20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause20.setText("PAUSAR");
        Pause20.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause20ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 990, 120, 20));

        estado20.setBackground(new java.awt.Color(0, 255, 0));
        estado20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado20.setText("Normal");
        estado20.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado20, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1020, 160, 50));

        finish20.setBackground(new java.awt.Color(0, 255, 255));
        finish20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish20.setText("Finalizar ");
        finish20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish20ActionPerformed(evt);
            }
        });
        jPanel2.add(finish20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1030, 130, 40));

        jLabel138.setBackground(new java.awt.Color(153, 51, 0));
        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel138.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 890, -1, -1));

        jLabel139.setBackground(new java.awt.Color(51, 255, 255));
        jLabel139.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel139.setText("Equipo; ");
        jLabel139.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel139.setOpaque(true);
        jPanel2.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1110, -1, 30));

        Pocision21.setEditable(false);
        Pocision21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision21.setText("22");
        jPanel2.add(Pocision21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 1110, 30, 30));

        Icono21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Icono21, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1140, 100, 40));

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel2.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1100, 140, 120));

        Nombre23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Nombre23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 1110, 150, 30));

        jLabel141.setBackground(new java.awt.Color(102, 102, 255));
        jLabel141.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel141.setText("Nombre del Usuario; ");
        jLabel141.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        jLabel141.setOpaque(true);
        jPanel2.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1110, 140, 30));

        jLabel142.setBackground(new java.awt.Color(255, 102, 255));
        jLabel142.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel142.setText("Grado,Grupo,Turno y Especialidad;");
        jLabel142.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        jLabel142.setOpaque(true);
        jPanel2.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1140, 230, 30));

        Int23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(Int23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 1140, 60, 30));

        Reloj22.setEditable(false);
        Reloj22.setBackground(new java.awt.Color(0, 0, 0));
        Reloj22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj22.setForeground(new java.awt.Color(0, 255, 0));
        Reloj22.setText("00 :  00  :  00  :  00");
        Reloj22.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel2.add(Reloj22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1170, 130, -1));

        comenzar21.setBackground(new java.awt.Color(255, 255, 0));
        comenzar21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar21.setText("COMENZAR");
        comenzar21.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar21ActionPerformed(evt);
            }
        });
        jPanel2.add(comenzar21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1170, 120, -1));

        jLabel143.setBackground(new java.awt.Color(0, 204, 204));
        jLabel143.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel143.setText("H   :  Min:    S  :  CS");
        jLabel143.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        jLabel143.setOpaque(true);
        jPanel2.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1190, 130, 20));

        Pause21.setBackground(new java.awt.Color(255, 153, 0));
        Pause21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause21.setText("PAUSAR");
        Pause21.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause21ActionPerformed(evt);
            }
        });
        jPanel2.add(Pause21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1190, 120, 20));

        estado21.setBackground(new java.awt.Color(0, 255, 0));
        estado21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado21.setText("Normal");
        estado21.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel2.add(estado21, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1220, 160, 50));

        finish21.setBackground(new java.awt.Color(0, 255, 255));
        finish21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish21.setText("Finalizar ");
        finish21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish21ActionPerformed(evt);
            }
        });
        jPanel2.add(finish21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1230, 130, 40));

        jLabel144.setBackground(new java.awt.Color(153, 51, 0));
        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel144.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel2.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1090, -1, -1));

        jLabel145.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 0, 255));
        jLabel145.setText("LABORATORIO 2");
        jPanel2.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        Nombre1.setEditable(false);
        Int1.setBackground(Color.yellow);
        Int1.setEditable(false);
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

    private void comenzar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar2ActionPerformed
        // TODO add your handling code here:
      t2.start();
        Nombre2.setBackground(Color.yellow);
        Nombre2.setEditable(false);
        Int2.setBackground(Color.yellow);
        Int2.setEditable(false);
        Icono2.setText("OCUPADA");
        comenzar2.setEnabled(false);
        Pause2.setEnabled(true);
    }//GEN-LAST:event_comenzar2ActionPerformed

    private void Pause2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause2ActionPerformed
        // TODO add your handling code here:
        t2.stop();
        Pause2.setEnabled(false);
        comenzar2.setText("Reanudar");
        finish2.setEnabled(true);
        comenzar2.setEnabled(true);
    }//GEN-LAST:event_Pause2ActionPerformed

    private void finish2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish2ActionPerformed
        // TODO add your handling code here:
        t2.stop();
        Datos3[0]=Pocision2.getText();
        Datos3[1]=Nombre2.getText();
        Datos3[2]=Int2.getText();
        Datos3[3]=Reloj3.getText();
        f.dtm.addRow(Datos3);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[2]=0;m[2]=0;s[2]=0;cs[2]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish2ActionPerformed

    private void comenzar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar3ActionPerformed
        // TODO add your handling code here:
      t3.start();
        Nombre3.setBackground(Color.yellow);
        Nombre3.setEditable(false);
        Int3.setBackground(Color.yellow);
        Int3.setEditable(false);
        Icono3.setText("OCUPADA");
        comenzar3.setEnabled(false);
        Pause3.setEnabled(true);
    }//GEN-LAST:event_comenzar3ActionPerformed

    private void Pause3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause3ActionPerformed
        // TODO add your handling code here:
        t3.stop();
        Pause3.setEnabled(false);
        comenzar3.setText("Reanudar");
        finish3.setEnabled(true);
        comenzar3.setEnabled(true);
    }//GEN-LAST:event_Pause3ActionPerformed

    private void finish3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish3ActionPerformed
        // TODO add your handling code here:
        t3.stop();
        Datos4[0]=Pocision3.getText();
        Datos4[1]=Nombre3.getText();
        Datos4[2]=Int3.getText();
        Datos4[3]=Reloj4.getText();
        f.dtm.addRow(Datos4);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[3]=0;m[3]=0;s[3]=0;cs[3]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish3ActionPerformed

    private void comenzar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar4ActionPerformed
        // TODO add your handling code here:
         t4.start();
        Nombre4.setBackground(Color.yellow);
        Nombre4.setEditable(false);
        Int4.setBackground(Color.yellow);
        Int4.setEditable(false);
        Icono4.setText("OCUPADA");
        comenzar4.setEnabled(false);
        Pause4.setEnabled(true);
    }//GEN-LAST:event_comenzar4ActionPerformed

    private void Pause4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause4ActionPerformed
        // TODO add your handling code here:
        t4.stop();
        Pause4.setEnabled(false);
        comenzar4.setText("Reanudar");
        finish4.setEnabled(true);
        comenzar4.setEnabled(true);
    }//GEN-LAST:event_Pause4ActionPerformed

    private void finish4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish4ActionPerformed
        // TODO add your handling code here:
        t4.stop();
        Datos5[0]=Pocision4.getText();
        Datos5[1]=Nombre4.getText();
        Datos5[2]=Int4.getText();
        Datos5[3]=Reloj5.getText();
        f.dtm.addRow(Datos5);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[4]=0;m[4]=0;s[4]=0;cs[4]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish4ActionPerformed

    private void comenzar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar5ActionPerformed
        // TODO add your handling code here:
        t5.start();
        Nombre5.setBackground(Color.yellow);
        Nombre5.setEditable(false);
        Int5.setBackground(Color.yellow);
        Int5.setEditable(false);
        Icono5.setText("OCUPADA");
        comenzar5.setEnabled(false);
        Pause5.setEnabled(true);
    }//GEN-LAST:event_comenzar5ActionPerformed

    private void Pause5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause5ActionPerformed
        // TODO add your handling code here:
        t5.stop();
        Pause5.setEnabled(false);
        comenzar5.setText("Reanudar");
        finish5.setEnabled(true);
        comenzar5.setEnabled(true);
    }//GEN-LAST:event_Pause5ActionPerformed

    private void finish5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish5ActionPerformed
        // TODO add your handling code here:
        t5.stop();
        Datos6[0]=Pocision5.getText();
        Datos6[1]=Nombre5.getText();
        Datos6[2]=Int5.getText();
        Datos6[3]=Reloj6.getText();
        f.dtm.addRow(Datos6);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[5]=0;m[5]=0;s[5]=0;cs[5]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish5ActionPerformed

    private void comenzar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar6ActionPerformed
        // TODO add your handling code here:
        t6.start();
        Nombre6.setBackground(Color.yellow);
        Nombre6.setEditable(false);
        Int6.setBackground(Color.yellow);
        Int6.setEditable(false);
        Icono6.setText("OCUPADA");
        comenzar6.setEnabled(false);
        Pause6.setEnabled(true);
    }//GEN-LAST:event_comenzar6ActionPerformed

    private void Pause6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause6ActionPerformed
        // TODO add your handling code here:t1.stop();
        Pause6.setEnabled(false);
        comenzar6.setText("Reanudar");
        finish6.setEnabled(true);
        comenzar6.setEnabled(true);
    }//GEN-LAST:event_Pause6ActionPerformed

    private void finish6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish6ActionPerformed
        // TODO add your handling code here:
        t6.stop();
        Datos7[0]=Pocision6.getText();
        Datos7[1]=Nombre6.getText();
        Datos7[2]=Int6.getText();
        Datos7[3]=Reloj7.getText();
        f.dtm.addRow(Datos7);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[6]=0;m[6]=0;s[6]=0;cs[6]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish6ActionPerformed

    private void comenzar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar7ActionPerformed
        // TODO add your handling code here:
        t7.start();
        Nombre7.setBackground(Color.yellow);
        Nombre7.setEditable(false);
        Int7.setBackground(Color.yellow);
        Int7.setEditable(false);
        Icono7.setText("OCUPADA");
        comenzar7.setEnabled(false);
        Pause7.setEnabled(true);
    }//GEN-LAST:event_comenzar7ActionPerformed

    private void Pause7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause7ActionPerformed
        // TODO add your handling code here:
        t7.stop();
        Pause7.setEnabled(false);
        comenzar7.setText("Reanudar");
        finish7.setEnabled(true);
        comenzar7.setEnabled(true);
    }//GEN-LAST:event_Pause7ActionPerformed

    private void finish7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish7ActionPerformed
        // TODO add your handling code here:
        t7.stop();
        Datos8[0]=Pocision7.getText();
        Datos8[1]=Nombre7.getText();
        Datos8[2]=Int7.getText();
        Datos8[3]=Reloj8.getText();
        f.dtm.addRow(Datos8);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[7]=0;m[7]=0;s[7]=0;cs[7]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish7ActionPerformed

    private void comenzar14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar14ActionPerformed
        // TODO add your handling code here:
        t14.start();
        Nombre14.setBackground(Color.yellow);
        Nombre14.setEditable(false);
        Int14.setBackground(Color.yellow);
        Int14.setEditable(false);
        Icono10.setText("OCUPADA");
        comenzar14.setEnabled(false);
        Pause14.setEnabled(true);
    }//GEN-LAST:event_comenzar14ActionPerformed

    private void Pause14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause14ActionPerformed
        // TODO add your handling code here:
        t14.stop();
        Pause14.setEnabled(false);
        comenzar14.setText("Reanudar");
        finish14.setEnabled(true);
        comenzar14.setEnabled(true);
    }//GEN-LAST:event_Pause14ActionPerformed

    private void finish14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish14ActionPerformed
        // TODO add your handling code here:
        t14.stop();
        Datos15[0]=Pocision10.getText();
        Datos15[1]=Nombre14.getText();
        Datos15[2]=Int14.getText();
        Datos15[3]=Reloj11.getText();
        f.dtm.addRow(Datos15);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[14]=0;m[14]=0;s[14]=0;cs[14]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish14ActionPerformed

    private void comenzar15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar15ActionPerformed
        // TODO add your handling code here:
        t15.start();
        Nombre15.setBackground(Color.yellow);
        Nombre15.setEditable(false);
        Int15.setBackground(Color.yellow);
        Int15.setEditable(false);
        Icono11.setText("OCUPADA");
        comenzar5.setEnabled(false);
        Pause15.setEnabled(true);
    }//GEN-LAST:event_comenzar15ActionPerformed

    private void Pause15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause15ActionPerformed
        // TODO add your handling code here:t1.stop();
        Pause15.setEnabled(false);
        comenzar15.setText("Reanudar");
        finish15.setEnabled(true);
        comenzar15.setEnabled(true);
    }//GEN-LAST:event_Pause15ActionPerformed

    private void finish15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish15ActionPerformed
        // TODO add your handling code here:
        t15.stop();
        Datos16[0]=Pocision11.getText();
        Datos16[1]=Nombre15.getText();
        Datos16[2]=Int15.getText();
        Datos16[3]=Reloj12.getText();
        f.dtm.addRow(Datos16);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[15]=0;m[15]=0;s[15]=0;cs[15]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish15ActionPerformed

    private void comenzar22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar22ActionPerformed
        // TODO add your handling code here:
        t22.start();
        Nombre22.setBackground(Color.yellow);
        Nombre22.setEditable(false);
        Int22.setBackground(Color.yellow);
        Int22.setEditable(false);
        Icono20.setText("OCUPADA");
        comenzar22.setEnabled(false);
        Pause22.setEnabled(true);
    }//GEN-LAST:event_comenzar22ActionPerformed

    private void Pause22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause22ActionPerformed
        // TODO add your handling code here:
        t10.stop();
        Pause22.setEnabled(false);
        comenzar22.setText("Reanudar");
        finish22.setEnabled(true);
        comenzar22.setEnabled(true);
    }//GEN-LAST:event_Pause22ActionPerformed

    private void finish22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish22ActionPerformed
        // TODO add your handling code here:
        t22.stop();
        Datos23[0]=Pocision22.getText();
        Datos23[1]=Nombre22.getText();
        Datos23[2]=Int22.getText();
        Datos23[3]=Reloj23.getText();
        f.dtm.addRow(Datos23);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[22]=0;m[22]=0;s[22]=0;cs[22]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish22ActionPerformed

    private void comenzar23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar23ActionPerformed
        // TODO add your handling code here:
        t23.start();
        Nombre23.setBackground(Color.yellow);
        Nombre23.setEditable(false);
        Int23.setBackground(Color.yellow);
        Int23.setEditable(false);
        Icono21.setText("OCUPADA");
        comenzar23.setEnabled(false);
        Pause23.setEnabled(true);
    }//GEN-LAST:event_comenzar23ActionPerformed

    private void Pause23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause23ActionPerformed
        // TODO add your handling code here:
        t23.stop();
        Pause23.setEnabled(false);
        comenzar23.setText("Reanudar");
        finish23.setEnabled(true);
        comenzar23.setEnabled(true);
    }//GEN-LAST:event_Pause23ActionPerformed

    private void finish23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish23ActionPerformed
        // TODO add your handling code here:
        t23.stop();
        Datos24[0]=Pocision23.getText();
        Datos24[1]=Nombre23.getText();
        Datos24[2]=Int23.getText();
        Datos24[3]=Reloj24.getText();
        f.dtm.addRow(Datos24);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[23]=0;m[23]=0;s[23]=0;cs[23]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish23ActionPerformed

    private void comenzar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar12ActionPerformed
        // TODO add your handling code here:
        t12.start();
        Nombre12.setBackground(Color.yellow);
        Nombre12.setEditable(false);
        Int12.setBackground(Color.yellow);
        Int12.setEditable(false);
        Icono12.setText("OCUPADA");
        comenzar12.setEnabled(false);
        Pause12.setEnabled(true);
    }//GEN-LAST:event_comenzar12ActionPerformed

    private void Pause12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause12ActionPerformed
        // TODO add your handling code here:
        t12.stop();
        Pause12.setEnabled(false);
        comenzar12.setText("Reanudar");
        finish12.setEnabled(true);
        comenzar12.setEnabled(true);
    }//GEN-LAST:event_Pause12ActionPerformed

    private void finish12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish12ActionPerformed
        // TODO add your handling code here:
        t12.stop();
        Datos13[0]=Pocision12.getText();
        Datos13[1]=Nombre12.getText();
        Datos13[2]=Int12.getText();
        Datos13[3]=Reloj13.getText();
        f.dtm.addRow(Datos13);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[12]=0;m[12]=0;s[12]=0;cs[12]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish12ActionPerformed

    private void comenzar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar13ActionPerformed
        // TODO add your handling code here:
        t13.start();
        Nombre13.setBackground(Color.yellow);
        Nombre13.setEditable(false);
        Int13.setBackground(Color.yellow);
        Int13.setEditable(false);
        Icono13.setText("OCUPADA");
        comenzar13.setEnabled(false);
        Pause13.setEnabled(true);
    }//GEN-LAST:event_comenzar13ActionPerformed

    private void Pause13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause13ActionPerformed
        // TODO add your handling code here:
        t13.stop();
        Pause13.setEnabled(false);
        comenzar13.setText("Reanudar");
        finish13.setEnabled(true);
        comenzar13.setEnabled(true);
    }//GEN-LAST:event_Pause13ActionPerformed

    private void finish13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish13ActionPerformed
        // TODO add your handling code here:
        t13.stop();
        Datos14[0]=Pocision13.getText();
        Datos14[1]=Nombre13.getText();
        Datos14[2]=Int13.getText();
        Datos14[3]=Reloj14.getText();
        f.dtm.addRow(Datos14);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[14]=0;m[14]=0;s[14]=0;cs[14]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish13ActionPerformed

    private void comenzar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar10ActionPerformed
        // TODO add your handling code here:
        t10.start();
        Nombre10.setBackground(Color.yellow);
        Nombre10.setEditable(false);
        Int10.setBackground(Color.yellow);
        Int10.setEditable(false);
        Icono22.setText("OCUPADA");
        comenzar10.setEnabled(false);
        Pause10.setEnabled(true);
    }//GEN-LAST:event_comenzar10ActionPerformed

    private void Pause10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause10ActionPerformed
        // TODO add your handling code here:
        t10.stop();
        Pause10.setEnabled(false);
        comenzar10.setText("Reanudar");
        finish10.setEnabled(true);
        comenzar10.setEnabled(true);
    }//GEN-LAST:event_Pause10ActionPerformed

    private void finish10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish10ActionPerformed
        // TODO add your handling code here:
        t10.stop();
        Datos11[0]=Pocision10.getText();
        Datos11[1]=Nombre10.getText();
        Datos11[2]=Int10.getText();
        Datos11[3]=Reloj11.getText();
        f.dtm.addRow(Datos11);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[10]=0;m[10]=0;s[10]=0;cs[10]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish10ActionPerformed

    private void comenzar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar11ActionPerformed
        // TODO add your handling code here:
        t11.start();
        Nombre11.setBackground(Color.yellow);
        Nombre11.setEditable(false);
        Int11.setBackground(Color.yellow);
        Int11.setEditable(false);
        Icono23.setText("OCUPADA");
        comenzar11.setEnabled(false);
        Pause11.setEnabled(true);
    }//GEN-LAST:event_comenzar11ActionPerformed

    private void Pause11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause11ActionPerformed
        // TODO add your handling code here:
          t11.stop();
        Pause11.setEnabled(false);
        comenzar11.setText("Reanudar");
        finish11.setEnabled(true);
        comenzar11.setEnabled(true);
    }//GEN-LAST:event_Pause11ActionPerformed

    private void finish11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish11ActionPerformed
        // TODO add your handling code here:
        t11.stop();
        Datos12[0]=Pocision11.getText();
        Datos12[1]=Nombre11.getText();
        Datos12[2]=Int11.getText();
        Datos12[3]=Reloj12.getText();
        f.dtm.addRow(Datos12);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[11]=0;m[11]=0;s[11]=0;cs[11]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish11ActionPerformed

    private void comenzar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar8ActionPerformed
        // TODO add your handling code here:
        t8.start();
        Nombre8.setBackground(Color.yellow);
        Nombre8.setEditable(false);
        Int8.setBackground(Color.yellow);
        Int8.setEditable(false);
        Icono14.setText("OCUPADA");
        comenzar8.setEnabled(false);
        Pause8.setEnabled(true);
    }//GEN-LAST:event_comenzar8ActionPerformed

    private void Pause8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause8ActionPerformed
        // TODO add your handling code here:
          t8.stop();
        Pause8.setEnabled(false);
        comenzar8.setText("Reanudar");
        finish8.setEnabled(true);
        comenzar8.setEnabled(true);
        
    }//GEN-LAST:event_Pause8ActionPerformed

    private void finish8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish8ActionPerformed
        // TODO add your handling code here:
        t8.stop();
        Datos9[0]=Pocision8.getText();
        Datos9[1]=Nombre8.getText();
        Datos9[2]=Int8.getText();
        Datos9[3]=Reloj9.getText();
        f.dtm.addRow(Datos9);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[8]=0;m[8]=0;s[8]=0;cs[8]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish8ActionPerformed

    private void comenzar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar9ActionPerformed
        // TODO add your handling code here:
        t9.start();
        Nombre9.setBackground(Color.yellow);
        Nombre9.setEditable(false);
        Int9.setBackground(Color.yellow);
        Int9.setEditable(false);
        Icono15.setText("OCUPADA");
        comenzar9.setEnabled(false);
        Pause9.setEnabled(true);
    }//GEN-LAST:event_comenzar9ActionPerformed

    private void Pause9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause9ActionPerformed
        // TODO add your handling code here:  t11.stop();
        Pause9.setEnabled(false);
        comenzar9.setText("Reanudar");
        finish9.setEnabled(true);
        comenzar9.setEnabled(true);
    }//GEN-LAST:event_Pause9ActionPerformed

    private void finish9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish9ActionPerformed
        // TODO add your handling code here:
        t9.stop();
        Datos10[0]=Pocision9.getText();
        Datos10[1]=Nombre9.getText();
        Datos10[2]=Int9.getText();
        Datos10[3]=Reloj10.getText();
        f.dtm.addRow(Datos10);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[9]=0;m[9]=0;s[9]=0;cs[9]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish9ActionPerformed

    private void comenzar16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar16ActionPerformed
        // TODO add your handling code here:
        t16.start();
        Nombre16.setBackground(Color.yellow);
        Nombre16.setEditable(false);
        Int16.setBackground(Color.yellow);
        Int16.setEditable(false);
        Icono8.setText("OCUPADA");
        comenzar16.setEnabled(false);
        Pause16.setEnabled(true);
    }//GEN-LAST:event_comenzar16ActionPerformed

    private void Pause16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause16ActionPerformed
        // TODO add your handling code here:  t11.stop();
        Pause16.setEnabled(false);
        comenzar16.setText("Reanudar");
        finish16.setEnabled(true);
        comenzar16.setEnabled(true);
    }//GEN-LAST:event_Pause16ActionPerformed

    private void finish16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish16ActionPerformed
        // TODO add your handling code here:
        t16.stop();
        Datos17[0]=Pocision16.getText();
        Datos17[1]=Nombre16.getText();
        Datos17[2]=Int16.getText();
        Datos17[3]=Reloj17.getText();
        f.dtm.addRow(Datos17);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[16]=0;m[16]=0;s[16]=0;cs[16]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish16ActionPerformed

    private void comenzar17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar17ActionPerformed
        // TODO add your handling code here:
        t17.start();
        Nombre17.setBackground(Color.yellow);
        Nombre17.setEditable(false);
        Int17.setBackground(Color.yellow);
        Int17.setEditable(false);
        Icono9.setText("OCUPADA");
        comenzar17.setEnabled(false);
        Pause17.setEnabled(true);
    }//GEN-LAST:event_comenzar17ActionPerformed

    private void Pause17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause17ActionPerformed
        // TODO add your handling code here:
          t17.stop();
        Pause17.setEnabled(false);
        comenzar17.setText("Reanudar");
        finish17.setEnabled(true);
        comenzar17.setEnabled(true);
    }//GEN-LAST:event_Pause17ActionPerformed

    private void finish17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish17ActionPerformed
        // TODO add your handling code here:
        t17.stop();
        Datos18[0]=Pocision17.getText();
        Datos18[1]=Nombre17.getText();
        Datos18[2]=Int17.getText();
        Datos18[3]=Reloj18.getText();
        f.dtm.addRow(Datos18);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[17]=0;m[17]=0;s[17]=0;cs[17]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish17ActionPerformed

    private void comenzar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar18ActionPerformed
        // TODO add your handling code here:
        t18.start();
        Nombre18.setBackground(Color.yellow);
        Nombre18.setEditable(false);
        Int18.setBackground(Color.yellow);
        Int18.setEditable(false);
        Icono16.setText("OCUPADA");
        comenzar18.setEnabled(false);
        Pause18.setEnabled(true);
    }//GEN-LAST:event_comenzar18ActionPerformed

    private void Pause18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause18ActionPerformed
        // TODO add your handling code here:
          t18.stop();
        Pause18.setEnabled(false);
        comenzar18.setText("Reanudar");
        finish18.setEnabled(true);
        comenzar18.setEnabled(true);
    }//GEN-LAST:event_Pause18ActionPerformed

    private void finish18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish18ActionPerformed
        // TODO add your handling code here:
        t18.stop();
        Datos19[0]=Pocision18.getText();
        Datos19[1]=Nombre18.getText();
        Datos19[2]=Int18.getText();
        Datos19[3]=Reloj19.getText();
        f.dtm.addRow(Datos19);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[18]=0;m[18]=0;s[18]=0;cs[18]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish18ActionPerformed

    private void comenzar19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar19ActionPerformed
        // TODO add your handling code here:
        t19.start();
        Nombre19.setBackground(Color.yellow);
        Nombre19.setEditable(false);
        Int19.setBackground(Color.yellow);
        Int19.setEditable(false);
        Icono17.setText("OCUPADA");
        comenzar19.setEnabled(false);
        Pause19.setEnabled(true);
    }//GEN-LAST:event_comenzar19ActionPerformed

    private void Pause19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause19ActionPerformed
        // TODO add your handling code here:
          t19.stop();
        Pause19.setEnabled(false);
        comenzar19.setText("Reanudar");
        finish19.setEnabled(true);
        comenzar19.setEnabled(true);
    }//GEN-LAST:event_Pause19ActionPerformed

    private void finish19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish19ActionPerformed
        // TODO add your handling code here:
        t19.stop();
        Datos20[0]=Pocision19.getText();
        Datos20[1]=Nombre19.getText();
        Datos20[2]=Int19.getText();
        Datos20[3]=Reloj20.getText();
        f.dtm.addRow(Datos20);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[19]=0;m[19]=0;s[19]=0;cs[19]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish19ActionPerformed

    private void comenzar20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar20ActionPerformed
        // TODO add your handling code here:
        t20.start();
        Nombre20.setBackground(Color.yellow);
        Nombre20.setEditable(false);
        Int20.setBackground(Color.yellow);
        Int20.setEditable(false);
        Icono18.setText("OCUPADA");
        comenzar20.setEnabled(false);
        Pause20.setEnabled(true);
    }//GEN-LAST:event_comenzar20ActionPerformed

    private void Pause20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause20ActionPerformed
        // TODO add your handling code here:
          t20.stop();
        Pause20.setEnabled(false);
        comenzar20.setText("Reanudar");
        finish20.setEnabled(true);
        comenzar20.setEnabled(true);
    }//GEN-LAST:event_Pause20ActionPerformed

    private void finish20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish20ActionPerformed
        // TODO add your handling code here:
        t20.stop();
        Datos21[0]=Pocision20.getText();
        Datos21[1]=Nombre20.getText();
        Datos21[2]=Int20.getText();
        Datos21[3]=Reloj21.getText();
        f.dtm.addRow(Datos21);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[20]=0;m[20]=0;s[20]=0;cs[20]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish20ActionPerformed

    private void comenzar21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar21ActionPerformed
        // TODO add your handling code here:
        t21.start();
        Nombre21.setBackground(Color.yellow);
        Nombre21.setEditable(false);
        Int21.setBackground(Color.yellow);
        Int21.setEditable(false);
        Icono19.setText("OCUPADA");
        comenzar21.setEnabled(false);
        Pause21.setEnabled(true);
    }//GEN-LAST:event_comenzar21ActionPerformed

    private void Pause21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause21ActionPerformed
        // TODO add your handling code here:  t11.stop();
        Pause21.setEnabled(false);
        comenzar21.setText("Reanudar");
        finish21.setEnabled(true);
        comenzar21.setEnabled(true);
    }//GEN-LAST:event_Pause21ActionPerformed

    private void finish21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish21ActionPerformed
        // TODO add your handling code here:
        t21.stop();
        Datos22[0]=Pocision21.getText();
        Datos22[1]=Nombre21.getText();
        Datos22[2]=Int21.getText();
        Datos22[3]=Reloj22.getText();
        f.dtm.addRow(Datos22);
        Nombre.setEditable(true);
        Nombre.setBackground(Color.WHITE);
        Nombre.setText("");
        Int.setEditable(true);
        Int.setBackground(Color.WHITE);
        Int.setText("");
        comenzar.setEnabled(true);
        Pause.setEnabled(false);
        finish.setEnabled(false);
        H[21]=0;m[21]=0;s[21]=0;cs[21]=0;
        Actualizar();
        Icono.setBackground(null);
        Icono.setText("");
    }//GEN-LAST:event_finish21ActionPerformed

    private void Pocision7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pocision7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pocision7ActionPerformed

    private void estado8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado8ActionPerformed

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
            java.util.logging.Logger.getLogger(lab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Icono1;
    private javax.swing.JLabel Icono10;
    private javax.swing.JLabel Icono11;
    private javax.swing.JLabel Icono12;
    private javax.swing.JLabel Icono13;
    private javax.swing.JLabel Icono14;
    private javax.swing.JLabel Icono15;
    private javax.swing.JLabel Icono16;
    private javax.swing.JLabel Icono17;
    private javax.swing.JLabel Icono18;
    private javax.swing.JLabel Icono19;
    private javax.swing.JLabel Icono2;
    private javax.swing.JLabel Icono20;
    private javax.swing.JLabel Icono21;
    private javax.swing.JLabel Icono22;
    private javax.swing.JLabel Icono23;
    private javax.swing.JLabel Icono3;
    private javax.swing.JLabel Icono4;
    private javax.swing.JLabel Icono5;
    private javax.swing.JLabel Icono6;
    private javax.swing.JLabel Icono7;
    private javax.swing.JLabel Icono8;
    private javax.swing.JLabel Icono9;
    private javax.swing.JTextField Int;
    private javax.swing.JTextField Int1;
    private javax.swing.JTextField Int10;
    private javax.swing.JTextField Int11;
    private javax.swing.JTextField Int12;
    private javax.swing.JTextField Int13;
    private javax.swing.JTextField Int14;
    private javax.swing.JTextField Int15;
    private javax.swing.JTextField Int16;
    private javax.swing.JTextField Int17;
    private javax.swing.JTextField Int18;
    private javax.swing.JTextField Int19;
    private javax.swing.JTextField Int2;
    private javax.swing.JTextField Int20;
    private javax.swing.JTextField Int21;
    private javax.swing.JTextField Int22;
    private javax.swing.JTextField Int23;
    private javax.swing.JTextField Int3;
    private javax.swing.JTextField Int4;
    private javax.swing.JTextField Int5;
    private javax.swing.JTextField Int6;
    private javax.swing.JTextField Int7;
    private javax.swing.JTextField Int8;
    private javax.swing.JTextField Int9;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Nombre1;
    private javax.swing.JTextField Nombre10;
    private javax.swing.JTextField Nombre11;
    private javax.swing.JTextField Nombre12;
    private javax.swing.JTextField Nombre13;
    private javax.swing.JTextField Nombre14;
    private javax.swing.JTextField Nombre15;
    private javax.swing.JTextField Nombre16;
    private javax.swing.JTextField Nombre17;
    private javax.swing.JTextField Nombre18;
    private javax.swing.JTextField Nombre19;
    private javax.swing.JTextField Nombre2;
    private javax.swing.JTextField Nombre20;
    private javax.swing.JTextField Nombre21;
    private javax.swing.JTextField Nombre22;
    private javax.swing.JTextField Nombre23;
    private javax.swing.JTextField Nombre3;
    private javax.swing.JTextField Nombre4;
    private javax.swing.JTextField Nombre5;
    private javax.swing.JTextField Nombre6;
    private javax.swing.JTextField Nombre7;
    private javax.swing.JTextField Nombre8;
    private javax.swing.JTextField Nombre9;
    private javax.swing.JButton Pause;
    private javax.swing.JButton Pause1;
    private javax.swing.JButton Pause10;
    private javax.swing.JButton Pause11;
    private javax.swing.JButton Pause12;
    private javax.swing.JButton Pause13;
    private javax.swing.JButton Pause14;
    private javax.swing.JButton Pause15;
    private javax.swing.JButton Pause16;
    private javax.swing.JButton Pause17;
    private javax.swing.JButton Pause18;
    private javax.swing.JButton Pause19;
    private javax.swing.JButton Pause2;
    private javax.swing.JButton Pause20;
    private javax.swing.JButton Pause21;
    private javax.swing.JButton Pause22;
    private javax.swing.JButton Pause23;
    private javax.swing.JButton Pause3;
    private javax.swing.JButton Pause4;
    private javax.swing.JButton Pause5;
    private javax.swing.JButton Pause6;
    private javax.swing.JButton Pause7;
    private javax.swing.JButton Pause8;
    private javax.swing.JButton Pause9;
    private javax.swing.JTextField Pocision;
    private javax.swing.JTextField Pocision1;
    private javax.swing.JTextField Pocision10;
    private javax.swing.JTextField Pocision11;
    private javax.swing.JTextField Pocision12;
    private javax.swing.JTextField Pocision13;
    private javax.swing.JTextField Pocision14;
    private javax.swing.JTextField Pocision15;
    private javax.swing.JTextField Pocision16;
    private javax.swing.JTextField Pocision17;
    private javax.swing.JTextField Pocision18;
    private javax.swing.JTextField Pocision19;
    private javax.swing.JTextField Pocision2;
    private javax.swing.JTextField Pocision20;
    private javax.swing.JTextField Pocision21;
    private javax.swing.JTextField Pocision22;
    private javax.swing.JTextField Pocision23;
    private javax.swing.JTextField Pocision3;
    private javax.swing.JTextField Pocision4;
    private javax.swing.JTextField Pocision5;
    private javax.swing.JTextField Pocision6;
    private javax.swing.JTextField Pocision7;
    private javax.swing.JTextField Pocision8;
    private javax.swing.JTextField Pocision9;
    private javax.swing.JTextField Reloj1;
    private javax.swing.JTextField Reloj10;
    private javax.swing.JTextField Reloj11;
    private javax.swing.JTextField Reloj12;
    private javax.swing.JTextField Reloj13;
    private javax.swing.JTextField Reloj14;
    private javax.swing.JTextField Reloj15;
    private javax.swing.JTextField Reloj16;
    private javax.swing.JTextField Reloj17;
    private javax.swing.JTextField Reloj18;
    private javax.swing.JTextField Reloj19;
    private javax.swing.JTextField Reloj2;
    private javax.swing.JTextField Reloj20;
    private javax.swing.JTextField Reloj21;
    private javax.swing.JTextField Reloj22;
    private javax.swing.JTextField Reloj23;
    private javax.swing.JTextField Reloj24;
    private javax.swing.JTextField Reloj3;
    private javax.swing.JTextField Reloj4;
    private javax.swing.JTextField Reloj5;
    private javax.swing.JTextField Reloj6;
    private javax.swing.JTextField Reloj7;
    private javax.swing.JTextField Reloj8;
    private javax.swing.JTextField Reloj9;
    private javax.swing.JButton comenzar;
    private javax.swing.JButton comenzar1;
    private javax.swing.JButton comenzar10;
    private javax.swing.JButton comenzar11;
    private javax.swing.JButton comenzar12;
    private javax.swing.JButton comenzar13;
    private javax.swing.JButton comenzar14;
    private javax.swing.JButton comenzar15;
    private javax.swing.JButton comenzar16;
    private javax.swing.JButton comenzar17;
    private javax.swing.JButton comenzar18;
    private javax.swing.JButton comenzar19;
    private javax.swing.JButton comenzar2;
    private javax.swing.JButton comenzar20;
    private javax.swing.JButton comenzar21;
    private javax.swing.JButton comenzar22;
    private javax.swing.JButton comenzar23;
    private javax.swing.JButton comenzar3;
    private javax.swing.JButton comenzar4;
    private javax.swing.JButton comenzar5;
    private javax.swing.JButton comenzar6;
    private javax.swing.JButton comenzar7;
    private javax.swing.JButton comenzar8;
    private javax.swing.JButton comenzar9;
    private javax.swing.JButton estado;
    private javax.swing.JButton estado1;
    private javax.swing.JButton estado10;
    private javax.swing.JButton estado11;
    private javax.swing.JButton estado12;
    private javax.swing.JButton estado13;
    private javax.swing.JButton estado14;
    private javax.swing.JButton estado15;
    private javax.swing.JButton estado16;
    private javax.swing.JButton estado17;
    private javax.swing.JButton estado18;
    private javax.swing.JButton estado19;
    private javax.swing.JButton estado2;
    private javax.swing.JButton estado20;
    private javax.swing.JButton estado21;
    private javax.swing.JButton estado22;
    private javax.swing.JButton estado23;
    private javax.swing.JButton estado3;
    private javax.swing.JButton estado4;
    private javax.swing.JButton estado5;
    private javax.swing.JButton estado6;
    private javax.swing.JButton estado7;
    private javax.swing.JButton estado8;
    private javax.swing.JButton estado9;
    private javax.swing.JButton finish;
    private javax.swing.JButton finish1;
    private javax.swing.JButton finish10;
    private javax.swing.JButton finish11;
    private javax.swing.JButton finish12;
    private javax.swing.JButton finish13;
    private javax.swing.JButton finish14;
    private javax.swing.JButton finish15;
    private javax.swing.JButton finish16;
    private javax.swing.JButton finish17;
    private javax.swing.JButton finish18;
    private javax.swing.JButton finish19;
    private javax.swing.JButton finish2;
    private javax.swing.JButton finish20;
    private javax.swing.JButton finish21;
    private javax.swing.JButton finish22;
    private javax.swing.JButton finish23;
    private javax.swing.JButton finish3;
    private javax.swing.JButton finish4;
    private javax.swing.JButton finish5;
    private javax.swing.JButton finish6;
    private javax.swing.JButton finish7;
    private javax.swing.JButton finish8;
    private javax.swing.JButton finish9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mayor;
    // End of variables declaration//GEN-END:variables
}
