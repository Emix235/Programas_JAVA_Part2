/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Itzayana
 */
public class Laboratorio3 extends javax.swing.JFrame {
public Laboratorio3() {
        initComponents();
        setLocationRelativeTo(null);
        t= new Timer(10, acciones);
        t1= new Timer(10, acciones2);
        t2= new Timer(10, acciones3); 
         t3= new Timer(10, acciones4);
         t4= new Timer(10, acciones5);
         t5= new Timer(10, acciones6);
         t6= new Timer(10, acciones7);
         t7= new Timer(10, acciones8);
         t8= new Timer(10, acciones9);
         t9= new Timer(10, acciones10);
         t10= new Timer(10, acciones11);
         t11= new Timer(10, acciones12);
         t12= new Timer(10, acciones13);
         t13= new Timer(10, acciones14);
         t14= new Timer(10, acciones15);
         t15= new Timer(10, acciones16);
         t16= new Timer(10, acciones17);
         t17= new Timer(10, acciones18);
         t18= new Timer(10, acciones19);
         t19= new Timer(10, acciones20);
         t20= new Timer(10, acciones21);
         t21= new Timer(10, acciones22);
         t22= new Timer(10, acciones23);
         t23= new Timer(10, acciones24);
    }
private Timer t,t1,t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24;
private String tiempo[]= new String [100];
private int H[]= new int [100];
private int m[]= new int [100];
private int s[]= new int [100];
private int cs[]= new int [100];
private ActionListener acciones = new ActionListener() {
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
            Actualizar();
        }
    };
private ActionListener acciones2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[2]++;
            if(cs[2]==100){
                cs[2]=0;
                s[2]++;
            }
            if(s[2]==60){
                s[2]=0;
                m[2]++;
            }
            if(m[2]==60){
                m[2]=0;
                H[2]++;
            }
            Actualizar2();
        }
    };
private ActionListener acciones3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[3]++;
            if(cs[3]==100){
                cs[3]=0;
                s[3]++;
            }
            if(s[3]==60){
                s[3]=0;
                m[3]++;
            }
            if(m[3]==60){
                m[3]=0;
                H[3]++;
            }
            Actualizar3();
        }
    };
private ActionListener acciones4 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[4]++;
            if(cs[4]==100){
                cs[4]=0;
                s[4]++;
            }
            if(s[4]==60){
                s[4]=0;
                m[4]++;
            }
            if(m[4]==60){
                m[4]=0;
                H[4]++;
            }
            Actualizar4();
        }
    };
private ActionListener acciones5 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[5]++;
            if(cs[5]==100){
                cs[5]=0;
                s[5]++;
            }
            if(s[5]==60){
                s[5]=0;
                m[5]++;
            }
            if(m[5]==60){
                m[5]=0;
                H[5]++;
            }
            Actualizar5();
        }
    };
private ActionListener acciones6 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[6]++;
            if(cs[6]==100){
                cs[6]=0;
                s[6]++;
            }
            if(s[6]==60){
                s[6]=0;
                m[6]++;
            }
            if(m[6]==60){
                m[6]=0;
                H[6]++;
            }
            Actualizar6();
        }
    };
private ActionListener acciones7 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[7]++;
            if(cs[7]==100){
                cs[7]=0;
                s[7]++;
            }
            if(s[7]==60){
                s[7]=0;
                m[7]++;
            }
            if(m[7]==60){
                m[7]=0;
                H[7]++;
            }
            Actualizar7();
        }
    };
private ActionListener acciones8 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[8]++;
            if(cs[8]==100){
                cs[8]=0;
                s[8]++;
            }
            if(s[8]==60){
                s[8]=0;
                m[8]++;
            }
            if(m[8]==60){
                m[8]=0;
                H[8]++;
            }
            Actualizar8();
        }
    };
private ActionListener acciones9 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[9]++;
            if(cs[9]==100){
                cs[9]=0;
                s[9]++;
            }
            if(s[9]==60){
                s[9]=0;
                m[9]++;
            }
            if(m[9]==60){
                m[9]=0;
                H[9]++;
            }
            Actualizar9();
        }
    };
private ActionListener acciones10 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[10]++;
            if(cs[10]==100){
                cs[10]=0;
                s[10]++;
            }
            if(s[10]==60){
                s[10]=0;
                m[10]++;
            }
            if(m[10]==60){
                m[10]=0;
                H[10]++;
            }
            Actualizar10();
        }
    };
private ActionListener acciones11 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[11]++;
            if(cs[11]==100){
                cs[11]=0;
                s[11]++;
            }
            if(s[11]==60){
                s[11]=0;
                m[11]++;
            }
            if(m[11]==60){
                m[11]=0;
                H[11]++;
            }
            Actualizar11();
        }
    };
private ActionListener acciones12 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[12]++;
            if(cs[12]==100){
                cs[12]=0;
                s[12]++;
            }
            if(s[12]==60){
                s[12]=0;
                m[12]++;
            }
            if(m[12]==60){
                m[12]=0;
                H[12]++;
            }
            Actualizar12();
        }
    };
private ActionListener acciones13 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[13]++;
            if(cs[13]==100){
                cs[13]=0;
                s[13]++;
            }
            if(s[13]==60){
                s[13]=0;
                m[13]++;
            }
            if(m[13]==60){
                m[13]=0;
                H[13]++;
            }
            Actualizar13();
        }
    };
private ActionListener acciones14 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[14]++;
            if(cs[14]==100){
                cs[14]=0;
                s[14]++;
            }
            if(s[14]==60){
                s[14]=0;
                m[14]++;
            }
            if(m[14]==60){
                m[14]=0;
                H[14]++;
            }
            Actualizar14();
        }
    };
private ActionListener acciones15 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[15]++;
            if(cs[15]==100){
                cs[15]=0;
                s[15]++;
            }
            if(s[15]==60){
                s[15]=0;
                m[15]++;
            }
            if(m[15]==60){
                m[15]=0;
                H[15]++;
            }
            Actualizar15();
        }
    };
private ActionListener acciones16 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[16]++;
            if(cs[16]==100){
                cs[16]=0;
                s[16]++;
            }
            if(s[16]==60){
                s[16]=0;
                m[16]++;
            }
            if(m[16]==60){
                m[16]=0;
                H[16]++;
            }
            Actualizar16();
        }
    };
private ActionListener acciones17 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[17]++;
            if(cs[17]==100){
                cs[17]=0;
                s[17]++;
            }
            if(s[17]==60){
                s[17]=0;
                m[17]++;
            }
            if(m[17]==60){
                m[17]=0;
                H[17]++;
            }
            Actualizar17();
        }
    };
private ActionListener acciones18 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[18]++;
            if(cs[18]==100){
                cs[18]=0;
                s[18]++;
            }
            if(s[18]==60){
                s[18]=0;
                m[18]++;
            }
            if(m[18]==60){
                m[18]=0;
                H[18]++;
            }
            Actualizar18();
        }
    };
private ActionListener acciones19 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[19]++;
            if(cs[19]==100){
                cs[19]=0;
                s[19]++;
            }
            if(s[19]==60){
                s[19]=0;
                m[19]++;
            }
            if(m[19]==60){
                m[19]=0;
                H[19]++;
            }
            Actualizar19();
        }
    };
private ActionListener acciones20 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[20]++;
            if(cs[20]==100){
                cs[20]=0;
                s[20]++;
            }
            if(s[20]==60){
                s[20]=0;
                m[20]++;
            }
            if(m[20]==60){
                m[20]=0;
                H[20]++;
            }
            Actualizar20();
        }
    };
private ActionListener acciones21 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[21]++;
            if(cs[21]==100){
                cs[21]=0;
                s[21]++;
            }
            if(s[21]==60){
                s[21]=0;
                m[21]++;
            }
            if(m[21]==60){
                m[21]=0;
                H[21]++;
            }
            Actualizar21();
        }
    };
private ActionListener acciones22 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[22]++;
            if(cs[22]==100){
                cs[22]=0;
                s[22]++;
            }
            if(s[22]==60){
                s[22]=0;
                m[22]++;
            }
            if(m[22]==60){
                m[22]=0;
                H[22]++;
            }
            Actualizar22();
        }
    };
private ActionListener acciones23 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[23]++;
            if(cs[23]==100){
                cs[23]=0;
                s[23]++;
            }
            if(s[23]==60){
                s[23]=0;
                m[23]++;
            }
            if(m[23]==60){
                m[23]=0;
                H[23]++;
            }
            Actualizar23();
        }
    };
private ActionListener acciones24 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs[24]++;
            if(cs[24]==100){
                cs[24]=0;
                s[24]++;
            }
            if(s[24]==60){
                s[24]=0;
                m[24]++;
            }
            if(m[24]==60){
                m[24]=0;
                H[24]++;
            }
            Actualizar24();
        }
    };
    public void  Actualizar(){
         tiempo[1]=(H[1]<=9?"0":"")+H[1]+"  :  "+(m[1]<=9?"0":"")+m[1]+"  :  "+(s[1]<=9?"0":"")+s[1]+"  :  "+(cs[1]<=9?"0":"")+cs[1];
         Reloj1.setText(tiempo[1]);
    }
    public void  Actualizar2(){
         tiempo[2]=(H[2]<=9?"0":"")+H[2]+"  :  "+(m[2]<=9?"0":"")+m[2]+"  :  "+(s[2]<=9?"0":"")+s[2]+"  :  "+(cs[2]<=9?"0":"")+cs[2];
         Reloj2.setText(tiempo[2]);
    }
    public void  Actualizar3(){
         tiempo[3]=(H[3]<=9?"0":"")+H[3]+"  :  "+(m[3]<=9?"0":"")+m[3]+"  :  "+(s[3]<=9?"0":"")+s[3]+"  :  "+(cs[3]<=9?"0":"")+cs[3];
         Reloj3.setText(tiempo[3]);
    }
    public void  Actualizar4(){
         tiempo[4]=(H[4]<=9?"0":"")+H[4]+"  :  "+(m[4]<=9?"0":"")+m[4]+"  :  "+(s[4]<=9?"0":"")+s[4]+"  :  "+(cs[4]<=9?"0":"")+cs[4];
         Reloj4.setText(tiempo[4]);
    }
    public void  Actualizar5(){
         tiempo[5]=(H[5]<=9?"0":"")+H[5]+"  :  "+(m[5]<=9?"0":"")+m[5]+"  :  "+(s[5]<=9?"0":"")+s[5]+"  :  "+(cs[5]<=9?"0":"")+cs[5];
         Reloj5.setText(tiempo[5]);
    }
    public void  Actualizar6(){
         tiempo[6]=(H[6]<=9?"0":"")+H[6]+"  :  "+(m[6]<=9?"0":"")+m[6]+"  :  "+(s[6]<=9?"0":"")+s[6]+"  :  "+(cs[6]<=9?"0":"")+cs[6];
         Reloj6.setText(tiempo[6]);
    }
    public void  Actualizar7(){
         tiempo[7]=(H[7]<=9?"0":"")+H[7]+"  :  "+(m[7]<=9?"0":"")+m[7]+"  :  "+(s[7]<=9?"0":"")+s[7]+"  :  "+(cs[7]<=9?"0":"")+cs[7];
         Reloj7.setText(tiempo[7]);
    }
    public void  Actualizar8(){
         tiempo[8]=(H[8]<=9?"0":"")+H[8]+"  :  "+(m[8]<=9?"0":"")+m[8]+"  :  "+(s[8]<=9?"0":"")+s[8]+"  :  "+(cs[8]<=9?"0":"")+cs[8];
         Reloj8.setText(tiempo[8]);
    }
    public void  Actualizar9(){
         tiempo[9]=(H[9]<=9?"0":"")+H[9]+"  :  "+(m[9]<=9?"0":"")+m[9]+"  :  "+(s[9]<=9?"0":"")+s[9]+"  :  "+(cs[9]<=9?"0":"")+cs[9];
         Reloj9.setText(tiempo[9]);
    }
    public void  Actualizar10(){
         tiempo[10]=(H[10]<=9?"0":"")+H[10]+"  :  "+(m[10]<=9?"0":"")+m[10]+"  :  "+(s[10]<=9?"0":"")+s[10]+"  :  "+(cs[10]<=9?"0":"")+cs[10];
         Reloj10.setText(tiempo[10]);
    }
    public void  Actualizar11(){
         tiempo[11]=(H[11]<=9?"0":"")+H[11]+"  :  "+(m[11]<=9?"0":"")+m[11]+"  :  "+(s[11]<=9?"0":"")+s[11]+"  :  "+(cs[11]<=9?"0":"")+cs[11];
         Reloj11.setText(tiempo[11]);
    }
    public void  Actualizar12(){
         tiempo[12]=(H[12]<=9?"0":"")+H[12]+"  :  "+(m[12]<=9?"0":"")+m[12]+"  :  "+(s[12]<=9?"0":"")+s[12]+"  :  "+(cs[12]<=9?"0":"")+cs[12];
         Reloj12.setText(tiempo[12]);
    }
    public void  Actualizar13(){
         tiempo[13]=(H[13]<=9?"0":"")+H[13]+"  :  "+(m[13]<=9?"0":"")+m[13]+"  :  "+(s[13]<=9?"0":"")+s[13]+"  :  "+(cs[13]<=9?"0":"")+cs[13];
         Reloj13.setText(tiempo[13]);
    }
    public void  Actualizar14(){
         tiempo[14]=(H[14]<=9?"0":"")+H[14]+"  :  "+(m[14]<=9?"0":"")+m[14]+"  :  "+(s[14]<=9?"0":"")+s[14]+"  :  "+(cs[14]<=9?"0":"")+cs[14];
         Reloj14.setText(tiempo[14]);
    }
    public void  Actualizar15(){
         tiempo[15]=(H[15]<=9?"0":"")+H[15]+"  :  "+(m[15]<=9?"0":"")+m[15]+"  :  "+(s[15]<=9?"0":"")+s[15]+"  :  "+(cs[15]<=9?"0":"")+cs[15];
         Reloj15.setText(tiempo[15]);
    }
    public void  Actualizar16(){
         tiempo[16]=(H[16]<=9?"0":"")+H[16]+"  :  "+(m[16]<=9?"0":"")+m[16]+"  :  "+(s[16]<=9?"0":"")+s[16]+"  :  "+(cs[16]<=9?"0":"")+cs[16];
         Reloj16.setText(tiempo[16]);
    }
    public void  Actualizar17(){
         tiempo[17]=(H[17]<=9?"0":"")+H[17]+"  :  "+(m[17]<=9?"0":"")+m[17]+"  :  "+(s[17]<=9?"0":"")+s[17]+"  :  "+(cs[17]<=9?"0":"")+cs[17];
         Reloj17.setText(tiempo[17]);
    }
    public void  Actualizar18(){
         tiempo[18]=(H[18]<=9?"0":"")+H[18]+"  :  "+(m[18]<=9?"0":"")+m[18]+"  :  "+(s[18]<=9?"0":"")+s[18]+"  :  "+(cs[18]<=9?"0":"")+cs[18];
         Reloj18.setText(tiempo[18]);
    }
    public void  Actualizar19(){
         tiempo[19]=(H[19]<=9?"0":"")+H[19]+"  :  "+(m[19]<=9?"0":"")+m[19]+"  :  "+(s[19]<=9?"0":"")+s[19]+"  :  "+(cs[19]<=9?"0":"")+cs[19];
         Reloj19.setText(tiempo[19]);
    }
    public void  Actualizar20(){
         tiempo[20]=(H[20]<=9?"0":"")+H[20]+"  :  "+(m[20]<=9?"0":"")+m[20]+"  :  "+(s[20]<=9?"0":"")+s[20]+"  :  "+(cs[20]<=9?"0":"")+cs[20];
         Reloj20.setText(tiempo[20]);
    }
    public void  Actualizar21(){
         tiempo[21]=(H[21]<=9?"0":"")+H[21]+"  :  "+(m[21]<=9?"0":"")+m[21]+"  :  "+(s[21]<=9?"0":"")+s[21]+"  :  "+(cs[21]<=9?"0":"")+cs[21];
         Reloj21.setText(tiempo[21]);
    }
    public void  Actualizar22(){
         tiempo[22]=(H[22]<=9?"0":"")+H[22]+"  :  "+(m[22]<=9?"0":"")+m[22]+"  :  "+(s[22]<=9?"0":"")+s[22]+"  :  "+(cs[22]<=9?"0":"")+cs[22];
         Reloj22.setText(tiempo[22]);
    }
    public void  Actualizar23(){
         tiempo[23]=(H[23]<=9?"0":"")+H[23]+"  :  "+(m[23]<=9?"0":"")+m[23]+"  :  "+(s[23]<=9?"0":"")+s[23]+"  :  "+(cs[23]<=9?"0":"")+cs[23];
         Reloj23.setText(tiempo[23]);
    }
    public void  Actualizar24(){
         tiempo[24]=(H[24]<=9?"0":"")+H[24]+"  :  "+(m[24]<=9?"0":"")+m[24]+"  :  "+(s[24]<=9?"0":"")+s[24]+"  :  "+(cs[24]<=9?"0":"")+cs[24];
         Reloj24.setText(tiempo[24]);
    }
    
    
    /**
     * Creates new form Lab1
     */
   

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
        jLabel27 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Reloj1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtUsuario1 = new javax.swing.JTextField();
        Start1 = new javax.swing.JButton();
        Pause1 = new javax.swing.JButton();
        Stop1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Reloj2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        Start2 = new javax.swing.JButton();
        Pause2 = new javax.swing.JButton();
        Stop2 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        Reloj3 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        Start3 = new javax.swing.JButton();
        Pause3 = new javax.swing.JButton();
        Stop3 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        Reloj4 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        Start4 = new javax.swing.JButton();
        Pause4 = new javax.swing.JButton();
        Stop4 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        Reloj5 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        Start5 = new javax.swing.JButton();
        Pause5 = new javax.swing.JButton();
        Stop5 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        Reloj6 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        Start6 = new javax.swing.JButton();
        Pause6 = new javax.swing.JButton();
        Stop6 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        Reloj7 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        Start7 = new javax.swing.JButton();
        Pause7 = new javax.swing.JButton();
        Stop7 = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jLabel104 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        Reloj8 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        Start8 = new javax.swing.JButton();
        Pause8 = new javax.swing.JButton();
        Stop8 = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jLabel117 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        Reloj9 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        Start9 = new javax.swing.JButton();
        Pause9 = new javax.swing.JButton();
        Stop9 = new javax.swing.JButton();
        jLabel124 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jLabel130 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        Reloj10 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        Start10 = new javax.swing.JButton();
        Pause10 = new javax.swing.JButton();
        Stop10 = new javax.swing.JButton();
        jLabel137 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jLabel143 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        Reloj11 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        Start11 = new javax.swing.JButton();
        Pause11 = new javax.swing.JButton();
        Stop11 = new javax.swing.JButton();
        jLabel150 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jTextField47 = new javax.swing.JTextField();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jLabel156 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        Reloj12 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jTextField49 = new javax.swing.JTextField();
        Start12 = new javax.swing.JButton();
        Pause12 = new javax.swing.JButton();
        Stop12 = new javax.swing.JButton();
        jLabel163 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jTextField51 = new javax.swing.JTextField();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jLabel169 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        Reloj13 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jTextField53 = new javax.swing.JTextField();
        Start13 = new javax.swing.JButton();
        Pause13 = new javax.swing.JButton();
        Stop13 = new javax.swing.JButton();
        jLabel176 = new javax.swing.JLabel();
        jTextField54 = new javax.swing.JTextField();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jTextField55 = new javax.swing.JTextField();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jLabel182 = new javax.swing.JLabel();
        jTextField56 = new javax.swing.JTextField();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        Reloj14 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jTextField57 = new javax.swing.JTextField();
        Start14 = new javax.swing.JButton();
        Pause14 = new javax.swing.JButton();
        Stop14 = new javax.swing.JButton();
        jLabel189 = new javax.swing.JLabel();
        jTextField58 = new javax.swing.JTextField();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jTextField59 = new javax.swing.JTextField();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jLabel195 = new javax.swing.JLabel();
        jTextField60 = new javax.swing.JTextField();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        Reloj15 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jTextField61 = new javax.swing.JTextField();
        Start15 = new javax.swing.JButton();
        Pause15 = new javax.swing.JButton();
        Stop15 = new javax.swing.JButton();
        jLabel202 = new javax.swing.JLabel();
        jTextField62 = new javax.swing.JTextField();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jTextField63 = new javax.swing.JTextField();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jLabel208 = new javax.swing.JLabel();
        jTextField64 = new javax.swing.JTextField();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        Reloj16 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jTextField65 = new javax.swing.JTextField();
        Start16 = new javax.swing.JButton();
        Pause16 = new javax.swing.JButton();
        Stop16 = new javax.swing.JButton();
        jLabel215 = new javax.swing.JLabel();
        jTextField66 = new javax.swing.JTextField();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jTextField67 = new javax.swing.JTextField();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jLabel221 = new javax.swing.JLabel();
        jTextField68 = new javax.swing.JTextField();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        Reloj17 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jTextField69 = new javax.swing.JTextField();
        Start17 = new javax.swing.JButton();
        Pause17 = new javax.swing.JButton();
        Stop17 = new javax.swing.JButton();
        jLabel228 = new javax.swing.JLabel();
        jTextField70 = new javax.swing.JTextField();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jTextField71 = new javax.swing.JTextField();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jLabel234 = new javax.swing.JLabel();
        jTextField72 = new javax.swing.JTextField();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        Reloj18 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jTextField73 = new javax.swing.JTextField();
        Start18 = new javax.swing.JButton();
        Pause18 = new javax.swing.JButton();
        Stop18 = new javax.swing.JButton();
        jLabel241 = new javax.swing.JLabel();
        jTextField74 = new javax.swing.JTextField();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jTextField75 = new javax.swing.JTextField();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jLabel247 = new javax.swing.JLabel();
        jTextField76 = new javax.swing.JTextField();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        Reloj19 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jTextField77 = new javax.swing.JTextField();
        Start19 = new javax.swing.JButton();
        Pause19 = new javax.swing.JButton();
        Stop19 = new javax.swing.JButton();
        jLabel254 = new javax.swing.JLabel();
        jTextField78 = new javax.swing.JTextField();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jTextField79 = new javax.swing.JTextField();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton120 = new javax.swing.JButton();
        jLabel260 = new javax.swing.JLabel();
        jTextField80 = new javax.swing.JTextField();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        Reloj20 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jTextField81 = new javax.swing.JTextField();
        Start20 = new javax.swing.JButton();
        Pause20 = new javax.swing.JButton();
        Stop20 = new javax.swing.JButton();
        jLabel267 = new javax.swing.JLabel();
        jTextField82 = new javax.swing.JTextField();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jTextField83 = new javax.swing.JTextField();
        jButton124 = new javax.swing.JButton();
        jButton125 = new javax.swing.JButton();
        jButton126 = new javax.swing.JButton();
        jLabel273 = new javax.swing.JLabel();
        jTextField84 = new javax.swing.JTextField();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        Reloj21 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jTextField85 = new javax.swing.JTextField();
        Start21 = new javax.swing.JButton();
        Pause21 = new javax.swing.JButton();
        Stop21 = new javax.swing.JButton();
        jLabel280 = new javax.swing.JLabel();
        jTextField86 = new javax.swing.JTextField();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        jTextField87 = new javax.swing.JTextField();
        jButton130 = new javax.swing.JButton();
        jButton131 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        jLabel286 = new javax.swing.JLabel();
        jTextField88 = new javax.swing.JTextField();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        Reloj22 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jTextField89 = new javax.swing.JTextField();
        Start22 = new javax.swing.JButton();
        Pause22 = new javax.swing.JButton();
        Stop22 = new javax.swing.JButton();
        jLabel293 = new javax.swing.JLabel();
        jTextField90 = new javax.swing.JTextField();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jTextField91 = new javax.swing.JTextField();
        jButton136 = new javax.swing.JButton();
        jButton137 = new javax.swing.JButton();
        jButton138 = new javax.swing.JButton();
        jLabel299 = new javax.swing.JLabel();
        jTextField92 = new javax.swing.JTextField();
        jLabel300 = new javax.swing.JLabel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        Reloj23 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        jTextField93 = new javax.swing.JTextField();
        Start23 = new javax.swing.JButton();
        Pause23 = new javax.swing.JButton();
        Stop23 = new javax.swing.JButton();
        jLabel306 = new javax.swing.JLabel();
        jTextField94 = new javax.swing.JTextField();
        jLabel307 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        jLabel311 = new javax.swing.JLabel();
        jTextField95 = new javax.swing.JTextField();
        jButton142 = new javax.swing.JButton();
        jButton143 = new javax.swing.JButton();
        jButton144 = new javax.swing.JButton();
        jLabel312 = new javax.swing.JLabel();
        jTextField96 = new javax.swing.JTextField();
        jLabel313 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        jLabel315 = new javax.swing.JLabel();
        Reloj24 = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        jTextField97 = new javax.swing.JTextField();
        Start24 = new javax.swing.JButton();
        Pause24 = new javax.swing.JButton();
        Stop24 = new javax.swing.JButton();
        jLabel319 = new javax.swing.JLabel();
        jTextField98 = new javax.swing.JTextField();
        jLabel320 = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        jTextField99 = new javax.swing.JTextField();
        jButton148 = new javax.swing.JButton();
        jButton149 = new javax.swing.JButton();
        jButton150 = new javax.swing.JButton();
        jLabel325 = new javax.swing.JLabel();
        jTextField100 = new javax.swing.JTextField();
        jLabel326 = new javax.swing.JLabel();
        jTextField173 = new javax.swing.JTextField();
        jButton260 = new javax.swing.JButton();
        jTextField174 = new javax.swing.JTextField();
        jTextField175 = new javax.swing.JTextField();
        jButton263 = new javax.swing.JButton();
        jTextField176 = new javax.swing.JTextField();
        jButton265 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1496, 2202));

        jPanel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1496, 2202));

        jLabel27.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel27.setText("Equipo 1");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj1.setBackground(new java.awt.Color(0, 0, 0));
        Reloj1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj1.setForeground(new java.awt.Color(0, 255, 0));
        Reloj1.setText("00 : 00 : 00 : 00");
        Reloj1.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(0, 0, 153));
        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 255, 0));
        jLabel16.setText("H       :Min      :Seg    :CS");
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(255, 0, 153));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nom.de Usuario ;");
        jLabel17.setOpaque(true);

        txtUsuario1.setBackground(new java.awt.Color(153, 255, 255));
        txtUsuario1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start1.setBackground(new java.awt.Color(0, 255, 255));
        Start1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start1.setForeground(new java.awt.Color(0, 0, 102));
        Start1.setText("Comenzar");
        Start1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start1MouseClicked(evt);
            }
        });
        Start1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start1ActionPerformed(evt);
            }
        });

        Pause1.setBackground(new java.awt.Color(204, 0, 0));
        Pause1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause1.setForeground(new java.awt.Color(255, 255, 0));
        Pause1.setText("Pausar");
        Pause1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause1MouseClicked(evt);
            }
        });

        Stop1.setBackground(new java.awt.Color(255, 255, 51));
        Stop1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop1.setText("Finalizado y desocupado");
        Stop1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop1MouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(0, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel18.setOpaque(true);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 255, 0));
        jLabel21.setText("00 : 00 : 00 : 00");
        jLabel21.setOpaque(true);

        jLabel22.setBackground(new java.awt.Color(0, 0, 153));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 255, 0));
        jLabel22.setText("H       :Min      :Seg    :CS");
        jLabel22.setOpaque(true);

        jLabel23.setBackground(new java.awt.Color(255, 0, 153));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Nom.de Usuario ;");
        jLabel23.setOpaque(true);

        jTextField7.setBackground(new java.awt.Color(153, 255, 255));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton10.setBackground(new java.awt.Color(0, 255, 255));
        jButton10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 102));
        jButton10.setText("Comenzar");
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(204, 0, 0));
        jButton11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 0));
        jButton11.setText("Pausar");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton12.setBackground(new java.awt.Color(255, 255, 51));
        jButton12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton12.setText("Finalizado y desocupado");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setBackground(new java.awt.Color(0, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel24.setOpaque(true);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel28.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel28.setText("Equipo 2");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj2.setBackground(new java.awt.Color(0, 0, 0));
        Reloj2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj2.setForeground(new java.awt.Color(0, 255, 0));
        Reloj2.setText("00 : 00 : 00 : 00");
        Reloj2.setOpaque(true);

        jLabel31.setBackground(new java.awt.Color(0, 0, 153));
        jLabel31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 255, 0));
        jLabel31.setText("H       :Min      :Seg    :CS");
        jLabel31.setOpaque(true);

        jLabel32.setBackground(new java.awt.Color(255, 0, 153));
        jLabel32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Nom.de Usuario ;");
        jLabel32.setOpaque(true);

        jTextField9.setBackground(new java.awt.Color(153, 255, 255));
        jTextField9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start2.setBackground(new java.awt.Color(0, 255, 255));
        Start2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start2.setForeground(new java.awt.Color(0, 0, 102));
        Start2.setText("Comenzar");
        Start2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start2MouseClicked(evt);
            }
        });
        Start2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start2ActionPerformed(evt);
            }
        });

        Pause2.setBackground(new java.awt.Color(204, 0, 0));
        Pause2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause2.setForeground(new java.awt.Color(255, 255, 0));
        Pause2.setText("Pausar");
        Pause2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause2MouseClicked(evt);
            }
        });

        Stop2.setBackground(new java.awt.Color(255, 255, 51));
        Stop2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop2.setText("Finalizado y desocupado");
        Stop2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop2MouseClicked(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(0, 255, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel33.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel33.setOpaque(true);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 255, 0));
        jLabel36.setText("00 : 00 : 00 : 00");
        jLabel36.setOpaque(true);

        jLabel37.setBackground(new java.awt.Color(0, 0, 153));
        jLabel37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 255, 0));
        jLabel37.setText("H       :Min      :Seg    :CS");
        jLabel37.setOpaque(true);

        jLabel38.setBackground(new java.awt.Color(255, 0, 153));
        jLabel38.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Nom.de Usuario ;");
        jLabel38.setOpaque(true);

        jTextField11.setBackground(new java.awt.Color(153, 255, 255));
        jTextField11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton16.setBackground(new java.awt.Color(0, 255, 255));
        jButton16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 0, 102));
        jButton16.setText("Comenzar");
        jButton16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(204, 0, 0));
        jButton17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 0));
        jButton17.setText("Pausar");
        jButton17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton18.setBackground(new java.awt.Color(255, 255, 51));
        jButton18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton18.setText("Finalizado y desocupado");
        jButton18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel39.setBackground(new java.awt.Color(0, 255, 255));
        jLabel39.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel39.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel39.setOpaque(true);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel41.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel41.setText("Equipo 3");

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj3.setBackground(new java.awt.Color(0, 0, 0));
        Reloj3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj3.setForeground(new java.awt.Color(0, 255, 0));
        Reloj3.setText("00 : 00 : 00 : 00");
        Reloj3.setOpaque(true);

        jLabel44.setBackground(new java.awt.Color(0, 0, 153));
        jLabel44.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 255, 0));
        jLabel44.setText("H       :Min      :Seg    :CS");
        jLabel44.setOpaque(true);

        jLabel45.setBackground(new java.awt.Color(255, 0, 153));
        jLabel45.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Nom.de Usuario ;");
        jLabel45.setOpaque(true);

        jTextField13.setBackground(new java.awt.Color(153, 255, 255));
        jTextField13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start3.setBackground(new java.awt.Color(0, 255, 255));
        Start3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start3.setForeground(new java.awt.Color(0, 0, 102));
        Start3.setText("Comenzar");
        Start3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start3MouseClicked(evt);
            }
        });
        Start3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start3ActionPerformed(evt);
            }
        });

        Pause3.setBackground(new java.awt.Color(204, 0, 0));
        Pause3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause3.setForeground(new java.awt.Color(255, 255, 0));
        Pause3.setText("Pausar");
        Pause3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause3MouseClicked(evt);
            }
        });

        Stop3.setBackground(new java.awt.Color(255, 255, 51));
        Stop3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop3.setText("Finalizado y desocupado");
        Stop3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop3MouseClicked(evt);
            }
        });

        jLabel46.setBackground(new java.awt.Color(0, 255, 255));
        jLabel46.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel46.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel46.setOpaque(true);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel49.setBackground(new java.awt.Color(0, 0, 0));
        jLabel49.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 255, 0));
        jLabel49.setText("00 : 00 : 00 : 00");
        jLabel49.setOpaque(true);

        jLabel50.setBackground(new java.awt.Color(0, 0, 153));
        jLabel50.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 255, 0));
        jLabel50.setText("H       :Min      :Seg    :CS");
        jLabel50.setOpaque(true);

        jLabel51.setBackground(new java.awt.Color(255, 0, 153));
        jLabel51.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Nom.de Usuario ;");
        jLabel51.setOpaque(true);

        jTextField15.setBackground(new java.awt.Color(153, 255, 255));
        jTextField15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton22.setBackground(new java.awt.Color(0, 255, 255));
        jButton22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 0, 102));
        jButton22.setText("Comenzar");
        jButton22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(204, 0, 0));
        jButton23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 0));
        jButton23.setText("Pausar");
        jButton23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton24.setBackground(new java.awt.Color(255, 255, 51));
        jButton24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton24.setText("Finalizado y desocupado");
        jButton24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel52.setBackground(new java.awt.Color(0, 255, 255));
        jLabel52.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel52.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel52.setOpaque(true);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel53.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel54.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel54.setText("Equipo 4");

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj4.setBackground(new java.awt.Color(0, 0, 0));
        Reloj4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj4.setForeground(new java.awt.Color(0, 255, 0));
        Reloj4.setText("00 : 00 : 00 : 00");
        Reloj4.setOpaque(true);

        jLabel57.setBackground(new java.awt.Color(0, 0, 153));
        jLabel57.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 255, 0));
        jLabel57.setText("H       :Min      :Seg    :CS");
        jLabel57.setOpaque(true);

        jLabel58.setBackground(new java.awt.Color(255, 0, 153));
        jLabel58.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Nom.de Usuario ;");
        jLabel58.setOpaque(true);

        jTextField17.setBackground(new java.awt.Color(153, 255, 255));
        jTextField17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start4.setBackground(new java.awt.Color(0, 255, 255));
        Start4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start4.setForeground(new java.awt.Color(0, 0, 102));
        Start4.setText("Comenzar");
        Start4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start4MouseClicked(evt);
            }
        });
        Start4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start4ActionPerformed(evt);
            }
        });

        Pause4.setBackground(new java.awt.Color(204, 0, 0));
        Pause4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause4.setForeground(new java.awt.Color(255, 255, 0));
        Pause4.setText("Pausar");
        Pause4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause4MouseClicked(evt);
            }
        });

        Stop4.setBackground(new java.awt.Color(255, 255, 51));
        Stop4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop4.setText("Finalizado y desocupado");
        Stop4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop4MouseClicked(evt);
            }
        });

        jLabel59.setBackground(new java.awt.Color(0, 255, 255));
        jLabel59.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel59.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel59.setOpaque(true);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel60.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel62.setBackground(new java.awt.Color(0, 0, 0));
        jLabel62.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 255, 0));
        jLabel62.setText("00 : 00 : 00 : 00");
        jLabel62.setOpaque(true);

        jLabel63.setBackground(new java.awt.Color(0, 0, 153));
        jLabel63.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(51, 255, 0));
        jLabel63.setText("H       :Min      :Seg    :CS");
        jLabel63.setOpaque(true);

        jLabel64.setBackground(new java.awt.Color(255, 0, 153));
        jLabel64.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Nom.de Usuario ;");
        jLabel64.setOpaque(true);

        jTextField19.setBackground(new java.awt.Color(153, 255, 255));
        jTextField19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton28.setBackground(new java.awt.Color(0, 255, 255));
        jButton28.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 0, 102));
        jButton28.setText("Comenzar");
        jButton28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(204, 0, 0));
        jButton29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 0));
        jButton29.setText("Pausar");
        jButton29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton30.setBackground(new java.awt.Color(255, 255, 51));
        jButton30.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton30.setText("Finalizado y desocupado");
        jButton30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel65.setBackground(new java.awt.Color(0, 255, 255));
        jLabel65.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel65.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel65.setOpaque(true);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel66.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel67.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel67.setText("Equipo 5");

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj5.setBackground(new java.awt.Color(0, 0, 0));
        Reloj5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj5.setForeground(new java.awt.Color(0, 255, 0));
        Reloj5.setText("00 : 00 : 00 : 00");
        Reloj5.setOpaque(true);

        jLabel70.setBackground(new java.awt.Color(0, 0, 153));
        jLabel70.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(51, 255, 0));
        jLabel70.setText("H       :Min      :Seg    :CS");
        jLabel70.setOpaque(true);

        jLabel71.setBackground(new java.awt.Color(255, 0, 153));
        jLabel71.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Nom.de Usuario ;");
        jLabel71.setOpaque(true);

        jTextField21.setBackground(new java.awt.Color(153, 255, 255));
        jTextField21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start5.setBackground(new java.awt.Color(0, 255, 255));
        Start5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start5.setForeground(new java.awt.Color(0, 0, 102));
        Start5.setText("Comenzar");
        Start5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start5MouseClicked(evt);
            }
        });
        Start5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start5ActionPerformed(evt);
            }
        });

        Pause5.setBackground(new java.awt.Color(204, 0, 0));
        Pause5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause5.setForeground(new java.awt.Color(255, 255, 0));
        Pause5.setText("Pausar");
        Pause5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause5MouseClicked(evt);
            }
        });

        Stop5.setBackground(new java.awt.Color(255, 255, 51));
        Stop5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop5.setText("Finalizado y desocupado");
        Stop5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop5MouseClicked(evt);
            }
        });

        jLabel72.setBackground(new java.awt.Color(0, 255, 255));
        jLabel72.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel72.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel72.setOpaque(true);

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel73.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel75.setBackground(new java.awt.Color(0, 0, 0));
        jLabel75.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 255, 0));
        jLabel75.setText("00 : 00 : 00 : 00");
        jLabel75.setOpaque(true);

        jLabel76.setBackground(new java.awt.Color(0, 0, 153));
        jLabel76.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(51, 255, 0));
        jLabel76.setText("H       :Min      :Seg    :CS");
        jLabel76.setOpaque(true);

        jLabel77.setBackground(new java.awt.Color(255, 0, 153));
        jLabel77.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Nom.de Usuario ;");
        jLabel77.setOpaque(true);

        jTextField23.setBackground(new java.awt.Color(153, 255, 255));
        jTextField23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton34.setBackground(new java.awt.Color(0, 255, 255));
        jButton34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton34.setForeground(new java.awt.Color(0, 0, 102));
        jButton34.setText("Comenzar");
        jButton34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(204, 0, 0));
        jButton35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 0));
        jButton35.setText("Pausar");
        jButton35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton36.setBackground(new java.awt.Color(255, 255, 51));
        jButton36.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton36.setText("Finalizado y desocupado");
        jButton36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel78.setBackground(new java.awt.Color(0, 255, 255));
        jLabel78.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel78.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel78.setOpaque(true);

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel79.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel80.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel80.setText("Equipo 6");

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj6.setBackground(new java.awt.Color(0, 0, 0));
        Reloj6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj6.setForeground(new java.awt.Color(0, 255, 0));
        Reloj6.setText("00 : 00 : 00 : 00");
        Reloj6.setOpaque(true);

        jLabel83.setBackground(new java.awt.Color(0, 0, 153));
        jLabel83.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(51, 255, 0));
        jLabel83.setText("H       :Min      :Seg    :CS");
        jLabel83.setOpaque(true);

        jLabel84.setBackground(new java.awt.Color(255, 0, 153));
        jLabel84.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("Nom.de Usuario ;");
        jLabel84.setOpaque(true);

        jTextField25.setBackground(new java.awt.Color(153, 255, 255));
        jTextField25.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start6.setBackground(new java.awt.Color(0, 255, 255));
        Start6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start6.setForeground(new java.awt.Color(0, 0, 102));
        Start6.setText("Comenzar");
        Start6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start6MouseClicked(evt);
            }
        });
        Start6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start6ActionPerformed(evt);
            }
        });

        Pause6.setBackground(new java.awt.Color(204, 0, 0));
        Pause6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause6.setForeground(new java.awt.Color(255, 255, 0));
        Pause6.setText("Pausar");
        Pause6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause6MouseClicked(evt);
            }
        });

        Stop6.setBackground(new java.awt.Color(255, 255, 51));
        Stop6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop6.setText("Finalizado y desocupado");
        Stop6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop6MouseClicked(evt);
            }
        });

        jLabel85.setBackground(new java.awt.Color(0, 255, 255));
        jLabel85.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel85.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel85.setOpaque(true);

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel86.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel88.setBackground(new java.awt.Color(0, 0, 0));
        jLabel88.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(0, 255, 0));
        jLabel88.setText("00 : 00 : 00 : 00");
        jLabel88.setOpaque(true);

        jLabel89.setBackground(new java.awt.Color(0, 0, 153));
        jLabel89.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(51, 255, 0));
        jLabel89.setText("H       :Min      :Seg    :CS");
        jLabel89.setOpaque(true);

        jLabel90.setBackground(new java.awt.Color(255, 0, 153));
        jLabel90.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("Nom.de Usuario ;");
        jLabel90.setOpaque(true);

        jTextField27.setBackground(new java.awt.Color(153, 255, 255));
        jTextField27.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton40.setBackground(new java.awt.Color(0, 255, 255));
        jButton40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton40.setForeground(new java.awt.Color(0, 0, 102));
        jButton40.setText("Comenzar");
        jButton40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setBackground(new java.awt.Color(204, 0, 0));
        jButton41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 0));
        jButton41.setText("Pausar");
        jButton41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton42.setBackground(new java.awt.Color(255, 255, 51));
        jButton42.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton42.setText("Finalizado y desocupado");
        jButton42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel91.setBackground(new java.awt.Color(0, 255, 255));
        jLabel91.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel91.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel91.setOpaque(true);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel92.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel93.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel93.setText("Equipo 7");

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj7.setBackground(new java.awt.Color(0, 0, 0));
        Reloj7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj7.setForeground(new java.awt.Color(0, 255, 0));
        Reloj7.setText("00 : 00 : 00 : 00");
        Reloj7.setOpaque(true);

        jLabel96.setBackground(new java.awt.Color(0, 0, 153));
        jLabel96.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(51, 255, 0));
        jLabel96.setText("H       :Min      :Seg    :CS");
        jLabel96.setOpaque(true);

        jLabel97.setBackground(new java.awt.Color(255, 0, 153));
        jLabel97.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Nom.de Usuario ;");
        jLabel97.setOpaque(true);

        jTextField29.setBackground(new java.awt.Color(153, 255, 255));
        jTextField29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start7.setBackground(new java.awt.Color(0, 255, 255));
        Start7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start7.setForeground(new java.awt.Color(0, 0, 102));
        Start7.setText("Comenzar");
        Start7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start7MouseClicked(evt);
            }
        });
        Start7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start7ActionPerformed(evt);
            }
        });

        Pause7.setBackground(new java.awt.Color(204, 0, 0));
        Pause7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause7.setForeground(new java.awt.Color(255, 255, 0));
        Pause7.setText("Pausar");
        Pause7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause7MouseClicked(evt);
            }
        });

        Stop7.setBackground(new java.awt.Color(255, 255, 51));
        Stop7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop7.setText("Finalizado y desocupado");
        Stop7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop7MouseClicked(evt);
            }
        });

        jLabel98.setBackground(new java.awt.Color(0, 255, 255));
        jLabel98.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel98.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel98.setOpaque(true);

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel99.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel101.setBackground(new java.awt.Color(0, 0, 0));
        jLabel101.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 255, 0));
        jLabel101.setText("00 : 00 : 00 : 00");
        jLabel101.setOpaque(true);

        jLabel102.setBackground(new java.awt.Color(0, 0, 153));
        jLabel102.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(51, 255, 0));
        jLabel102.setText("H       :Min      :Seg    :CS");
        jLabel102.setOpaque(true);

        jLabel103.setBackground(new java.awt.Color(255, 0, 153));
        jLabel103.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("Nom.de Usuario ;");
        jLabel103.setOpaque(true);

        jTextField31.setBackground(new java.awt.Color(153, 255, 255));
        jTextField31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton46.setBackground(new java.awt.Color(0, 255, 255));
        jButton46.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton46.setForeground(new java.awt.Color(0, 0, 102));
        jButton46.setText("Comenzar");
        jButton46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setBackground(new java.awt.Color(204, 0, 0));
        jButton47.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton47.setForeground(new java.awt.Color(255, 255, 0));
        jButton47.setText("Pausar");
        jButton47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton48.setBackground(new java.awt.Color(255, 255, 51));
        jButton48.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton48.setText("Finalizado y desocupado");
        jButton48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel104.setBackground(new java.awt.Color(0, 255, 255));
        jLabel104.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel104.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel104.setOpaque(true);

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel105.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel106.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel106.setText("Equipo 8");

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj8.setBackground(new java.awt.Color(0, 0, 0));
        Reloj8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj8.setForeground(new java.awt.Color(0, 255, 0));
        Reloj8.setText("00 : 00 : 00 : 00");
        Reloj8.setOpaque(true);

        jLabel109.setBackground(new java.awt.Color(0, 0, 153));
        jLabel109.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(51, 255, 0));
        jLabel109.setText("H       :Min      :Seg    :CS");
        jLabel109.setOpaque(true);

        jLabel110.setBackground(new java.awt.Color(255, 0, 153));
        jLabel110.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("Nom.de Usuario ;");
        jLabel110.setOpaque(true);

        jTextField33.setBackground(new java.awt.Color(153, 255, 255));
        jTextField33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start8.setBackground(new java.awt.Color(0, 255, 255));
        Start8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start8.setForeground(new java.awt.Color(0, 0, 102));
        Start8.setText("Comenzar");
        Start8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start8MouseClicked(evt);
            }
        });
        Start8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start8ActionPerformed(evt);
            }
        });

        Pause8.setBackground(new java.awt.Color(204, 0, 0));
        Pause8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause8.setForeground(new java.awt.Color(255, 255, 0));
        Pause8.setText("Pausar");
        Pause8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause8MouseClicked(evt);
            }
        });

        Stop8.setBackground(new java.awt.Color(255, 255, 51));
        Stop8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop8.setText("Finalizado y desocupado");
        Stop8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop8MouseClicked(evt);
            }
        });

        jLabel111.setBackground(new java.awt.Color(0, 255, 255));
        jLabel111.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel111.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel111.setOpaque(true);

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel112.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel114.setBackground(new java.awt.Color(0, 0, 0));
        jLabel114.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(0, 255, 0));
        jLabel114.setText("00 : 00 : 00 : 00");
        jLabel114.setOpaque(true);

        jLabel115.setBackground(new java.awt.Color(0, 0, 153));
        jLabel115.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(51, 255, 0));
        jLabel115.setText("H       :Min      :Seg    :CS");
        jLabel115.setOpaque(true);

        jLabel116.setBackground(new java.awt.Color(255, 0, 153));
        jLabel116.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("Nom.de Usuario ;");
        jLabel116.setOpaque(true);

        jTextField35.setBackground(new java.awt.Color(153, 255, 255));
        jTextField35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton52.setBackground(new java.awt.Color(0, 255, 255));
        jButton52.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton52.setForeground(new java.awt.Color(0, 0, 102));
        jButton52.setText("Comenzar");
        jButton52.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setBackground(new java.awt.Color(204, 0, 0));
        jButton53.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton53.setForeground(new java.awt.Color(255, 255, 0));
        jButton53.setText("Pausar");
        jButton53.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton54.setBackground(new java.awt.Color(255, 255, 51));
        jButton54.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton54.setText("Finalizado y desocupado");
        jButton54.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel117.setBackground(new java.awt.Color(0, 255, 255));
        jLabel117.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel117.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel117.setOpaque(true);

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel118.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel119.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel119.setText("Equipo 9");

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj9.setBackground(new java.awt.Color(0, 0, 0));
        Reloj9.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj9.setForeground(new java.awt.Color(0, 255, 0));
        Reloj9.setText("00 : 00 : 00 : 00");
        Reloj9.setOpaque(true);

        jLabel122.setBackground(new java.awt.Color(0, 0, 153));
        jLabel122.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(51, 255, 0));
        jLabel122.setText("H       :Min      :Seg    :CS");
        jLabel122.setOpaque(true);

        jLabel123.setBackground(new java.awt.Color(255, 0, 153));
        jLabel123.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("Nom.de Usuario ;");
        jLabel123.setOpaque(true);

        jTextField37.setBackground(new java.awt.Color(153, 255, 255));
        jTextField37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start9.setBackground(new java.awt.Color(0, 255, 255));
        Start9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start9.setForeground(new java.awt.Color(0, 0, 102));
        Start9.setText("Comenzar");
        Start9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start9MouseClicked(evt);
            }
        });
        Start9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start9ActionPerformed(evt);
            }
        });

        Pause9.setBackground(new java.awt.Color(204, 0, 0));
        Pause9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause9.setForeground(new java.awt.Color(255, 255, 0));
        Pause9.setText("Pausar");
        Pause9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause9MouseClicked(evt);
            }
        });

        Stop9.setBackground(new java.awt.Color(255, 255, 51));
        Stop9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop9.setText("Finalizado y desocupado");
        Stop9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop9MouseClicked(evt);
            }
        });

        jLabel124.setBackground(new java.awt.Color(0, 255, 255));
        jLabel124.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel124.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel124.setOpaque(true);

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel125.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel127.setBackground(new java.awt.Color(0, 0, 0));
        jLabel127.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(0, 255, 0));
        jLabel127.setText("00 : 00 : 00 : 00");
        jLabel127.setOpaque(true);

        jLabel128.setBackground(new java.awt.Color(0, 0, 153));
        jLabel128.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(51, 255, 0));
        jLabel128.setText("H       :Min      :Seg    :CS");
        jLabel128.setOpaque(true);

        jLabel129.setBackground(new java.awt.Color(255, 0, 153));
        jLabel129.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setText("Nom.de Usuario ;");
        jLabel129.setOpaque(true);

        jTextField39.setBackground(new java.awt.Color(153, 255, 255));
        jTextField39.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton58.setBackground(new java.awt.Color(0, 255, 255));
        jButton58.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton58.setForeground(new java.awt.Color(0, 0, 102));
        jButton58.setText("Comenzar");
        jButton58.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setBackground(new java.awt.Color(204, 0, 0));
        jButton59.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton59.setForeground(new java.awt.Color(255, 255, 0));
        jButton59.setText("Pausar");
        jButton59.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton60.setBackground(new java.awt.Color(255, 255, 51));
        jButton60.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton60.setText("Finalizado y desocupado");
        jButton60.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel130.setBackground(new java.awt.Color(0, 255, 255));
        jLabel130.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel130.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel130.setOpaque(true);

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel131.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel132.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel132.setText("Equipo 10");

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj10.setBackground(new java.awt.Color(0, 0, 0));
        Reloj10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj10.setForeground(new java.awt.Color(0, 255, 0));
        Reloj10.setText("00 : 00 : 00 : 00");
        Reloj10.setOpaque(true);

        jLabel135.setBackground(new java.awt.Color(0, 0, 153));
        jLabel135.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(51, 255, 0));
        jLabel135.setText("H       :Min      :Seg    :CS");
        jLabel135.setOpaque(true);

        jLabel136.setBackground(new java.awt.Color(255, 0, 153));
        jLabel136.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("Nom.de Usuario ;");
        jLabel136.setOpaque(true);

        jTextField41.setBackground(new java.awt.Color(153, 255, 255));
        jTextField41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start10.setBackground(new java.awt.Color(0, 255, 255));
        Start10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start10.setForeground(new java.awt.Color(0, 0, 102));
        Start10.setText("Comenzar");
        Start10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start10MouseClicked(evt);
            }
        });
        Start10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start10ActionPerformed(evt);
            }
        });

        Pause10.setBackground(new java.awt.Color(204, 0, 0));
        Pause10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause10.setForeground(new java.awt.Color(255, 255, 0));
        Pause10.setText("Pausar");
        Pause10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause10MouseClicked(evt);
            }
        });

        Stop10.setBackground(new java.awt.Color(255, 255, 51));
        Stop10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop10.setText("Finalizado y desocupado");
        Stop10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop10MouseClicked(evt);
            }
        });

        jLabel137.setBackground(new java.awt.Color(0, 255, 255));
        jLabel137.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel137.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel137.setOpaque(true);

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel138.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel140.setBackground(new java.awt.Color(0, 0, 0));
        jLabel140.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(0, 255, 0));
        jLabel140.setText("00 : 00 : 00 : 00");
        jLabel140.setOpaque(true);

        jLabel141.setBackground(new java.awt.Color(0, 0, 153));
        jLabel141.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(51, 255, 0));
        jLabel141.setText("H       :Min      :Seg    :CS");
        jLabel141.setOpaque(true);

        jLabel142.setBackground(new java.awt.Color(255, 0, 153));
        jLabel142.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setText("Nom.de Usuario ;");
        jLabel142.setOpaque(true);

        jTextField43.setBackground(new java.awt.Color(153, 255, 255));
        jTextField43.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton64.setBackground(new java.awt.Color(0, 255, 255));
        jButton64.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton64.setForeground(new java.awt.Color(0, 0, 102));
        jButton64.setText("Comenzar");
        jButton64.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.setBackground(new java.awt.Color(204, 0, 0));
        jButton65.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton65.setForeground(new java.awt.Color(255, 255, 0));
        jButton65.setText("Pausar");
        jButton65.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton66.setBackground(new java.awt.Color(255, 255, 51));
        jButton66.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton66.setText("Finalizado y desocupado");
        jButton66.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel143.setBackground(new java.awt.Color(0, 255, 255));
        jLabel143.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel143.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel143.setOpaque(true);

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel144.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel145.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel145.setText("Equipo 11");

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj11.setBackground(new java.awt.Color(0, 0, 0));
        Reloj11.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj11.setForeground(new java.awt.Color(0, 255, 0));
        Reloj11.setText("00 : 00 : 00 : 00");
        Reloj11.setOpaque(true);

        jLabel148.setBackground(new java.awt.Color(0, 0, 153));
        jLabel148.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(51, 255, 0));
        jLabel148.setText("H       :Min      :Seg    :CS");
        jLabel148.setOpaque(true);

        jLabel149.setBackground(new java.awt.Color(255, 0, 153));
        jLabel149.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setText("Nom.de Usuario ;");
        jLabel149.setOpaque(true);

        jTextField45.setBackground(new java.awt.Color(153, 255, 255));
        jTextField45.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start11.setBackground(new java.awt.Color(0, 255, 255));
        Start11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start11.setForeground(new java.awt.Color(0, 0, 102));
        Start11.setText("Comenzar");
        Start11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start11MouseClicked(evt);
            }
        });
        Start11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start11ActionPerformed(evt);
            }
        });

        Pause11.setBackground(new java.awt.Color(204, 0, 0));
        Pause11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause11.setForeground(new java.awt.Color(255, 255, 0));
        Pause11.setText("Pausar");
        Pause11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause11MouseClicked(evt);
            }
        });

        Stop11.setBackground(new java.awt.Color(255, 255, 51));
        Stop11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop11.setText("Finalizado y desocupado");
        Stop11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop11MouseClicked(evt);
            }
        });

        jLabel150.setBackground(new java.awt.Color(0, 255, 255));
        jLabel150.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel150.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel150.setOpaque(true);

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel151.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel153.setBackground(new java.awt.Color(0, 0, 0));
        jLabel153.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(0, 255, 0));
        jLabel153.setText("00 : 00 : 00 : 00");
        jLabel153.setOpaque(true);

        jLabel154.setBackground(new java.awt.Color(0, 0, 153));
        jLabel154.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(51, 255, 0));
        jLabel154.setText("H       :Min      :Seg    :CS");
        jLabel154.setOpaque(true);

        jLabel155.setBackground(new java.awt.Color(255, 0, 153));
        jLabel155.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setText("Nom.de Usuario ;");
        jLabel155.setOpaque(true);

        jTextField47.setBackground(new java.awt.Color(153, 255, 255));
        jTextField47.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton70.setBackground(new java.awt.Color(0, 255, 255));
        jButton70.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton70.setForeground(new java.awt.Color(0, 0, 102));
        jButton70.setText("Comenzar");
        jButton70.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        jButton71.setBackground(new java.awt.Color(204, 0, 0));
        jButton71.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton71.setForeground(new java.awt.Color(255, 255, 0));
        jButton71.setText("Pausar");
        jButton71.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton72.setBackground(new java.awt.Color(255, 255, 51));
        jButton72.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton72.setText("Finalizado y desocupado");
        jButton72.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel156.setBackground(new java.awt.Color(0, 255, 255));
        jLabel156.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel156.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel156.setOpaque(true);

        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel157.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel158.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel158.setText("Equipo 12");

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj12.setBackground(new java.awt.Color(0, 0, 0));
        Reloj12.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj12.setForeground(new java.awt.Color(0, 255, 0));
        Reloj12.setText("00 : 00 : 00 : 00");
        Reloj12.setOpaque(true);

        jLabel161.setBackground(new java.awt.Color(0, 0, 153));
        jLabel161.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(51, 255, 0));
        jLabel161.setText("H       :Min      :Seg    :CS");
        jLabel161.setOpaque(true);

        jLabel162.setBackground(new java.awt.Color(255, 0, 153));
        jLabel162.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setText("Nom.de Usuario ;");
        jLabel162.setOpaque(true);

        jTextField49.setBackground(new java.awt.Color(153, 255, 255));
        jTextField49.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start12.setBackground(new java.awt.Color(0, 255, 255));
        Start12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start12.setForeground(new java.awt.Color(0, 0, 102));
        Start12.setText("Comenzar");
        Start12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start12MouseClicked(evt);
            }
        });
        Start12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start12ActionPerformed(evt);
            }
        });

        Pause12.setBackground(new java.awt.Color(204, 0, 0));
        Pause12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause12.setForeground(new java.awt.Color(255, 255, 0));
        Pause12.setText("Pausar");
        Pause12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause12MouseClicked(evt);
            }
        });

        Stop12.setBackground(new java.awt.Color(255, 255, 51));
        Stop12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop12.setText("Finalizado y desocupado");
        Stop12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop12MouseClicked(evt);
            }
        });

        jLabel163.setBackground(new java.awt.Color(0, 255, 255));
        jLabel163.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel163.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel163.setOpaque(true);

        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel164.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel166.setBackground(new java.awt.Color(0, 0, 0));
        jLabel166.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(0, 255, 0));
        jLabel166.setText("00 : 00 : 00 : 00");
        jLabel166.setOpaque(true);

        jLabel167.setBackground(new java.awt.Color(0, 0, 153));
        jLabel167.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(51, 255, 0));
        jLabel167.setText("H       :Min      :Seg    :CS");
        jLabel167.setOpaque(true);

        jLabel168.setBackground(new java.awt.Color(255, 0, 153));
        jLabel168.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setText("Nom.de Usuario ;");
        jLabel168.setOpaque(true);

        jTextField51.setBackground(new java.awt.Color(153, 255, 255));
        jTextField51.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton76.setBackground(new java.awt.Color(0, 255, 255));
        jButton76.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton76.setForeground(new java.awt.Color(0, 0, 102));
        jButton76.setText("Comenzar");
        jButton76.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jButton77.setBackground(new java.awt.Color(204, 0, 0));
        jButton77.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton77.setForeground(new java.awt.Color(255, 255, 0));
        jButton77.setText("Pausar");
        jButton77.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton78.setBackground(new java.awt.Color(255, 255, 51));
        jButton78.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton78.setText("Finalizado y desocupado");
        jButton78.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel169.setBackground(new java.awt.Color(0, 255, 255));
        jLabel169.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel169.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel169.setOpaque(true);

        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel170.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel171.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel171.setText("Equipo 13");

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj13.setBackground(new java.awt.Color(0, 0, 0));
        Reloj13.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj13.setForeground(new java.awt.Color(0, 255, 0));
        Reloj13.setText("00 : 00 : 00 : 00");
        Reloj13.setOpaque(true);

        jLabel174.setBackground(new java.awt.Color(0, 0, 153));
        jLabel174.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(51, 255, 0));
        jLabel174.setText("H       :Min      :Seg    :CS");
        jLabel174.setOpaque(true);

        jLabel175.setBackground(new java.awt.Color(255, 0, 153));
        jLabel175.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(255, 255, 255));
        jLabel175.setText("Nom.de Usuario ;");
        jLabel175.setOpaque(true);

        jTextField53.setBackground(new java.awt.Color(153, 255, 255));
        jTextField53.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start13.setBackground(new java.awt.Color(0, 255, 255));
        Start13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start13.setForeground(new java.awt.Color(0, 0, 102));
        Start13.setText("Comenzar");
        Start13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start13MouseClicked(evt);
            }
        });
        Start13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start13ActionPerformed(evt);
            }
        });

        Pause13.setBackground(new java.awt.Color(204, 0, 0));
        Pause13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause13.setForeground(new java.awt.Color(255, 255, 0));
        Pause13.setText("Pausar");
        Pause13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause13MouseClicked(evt);
            }
        });

        Stop13.setBackground(new java.awt.Color(255, 255, 51));
        Stop13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop13.setText("Finalizado y desocupado");
        Stop13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop13MouseClicked(evt);
            }
        });

        jLabel176.setBackground(new java.awt.Color(0, 255, 255));
        jLabel176.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel176.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel176.setOpaque(true);

        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel177.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel179.setBackground(new java.awt.Color(0, 0, 0));
        jLabel179.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(0, 255, 0));
        jLabel179.setText("00 : 00 : 00 : 00");
        jLabel179.setOpaque(true);

        jLabel180.setBackground(new java.awt.Color(0, 0, 153));
        jLabel180.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(51, 255, 0));
        jLabel180.setText("H       :Min      :Seg    :CS");
        jLabel180.setOpaque(true);

        jLabel181.setBackground(new java.awt.Color(255, 0, 153));
        jLabel181.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setText("Nom.de Usuario ;");
        jLabel181.setOpaque(true);

        jTextField55.setBackground(new java.awt.Color(153, 255, 255));
        jTextField55.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton82.setBackground(new java.awt.Color(0, 255, 255));
        jButton82.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton82.setForeground(new java.awt.Color(0, 0, 102));
        jButton82.setText("Comenzar");
        jButton82.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });

        jButton83.setBackground(new java.awt.Color(204, 0, 0));
        jButton83.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton83.setForeground(new java.awt.Color(255, 255, 0));
        jButton83.setText("Pausar");
        jButton83.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton84.setBackground(new java.awt.Color(255, 255, 51));
        jButton84.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton84.setText("Finalizado y desocupado");
        jButton84.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel182.setBackground(new java.awt.Color(0, 255, 255));
        jLabel182.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel182.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel182.setOpaque(true);

        jLabel183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel183.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel184.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel184.setText("Equipo 14");

        jLabel185.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj14.setBackground(new java.awt.Color(0, 0, 0));
        Reloj14.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj14.setForeground(new java.awt.Color(0, 255, 0));
        Reloj14.setText("00 : 00 : 00 : 00");
        Reloj14.setOpaque(true);

        jLabel187.setBackground(new java.awt.Color(0, 0, 153));
        jLabel187.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(51, 255, 0));
        jLabel187.setText("H       :Min      :Seg    :CS");
        jLabel187.setOpaque(true);

        jLabel188.setBackground(new java.awt.Color(255, 0, 153));
        jLabel188.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel188.setForeground(new java.awt.Color(255, 255, 255));
        jLabel188.setText("Nom.de Usuario ;");
        jLabel188.setOpaque(true);

        jTextField57.setBackground(new java.awt.Color(153, 255, 255));
        jTextField57.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start14.setBackground(new java.awt.Color(0, 255, 255));
        Start14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start14.setForeground(new java.awt.Color(0, 0, 102));
        Start14.setText("Comenzar");
        Start14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start14MouseClicked(evt);
            }
        });
        Start14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start14ActionPerformed(evt);
            }
        });

        Pause14.setBackground(new java.awt.Color(204, 0, 0));
        Pause14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause14.setForeground(new java.awt.Color(255, 255, 0));
        Pause14.setText("Pausar");
        Pause14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause14MouseClicked(evt);
            }
        });

        Stop14.setBackground(new java.awt.Color(255, 255, 51));
        Stop14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop14.setText("Finalizado y desocupado");
        Stop14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop14MouseClicked(evt);
            }
        });

        jLabel189.setBackground(new java.awt.Color(0, 255, 255));
        jLabel189.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel189.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel189.setOpaque(true);

        jLabel190.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel190.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel192.setBackground(new java.awt.Color(0, 0, 0));
        jLabel192.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(0, 255, 0));
        jLabel192.setText("00 : 00 : 00 : 00");
        jLabel192.setOpaque(true);

        jLabel193.setBackground(new java.awt.Color(0, 0, 153));
        jLabel193.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(51, 255, 0));
        jLabel193.setText("H       :Min      :Seg    :CS");
        jLabel193.setOpaque(true);

        jLabel194.setBackground(new java.awt.Color(255, 0, 153));
        jLabel194.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(255, 255, 255));
        jLabel194.setText("Nom.de Usuario ;");
        jLabel194.setOpaque(true);

        jTextField59.setBackground(new java.awt.Color(153, 255, 255));
        jTextField59.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton88.setBackground(new java.awt.Color(0, 255, 255));
        jButton88.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton88.setForeground(new java.awt.Color(0, 0, 102));
        jButton88.setText("Comenzar");
        jButton88.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });

        jButton89.setBackground(new java.awt.Color(204, 0, 0));
        jButton89.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton89.setForeground(new java.awt.Color(255, 255, 0));
        jButton89.setText("Pausar");
        jButton89.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton90.setBackground(new java.awt.Color(255, 255, 51));
        jButton90.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton90.setText("Finalizado y desocupado");
        jButton90.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel195.setBackground(new java.awt.Color(0, 255, 255));
        jLabel195.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel195.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel195.setOpaque(true);

        jLabel196.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel196.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel197.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel197.setText("Equipo 15");

        jLabel198.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj15.setBackground(new java.awt.Color(0, 0, 0));
        Reloj15.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj15.setForeground(new java.awt.Color(0, 255, 0));
        Reloj15.setText("00 : 00 : 00 : 00");
        Reloj15.setOpaque(true);

        jLabel200.setBackground(new java.awt.Color(0, 0, 153));
        jLabel200.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(51, 255, 0));
        jLabel200.setText("H       :Min      :Seg    :CS");
        jLabel200.setOpaque(true);

        jLabel201.setBackground(new java.awt.Color(255, 0, 153));
        jLabel201.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel201.setForeground(new java.awt.Color(255, 255, 255));
        jLabel201.setText("Nom.de Usuario ;");
        jLabel201.setOpaque(true);

        jTextField61.setBackground(new java.awt.Color(153, 255, 255));
        jTextField61.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start15.setBackground(new java.awt.Color(0, 255, 255));
        Start15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start15.setForeground(new java.awt.Color(0, 0, 102));
        Start15.setText("Comenzar");
        Start15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start15MouseClicked(evt);
            }
        });
        Start15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start15ActionPerformed(evt);
            }
        });

        Pause15.setBackground(new java.awt.Color(204, 0, 0));
        Pause15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause15.setForeground(new java.awt.Color(255, 255, 0));
        Pause15.setText("Pausar");
        Pause15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause15MouseClicked(evt);
            }
        });

        Stop15.setBackground(new java.awt.Color(255, 255, 51));
        Stop15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop15.setText("Finalizado y desocupado");
        Stop15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop15MouseClicked(evt);
            }
        });

        jLabel202.setBackground(new java.awt.Color(0, 255, 255));
        jLabel202.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel202.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel202.setOpaque(true);

        jLabel203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel203.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel205.setBackground(new java.awt.Color(0, 0, 0));
        jLabel205.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel205.setForeground(new java.awt.Color(0, 255, 0));
        jLabel205.setText("00 : 00 : 00 : 00");
        jLabel205.setOpaque(true);

        jLabel206.setBackground(new java.awt.Color(0, 0, 153));
        jLabel206.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel206.setForeground(new java.awt.Color(51, 255, 0));
        jLabel206.setText("H       :Min      :Seg    :CS");
        jLabel206.setOpaque(true);

        jLabel207.setBackground(new java.awt.Color(255, 0, 153));
        jLabel207.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(255, 255, 255));
        jLabel207.setText("Nom.de Usuario ;");
        jLabel207.setOpaque(true);

        jTextField63.setBackground(new java.awt.Color(153, 255, 255));
        jTextField63.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton94.setBackground(new java.awt.Color(0, 255, 255));
        jButton94.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton94.setForeground(new java.awt.Color(0, 0, 102));
        jButton94.setText("Comenzar");
        jButton94.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });

        jButton95.setBackground(new java.awt.Color(204, 0, 0));
        jButton95.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton95.setForeground(new java.awt.Color(255, 255, 0));
        jButton95.setText("Pausar");
        jButton95.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton96.setBackground(new java.awt.Color(255, 255, 51));
        jButton96.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton96.setText("Finalizado y desocupado");
        jButton96.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel208.setBackground(new java.awt.Color(0, 255, 255));
        jLabel208.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel208.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel208.setOpaque(true);

        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel209.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel210.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel210.setText("Equipo 16");

        jLabel211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj16.setBackground(new java.awt.Color(0, 0, 0));
        Reloj16.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj16.setForeground(new java.awt.Color(0, 255, 0));
        Reloj16.setText("00 : 00 : 00 : 00");
        Reloj16.setOpaque(true);

        jLabel213.setBackground(new java.awt.Color(0, 0, 153));
        jLabel213.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel213.setForeground(new java.awt.Color(51, 255, 0));
        jLabel213.setText("H       :Min      :Seg    :CS");
        jLabel213.setOpaque(true);

        jLabel214.setBackground(new java.awt.Color(255, 0, 153));
        jLabel214.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel214.setForeground(new java.awt.Color(255, 255, 255));
        jLabel214.setText("Nom.de Usuario ;");
        jLabel214.setOpaque(true);

        jTextField65.setBackground(new java.awt.Color(153, 255, 255));
        jTextField65.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start16.setBackground(new java.awt.Color(0, 255, 255));
        Start16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start16.setForeground(new java.awt.Color(0, 0, 102));
        Start16.setText("Comenzar");
        Start16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start16MouseClicked(evt);
            }
        });
        Start16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start16ActionPerformed(evt);
            }
        });

        Pause16.setBackground(new java.awt.Color(204, 0, 0));
        Pause16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause16.setForeground(new java.awt.Color(255, 255, 0));
        Pause16.setText("Pausar");
        Pause16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause16MouseClicked(evt);
            }
        });

        Stop16.setBackground(new java.awt.Color(255, 255, 51));
        Stop16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop16.setText("Finalizado y desocupado");
        Stop16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop16MouseClicked(evt);
            }
        });

        jLabel215.setBackground(new java.awt.Color(0, 255, 255));
        jLabel215.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel215.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel215.setOpaque(true);

        jLabel216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel216.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel217.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel218.setBackground(new java.awt.Color(0, 0, 0));
        jLabel218.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(0, 255, 0));
        jLabel218.setText("00 : 00 : 00 : 00");
        jLabel218.setOpaque(true);

        jLabel219.setBackground(new java.awt.Color(0, 0, 153));
        jLabel219.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel219.setForeground(new java.awt.Color(51, 255, 0));
        jLabel219.setText("H       :Min      :Seg    :CS");
        jLabel219.setOpaque(true);

        jLabel220.setBackground(new java.awt.Color(255, 0, 153));
        jLabel220.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel220.setForeground(new java.awt.Color(255, 255, 255));
        jLabel220.setText("Nom.de Usuario ;");
        jLabel220.setOpaque(true);

        jTextField67.setBackground(new java.awt.Color(153, 255, 255));
        jTextField67.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton100.setBackground(new java.awt.Color(0, 255, 255));
        jButton100.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton100.setForeground(new java.awt.Color(0, 0, 102));
        jButton100.setText("Comenzar");
        jButton100.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });

        jButton101.setBackground(new java.awt.Color(204, 0, 0));
        jButton101.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton101.setForeground(new java.awt.Color(255, 255, 0));
        jButton101.setText("Pausar");
        jButton101.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton102.setBackground(new java.awt.Color(255, 255, 51));
        jButton102.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton102.setText("Finalizado y desocupado");
        jButton102.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel221.setBackground(new java.awt.Color(0, 255, 255));
        jLabel221.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel221.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel221.setOpaque(true);

        jLabel222.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel222.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel223.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel223.setText("Equipo 17");

        jLabel224.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj17.setBackground(new java.awt.Color(0, 0, 0));
        Reloj17.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj17.setForeground(new java.awt.Color(0, 255, 0));
        Reloj17.setText("00 : 00 : 00 : 00");
        Reloj17.setOpaque(true);

        jLabel226.setBackground(new java.awt.Color(0, 0, 153));
        jLabel226.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel226.setForeground(new java.awt.Color(51, 255, 0));
        jLabel226.setText("H       :Min      :Seg    :CS");
        jLabel226.setOpaque(true);

        jLabel227.setBackground(new java.awt.Color(255, 0, 153));
        jLabel227.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel227.setForeground(new java.awt.Color(255, 255, 255));
        jLabel227.setText("Nom.de Usuario ;");
        jLabel227.setOpaque(true);

        jTextField69.setBackground(new java.awt.Color(153, 255, 255));
        jTextField69.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start17.setBackground(new java.awt.Color(0, 255, 255));
        Start17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start17.setForeground(new java.awt.Color(0, 0, 102));
        Start17.setText("Comenzar");
        Start17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start17MouseClicked(evt);
            }
        });
        Start17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start17ActionPerformed(evt);
            }
        });

        Pause17.setBackground(new java.awt.Color(204, 0, 0));
        Pause17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause17.setForeground(new java.awt.Color(255, 255, 0));
        Pause17.setText("Pausar");
        Pause17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause17MouseClicked(evt);
            }
        });

        Stop17.setBackground(new java.awt.Color(255, 255, 51));
        Stop17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop17.setText("Finalizado y desocupado");
        Stop17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop17MouseClicked(evt);
            }
        });

        jLabel228.setBackground(new java.awt.Color(0, 255, 255));
        jLabel228.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel228.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel228.setOpaque(true);

        jLabel229.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel229.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel230.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel231.setBackground(new java.awt.Color(0, 0, 0));
        jLabel231.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel231.setForeground(new java.awt.Color(0, 255, 0));
        jLabel231.setText("00 : 00 : 00 : 00");
        jLabel231.setOpaque(true);

        jLabel232.setBackground(new java.awt.Color(0, 0, 153));
        jLabel232.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel232.setForeground(new java.awt.Color(51, 255, 0));
        jLabel232.setText("H       :Min      :Seg    :CS");
        jLabel232.setOpaque(true);

        jLabel233.setBackground(new java.awt.Color(255, 0, 153));
        jLabel233.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel233.setForeground(new java.awt.Color(255, 255, 255));
        jLabel233.setText("Nom.de Usuario ;");
        jLabel233.setOpaque(true);

        jTextField71.setBackground(new java.awt.Color(153, 255, 255));
        jTextField71.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton106.setBackground(new java.awt.Color(0, 255, 255));
        jButton106.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton106.setForeground(new java.awt.Color(0, 0, 102));
        jButton106.setText("Comenzar");
        jButton106.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton106ActionPerformed(evt);
            }
        });

        jButton107.setBackground(new java.awt.Color(204, 0, 0));
        jButton107.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton107.setForeground(new java.awt.Color(255, 255, 0));
        jButton107.setText("Pausar");
        jButton107.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton108.setBackground(new java.awt.Color(255, 255, 51));
        jButton108.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton108.setText("Finalizado y desocupado");
        jButton108.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel234.setBackground(new java.awt.Color(0, 255, 255));
        jLabel234.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel234.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel234.setOpaque(true);

        jLabel235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel235.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel236.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel236.setText("Equipo 18");

        jLabel237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj18.setBackground(new java.awt.Color(0, 0, 0));
        Reloj18.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj18.setForeground(new java.awt.Color(0, 255, 0));
        Reloj18.setText("00 : 00 : 00 : 00");
        Reloj18.setOpaque(true);

        jLabel239.setBackground(new java.awt.Color(0, 0, 153));
        jLabel239.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel239.setForeground(new java.awt.Color(51, 255, 0));
        jLabel239.setText("H       :Min      :Seg    :CS");
        jLabel239.setOpaque(true);

        jLabel240.setBackground(new java.awt.Color(255, 0, 153));
        jLabel240.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel240.setForeground(new java.awt.Color(255, 255, 255));
        jLabel240.setText("Nom.de Usuario ;");
        jLabel240.setOpaque(true);

        jTextField73.setBackground(new java.awt.Color(153, 255, 255));
        jTextField73.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start18.setBackground(new java.awt.Color(0, 255, 255));
        Start18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start18.setForeground(new java.awt.Color(0, 0, 102));
        Start18.setText("Comenzar");
        Start18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start18MouseClicked(evt);
            }
        });
        Start18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start18ActionPerformed(evt);
            }
        });

        Pause18.setBackground(new java.awt.Color(204, 0, 0));
        Pause18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause18.setForeground(new java.awt.Color(255, 255, 0));
        Pause18.setText("Pausar");
        Pause18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause18MouseClicked(evt);
            }
        });

        Stop18.setBackground(new java.awt.Color(255, 255, 51));
        Stop18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop18.setText("Finalizado y desocupado");
        Stop18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop18MouseClicked(evt);
            }
        });

        jLabel241.setBackground(new java.awt.Color(0, 255, 255));
        jLabel241.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel241.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel241.setOpaque(true);

        jLabel242.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel242.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel243.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel244.setBackground(new java.awt.Color(0, 0, 0));
        jLabel244.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel244.setForeground(new java.awt.Color(0, 255, 0));
        jLabel244.setText("00 : 00 : 00 : 00");
        jLabel244.setOpaque(true);

        jLabel245.setBackground(new java.awt.Color(0, 0, 153));
        jLabel245.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel245.setForeground(new java.awt.Color(51, 255, 0));
        jLabel245.setText("H       :Min      :Seg    :CS");
        jLabel245.setOpaque(true);

        jLabel246.setBackground(new java.awt.Color(255, 0, 153));
        jLabel246.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel246.setForeground(new java.awt.Color(255, 255, 255));
        jLabel246.setText("Nom.de Usuario ;");
        jLabel246.setOpaque(true);

        jTextField75.setBackground(new java.awt.Color(153, 255, 255));
        jTextField75.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton112.setBackground(new java.awt.Color(0, 255, 255));
        jButton112.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton112.setForeground(new java.awt.Color(0, 0, 102));
        jButton112.setText("Comenzar");
        jButton112.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton112ActionPerformed(evt);
            }
        });

        jButton113.setBackground(new java.awt.Color(204, 0, 0));
        jButton113.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton113.setForeground(new java.awt.Color(255, 255, 0));
        jButton113.setText("Pausar");
        jButton113.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton114.setBackground(new java.awt.Color(255, 255, 51));
        jButton114.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton114.setText("Finalizado y desocupado");
        jButton114.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel247.setBackground(new java.awt.Color(0, 255, 255));
        jLabel247.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel247.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel247.setOpaque(true);

        jLabel248.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel248.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel249.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel249.setText("Equipo 19");

        jLabel250.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj19.setBackground(new java.awt.Color(0, 0, 0));
        Reloj19.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj19.setForeground(new java.awt.Color(0, 255, 0));
        Reloj19.setText("00 : 00 : 00 : 00");
        Reloj19.setOpaque(true);

        jLabel252.setBackground(new java.awt.Color(0, 0, 153));
        jLabel252.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel252.setForeground(new java.awt.Color(51, 255, 0));
        jLabel252.setText("H       :Min      :Seg    :CS");
        jLabel252.setOpaque(true);

        jLabel253.setBackground(new java.awt.Color(255, 0, 153));
        jLabel253.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel253.setForeground(new java.awt.Color(255, 255, 255));
        jLabel253.setText("Nom.de Usuario ;");
        jLabel253.setOpaque(true);

        jTextField77.setBackground(new java.awt.Color(153, 255, 255));
        jTextField77.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start19.setBackground(new java.awt.Color(0, 255, 255));
        Start19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start19.setForeground(new java.awt.Color(0, 0, 102));
        Start19.setText("Comenzar");
        Start19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start19MouseClicked(evt);
            }
        });
        Start19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start19ActionPerformed(evt);
            }
        });

        Pause19.setBackground(new java.awt.Color(204, 0, 0));
        Pause19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause19.setForeground(new java.awt.Color(255, 255, 0));
        Pause19.setText("Pausar");
        Pause19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause19MouseClicked(evt);
            }
        });

        Stop19.setBackground(new java.awt.Color(255, 255, 51));
        Stop19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop19.setText("Finalizado y desocupado");
        Stop19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop19MouseClicked(evt);
            }
        });

        jLabel254.setBackground(new java.awt.Color(0, 255, 255));
        jLabel254.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel254.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel254.setOpaque(true);

        jLabel255.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel255.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel256.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel257.setBackground(new java.awt.Color(0, 0, 0));
        jLabel257.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel257.setForeground(new java.awt.Color(0, 255, 0));
        jLabel257.setText("00 : 00 : 00 : 00");
        jLabel257.setOpaque(true);

        jLabel258.setBackground(new java.awt.Color(0, 0, 153));
        jLabel258.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel258.setForeground(new java.awt.Color(51, 255, 0));
        jLabel258.setText("H       :Min      :Seg    :CS");
        jLabel258.setOpaque(true);

        jLabel259.setBackground(new java.awt.Color(255, 0, 153));
        jLabel259.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel259.setForeground(new java.awt.Color(255, 255, 255));
        jLabel259.setText("Nom.de Usuario ;");
        jLabel259.setOpaque(true);

        jTextField79.setBackground(new java.awt.Color(153, 255, 255));
        jTextField79.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton118.setBackground(new java.awt.Color(0, 255, 255));
        jButton118.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton118.setForeground(new java.awt.Color(0, 0, 102));
        jButton118.setText("Comenzar");
        jButton118.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton118ActionPerformed(evt);
            }
        });

        jButton119.setBackground(new java.awt.Color(204, 0, 0));
        jButton119.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton119.setForeground(new java.awt.Color(255, 255, 0));
        jButton119.setText("Pausar");
        jButton119.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton120.setBackground(new java.awt.Color(255, 255, 51));
        jButton120.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton120.setText("Finalizado y desocupado");
        jButton120.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel260.setBackground(new java.awt.Color(0, 255, 255));
        jLabel260.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel260.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel260.setOpaque(true);

        jLabel261.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel261.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel262.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel262.setText("Equipo 20");

        jLabel263.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj20.setBackground(new java.awt.Color(0, 0, 0));
        Reloj20.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj20.setForeground(new java.awt.Color(0, 255, 0));
        Reloj20.setText("00 : 00 : 00 : 00");
        Reloj20.setOpaque(true);

        jLabel265.setBackground(new java.awt.Color(0, 0, 153));
        jLabel265.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel265.setForeground(new java.awt.Color(51, 255, 0));
        jLabel265.setText("H       :Min      :Seg    :CS");
        jLabel265.setOpaque(true);

        jLabel266.setBackground(new java.awt.Color(255, 0, 153));
        jLabel266.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel266.setForeground(new java.awt.Color(255, 255, 255));
        jLabel266.setText("Nom.de Usuario ;");
        jLabel266.setOpaque(true);

        jTextField81.setBackground(new java.awt.Color(153, 255, 255));
        jTextField81.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start20.setBackground(new java.awt.Color(0, 255, 255));
        Start20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start20.setForeground(new java.awt.Color(0, 0, 102));
        Start20.setText("Comenzar");
        Start20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start20MouseClicked(evt);
            }
        });
        Start20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start20ActionPerformed(evt);
            }
        });

        Pause20.setBackground(new java.awt.Color(204, 0, 0));
        Pause20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause20.setForeground(new java.awt.Color(255, 255, 0));
        Pause20.setText("Pausar");
        Pause20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause20MouseClicked(evt);
            }
        });

        Stop20.setBackground(new java.awt.Color(255, 255, 51));
        Stop20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop20.setText("Finalizado y desocupado");
        Stop20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop20MouseClicked(evt);
            }
        });

        jLabel267.setBackground(new java.awt.Color(0, 255, 255));
        jLabel267.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel267.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel267.setOpaque(true);

        jLabel268.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel268.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel269.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel270.setBackground(new java.awt.Color(0, 0, 0));
        jLabel270.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel270.setForeground(new java.awt.Color(0, 255, 0));
        jLabel270.setText("00 : 00 : 00 : 00");
        jLabel270.setOpaque(true);

        jLabel271.setBackground(new java.awt.Color(0, 0, 153));
        jLabel271.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel271.setForeground(new java.awt.Color(51, 255, 0));
        jLabel271.setText("H       :Min      :Seg    :CS");
        jLabel271.setOpaque(true);

        jLabel272.setBackground(new java.awt.Color(255, 0, 153));
        jLabel272.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel272.setForeground(new java.awt.Color(255, 255, 255));
        jLabel272.setText("Nom.de Usuario ;");
        jLabel272.setOpaque(true);

        jTextField83.setBackground(new java.awt.Color(153, 255, 255));
        jTextField83.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton124.setBackground(new java.awt.Color(0, 255, 255));
        jButton124.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton124.setForeground(new java.awt.Color(0, 0, 102));
        jButton124.setText("Comenzar");
        jButton124.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton124ActionPerformed(evt);
            }
        });

        jButton125.setBackground(new java.awt.Color(204, 0, 0));
        jButton125.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton125.setForeground(new java.awt.Color(255, 255, 0));
        jButton125.setText("Pausar");
        jButton125.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton126.setBackground(new java.awt.Color(255, 255, 51));
        jButton126.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton126.setText("Finalizado y desocupado");
        jButton126.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel273.setBackground(new java.awt.Color(0, 255, 255));
        jLabel273.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel273.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel273.setOpaque(true);

        jLabel274.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel274.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel275.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel275.setText("Equipo 21");

        jLabel276.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj21.setBackground(new java.awt.Color(0, 0, 0));
        Reloj21.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj21.setForeground(new java.awt.Color(0, 255, 0));
        Reloj21.setText("00 : 00 : 00 : 00");
        Reloj21.setOpaque(true);

        jLabel278.setBackground(new java.awt.Color(0, 0, 153));
        jLabel278.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel278.setForeground(new java.awt.Color(51, 255, 0));
        jLabel278.setText("H       :Min      :Seg    :CS");
        jLabel278.setOpaque(true);

        jLabel279.setBackground(new java.awt.Color(255, 0, 153));
        jLabel279.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel279.setForeground(new java.awt.Color(255, 255, 255));
        jLabel279.setText("Nom.de Usuario ;");
        jLabel279.setOpaque(true);

        jTextField85.setBackground(new java.awt.Color(153, 255, 255));
        jTextField85.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start21.setBackground(new java.awt.Color(0, 255, 255));
        Start21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start21.setForeground(new java.awt.Color(0, 0, 102));
        Start21.setText("Comenzar");
        Start21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start21MouseClicked(evt);
            }
        });
        Start21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start21ActionPerformed(evt);
            }
        });

        Pause21.setBackground(new java.awt.Color(204, 0, 0));
        Pause21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause21.setForeground(new java.awt.Color(255, 255, 0));
        Pause21.setText("Pausar");
        Pause21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause21MouseClicked(evt);
            }
        });

        Stop21.setBackground(new java.awt.Color(255, 255, 51));
        Stop21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop21.setText("Finalizado y desocupado");
        Stop21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop21MouseClicked(evt);
            }
        });

        jLabel280.setBackground(new java.awt.Color(0, 255, 255));
        jLabel280.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel280.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel280.setOpaque(true);

        jLabel281.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel281.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel282.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel283.setBackground(new java.awt.Color(0, 0, 0));
        jLabel283.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel283.setForeground(new java.awt.Color(0, 255, 0));
        jLabel283.setText("00 : 00 : 00 : 00");
        jLabel283.setOpaque(true);

        jLabel284.setBackground(new java.awt.Color(0, 0, 153));
        jLabel284.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel284.setForeground(new java.awt.Color(51, 255, 0));
        jLabel284.setText("H       :Min      :Seg    :CS");
        jLabel284.setOpaque(true);

        jLabel285.setBackground(new java.awt.Color(255, 0, 153));
        jLabel285.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel285.setForeground(new java.awt.Color(255, 255, 255));
        jLabel285.setText("Nom.de Usuario ;");
        jLabel285.setOpaque(true);

        jTextField87.setBackground(new java.awt.Color(153, 255, 255));
        jTextField87.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton130.setBackground(new java.awt.Color(0, 255, 255));
        jButton130.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton130.setForeground(new java.awt.Color(0, 0, 102));
        jButton130.setText("Comenzar");
        jButton130.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton130ActionPerformed(evt);
            }
        });

        jButton131.setBackground(new java.awt.Color(204, 0, 0));
        jButton131.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton131.setForeground(new java.awt.Color(255, 255, 0));
        jButton131.setText("Pausar");
        jButton131.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton132.setBackground(new java.awt.Color(255, 255, 51));
        jButton132.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton132.setText("Finalizado y desocupado");
        jButton132.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel286.setBackground(new java.awt.Color(0, 255, 255));
        jLabel286.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel286.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel286.setOpaque(true);

        jLabel287.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel287.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel288.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel288.setText("Equipo 22");

        jLabel289.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj22.setBackground(new java.awt.Color(0, 0, 0));
        Reloj22.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj22.setForeground(new java.awt.Color(0, 255, 0));
        Reloj22.setText("00 : 00 : 00 : 00");
        Reloj22.setOpaque(true);

        jLabel291.setBackground(new java.awt.Color(0, 0, 153));
        jLabel291.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel291.setForeground(new java.awt.Color(51, 255, 0));
        jLabel291.setText("H       :Min      :Seg    :CS");
        jLabel291.setOpaque(true);

        jLabel292.setBackground(new java.awt.Color(255, 0, 153));
        jLabel292.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel292.setForeground(new java.awt.Color(255, 255, 255));
        jLabel292.setText("Nom.de Usuario ;");
        jLabel292.setOpaque(true);

        jTextField89.setBackground(new java.awt.Color(153, 255, 255));
        jTextField89.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start22.setBackground(new java.awt.Color(0, 255, 255));
        Start22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start22.setForeground(new java.awt.Color(0, 0, 102));
        Start22.setText("Comenzar");
        Start22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start22MouseClicked(evt);
            }
        });
        Start22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start22ActionPerformed(evt);
            }
        });

        Pause22.setBackground(new java.awt.Color(204, 0, 0));
        Pause22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause22.setForeground(new java.awt.Color(255, 255, 0));
        Pause22.setText("Pausar");
        Pause22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause22MouseClicked(evt);
            }
        });

        Stop22.setBackground(new java.awt.Color(255, 255, 51));
        Stop22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop22.setText("Finalizado y desocupado");
        Stop22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop22MouseClicked(evt);
            }
        });

        jLabel293.setBackground(new java.awt.Color(0, 255, 255));
        jLabel293.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel293.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel293.setOpaque(true);

        jLabel294.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel294.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel295.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel296.setBackground(new java.awt.Color(0, 0, 0));
        jLabel296.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel296.setForeground(new java.awt.Color(0, 255, 0));
        jLabel296.setText("00 : 00 : 00 : 00");
        jLabel296.setOpaque(true);

        jLabel297.setBackground(new java.awt.Color(0, 0, 153));
        jLabel297.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel297.setForeground(new java.awt.Color(51, 255, 0));
        jLabel297.setText("H       :Min      :Seg    :CS");
        jLabel297.setOpaque(true);

        jLabel298.setBackground(new java.awt.Color(255, 0, 153));
        jLabel298.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel298.setForeground(new java.awt.Color(255, 255, 255));
        jLabel298.setText("Nom.de Usuario ;");
        jLabel298.setOpaque(true);

        jTextField91.setBackground(new java.awt.Color(153, 255, 255));
        jTextField91.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton136.setBackground(new java.awt.Color(0, 255, 255));
        jButton136.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton136.setForeground(new java.awt.Color(0, 0, 102));
        jButton136.setText("Comenzar");
        jButton136.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton136ActionPerformed(evt);
            }
        });

        jButton137.setBackground(new java.awt.Color(204, 0, 0));
        jButton137.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton137.setForeground(new java.awt.Color(255, 255, 0));
        jButton137.setText("Pausar");
        jButton137.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton138.setBackground(new java.awt.Color(255, 255, 51));
        jButton138.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton138.setText("Finalizado y desocupado");
        jButton138.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel299.setBackground(new java.awt.Color(0, 255, 255));
        jLabel299.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel299.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel299.setOpaque(true);

        jLabel300.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel300.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel301.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel301.setText("Equipo 23");

        jLabel302.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj23.setBackground(new java.awt.Color(0, 0, 0));
        Reloj23.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj23.setForeground(new java.awt.Color(0, 255, 0));
        Reloj23.setText("00 : 00 : 00 : 00");
        Reloj23.setOpaque(true);

        jLabel304.setBackground(new java.awt.Color(0, 0, 153));
        jLabel304.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel304.setForeground(new java.awt.Color(51, 255, 0));
        jLabel304.setText("H       :Min      :Seg    :CS");
        jLabel304.setOpaque(true);

        jLabel305.setBackground(new java.awt.Color(255, 0, 153));
        jLabel305.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel305.setForeground(new java.awt.Color(255, 255, 255));
        jLabel305.setText("Nom.de Usuario ;");
        jLabel305.setOpaque(true);

        jTextField93.setBackground(new java.awt.Color(153, 255, 255));
        jTextField93.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start23.setBackground(new java.awt.Color(0, 255, 255));
        Start23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start23.setForeground(new java.awt.Color(0, 0, 102));
        Start23.setText("Comenzar");
        Start23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start23MouseClicked(evt);
            }
        });
        Start23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start23ActionPerformed(evt);
            }
        });

        Pause23.setBackground(new java.awt.Color(204, 0, 0));
        Pause23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause23.setForeground(new java.awt.Color(255, 255, 0));
        Pause23.setText("Pausar");
        Pause23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause23MouseClicked(evt);
            }
        });

        Stop23.setBackground(new java.awt.Color(255, 255, 51));
        Stop23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop23.setText("Finalizado y desocupado");
        Stop23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop23MouseClicked(evt);
            }
        });

        jLabel306.setBackground(new java.awt.Color(0, 255, 255));
        jLabel306.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel306.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel306.setOpaque(true);

        jLabel307.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel307.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel308.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel309.setBackground(new java.awt.Color(0, 0, 0));
        jLabel309.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel309.setForeground(new java.awt.Color(0, 255, 0));
        jLabel309.setText("00 : 00 : 00 : 00");
        jLabel309.setOpaque(true);

        jLabel310.setBackground(new java.awt.Color(0, 0, 153));
        jLabel310.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel310.setForeground(new java.awt.Color(51, 255, 0));
        jLabel310.setText("H       :Min      :Seg    :CS");
        jLabel310.setOpaque(true);

        jLabel311.setBackground(new java.awt.Color(255, 0, 153));
        jLabel311.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel311.setForeground(new java.awt.Color(255, 255, 255));
        jLabel311.setText("Nom.de Usuario ;");
        jLabel311.setOpaque(true);

        jTextField95.setBackground(new java.awt.Color(153, 255, 255));
        jTextField95.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton142.setBackground(new java.awt.Color(0, 255, 255));
        jButton142.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton142.setForeground(new java.awt.Color(0, 0, 102));
        jButton142.setText("Comenzar");
        jButton142.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton142ActionPerformed(evt);
            }
        });

        jButton143.setBackground(new java.awt.Color(204, 0, 0));
        jButton143.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton143.setForeground(new java.awt.Color(255, 255, 0));
        jButton143.setText("Pausar");
        jButton143.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton144.setBackground(new java.awt.Color(255, 255, 51));
        jButton144.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton144.setText("Finalizado y desocupado");
        jButton144.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel312.setBackground(new java.awt.Color(0, 255, 255));
        jLabel312.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel312.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel312.setOpaque(true);

        jLabel313.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel313.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel314.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel314.setText("Equipo 24");

        jLabel315.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        Reloj24.setBackground(new java.awt.Color(0, 0, 0));
        Reloj24.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Reloj24.setForeground(new java.awt.Color(0, 255, 0));
        Reloj24.setText("00 : 00 : 00 : 00");
        Reloj24.setOpaque(true);

        jLabel317.setBackground(new java.awt.Color(0, 0, 153));
        jLabel317.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel317.setForeground(new java.awt.Color(51, 255, 0));
        jLabel317.setText("H       :Min      :Seg    :CS");
        jLabel317.setOpaque(true);

        jLabel318.setBackground(new java.awt.Color(255, 0, 153));
        jLabel318.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel318.setForeground(new java.awt.Color(255, 255, 255));
        jLabel318.setText("Nom.de Usuario ;");
        jLabel318.setOpaque(true);

        jTextField97.setBackground(new java.awt.Color(153, 255, 255));
        jTextField97.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Start24.setBackground(new java.awt.Color(0, 255, 255));
        Start24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start24.setForeground(new java.awt.Color(0, 0, 102));
        Start24.setText("Comenzar");
        Start24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Start24MouseClicked(evt);
            }
        });
        Start24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start24ActionPerformed(evt);
            }
        });

        Pause24.setBackground(new java.awt.Color(204, 0, 0));
        Pause24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Pause24.setForeground(new java.awt.Color(255, 255, 0));
        Pause24.setText("Pausar");
        Pause24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pause24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause24MouseClicked(evt);
            }
        });

        Stop24.setBackground(new java.awt.Color(255, 255, 51));
        Stop24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Stop24.setText("Finalizado y desocupado");
        Stop24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Stop24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop24MouseClicked(evt);
            }
        });

        jLabel319.setBackground(new java.awt.Color(0, 255, 255));
        jLabel319.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel319.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel319.setOpaque(true);

        jLabel320.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel320.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jLabel321.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N

        jLabel322.setBackground(new java.awt.Color(0, 0, 0));
        jLabel322.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel322.setForeground(new java.awt.Color(0, 255, 0));
        jLabel322.setText("00 : 00 : 00 : 00");
        jLabel322.setOpaque(true);

        jLabel323.setBackground(new java.awt.Color(0, 0, 153));
        jLabel323.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel323.setForeground(new java.awt.Color(51, 255, 0));
        jLabel323.setText("H       :Min      :Seg    :CS");
        jLabel323.setOpaque(true);

        jLabel324.setBackground(new java.awt.Color(255, 0, 153));
        jLabel324.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel324.setForeground(new java.awt.Color(255, 255, 255));
        jLabel324.setText("Nom.de Usuario ;");
        jLabel324.setOpaque(true);

        jTextField99.setBackground(new java.awt.Color(153, 255, 255));
        jTextField99.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton148.setBackground(new java.awt.Color(0, 255, 255));
        jButton148.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton148.setForeground(new java.awt.Color(0, 0, 102));
        jButton148.setText("Comenzar");
        jButton148.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton148ActionPerformed(evt);
            }
        });

        jButton149.setBackground(new java.awt.Color(204, 0, 0));
        jButton149.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton149.setForeground(new java.awt.Color(255, 255, 0));
        jButton149.setText("Pausar");
        jButton149.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton150.setBackground(new java.awt.Color(255, 255, 51));
        jButton150.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton150.setText("Finalizado y desocupado");
        jButton150.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel325.setBackground(new java.awt.Color(0, 255, 255));
        jLabel325.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel325.setText("Grado,Grupo,Turno y Especialidad; ");
        jLabel325.setOpaque(true);

        jLabel326.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        jLabel326.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 51, 0), new java.awt.Color(153, 51, 0), new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

        jTextField173.setBackground(new java.awt.Color(153, 255, 255));
        jTextField173.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton260.setBackground(new java.awt.Color(204, 0, 0));
        jButton260.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton260.setForeground(new java.awt.Color(255, 255, 0));
        jButton260.setText("Pausar");
        jButton260.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField175.setBackground(new java.awt.Color(153, 255, 255));
        jTextField175.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton263.setBackground(new java.awt.Color(204, 0, 0));
        jButton263.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton263.setForeground(new java.awt.Color(255, 255, 0));
        jButton263.setText("Pausar");
        jButton263.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton265.setBackground(new java.awt.Color(102, 255, 204));
        jButton265.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton265.setText("Estados de los Equipos ");
        jButton265.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 51), new java.awt.Color(0, 255, 102), new java.awt.Color(51, 255, 204), new java.awt.Color(0, 153, 153)));

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel2.setText("Laboratorio de Computo 1");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 4, true));

        jButton2.setBackground(new java.awt.Color(255, 102, 255));
        jButton2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton2.setText("Salir");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(204, 0, 204), new java.awt.Color(255, 0, 255)));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton1.setText("Datos Obtenidos");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1022, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton265, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Stop3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Start3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Pause11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Pause12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Start12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Stop12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pause13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel302)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel275, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel288, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel279, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel280, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Stop21, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reloj22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel298, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel299, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Start22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel310, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel306, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel312, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton143, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addComponent(jLabel185)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Start14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(230, 230, 230)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel323, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButton150, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jButton149, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel176))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel285, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(Pause23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(830, 830, 830)
                        .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1060, 1060, 1060)
                        .addComponent(jLabel301, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(Reloj13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel283, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(Reloj21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel319, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(780, 780, 780)
                        .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(780, 780, 780)
                        .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(880, 880, 880)
                        .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(Reloj23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1330, 1330, 1330)
                        .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1020, 1020, 1020)
                        .addComponent(jLabel287, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1020, 1020, 1020)
                        .addComponent(jLabel300, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Start1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Reloj4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(Stop22, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jLabel165))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1040, 1040, 1040)
                        .addComponent(jLabel308))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel324, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jLabel159))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel325, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(780, 780, 780)
                        .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel304, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jLabel191))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jLabel152))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(Start21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(880, 880, 880)
                        .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Stop2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(880, 880, 880)
                        .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel309, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(Start11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(830, 830, 830)
                        .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(Pause22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1020, 1020, 1020)
                        .addComponent(jLabel307, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1040, 1040, 1040)
                        .addComponent(jLabel276))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(880, 880, 880)
                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel311, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel317, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel194, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel189))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel292, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(780, 780, 780)
                        .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel177, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel278, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel297, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jLabel172))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1040, 1040, 1040)
                        .addComponent(jLabel315))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(Stop24, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1040, 1040, 1040)
                        .addComponent(jLabel282))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1040, 1040, 1040)
                        .addComponent(jLabel289))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1020, 1020, 1020)
                        .addComponent(jLabel294, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel322, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1040, 1040, 1040)
                        .addComponent(jLabel295))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Reloj3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jButton148, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(830, 830, 830)
                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1020, 1020, 1020)
                        .addComponent(jLabel281, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(830, 830, 830)
                        .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Stop1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(780, 780, 780)
                        .addComponent(Pause14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(Start13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Start2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(Pause1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Reloj2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel305, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Stop4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(Reloj12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1380, 1380, 1380)
                        .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(780, 780, 780)
                        .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(Stop11, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(Stop23, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(Pause24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1020, 1020, 1020)
                        .addComponent(jLabel313, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(Start23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel293, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(780, 780, 780)
                        .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel286, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Reloj1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(jButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(780, 780, 780)
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(Pause2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel284, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel296, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(780, 780, 780)
                        .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jLabel178))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(780, 780, 780)
                        .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1040, 1040, 1040)
                        .addComponent(jLabel321))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(Reloj24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(780, 780, 780)
                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1060, 1060, 1060)
                        .addComponent(jLabel314, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel318, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(Stop14, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(jLabel291, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1020, 1020, 1020)
                        .addComponent(jLabel326, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(Pause3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(Pause21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1330, 1330, 1330)
                        .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1330, 1330, 1330)
                        .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1280, 1280, 1280)
                        .addComponent(jButton131, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(Stop13, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1180, 1180, 1180)
                        .addComponent(Start24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jLabel146))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(Pause4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Start4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(Reloj14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1020, 1020, 1020)
                        .addComponent(jLabel320, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(650, 650, 650)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField175, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jTextField174, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField176, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton260, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton263, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(Pause5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Stop5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Start5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel74)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Start15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel204))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel208, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel198))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Stop15, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel202))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Pause15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Start6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel81))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Pause6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Stop6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel87)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel220, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel215)
                                    .addComponent(jLabel221, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Start16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(Pause16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Stop16, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel222, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel218, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel216, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel219, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel211))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel210, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel217))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Start7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel94))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Stop7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Pause7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel100))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel231, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel230))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel224))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel233, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel229, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Stop17, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel232, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel226, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel228))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Pause17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel234, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Start17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel235, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Start8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel113))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Pause8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Stop8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel107)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel236, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel244, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Reloj18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel240, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel241)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Stop18, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Pause18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel242, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel245, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel237))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Start18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel239, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel246, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel247, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel248, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel243))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Start9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel120))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Stop9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Pause9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel126))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel259, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel253, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel254)
                                        .addGap(5, 5, 5)
                                        .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Stop19, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Start19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel250))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel252, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel260, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel249, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel261, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Pause19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel257, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel256))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel258, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel255, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Stop10, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel139))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Start10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Pause10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel133)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel266, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton126, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Stop20, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel270, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Reloj20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel263))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel267))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel273, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel265, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel272, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(Pause20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel274, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel262, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel271, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel268, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jButton125, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(Start20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel269))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton265, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(130, 130, 130)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel29))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel48)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addComponent(Stop3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(Start3)
                                                    .addComponent(jButton22)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(jButton70))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(Reloj11))
                                            .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(Pause11))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel153)))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(Pause12))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(Start12))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(Stop12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel179)
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton82)
                                            .addComponent(Pause13)
                                            .addComponent(jButton83)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addComponent(jLabel275, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(110, 110, 110)
                                        .addComponent(jLabel288, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(110, 110, 110)
                                        .addComponent(jLabel302))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(240, 240, 240)
                                        .addComponent(jLabel279, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel280, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addComponent(Stop21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(Reloj22)
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel298, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel299, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Start22))
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel310, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel306, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel312, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton142)
                                            .addComponent(jButton143)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(560, 560, 560)
                                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(650, 650, 650)
                                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(270, 270, 270)
                                        .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel185))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel192)
                                        .addGap(69, 69, 69)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton88)
                                            .addComponent(Start14)
                                            .addComponent(jButton89)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel323, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jButton150, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButton149)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(650, 650, 650)
                                .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel285, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(680, 680, 680)
                                .addComponent(Pause23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(650, 650, 650)
                                .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jLabel35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(570, 570, 570)
                                .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(580, 580, 580)
                                .addComponent(jLabel301, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(590, 590, 590)
                                .addComponent(Reloj13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(760, 760, 760)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(750, 750, 750)
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(770, 770, 770)
                                .addComponent(jLabel61))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel283))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(Reloj21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(jButton76))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(840, 840, 840)
                                .addComponent(jLabel319, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(810, 810, 810)
                                .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(770, 770, 770)
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jButton71))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addComponent(jLabel166))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(650, 650, 650)
                                .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(590, 590, 590)
                                .addComponent(Reloj23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(650, 650, 650)
                                .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel287, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(jButton17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(620, 620, 620)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addComponent(jLabel300, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(680, 680, 680)
                                .addComponent(jButton23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(Start1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(620, 620, 620)
                                .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(780, 780, 780)
                                .addComponent(jLabel62))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(780, 780, 780)
                                .addComponent(Reloj4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(510, 510, 510)
                                .addComponent(Stop22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jLabel165))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jButton10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(580, 580, 580)
                                .addComponent(jLabel308))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(870, 870, 870)
                                .addComponent(jButton28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(650, 650, 650)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(810, 810, 810)
                                .addComponent(jLabel324, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(840, 840, 840)
                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jLabel159))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(810, 810, 810)
                                .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(560, 560, 560)
                                .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(840, 840, 840)
                                .addComponent(jLabel325, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(570, 570, 570)
                                .addComponent(jLabel304, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(770, 770, 770)
                                .addComponent(jLabel191))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel152))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(770, 770, 770)
                                .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(Start21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(510, 510, 510)
                                .addComponent(Stop2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(650, 650, 650)
                                .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(840, 840, 840)
                                .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(590, 590, 590)
                                .addComponent(jLabel309))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(Start11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(Pause22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(810, 810, 810)
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(560, 560, 560)
                                .addComponent(jLabel307, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel276))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(620, 620, 620)
                                .addComponent(jLabel311, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(760, 760, 760)
                                .addComponent(jLabel317, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(810, 810, 810)
                                .addComponent(jLabel194, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(840, 840, 840)
                                .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(jLabel292, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(620, 620, 620)
                                .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(810, 810, 810)
                                .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(jButton136))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(560, 560, 560)
                                .addComponent(jLabel177, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel278, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jLabel297, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(510, 510, 510)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(580, 580, 580)
                                .addComponent(jLabel172))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(770, 770, 770)
                                .addComponent(jLabel315))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(890, 890, 890)
                                .addComponent(Stop24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel282))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jLabel289))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addComponent(jLabel294, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(780, 780, 780)
                                .addComponent(jLabel322))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jLabel295))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(590, 590, 590)
                                .addComponent(Reloj3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(580, 580, 580)
                                .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(870, 870, 870)
                                .addComponent(jButton148))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(620, 620, 620)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel281, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jButton130))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(840, 840, 840)
                                .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(Stop1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(870, 870, 870)
                                .addComponent(Pause14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(680, 680, 680)
                                .addComponent(Start13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(810, 810, 810)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(Start2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(Pause1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(580, 580, 580)
                                .addComponent(jLabel42))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(700, 700, 700)
                                .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addComponent(Reloj2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(620, 620, 620)
                                .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(560, 560, 560)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(620, 620, 620)
                                .addComponent(jLabel305, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(890, 890, 890)
                                .addComponent(Stop4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addComponent(Reloj12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(650, 650, 650)
                                .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(620, 620, 620)
                                .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(590, 590, 590)
                                .addComponent(jLabel49))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(Stop11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(jButton16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(700, 700, 700)
                                .addComponent(Stop23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(760, 760, 760)
                                .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(770, 770, 770)
                                .addComponent(jLabel55))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(870, 870, 870)
                                .addComponent(Pause24))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(560, 560, 560)
                                .addComponent(jLabel313, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(680, 680, 680)
                                .addComponent(Start23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(jLabel293, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addComponent(jLabel36))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(840, 840, 840)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(890, 890, 890)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(jButton77))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jLabel286, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(Reloj1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(jButton137))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(620, 620, 620)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(Pause2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(570, 570, 570)
                                .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(750, 750, 750)
                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel284, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addComponent(jLabel296))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(580, 580, 580)
                                .addComponent(jLabel178))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(810, 810, 810)
                                .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(770, 770, 770)
                                .addComponent(jLabel321))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(760, 760, 760)
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(780, 780, 780)
                                .addComponent(Reloj24))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(750, 750, 750)
                                .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(770, 770, 770)
                                .addComponent(jLabel314, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(570, 570, 570)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(810, 810, 810)
                                .addComponent(jLabel318, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(840, 840, 840)
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(650, 650, 650)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(840, 840, 840)
                                .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(570, 570, 570)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(870, 870, 870)
                                .addComponent(jButton29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(510, 510, 510)
                                .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jButton11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(700, 700, 700)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(890, 890, 890)
                                .addComponent(Stop14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jLabel291, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(750, 750, 750)
                                .addComponent(jLabel326, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(680, 680, 680)
                                .addComponent(Pause3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(750, 750, 750)
                                .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(Pause21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jButton131))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(700, 700, 700)
                                .addComponent(Stop13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(870, 870, 870)
                                .addComponent(Start24))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(650, 650, 650)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel146))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(620, 620, 620)
                                .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(870, 870, 870)
                                .addComponent(Pause4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(870, 870, 870)
                                .addComponent(Start4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(780, 780, 780)
                                .addComponent(Reloj14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(460, 460, 460)
                                .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(750, 750, 750)
                                .addComponent(jLabel320, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField173, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton260)
                            .addComponent(jButton263))))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel75)
                        .addGap(9, 9, 9)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pause5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Stop5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton34)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Start5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Reloj5))
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Start15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton95))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel204))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel208, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel198))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel205))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(Stop15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Reloj15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Pause15))
                    .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Start6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel81))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Reloj6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Pause6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(Stop6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel220, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel221, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Start16)
                            .addComponent(Pause16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Stop16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Reloj16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton101))
                    .addComponent(jLabel222, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel218))
                    .addComponent(jLabel216, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel219, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel211))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel210, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel217)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Reloj7)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Start7)
                            .addComponent(jButton46)
                            .addComponent(jButton47)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(Stop7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Pause7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel101))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel231)
                        .addGap(9, 9, 9)
                        .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton106)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel230))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel224))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel233, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel229, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(Stop17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel232, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel226, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Reloj17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel228, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Pause17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel234, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton107))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Start17))
                    .addComponent(jLabel235, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Start8))
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel113))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel114))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Pause8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(Stop8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Reloj8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel107))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel236, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel244)
                                    .addComponent(Reloj18))
                                .addGap(9, 9, 9)
                                .addComponent(jLabel240, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel241, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton113)
                            .addComponent(Pause18)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Stop18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel242, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel245, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel237))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Start18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel239, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel246, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel247, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel248, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel243)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Start9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Reloj9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel120))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(Stop9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Pause9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel127))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel126))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel259, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel253, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel254, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton119)
                            .addComponent(Start19)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Stop19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel250))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel252, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel260, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Reloj19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel249, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel261, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton118))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Pause19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel257))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel256))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel258, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel255, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Reloj10)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton65)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Stop10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel139))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Start10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel140))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Pause10))
                    .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel133))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel266, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton126, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(Stop20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton124))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel270))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Reloj20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel263))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel267, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel273, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel265, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel272, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Pause20))
                    .addComponent(jLabel274, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel262, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel271, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel268, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Start20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel269))))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2213, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton148ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton148ActionPerformed

    private void Start24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start24ActionPerformed

    private void jButton142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton142ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton142ActionPerformed

    private void Start23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start23ActionPerformed

    private void jButton136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton136ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton136ActionPerformed

    private void Start22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start22ActionPerformed

    private void jButton130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton130ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton130ActionPerformed

    private void Start21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start21ActionPerformed

    private void jButton124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton124ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton124ActionPerformed

    private void Start20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start20ActionPerformed

    private void jButton118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton118ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton118ActionPerformed

    private void Start19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start19ActionPerformed

    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton112ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton112ActionPerformed

    private void Start18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start18ActionPerformed

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton106ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton106ActionPerformed

    private void Start17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start17ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton100ActionPerformed

    private void Start16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start16ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton94ActionPerformed

    private void Start15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start15ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton88ActionPerformed

    private void Start14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start14ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton82ActionPerformed

    private void Start13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start13ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton76ActionPerformed

    private void Start12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start12ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton70ActionPerformed

    private void Start11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start11ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton64ActionPerformed

    private void Start10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start10ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void Start9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start9ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void Start8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start8ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void Start7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start7ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void Start6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start6ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void Start5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start5ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void Start4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start4ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void Start3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start3ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void Start2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void Start1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start1ActionPerformed
       
    }//GEN-LAST:event_Start1ActionPerformed

    private void Start1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start1MouseClicked
        t.start();
        Start1.setEnabled(false);
        Start1.setText("Reanudar ");
        Pause1.setEnabled(true);
        Stop1.setEnabled(true);
    }//GEN-LAST:event_Start1MouseClicked

    private void Pause1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause1MouseClicked
         t.stop();
        Start1.setEnabled(true);
        Pause1.setEnabled(false);
    }//GEN-LAST:event_Pause1MouseClicked

    private void Stop1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop1MouseClicked
               if(t.isRunning()){
            t.stop();
            Start1.setEnabled(true);
        }
        Start1.setText("Iniciar");
        Pause1.setEnabled(false);
            Stop1.setEnabled(false);
            H[1]=0;m[1]=0;s[1]=0;cs[1]=0;
            Actualizar();
    }//GEN-LAST:event_Stop1MouseClicked

    private void Start2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start2MouseClicked
       t1.start();
        Start2.setEnabled(false);
        Start2.setText("Reanudar ");
        Pause2.setEnabled(true);
        Stop2.setEnabled(true);
    }//GEN-LAST:event_Start2MouseClicked

    private void Pause2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause2MouseClicked
        // TODO add your handling code here:
         t1.stop();
        Start2.setEnabled(true);
        Pause2.setEnabled(false);
    }//GEN-LAST:event_Pause2MouseClicked

    private void Stop2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop2MouseClicked
        // TODO add your handling code here:
        if(t1.isRunning()){
            t1.stop();
            Start2.setEnabled(true);
        }
        Start2.setText("Iniciar");
        Pause2.setEnabled(false);
            Stop2.setEnabled(false);
            H[2]=0;m[2]=0;s[2]=0;cs[2]=0;
            Actualizar2();
    }//GEN-LAST:event_Stop2MouseClicked

    private void Start3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start3MouseClicked
      t2.start();
        Start3.setEnabled(false);
        Start3.setText("Reanudar ");
        Pause3.setEnabled(true);
        Stop3.setEnabled(true);
    }//GEN-LAST:event_Start3MouseClicked

    private void Start4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start4MouseClicked
      t3.start();
        Start4.setEnabled(false);
        Start4.setText("Reanudar ");
        Pause4.setEnabled(true);
        Stop4.setEnabled(true);
    }//GEN-LAST:event_Start4MouseClicked

    private void Start5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start5MouseClicked
t4.start();
        Start5.setEnabled(false);
        Start5.setText("Reanudar ");
        Pause5.setEnabled(true);
        Stop5.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_Start5MouseClicked

    private void Start6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start6MouseClicked
        t5.start();
        Start6.setEnabled(false);
        Start6.setText("Reanudar ");
        Pause6.setEnabled(true);
        Stop6.setEnabled(true);
    }//GEN-LAST:event_Start6MouseClicked

    private void Start7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start7MouseClicked
       t6.start();
        Start7.setEnabled(false);
        Start7.setText("Reanudar ");
        Pause7.setEnabled(true);
        Stop7.setEnabled(true);
    }//GEN-LAST:event_Start7MouseClicked

    private void Start8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start8MouseClicked
      t7.start();
        Start8.setEnabled(false);
        Start8.setText("Reanudar ");
        Pause8.setEnabled(true);
        Stop8.setEnabled(true);
    }//GEN-LAST:event_Start8MouseClicked

    private void Start9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start9MouseClicked
        t8.start();
        Start9.setEnabled(false);
        Start9.setText("Reanudar ");
        Pause9.setEnabled(true);
        Stop9.setEnabled(true);
    }//GEN-LAST:event_Start9MouseClicked

    private void Start10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start10MouseClicked
      t9.start();
        Start10.setEnabled(false);
        Start10.setText("Reanudar ");
        Pause10.setEnabled(true);
        Stop10.setEnabled(true);
    }//GEN-LAST:event_Start10MouseClicked

    private void Start11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start11MouseClicked
        t10.start();
        Start11.setEnabled(false);
        Start11.setText("Reanudar ");
        Pause11.setEnabled(true);
        Stop11.setEnabled(true);
    }//GEN-LAST:event_Start11MouseClicked

    private void Start12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start12MouseClicked
        t11.start();
        Start12.setEnabled(false);
        Start12.setText("Reanudar ");
        Pause12.setEnabled(true);
        Stop12.setEnabled(true);
    }//GEN-LAST:event_Start12MouseClicked

    private void Start13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start13MouseClicked
        t12.start();
        Start13.setEnabled(false);
        Start13.setText("Reanudar ");
        Pause13.setEnabled(true);
        Stop13.setEnabled(true);
    }//GEN-LAST:event_Start13MouseClicked

    private void Start14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start14MouseClicked
        t13.start();
        Start14.setEnabled(false);
        Start14.setText("Reanudar ");
        Pause14.setEnabled(true);
        Stop14.setEnabled(true);
    }//GEN-LAST:event_Start14MouseClicked

    private void Start15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start15MouseClicked
       t14.start();
        Start15.setEnabled(false);
        Start15.setText("Reanudar ");
        Pause15.setEnabled(true);
        Stop15.setEnabled(true);
    }//GEN-LAST:event_Start15MouseClicked

    private void Start16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start16MouseClicked
        t15.start();
        Start16.setEnabled(false);
        Start16.setText("Reanudar ");
        Pause16.setEnabled(true);
        Stop16.setEnabled(true);
    }//GEN-LAST:event_Start16MouseClicked

    private void Start17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start17MouseClicked
        t16.start();
        Start17.setEnabled(false);
        Start17.setText("Reanudar ");
        Pause17.setEnabled(true);
        Stop17.setEnabled(true);
    }//GEN-LAST:event_Start17MouseClicked

    private void Start18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start18MouseClicked
       t17.start();
        Start18.setEnabled(false);
        Start18.setText("Reanudar ");
        Pause18.setEnabled(true);
        Stop18.setEnabled(true);
    }//GEN-LAST:event_Start18MouseClicked

    private void Start19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start19MouseClicked
        t18.start();
        Start19.setEnabled(false);
        Start19.setText("Reanudar ");
        Pause19.setEnabled(true);
        Stop19.setEnabled(true);
    }//GEN-LAST:event_Start19MouseClicked

    private void Start20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start20MouseClicked
        t19.start();
        Start20.setEnabled(false);
        Start20.setText("Reanudar ");
        Pause20.setEnabled(true);
        Stop20.setEnabled(true);
    }//GEN-LAST:event_Start20MouseClicked

    private void Start21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start21MouseClicked
        t20.start();
        Start21.setEnabled(false);
        Start21.setText("Reanudar ");
        Pause21.setEnabled(true);
        Stop21.setEnabled(true);
    }//GEN-LAST:event_Start21MouseClicked

    private void Start22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start22MouseClicked
        t21.start();
        Start22.setEnabled(false);
        Start22.setText("Reanudar ");
        Pause22.setEnabled(true);
        Stop22.setEnabled(true);
    }//GEN-LAST:event_Start22MouseClicked

    private void Start23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start23MouseClicked
       t22.start();
        Start23.setEnabled(false);
        Start23.setText("Reanudar ");
        Pause23.setEnabled(true);
        Stop23.setEnabled(true);
    }//GEN-LAST:event_Start23MouseClicked

    private void Start24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start24MouseClicked
       t23.start();
        Start24.setEnabled(false);
        Start24.setText("Reanudar ");
        Pause24.setEnabled(true);
        Stop24.setEnabled(true);
    }//GEN-LAST:event_Start24MouseClicked

    private void Pause3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause3MouseClicked
       t2.stop();
        Start3.setEnabled(true);
        Pause3.setEnabled(false);
    }//GEN-LAST:event_Pause3MouseClicked

    private void Pause4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause4MouseClicked
        t3.stop();
        Start4.setEnabled(true);
        Pause4.setEnabled(false);
    }//GEN-LAST:event_Pause4MouseClicked

    private void Pause5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause5MouseClicked
      t4.stop();
        Start5.setEnabled(true);
        Pause5.setEnabled(false);
    }//GEN-LAST:event_Pause5MouseClicked

    private void Pause6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause6MouseClicked
       t5.stop();
        Start6.setEnabled(true);
        Pause6.setEnabled(false);
    }//GEN-LAST:event_Pause6MouseClicked

    private void Pause7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause7MouseClicked
        t6.stop();
        Start7.setEnabled(true);
        Pause7.setEnabled(false);
    }//GEN-LAST:event_Pause7MouseClicked

    private void Pause8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause8MouseClicked
      t7.stop();
        Start8.setEnabled(true);
        Pause8.setEnabled(false);
    }//GEN-LAST:event_Pause8MouseClicked

    private void Pause9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause9MouseClicked
       t8.stop();
        Start9.setEnabled(true);
        Pause9.setEnabled(false);
    }//GEN-LAST:event_Pause9MouseClicked

    private void Pause10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause10MouseClicked
        t9.stop();
        Start10.setEnabled(true);
        Pause10.setEnabled(false);
    }//GEN-LAST:event_Pause10MouseClicked

    private void Pause11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause11MouseClicked
        t10.stop();
        Start11.setEnabled(true);
        Pause11.setEnabled(false);
    }//GEN-LAST:event_Pause11MouseClicked

    private void Pause12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause12MouseClicked
      t11.stop();
        Start12.setEnabled(true);
        Pause12.setEnabled(false);
    }//GEN-LAST:event_Pause12MouseClicked

    private void Pause13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause13MouseClicked
       t12.stop();
        Start13.setEnabled(true);
        Pause13.setEnabled(false);
    }//GEN-LAST:event_Pause13MouseClicked

    private void Pause14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause14MouseClicked
        t13.stop();
        Start14.setEnabled(true);
        Pause14.setEnabled(false);
    }//GEN-LAST:event_Pause14MouseClicked

    private void Pause15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause15MouseClicked
       t14.stop();
        Start15.setEnabled(true);
        Pause15.setEnabled(false);
    }//GEN-LAST:event_Pause15MouseClicked

    private void Pause16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause16MouseClicked
        t15.stop();
        Start16.setEnabled(true);
        Pause16.setEnabled(false);
    }//GEN-LAST:event_Pause16MouseClicked

    private void Pause17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause17MouseClicked
        t16.stop();
        Start17.setEnabled(true);
        Pause17.setEnabled(false);
    }//GEN-LAST:event_Pause17MouseClicked

    private void Pause18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause18MouseClicked
       t17.stop();
        Start18.setEnabled(true);
        Pause18.setEnabled(false);
    }//GEN-LAST:event_Pause18MouseClicked

    private void Pause19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause19MouseClicked
        t18.stop();
        Start19.setEnabled(true);
        Pause19.setEnabled(false);
    }//GEN-LAST:event_Pause19MouseClicked

    private void Pause20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause20MouseClicked
       t19.stop();
        Start20.setEnabled(true);
        Pause20.setEnabled(false);
    }//GEN-LAST:event_Pause20MouseClicked

    private void Pause21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause21MouseClicked
       t20.stop();
        Start21.setEnabled(true);
        Pause21.setEnabled(false);
    }//GEN-LAST:event_Pause21MouseClicked

    private void Pause22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause22MouseClicked
      t21.stop();
        Start22.setEnabled(true);
        Pause22.setEnabled(false);
    }//GEN-LAST:event_Pause22MouseClicked

    private void Pause23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause23MouseClicked
       t22.stop();
        Start23.setEnabled(true);
        Pause23.setEnabled(false);
    }//GEN-LAST:event_Pause23MouseClicked

    private void Pause24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause24MouseClicked
       t23.stop();
        Start24.setEnabled(true);
        Pause24.setEnabled(false);
    }//GEN-LAST:event_Pause24MouseClicked

    private void Stop3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop3MouseClicked
 if(t2.isRunning()){
            t2.stop();
            Start3.setEnabled(true);
        }
        Start3.setText("Iniciar");
        Pause3.setEnabled(false);
            Stop3.setEnabled(false);
            H[3]=0;m[3]=0;s[3]=0;cs[3]=0;
            Actualizar3();      
    }//GEN-LAST:event_Stop3MouseClicked

    private void Stop4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop4MouseClicked
         if(t3.isRunning()){
            t3.stop();
            Start4.setEnabled(true);
        }
        Start4.setText("Iniciar");
        Pause4.setEnabled(false);
            Stop4.setEnabled(false);
            H[4]=0;m[4]=0;s[4]=0;cs[4]=0;
            Actualizar4();
    }//GEN-LAST:event_Stop4MouseClicked

    private void Stop5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop5MouseClicked
        if(t4.isRunning()){
            t4.stop();
            Start5.setEnabled(true);
        }
        Start5.setText("Iniciar");
        Pause5.setEnabled(false);
            Stop5.setEnabled(false);
            H[5]=0;m[5]=0;s[5]=0;cs[5]=0;
            Actualizar5();
    }//GEN-LAST:event_Stop5MouseClicked

    private void Stop6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop6MouseClicked
        // TODO add your handling code here:
         if(t5.isRunning()){
            t5.stop();
            Start6.setEnabled(true);
        }
        Start6.setText("Iniciar");
        Pause6.setEnabled(false);
            Stop6.setEnabled(false);
            H[6]=0;m[6]=0;s[6]=0;cs[6]=0;
            Actualizar6();
    }//GEN-LAST:event_Stop6MouseClicked

    private void Stop7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop7MouseClicked
        // TODO add your handling code here:
         if(t6.isRunning()){
            t6.stop();
            Start7.setEnabled(true);
        }
        Start7.setText("Iniciar");
        Pause7.setEnabled(false);
            Stop7.setEnabled(false);
            H[7]=0;m[7]=0;s[7]=0;cs[7]=0;
            Actualizar7();
    }//GEN-LAST:event_Stop7MouseClicked

    private void Stop8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop8MouseClicked
        // TODO add your handling code here:
         if(t7.isRunning()){
            t7.stop();
            Start8.setEnabled(true);
        }
        Start8.setText("Iniciar");
        Pause8.setEnabled(false);
            Stop8.setEnabled(false);
            H[8]=0;m[8]=0;s[8]=0;cs[8]=0;
            Actualizar8();
    }//GEN-LAST:event_Stop8MouseClicked

    private void Stop9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop9MouseClicked
        // TODO add your handling code here:
         if(t8.isRunning()){
            t8.stop();
            Start9.setEnabled(true);
        }
        Start9.setText("Iniciar");
        Pause9.setEnabled(false);
            Stop9.setEnabled(false);
            H[9]=0;m[9]=0;s[9]=0;cs[9]=0;
            Actualizar9();
    }//GEN-LAST:event_Stop9MouseClicked

    private void Stop10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop10MouseClicked
        // TODO add your handling code here:
         if(t9.isRunning()){
            t9.stop();
            Start10.setEnabled(true);
        }
        Start10.setText("Iniciar");
        Pause10.setEnabled(false);
            Stop10.setEnabled(false);
            H[10]=0;m[10]=0;s[10]=0;cs[10]=0;
            Actualizar10();
    }//GEN-LAST:event_Stop10MouseClicked

    private void Stop11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop11MouseClicked
        // TODO add your handling code here:
         if(t10.isRunning()){
            t10.stop();
            Start11 .setEnabled(true);
        }
        Start11.setText("Iniciar");
        Pause11.setEnabled(false);
            Stop11.setEnabled(false);
            H[11]=0;m[11]=0;s[11]=0;cs[11]=0;
            Actualizar11();
    }//GEN-LAST:event_Stop11MouseClicked

    private void Stop12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop12MouseClicked
        // TODO add your handling code here:
         if(t11.isRunning()){
            t11.stop();
            Start12.setEnabled(true);
        }
        Start12.setText("Iniciar");
        Pause12.setEnabled(false);
            Stop12.setEnabled(false);
            H[12]=0;m[12]=0;s[12]=0;cs[12]=0;
            Actualizar12();
    }//GEN-LAST:event_Stop12MouseClicked

    private void Stop13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop13MouseClicked
        // TODO add your handling code here:
         if(t12.isRunning()){
            t12.stop();
            Start13.setEnabled(true);
        }
        Start13.setText("Iniciar");
        Pause13.setEnabled(false);
            Stop13.setEnabled(false);
            H[13]=0;m[13]=0;s[13]=0;cs[13]=0;
            Actualizar13();
    }//GEN-LAST:event_Stop13MouseClicked

    private void Stop14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop14MouseClicked
        // TODO add your handling code here:
         if(t13.isRunning()){
            t13.stop();
            Start14.setEnabled(true);
        }
        Start14.setText("Iniciar");
        Pause14.setEnabled(false);
            Stop14.setEnabled(false);
            H[14]=0;m[14]=0;s[14]=0;cs[14]=0;
            Actualizar14();
    }//GEN-LAST:event_Stop14MouseClicked

    private void Stop15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop15MouseClicked
        // TODO add your handling code here:
         if(t14.isRunning()){
            t14.stop();
            Start15.setEnabled(true);
        }
        Start15.setText("Iniciar");
        Pause15.setEnabled(false);
            Stop15.setEnabled(false);
            H[15]=0;m[15]=0;s[15]=0;cs[15]=0;
            Actualizar15();
    }//GEN-LAST:event_Stop15MouseClicked

    private void Stop16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop16MouseClicked
        // TODO add your handling code here:
         if(t15.isRunning()){
            t15.stop();
            Start16.setEnabled(true);
        }
        Start16.setText("Iniciar");
        Pause16.setEnabled(false);
            Stop16.setEnabled(false);
            H[16]=0;m[16]=0;s[16]=0;cs[16]=0;
            Actualizar16();
    }//GEN-LAST:event_Stop16MouseClicked

    private void Stop17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop17MouseClicked
        // TODO add your handling code here:
         if(t16.isRunning()){
            t16.stop();
            Start17.setEnabled(true);
        }
        Start17.setText("Iniciar");
        Pause17.setEnabled(false);
            Stop17.setEnabled(false);
            H[17]=0;m[17]=0;s[17]=0;cs[17]=0;
            Actualizar17();
    }//GEN-LAST:event_Stop17MouseClicked

    private void Stop18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop18MouseClicked
        // TODO add your handling code here:
         if(t17.isRunning()){
            t17.stop();
            Start18.setEnabled(true);
        }
        Start18.setText("Iniciar");
        Pause18.setEnabled(false);
            Stop18.setEnabled(false);
            H[18]=0;m[18]=0;s[18]=0;cs[18]=0;
            Actualizar18();
    }//GEN-LAST:event_Stop18MouseClicked

    private void Stop19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop19MouseClicked
        // TODO add your handling code here:
         if(t18.isRunning()){
            t18.stop();
            Start19.setEnabled(true);
        }
        Start19.setText("Iniciar");
        Pause19.setEnabled(false);
            Stop19.setEnabled(false);
            H[19]=0;m[19]=0;s[19]=0;cs[19]=0;
            Actualizar19();
    }//GEN-LAST:event_Stop19MouseClicked

    private void Stop20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop20MouseClicked
        // TODO add your handling code here:
         if(t19.isRunning()){
            t19.stop();
            Start20.setEnabled(true);
        }
        Start20.setText("Iniciar");
        Pause20.setEnabled(false);
            Stop20.setEnabled(false);
            H[20]=0;m[20]=0;s[20]=0;cs[20]=0;
            Actualizar20();
    }//GEN-LAST:event_Stop20MouseClicked

    private void Stop21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop21MouseClicked
        // TODO add your handling code here:
         if(t20.isRunning()){
            t20.stop();
            Start21.setEnabled(true);
        }
        Start21.setText("Iniciar");
        Pause21.setEnabled(false);
            Stop21.setEnabled(false);
            H[21]=0;m[21]=0;s[21]=0;cs[21]=0;
            Actualizar21();
    }//GEN-LAST:event_Stop21MouseClicked

    private void Stop22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop22MouseClicked
        // TODO add your handling code here:
         if(t21.isRunning()){
            t21.stop();
            Start22.setEnabled(true);
        }
        Start22.setText("Iniciar");
        Pause22.setEnabled(false);
            Stop22.setEnabled(false);
            H[22]=0;m[22]=0;s[22]=0;cs[22]=0;
            Actualizar22();
    }//GEN-LAST:event_Stop22MouseClicked

    private void Stop23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop23MouseClicked
        // TODO add your handling code here:
         if(t22.isRunning()){
            t22.stop();
            Start23.setEnabled(true);
        }
        Start23.setText("Iniciar");
        Pause23.setEnabled(false);
            Stop23.setEnabled(false);
            H[23]=0;m[23]=0;s[23]=0;cs[23]=0;
            Actualizar23();
    }//GEN-LAST:event_Stop23MouseClicked

    private void Stop24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop24MouseClicked
        // TODO add your handling code here:
         if(t23.isRunning()){
            t23.stop();
            Start24.setEnabled(true);
        }
        Start24.setText("Iniciar");
        Pause24.setEnabled(false);
            Stop24.setEnabled(false);
            H[24]=0;m[24]=0;s[24]=0;cs[24]=0;
            Actualizar24();
    }//GEN-LAST:event_Stop24MouseClicked

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
            java.util.logging.Logger.getLogger(Laboratorio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboratorio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboratorio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboratorio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laboratorio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton Pause24;
    private javax.swing.JButton Pause3;
    private javax.swing.JButton Pause4;
    private javax.swing.JButton Pause5;
    private javax.swing.JButton Pause6;
    private javax.swing.JButton Pause7;
    private javax.swing.JButton Pause8;
    private javax.swing.JButton Pause9;
    private javax.swing.JLabel Reloj1;
    private javax.swing.JLabel Reloj10;
    private javax.swing.JLabel Reloj11;
    private javax.swing.JLabel Reloj12;
    private javax.swing.JLabel Reloj13;
    private javax.swing.JLabel Reloj14;
    private javax.swing.JLabel Reloj15;
    private javax.swing.JLabel Reloj16;
    private javax.swing.JLabel Reloj17;
    private javax.swing.JLabel Reloj18;
    private javax.swing.JLabel Reloj19;
    private javax.swing.JLabel Reloj2;
    private javax.swing.JLabel Reloj20;
    private javax.swing.JLabel Reloj21;
    private javax.swing.JLabel Reloj22;
    private javax.swing.JLabel Reloj23;
    private javax.swing.JLabel Reloj24;
    private javax.swing.JLabel Reloj3;
    private javax.swing.JLabel Reloj4;
    private javax.swing.JLabel Reloj5;
    private javax.swing.JLabel Reloj6;
    private javax.swing.JLabel Reloj7;
    private javax.swing.JLabel Reloj8;
    private javax.swing.JLabel Reloj9;
    private javax.swing.JButton Start1;
    private javax.swing.JButton Start10;
    private javax.swing.JButton Start11;
    private javax.swing.JButton Start12;
    private javax.swing.JButton Start13;
    private javax.swing.JButton Start14;
    private javax.swing.JButton Start15;
    private javax.swing.JButton Start16;
    private javax.swing.JButton Start17;
    private javax.swing.JButton Start18;
    private javax.swing.JButton Start19;
    private javax.swing.JButton Start2;
    private javax.swing.JButton Start20;
    private javax.swing.JButton Start21;
    private javax.swing.JButton Start22;
    private javax.swing.JButton Start23;
    private javax.swing.JButton Start24;
    private javax.swing.JButton Start3;
    private javax.swing.JButton Start4;
    private javax.swing.JButton Start5;
    private javax.swing.JButton Start6;
    private javax.swing.JButton Start7;
    private javax.swing.JButton Start8;
    private javax.swing.JButton Start9;
    private javax.swing.JButton Stop1;
    private javax.swing.JButton Stop10;
    private javax.swing.JButton Stop11;
    private javax.swing.JButton Stop12;
    private javax.swing.JButton Stop13;
    private javax.swing.JButton Stop14;
    private javax.swing.JButton Stop15;
    private javax.swing.JButton Stop16;
    private javax.swing.JButton Stop17;
    private javax.swing.JButton Stop18;
    private javax.swing.JButton Stop19;
    private javax.swing.JButton Stop2;
    private javax.swing.JButton Stop20;
    private javax.swing.JButton Stop21;
    private javax.swing.JButton Stop22;
    private javax.swing.JButton Stop23;
    private javax.swing.JButton Stop24;
    private javax.swing.JButton Stop3;
    private javax.swing.JButton Stop4;
    private javax.swing.JButton Stop5;
    private javax.swing.JButton Stop6;
    private javax.swing.JButton Stop7;
    private javax.swing.JButton Stop8;
    private javax.swing.JButton Stop9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton124;
    private javax.swing.JButton jButton125;
    private javax.swing.JButton jButton126;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton136;
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton148;
    private javax.swing.JButton jButton149;
    private javax.swing.JButton jButton150;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton260;
    private javax.swing.JButton jButton263;
    private javax.swing.JButton jButton265;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
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
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
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
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
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
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField100;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField173;
    private javax.swing.JTextField jTextField174;
    private javax.swing.JTextField jTextField175;
    private javax.swing.JTextField jTextField176;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    private javax.swing.JTextField jTextField88;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    private javax.swing.JTextField jTextField93;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField96;
    private javax.swing.JTextField jTextField97;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JTextField jTextField99;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
