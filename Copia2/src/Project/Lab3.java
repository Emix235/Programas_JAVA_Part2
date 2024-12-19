/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;
import static Project.State3.r;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Itzayana
 */
public class Lab3 extends javax.swing.JFrame{
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
Formulario3 f= new Formulario3();
State3 S= new State3();
    /**
     * Creates new form Lab1
     */
    public Lab3() {
        initComponents();
         this.setLocationRelativeTo(null);
        t= new Timer(10, acciones);
        t1= new Timer(10,acciones1 );
        t2= new Timer(10,acciones2 );
        t3= new Timer(10,acciones3 );
        t4= new Timer(10,acciones4 );
        t5= new Timer(10,acciones5 );
        t6= new Timer(10,acciones6 );
        t7= new Timer(10,acciones7 );
        t8= new Timer(10,acciones8 );
        t9= new Timer(10,acciones9 );
        t10= new Timer(10,acciones10 );
        t11= new Timer(10,acciones11 );
        t12= new Timer(10,acciones12 );
        t13= new Timer(10,acciones13 );
        t14= new Timer(10,acciones14 );
        t15= new Timer(10,acciones15 );
        t16= new Timer(10,acciones16 );
        t17= new Timer(10,acciones17 );
        t18= new Timer(10,acciones18 );
        t19= new Timer(10,acciones19 );
        t20= new Timer(10,acciones20 );
        t21= new Timer(10,acciones21 );
        t22= new Timer(10,acciones22 );
        t23= new Timer(10,acciones23 );
        finish.setEnabled(false);
        finish1.setEnabled(false);
        finish2.setEnabled(false);
        finish3.setEnabled(false);
        finish4.setEnabled(false);
        finish5.setEnabled(false);
        finish6.setEnabled(false);
        finish7.setEnabled(false);
        finish8.setEnabled(false);
        finish9.setEnabled(false);
        finish10.setEnabled(false);
        finish11.setEnabled(false);
        finish12.setEnabled(false);
        finish13.setEnabled(false);
        finish14.setEnabled(false);
        finish15.setEnabled(false);
        finish16.setEnabled(false);
        finish17.setEnabled(false);
        finish18.setEnabled(false);
        finish19.setEnabled(false);
        finish20.setEnabled(false);
        finish21.setEnabled(false);
        finish22.setEnabled(false);
        finish23.setEnabled(false);
        
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
private ActionListener acciones2 = new ActionListener(){
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
private ActionListener acciones3 = new ActionListener(){
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
private ActionListener acciones4 = new ActionListener(){
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
private ActionListener acciones5 = new ActionListener(){
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
private ActionListener acciones6 = new ActionListener(){
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
private ActionListener acciones7 = new ActionListener(){
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
private ActionListener acciones8 = new ActionListener(){
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
private ActionListener acciones9 = new ActionListener(){
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
private ActionListener acciones10 = new ActionListener(){
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
private ActionListener acciones11 = new ActionListener(){
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
private ActionListener acciones12 = new ActionListener(){
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
private ActionListener acciones13 = new ActionListener(){
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
private ActionListener acciones14 = new ActionListener(){
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
private ActionListener acciones15 = new ActionListener(){
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
private ActionListener acciones16 = new ActionListener(){
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
private ActionListener acciones17 = new ActionListener(){
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
private ActionListener acciones18 = new ActionListener(){
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
private ActionListener acciones19 = new ActionListener(){
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
private ActionListener acciones20 = new ActionListener(){
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
private ActionListener acciones21 = new ActionListener(){
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
private ActionListener acciones22 = new ActionListener(){
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
private ActionListener acciones23 = new ActionListener(){
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



public void Actualizar() {
            tiempo[0]=(H[0]<=9?"0":"")+H[0]+"  :  "+(m[0]<=9?"0":"")+m[0]+"  :  "+(s[0]<=9?"0":"")+s[0]+"  :  "+(cs[0]<=9?"0":"")+cs[0];
         Reloj1.setText(tiempo[0]);
        }
public void Actualizar1() {
            tiempo[1]=(H[1]<=9?"0":"")+H[1]+"  :  "+(m[1]<=9?"0":"")+m[1]+"  :  "+(s[1]<=9?"0":"")+s[1]+"  :  "+(cs[1]<=9?"0":"")+cs[1];
         Reloj2.setText(tiempo[1]);
        }
public void Actualizar2() {
            tiempo[2]=(H[2]<=9?"0":"")+H[2]+"  :  "+(m[2]<=9?"0":"")+m[2]+"  :  "+(s[2]<=9?"0":"")+s[2]+"  :  "+(cs[2]<=9?"0":"")+cs[2];
         Reloj3.setText(tiempo[2]);
        }
public void Actualizar3() {
            tiempo[3]=(H[3]<=9?"0":"")+H[3]+"  :  "+(m[3]<=9?"0":"")+m[3]+"  :  "+(s[3]<=9?"0":"")+s[3]+"  :  "+(cs[3]<=9?"0":"")+cs[3];
         Reloj4.setText(tiempo[3]);
        }
public void Actualizar4() {
            tiempo[4]=(H[4]<=9?"0":"")+H[4]+"  :  "+(m[4]<=9?"0":"")+m[4]+"  :  "+(s[4]<=9?"0":"")+s[4]+"  :  "+(cs[4]<=9?"0":"")+cs[4];
         Reloj5.setText(tiempo[4]);
        }
public void Actualizar5() {
            tiempo[5]=(H[5]<=9?"0":"")+H[5]+"  :  "+(m[5]<=9?"0":"")+m[5]+"  :  "+(s[5]<=9?"0":"")+s[5]+"  :  "+(cs[5]<=9?"0":"")+cs[5];
         Reloj6.setText(tiempo[5]);
        }
public void Actualizar6() {
            tiempo[6]=(H[6]<=9?"0":"")+H[6]+"  :  "+(m[6]<=9?"0":"")+m[6]+"  :  "+(s[6]<=9?"0":"")+s[6]+"  :  "+(cs[6]<=9?"0":"")+cs[6];
         Reloj7.setText(tiempo[6]);
        }
public void Actualizar7() {
            tiempo[7]=(H[7]<=9?"0":"")+H[7]+"  :  "+(m[7]<=9?"0":"")+m[7]+"  :  "+(s[7]<=9?"0":"")+s[7]+"  :  "+(cs[7]<=9?"0":"")+cs[7];
         Reloj8.setText(tiempo[7]);
        }
public void Actualizar8() {
            tiempo[8]=(H[8]<=9?"0":"")+H[8]+"  :  "+(m[8]<=9?"0":"")+m[8]+"  :  "+(s[8]<=9?"0":"")+s[8]+"  :  "+(cs[8]<=9?"0":"")+cs[8];
         Reloj9.setText(tiempo[8]);
        }
public void Actualizar9() {
            tiempo[9]=(H[9]<=9?"0":"")+H[9]+"  :  "+(m[9]<=9?"0":"")+m[9]+"  :  "+(s[9]<=9?"0":"")+s[9]+"  :  "+(cs[9]<=9?"0":"")+cs[9];
         Reloj10.setText(tiempo[9]);
        }
public void Actualizar10() {
            tiempo[10]=(H[10]<=9?"0":"")+H[10]+"  :  "+(m[10]<=9?"0":"")+m[10]+"  :  "+(s[10]<=9?"0":"")+s[10]+"  :  "+(cs[10]<=9?"0":"")+cs[10];
         Reloj11.setText(tiempo[10]);
        }
public void Actualizar11() {
            tiempo[11]=(H[11]<=9?"0":"")+H[11]+"  :  "+(m[11]<=9?"0":"")+m[11]+"  :  "+(s[11]<=9?"0":"")+s[11]+"  :  "+(cs[11]<=9?"0":"")+cs[11];
         Reloj12.setText(tiempo[11]);
        }
public void Actualizar12() {
            tiempo[12]=(H[12]<=9?"0":"")+H[12]+"  :  "+(m[12]<=9?"0":"")+m[12]+"  :  "+(s[12]<=9?"0":"")+s[12]+"  :  "+(cs[12]<=9?"0":"")+cs[12];
         Reloj13.setText(tiempo[12]);
        }
public void Actualizar13() {
            tiempo[13]=(H[13]<=9?"0":"")+H[13]+"  :  "+(m[13]<=9?"0":"")+m[13]+"  :  "+(s[13]<=9?"0":"")+s[13]+"  :  "+(cs[13]<=9?"0":"")+cs[13];
         Reloj14.setText(tiempo[13]);
        }
public void Actualizar14() {
            tiempo[14]=(H[14]<=9?"0":"")+H[14]+"  :  "+(m[14]<=9?"0":"")+m[14]+"  :  "+(s[14]<=9?"0":"")+s[14]+"  :  "+(cs[14]<=9?"0":"")+cs[14];
         Reloj15.setText(tiempo[14]);
        }
public void Actualizar15() {
            tiempo[15]=(H[15]<=9?"0":"")+H[15]+"  :  "+(m[15]<=9?"0":"")+m[15]+"  :  "+(s[15]<=9?"0":"")+s[15]+"  :  "+(cs[15]<=9?"0":"")+cs[15];
         Reloj16.setText(tiempo[15]);
        }
public void Actualizar16() {
            tiempo[16]=(H[16]<=9?"0":"")+H[16]+"  :  "+(m[16]<=9?"0":"")+m[16]+"  :  "+(s[16]<=9?"0":"")+s[16]+"  :  "+(cs[16]<=9?"0":"")+cs[16];
         Reloj17.setText(tiempo[16]);
        }
public void Actualizar17() {
            tiempo[17]=(H[17]<=9?"0":"")+H[17]+"  :  "+(m[17]<=9?"0":"")+m[17]+"  :  "+(s[17]<=9?"0":"")+s[17]+"  :  "+(cs[17]<=9?"0":"")+cs[17];
         Reloj18.setText(tiempo[17]);
        }
public void Actualizar18() {
            tiempo[18]=(H[18]<=9?"0":"")+H[18]+"  :  "+(m[18]<=9?"0":"")+m[18]+"  :  "+(s[18]<=9?"0":"")+s[18]+"  :  "+(cs[18]<=9?"0":"")+cs[18];
         Reloj19.setText(tiempo[18]);
        }
public void Actualizar19() {
            tiempo[19]=(H[19]<=9?"0":"")+H[19]+"  :  "+(m[19]<=9?"0":"")+m[19]+"  :  "+(s[19]<=9?"0":"")+s[19]+"  :  "+(cs[19]<=9?"0":"")+cs[19];
         Reloj20.setText(tiempo[19]);
        }
public void Actualizar20() {
            tiempo[20]=(H[20]<=9?"0":"")+H[20]+"  :  "+(m[20]<=9?"0":"")+m[20]+"  :  "+(s[20]<=9?"0":"")+s[20]+"  :  "+(cs[20]<=9?"0":"")+cs[20];
         Reloj21.setText(tiempo[20]);
        }
public void Actualizar21() {
            tiempo[21]=(H[21]<=9?"0":"")+H[21]+"  :  "+(m[21]<=9?"0":"")+m[21]+"  :  "+(s[21]<=9?"0":"")+s[21]+"  :  "+(cs[21]<=9?"0":"")+cs[21];
         Reloj22.setText(tiempo[21]);
        }
public void Actualizar22() {
            tiempo[22]=(H[22]<=9?"0":"")+H[22]+"  :  "+(m[22]<=9?"0":"")+m[22]+"  :  "+(s[22]<=9?"0":"")+s[22]+"  :  "+(cs[22]<=9?"0":"")+cs[22];
         Reloj23.setText(tiempo[22]);
        }
public void Actualizar23() {
            tiempo[23]=(H[23]<=9?"0":"")+H[23]+"  :  "+(m[23]<=9?"0":"")+m[23]+"  :  "+(s[23]<=9?"0":"")+s[23]+"  :  "+(cs[23]<=9?"0":"")+cs[23];
         Reloj24.setText(tiempo[23]);
        }


public void Decorar(){
    Nombre.setEditable(false);
    Nombre.setEnabled(false);
    Nombre.setBackground(Color.red);
    p1.setBackground(Color.red);
    comenzar.setEnabled(false);
    Pause.setEnabled(false);
    ImageIcon imagen = new ImageIcon (getClass().getResource("/pictures/eae998_e2a5b283977b409ba0bc0c76ad6f171a_mv2.jpg"));
    Idea2.setIcon(imagen);
    this.repaint();
    Icono.setText("No funciona.");
    estado.setText("Fuera de Servicio.");
    estado.setBackground(Color.red);
}
public void Decorar0(){
    this.repaint();
    this.repaint();
    this.repaint();
    Nombre.setEditable(true);
    Nombre.setEnabled(true);
    Nombre.setBackground(Color.white);
    p1.setBackground(Color.white);
    comenzar.setEnabled(true);
    Pause.setEnabled(false);
    Icono.setText("");
    estado.setText("Normal.");
    estado.setBackground(Color.green);
    
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
        Idea2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        Int = new javax.swing.JTextField();
        Reloj1 = new javax.swing.JTextField();
        comenzar = new javax.swing.JButton();
        p3 = new javax.swing.JLabel();
        Pause = new javax.swing.JButton();
        estado = new javax.swing.JButton();
        finish = new javax.swing.JButton();
        Idea1 = new javax.swing.JLabel();
        Icono1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Pocision1 = new javax.swing.JTextField();
        Idea39 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JTextField();
        p58 = new javax.swing.JLabel();
        p59 = new javax.swing.JLabel();
        Int1 = new javax.swing.JTextField();
        Reloj2 = new javax.swing.JTextField();
        comenzar1 = new javax.swing.JButton();
        p60 = new javax.swing.JLabel();
        Pause1 = new javax.swing.JButton();
        estado1 = new javax.swing.JButton();
        finish1 = new javax.swing.JButton();
        Idea40 = new javax.swing.JLabel();
        Icono2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Pocision2 = new javax.swing.JTextField();
        Idea41 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JTextField();
        p61 = new javax.swing.JLabel();
        p62 = new javax.swing.JLabel();
        Int2 = new javax.swing.JTextField();
        Reloj3 = new javax.swing.JTextField();
        comenzar2 = new javax.swing.JButton();
        p63 = new javax.swing.JLabel();
        Pause2 = new javax.swing.JButton();
        estado2 = new javax.swing.JButton();
        finish2 = new javax.swing.JButton();
        Idea42 = new javax.swing.JLabel();
        Icono3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Pocision3 = new javax.swing.JTextField();
        Idea43 = new javax.swing.JLabel();
        Nombre3 = new javax.swing.JTextField();
        p64 = new javax.swing.JLabel();
        p65 = new javax.swing.JLabel();
        Int3 = new javax.swing.JTextField();
        Reloj4 = new javax.swing.JTextField();
        comenzar3 = new javax.swing.JButton();
        p66 = new javax.swing.JLabel();
        Pause3 = new javax.swing.JButton();
        estado3 = new javax.swing.JButton();
        finish3 = new javax.swing.JButton();
        Idea44 = new javax.swing.JLabel();
        Icono4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Pocision4 = new javax.swing.JTextField();
        Idea45 = new javax.swing.JLabel();
        Nombre4 = new javax.swing.JTextField();
        p67 = new javax.swing.JLabel();
        p68 = new javax.swing.JLabel();
        Int4 = new javax.swing.JTextField();
        Reloj5 = new javax.swing.JTextField();
        comenzar4 = new javax.swing.JButton();
        p69 = new javax.swing.JLabel();
        Pause4 = new javax.swing.JButton();
        estado4 = new javax.swing.JButton();
        finish4 = new javax.swing.JButton();
        Idea46 = new javax.swing.JLabel();
        Icono5 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Pocision5 = new javax.swing.JTextField();
        Idea47 = new javax.swing.JLabel();
        Nombre5 = new javax.swing.JTextField();
        p70 = new javax.swing.JLabel();
        p71 = new javax.swing.JLabel();
        Int5 = new javax.swing.JTextField();
        Reloj6 = new javax.swing.JTextField();
        comenzar5 = new javax.swing.JButton();
        p72 = new javax.swing.JLabel();
        Pause5 = new javax.swing.JButton();
        estado5 = new javax.swing.JButton();
        finish5 = new javax.swing.JButton();
        Idea48 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pocision6 = new javax.swing.JTextField();
        Icono6 = new javax.swing.JLabel();
        Idea3 = new javax.swing.JLabel();
        Nombre6 = new javax.swing.JTextField();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        Int6 = new javax.swing.JTextField();
        Reloj7 = new javax.swing.JTextField();
        comenzar6 = new javax.swing.JButton();
        p6 = new javax.swing.JLabel();
        Pause6 = new javax.swing.JButton();
        estado6 = new javax.swing.JButton();
        finish6 = new javax.swing.JButton();
        Idea4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Pocision7 = new javax.swing.JTextField();
        Icono7 = new javax.swing.JLabel();
        Idea5 = new javax.swing.JLabel();
        Nombre7 = new javax.swing.JTextField();
        p7 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        Int7 = new javax.swing.JTextField();
        Reloj8 = new javax.swing.JTextField();
        comenzar7 = new javax.swing.JButton();
        p9 = new javax.swing.JLabel();
        Pause7 = new javax.swing.JButton();
        estado7 = new javax.swing.JButton();
        finish7 = new javax.swing.JButton();
        Idea6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Pocision8 = new javax.swing.JTextField();
        Icono8 = new javax.swing.JLabel();
        Idea7 = new javax.swing.JLabel();
        Nombre8 = new javax.swing.JTextField();
        p10 = new javax.swing.JLabel();
        p11 = new javax.swing.JLabel();
        Int8 = new javax.swing.JTextField();
        Reloj9 = new javax.swing.JTextField();
        comenzar8 = new javax.swing.JButton();
        p12 = new javax.swing.JLabel();
        Pause8 = new javax.swing.JButton();
        estado8 = new javax.swing.JButton();
        finish8 = new javax.swing.JButton();
        Idea8 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Pocision9 = new javax.swing.JTextField();
        Icono9 = new javax.swing.JLabel();
        Idea9 = new javax.swing.JLabel();
        Nombre9 = new javax.swing.JTextField();
        p13 = new javax.swing.JLabel();
        p14 = new javax.swing.JLabel();
        Int9 = new javax.swing.JTextField();
        Reloj10 = new javax.swing.JTextField();
        comenzar9 = new javax.swing.JButton();
        p15 = new javax.swing.JLabel();
        Pause9 = new javax.swing.JButton();
        estado9 = new javax.swing.JButton();
        finish9 = new javax.swing.JButton();
        Idea10 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Pocision10 = new javax.swing.JTextField();
        Icono10 = new javax.swing.JLabel();
        Idea11 = new javax.swing.JLabel();
        Nombre10 = new javax.swing.JTextField();
        p16 = new javax.swing.JLabel();
        p17 = new javax.swing.JLabel();
        Int10 = new javax.swing.JTextField();
        Reloj11 = new javax.swing.JTextField();
        comenzar10 = new javax.swing.JButton();
        p18 = new javax.swing.JLabel();
        Pause10 = new javax.swing.JButton();
        estado10 = new javax.swing.JButton();
        finish10 = new javax.swing.JButton();
        Idea12 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Pocision11 = new javax.swing.JTextField();
        Icono11 = new javax.swing.JLabel();
        Idea13 = new javax.swing.JLabel();
        Nombre11 = new javax.swing.JTextField();
        p19 = new javax.swing.JLabel();
        p20 = new javax.swing.JLabel();
        Int11 = new javax.swing.JTextField();
        Reloj12 = new javax.swing.JTextField();
        comenzar11 = new javax.swing.JButton();
        p21 = new javax.swing.JLabel();
        Pause11 = new javax.swing.JButton();
        estado11 = new javax.swing.JButton();
        finish11 = new javax.swing.JButton();
        Idea14 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Pocision12 = new javax.swing.JTextField();
        Icono12 = new javax.swing.JLabel();
        Idea15 = new javax.swing.JLabel();
        Nombre12 = new javax.swing.JTextField();
        p22 = new javax.swing.JLabel();
        p23 = new javax.swing.JLabel();
        Int12 = new javax.swing.JTextField();
        Reloj13 = new javax.swing.JTextField();
        comenzar12 = new javax.swing.JButton();
        p24 = new javax.swing.JLabel();
        Pause12 = new javax.swing.JButton();
        estado12 = new javax.swing.JButton();
        finish12 = new javax.swing.JButton();
        Idea16 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Pocision13 = new javax.swing.JTextField();
        Icono13 = new javax.swing.JLabel();
        Idea17 = new javax.swing.JLabel();
        Nombre13 = new javax.swing.JTextField();
        p25 = new javax.swing.JLabel();
        p26 = new javax.swing.JLabel();
        Int13 = new javax.swing.JTextField();
        Reloj14 = new javax.swing.JTextField();
        comenzar13 = new javax.swing.JButton();
        p27 = new javax.swing.JLabel();
        Pause13 = new javax.swing.JButton();
        estado13 = new javax.swing.JButton();
        finish13 = new javax.swing.JButton();
        Idea18 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        Pocision14 = new javax.swing.JTextField();
        Icono14 = new javax.swing.JLabel();
        Idea19 = new javax.swing.JLabel();
        Nombre14 = new javax.swing.JTextField();
        p28 = new javax.swing.JLabel();
        p29 = new javax.swing.JLabel();
        Int14 = new javax.swing.JTextField();
        Reloj15 = new javax.swing.JTextField();
        comenzar14 = new javax.swing.JButton();
        p30 = new javax.swing.JLabel();
        Pause14 = new javax.swing.JButton();
        estado14 = new javax.swing.JButton();
        finish14 = new javax.swing.JButton();
        Idea20 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        Pocision15 = new javax.swing.JTextField();
        Icono15 = new javax.swing.JLabel();
        Idea21 = new javax.swing.JLabel();
        Nombre15 = new javax.swing.JTextField();
        p31 = new javax.swing.JLabel();
        p32 = new javax.swing.JLabel();
        Int15 = new javax.swing.JTextField();
        Reloj16 = new javax.swing.JTextField();
        comenzar15 = new javax.swing.JButton();
        p33 = new javax.swing.JLabel();
        Pause15 = new javax.swing.JButton();
        estado15 = new javax.swing.JButton();
        finish15 = new javax.swing.JButton();
        Idea22 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Pocision16 = new javax.swing.JTextField();
        Icono16 = new javax.swing.JLabel();
        Idea23 = new javax.swing.JLabel();
        Nombre16 = new javax.swing.JTextField();
        p34 = new javax.swing.JLabel();
        p35 = new javax.swing.JLabel();
        Int16 = new javax.swing.JTextField();
        Reloj17 = new javax.swing.JTextField();
        comenzar16 = new javax.swing.JButton();
        p36 = new javax.swing.JLabel();
        Pause16 = new javax.swing.JButton();
        estado16 = new javax.swing.JButton();
        finish16 = new javax.swing.JButton();
        Idea24 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Pocision17 = new javax.swing.JTextField();
        Icono17 = new javax.swing.JLabel();
        Idea25 = new javax.swing.JLabel();
        Nombre17 = new javax.swing.JTextField();
        p37 = new javax.swing.JLabel();
        p38 = new javax.swing.JLabel();
        Int17 = new javax.swing.JTextField();
        Reloj18 = new javax.swing.JTextField();
        comenzar17 = new javax.swing.JButton();
        p39 = new javax.swing.JLabel();
        Pause17 = new javax.swing.JButton();
        estado17 = new javax.swing.JButton();
        finish17 = new javax.swing.JButton();
        Idea26 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        Pocision18 = new javax.swing.JTextField();
        Icono18 = new javax.swing.JLabel();
        Idea27 = new javax.swing.JLabel();
        Nombre18 = new javax.swing.JTextField();
        p40 = new javax.swing.JLabel();
        p41 = new javax.swing.JLabel();
        Int18 = new javax.swing.JTextField();
        Reloj19 = new javax.swing.JTextField();
        comenzar18 = new javax.swing.JButton();
        p42 = new javax.swing.JLabel();
        Pause18 = new javax.swing.JButton();
        estado18 = new javax.swing.JButton();
        finish18 = new javax.swing.JButton();
        Idea28 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        Pocision19 = new javax.swing.JTextField();
        Icono19 = new javax.swing.JLabel();
        Idea29 = new javax.swing.JLabel();
        Nombre19 = new javax.swing.JTextField();
        p43 = new javax.swing.JLabel();
        p44 = new javax.swing.JLabel();
        Int19 = new javax.swing.JTextField();
        Reloj20 = new javax.swing.JTextField();
        comenzar19 = new javax.swing.JButton();
        p45 = new javax.swing.JLabel();
        Pause19 = new javax.swing.JButton();
        estado19 = new javax.swing.JButton();
        finish19 = new javax.swing.JButton();
        Idea30 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        Pocision20 = new javax.swing.JTextField();
        Icono20 = new javax.swing.JLabel();
        Idea31 = new javax.swing.JLabel();
        Nombre20 = new javax.swing.JTextField();
        p46 = new javax.swing.JLabel();
        p47 = new javax.swing.JLabel();
        Int20 = new javax.swing.JTextField();
        Reloj21 = new javax.swing.JTextField();
        comenzar20 = new javax.swing.JButton();
        p48 = new javax.swing.JLabel();
        Pause20 = new javax.swing.JButton();
        estado20 = new javax.swing.JButton();
        finish20 = new javax.swing.JButton();
        Idea32 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Pocision21 = new javax.swing.JTextField();
        Icono21 = new javax.swing.JLabel();
        Idea33 = new javax.swing.JLabel();
        Nombre21 = new javax.swing.JTextField();
        p49 = new javax.swing.JLabel();
        p50 = new javax.swing.JLabel();
        Int21 = new javax.swing.JTextField();
        Reloj22 = new javax.swing.JTextField();
        comenzar21 = new javax.swing.JButton();
        p51 = new javax.swing.JLabel();
        Pause21 = new javax.swing.JButton();
        estado21 = new javax.swing.JButton();
        finish21 = new javax.swing.JButton();
        Idea34 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Pocision22 = new javax.swing.JTextField();
        Icono22 = new javax.swing.JLabel();
        Idea35 = new javax.swing.JLabel();
        Nombre22 = new javax.swing.JTextField();
        p52 = new javax.swing.JLabel();
        p53 = new javax.swing.JLabel();
        Int22 = new javax.swing.JTextField();
        Reloj23 = new javax.swing.JTextField();
        comenzar22 = new javax.swing.JButton();
        p54 = new javax.swing.JLabel();
        Pause22 = new javax.swing.JButton();
        estado22 = new javax.swing.JButton();
        finish22 = new javax.swing.JButton();
        Idea36 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        Pocision23 = new javax.swing.JTextField();
        Icono23 = new javax.swing.JLabel();
        Idea37 = new javax.swing.JLabel();
        Nombre23 = new javax.swing.JTextField();
        p55 = new javax.swing.JLabel();
        p56 = new javax.swing.JLabel();
        Int23 = new javax.swing.JTextField();
        Reloj24 = new javax.swing.JTextField();
        comenzar23 = new javax.swing.JButton();
        p57 = new javax.swing.JLabel();
        Pause23 = new javax.swing.JButton();
        estado23 = new javax.swing.JButton();
        finish23 = new javax.swing.JButton();
        Idea38 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        M1 = new javax.swing.JMenu();
        Registros = new javax.swing.JMenuItem();
        M2 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel principal");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(210000000, 210000000));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 300));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(1200000000, 1200000000));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(2330, 1322));
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

        Idea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 120));

        Nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 150, 30));

        p1.setBackground(new java.awt.Color(102, 102, 255));
        p1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p1.setText("Nombre del Usuario; ");
        p1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p1.setOpaque(true);
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, 30));

        p2.setBackground(new java.awt.Color(255, 102, 255));
        p2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p2.setText("Grado,Grupo,Turno y Especialidad;");
        p2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p2.setOpaque(true);
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 230, 30));

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

        p3.setBackground(new java.awt.Color(0, 204, 204));
        p3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p3.setText("H   :  Min:    S  :  CS");
        p3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p3.setOpaque(true);
        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 20));

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
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });
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

        Idea1.setBackground(new java.awt.Color(153, 51, 0));
        Idea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        Icono1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 100, 40));

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

        Idea39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 140, 120));

        Nombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 150, 30));

        p58.setBackground(new java.awt.Color(102, 102, 255));
        p58.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p58.setText("Nombre del Usuario; ");
        p58.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p58.setOpaque(true);
        jPanel1.add(p58, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 140, 30));

        p59.setBackground(new java.awt.Color(255, 102, 255));
        p59.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p59.setText("Grado,Grupo,Turno y Especialidad;");
        p59.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p59.setOpaque(true);
        jPanel1.add(p59, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 230, 30));

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

        p60.setBackground(new java.awt.Color(0, 204, 204));
        p60.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p60.setText("H   :  Min:    S  :  CS");
        p60.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p60.setOpaque(true);
        jPanel1.add(p60, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 130, 20));

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
        estado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado1ActionPerformed(evt);
            }
        });
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

        Idea40.setBackground(new java.awt.Color(153, 51, 0));
        Idea40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea40.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        Icono2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 100, 40));

        jLabel13.setBackground(new java.awt.Color(51, 255, 255));
        jLabel13.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel13.setText("Equipo; ");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, 30));

        Pocision2.setEditable(false);
        Pocision2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision2.setText("3");
        jPanel1.add(Pocision2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 30, 30));

        Idea41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 140, 120));

        Nombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 150, 30));

        p61.setBackground(new java.awt.Color(102, 102, 255));
        p61.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p61.setText("Nombre del Usuario; ");
        p61.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p61.setOpaque(true);
        jPanel1.add(p61, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 140, 30));

        p62.setBackground(new java.awt.Color(255, 102, 255));
        p62.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p62.setText("Grado,Grupo,Turno y Especialidad;");
        p62.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p62.setOpaque(true);
        jPanel1.add(p62, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 230, 30));

        Int2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 60, 30));

        Reloj3.setEditable(false);
        Reloj3.setBackground(new java.awt.Color(0, 0, 0));
        Reloj3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj3.setForeground(new java.awt.Color(0, 255, 0));
        Reloj3.setText("00 :  00  :  00  :  00");
        Reloj3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 130, -1));

        comenzar2.setBackground(new java.awt.Color(255, 255, 0));
        comenzar2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar2.setText("COMENZAR");
        comenzar2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar2ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 120, -1));

        p63.setBackground(new java.awt.Color(0, 204, 204));
        p63.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p63.setText("H   :  Min:    S  :  CS");
        p63.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p63.setOpaque(true);
        jPanel1.add(p63, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 130, 20));

        Pause2.setBackground(new java.awt.Color(255, 153, 0));
        Pause2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause2.setText("PAUSAR");
        Pause2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause2ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 120, 20));

        estado2.setBackground(new java.awt.Color(0, 255, 0));
        estado2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado2.setText("Normal");
        estado2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado2ActionPerformed(evt);
            }
        });
        jPanel1.add(estado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 160, 50));

        finish2.setBackground(new java.awt.Color(0, 255, 255));
        finish2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish2.setText("Finalizar ");
        finish2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish2ActionPerformed(evt);
            }
        });
        jPanel1.add(finish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, 130, 40));

        Idea42.setBackground(new java.awt.Color(153, 51, 0));
        Idea42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea42.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        Icono3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 760, 100, 40));

        jLabel19.setBackground(new java.awt.Color(51, 255, 255));
        jLabel19.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel19.setText("Equipo; ");
        jLabel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, -1, 30));

        Pocision3.setEditable(false);
        Pocision3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision3.setText("4");
        jPanel1.add(Pocision3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 730, 30, 30));

        Idea43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 140, 120));

        Nombre3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 730, 150, 30));

        p64.setBackground(new java.awt.Color(102, 102, 255));
        p64.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p64.setText("Nombre del Usuario; ");
        p64.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p64.setOpaque(true);
        jPanel1.add(p64, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 730, 140, 30));

        p65.setBackground(new java.awt.Color(255, 102, 255));
        p65.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p65.setText("Grado,Grupo,Turno y Especialidad;");
        p65.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p65.setOpaque(true);
        jPanel1.add(p65, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 760, 230, 30));

        Int3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 760, 60, 30));

        Reloj4.setEditable(false);
        Reloj4.setBackground(new java.awt.Color(0, 0, 0));
        Reloj4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj4.setForeground(new java.awt.Color(0, 255, 0));
        Reloj4.setText("00 :  00  :  00  :  00");
        Reloj4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 790, 130, -1));

        comenzar3.setBackground(new java.awt.Color(255, 255, 0));
        comenzar3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar3.setText("COMENZAR");
        comenzar3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar3ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 790, 120, -1));

        p66.setBackground(new java.awt.Color(0, 204, 204));
        p66.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p66.setText("H   :  Min:    S  :  CS");
        p66.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p66.setOpaque(true);
        jPanel1.add(p66, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 810, 130, 20));

        Pause3.setBackground(new java.awt.Color(255, 153, 0));
        Pause3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause3.setText("PAUSAR");
        Pause3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause3ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 810, 120, 20));

        estado3.setBackground(new java.awt.Color(0, 255, 0));
        estado3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado3.setText("Normal");
        estado3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado3ActionPerformed(evt);
            }
        });
        jPanel1.add(estado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 840, 160, 50));

        finish3.setBackground(new java.awt.Color(0, 255, 255));
        finish3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish3.setText("Finalizar ");
        finish3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish3ActionPerformed(evt);
            }
        });
        jPanel1.add(finish3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 850, 130, 40));

        Idea44.setBackground(new java.awt.Color(153, 51, 0));
        Idea44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea44.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, -1, -1));

        Icono4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 960, 100, 40));

        jLabel25.setBackground(new java.awt.Color(51, 255, 255));
        jLabel25.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel25.setText("Equipo; ");
        jLabel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel25.setOpaque(true);
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 930, -1, 30));

        Pocision4.setEditable(false);
        Pocision4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision4.setText("5");
        jPanel1.add(Pocision4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 930, 30, 30));

        Idea45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 920, 140, 120));

        Nombre4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 930, 150, 30));

        p67.setBackground(new java.awt.Color(102, 102, 255));
        p67.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p67.setText("Nombre del Usuario; ");
        p67.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p67.setOpaque(true);
        jPanel1.add(p67, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 930, 140, 30));

        p68.setBackground(new java.awt.Color(255, 102, 255));
        p68.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p68.setText("Grado,Grupo,Turno y Especialidad;");
        p68.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p68.setOpaque(true);
        jPanel1.add(p68, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 960, 230, 30));

        Int4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 960, 60, 30));

        Reloj5.setEditable(false);
        Reloj5.setBackground(new java.awt.Color(0, 0, 0));
        Reloj5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj5.setForeground(new java.awt.Color(0, 255, 0));
        Reloj5.setText("00 :  00  :  00  :  00");
        Reloj5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 990, 130, -1));

        comenzar4.setBackground(new java.awt.Color(255, 255, 0));
        comenzar4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar4.setText("COMENZAR");
        comenzar4.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar4ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 990, 120, -1));

        p69.setBackground(new java.awt.Color(0, 204, 204));
        p69.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p69.setText("H   :  Min:    S  :  CS");
        p69.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p69.setOpaque(true);
        jPanel1.add(p69, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1010, 130, 20));

        Pause4.setBackground(new java.awt.Color(255, 153, 0));
        Pause4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause4.setText("PAUSAR");
        Pause4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause4ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1010, 120, 20));

        estado4.setBackground(new java.awt.Color(0, 255, 0));
        estado4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado4.setText("Normal");
        estado4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado4ActionPerformed(evt);
            }
        });
        jPanel1.add(estado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1040, 160, 50));

        finish4.setBackground(new java.awt.Color(0, 255, 255));
        finish4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish4.setText("Finalizar ");
        finish4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish4ActionPerformed(evt);
            }
        });
        jPanel1.add(finish4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1050, 130, 40));

        Idea46.setBackground(new java.awt.Color(153, 51, 0));
        Idea46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea46.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 910, -1, -1));

        Icono5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1160, 100, 40));

        jLabel31.setBackground(new java.awt.Color(51, 255, 255));
        jLabel31.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel31.setText("Equipo; ");
        jLabel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel31.setOpaque(true);
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1130, -1, 30));

        Pocision5.setEditable(false);
        Pocision5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision5.setText("6");
        jPanel1.add(Pocision5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1130, 30, 30));

        Idea47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1120, 140, 120));

        Nombre5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1130, 150, 30));

        p70.setBackground(new java.awt.Color(102, 102, 255));
        p70.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p70.setText("Nombre del Usuario; ");
        p70.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p70.setOpaque(true);
        jPanel1.add(p70, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1130, 140, 30));

        p71.setBackground(new java.awt.Color(255, 102, 255));
        p71.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p71.setText("Grado,Grupo,Turno y Especialidad;");
        p71.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p71.setOpaque(true);
        jPanel1.add(p71, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1160, 230, 30));

        Int5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1160, 60, 30));

        Reloj6.setEditable(false);
        Reloj6.setBackground(new java.awt.Color(0, 0, 0));
        Reloj6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj6.setForeground(new java.awt.Color(0, 255, 0));
        Reloj6.setText("00 :  00  :  00  :  00");
        Reloj6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1190, 130, -1));

        comenzar5.setBackground(new java.awt.Color(255, 255, 0));
        comenzar5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar5.setText("COMENZAR");
        comenzar5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar5ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1190, 120, -1));

        p72.setBackground(new java.awt.Color(0, 204, 204));
        p72.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p72.setText("H   :  Min:    S  :  CS");
        p72.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p72.setOpaque(true);
        jPanel1.add(p72, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1210, 130, 20));

        Pause5.setBackground(new java.awt.Color(255, 153, 0));
        Pause5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause5.setText("PAUSAR");
        Pause5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause5ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1210, 120, 20));

        estado5.setBackground(new java.awt.Color(0, 255, 0));
        estado5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado5.setText("Normal");
        estado5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado5ActionPerformed(evt);
            }
        });
        jPanel1.add(estado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1240, 160, 50));

        finish5.setBackground(new java.awt.Color(0, 255, 255));
        finish5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish5.setText("Finalizar ");
        finish5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish5ActionPerformed(evt);
            }
        });
        jPanel1.add(finish5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1250, 130, 40));

        Idea48.setBackground(new java.awt.Color(153, 51, 0));
        Idea48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea48.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1110, -1, -1));

        jLabel4.setBackground(new java.awt.Color(51, 255, 255));
        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("Equipo; ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, 30));

        Pocision6.setEditable(false);
        Pocision6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision6.setText("7");
        jPanel1.add(Pocision6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 30, 30));

        Icono6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 100, 40));

        Idea3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 140, 120));

        Nombre6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 150, 30));

        p4.setBackground(new java.awt.Color(102, 102, 255));
        p4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p4.setText("Nombre del Usuario; ");
        p4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p4.setOpaque(true);
        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 140, 30));

        p5.setBackground(new java.awt.Color(255, 102, 255));
        p5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p5.setText("Grado,Grupo,Turno y Especialidad;");
        p5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p5.setOpaque(true);
        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 230, 30));

        Int6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 160, 60, 30));

        Reloj7.setEditable(false);
        Reloj7.setBackground(new java.awt.Color(0, 0, 0));
        Reloj7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj7.setForeground(new java.awt.Color(0, 255, 0));
        Reloj7.setText("00 :  00  :  00  :  00");
        Reloj7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 130, -1));

        comenzar6.setBackground(new java.awt.Color(255, 255, 0));
        comenzar6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar6.setText("COMENZAR");
        comenzar6.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar6ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 190, 120, -1));

        p6.setBackground(new java.awt.Color(0, 204, 204));
        p6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p6.setText("H   :  Min:    S  :  CS");
        p6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p6.setOpaque(true);
        jPanel1.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 130, 20));

        Pause6.setBackground(new java.awt.Color(255, 153, 0));
        Pause6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause6.setText("PAUSAR");
        Pause6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause6ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 120, 20));

        estado6.setBackground(new java.awt.Color(0, 255, 0));
        estado6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado6.setText("Normal");
        estado6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado6ActionPerformed(evt);
            }
        });
        jPanel1.add(estado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 160, 50));

        finish6.setBackground(new java.awt.Color(0, 255, 255));
        finish6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish6.setText("Finalizar ");
        finish6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish6ActionPerformed(evt);
            }
        });
        jPanel1.add(finish6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, 130, 40));

        Idea4.setBackground(new java.awt.Color(153, 51, 0));
        Idea4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        jLabel5.setBackground(new java.awt.Color(51, 255, 255));
        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setText("Equipo; ");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, 30));

        Pocision7.setEditable(false);
        Pocision7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision7.setText("8");
        jPanel1.add(Pocision7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 30, 30));

        Icono7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 100, 40));

        Idea5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 140, 120));

        Nombre7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 330, 150, 30));

        p7.setBackground(new java.awt.Color(102, 102, 255));
        p7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p7.setText("Nombre del Usuario; ");
        p7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p7.setOpaque(true);
        jPanel1.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 140, 30));

        p8.setBackground(new java.awt.Color(255, 102, 255));
        p8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p8.setText("Grado,Grupo,Turno y Especialidad;");
        p8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p8.setOpaque(true);
        jPanel1.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 230, 30));

        Int7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 360, 60, 30));

        Reloj8.setEditable(false);
        Reloj8.setBackground(new java.awt.Color(0, 0, 0));
        Reloj8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj8.setForeground(new java.awt.Color(0, 255, 0));
        Reloj8.setText("00 :  00  :  00  :  00");
        Reloj8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 130, -1));

        comenzar7.setBackground(new java.awt.Color(255, 255, 0));
        comenzar7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar7.setText("COMENZAR");
        comenzar7.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar7ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, 120, -1));

        p9.setBackground(new java.awt.Color(0, 204, 204));
        p9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p9.setText("H   :  Min:    S  :  CS");
        p9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p9.setOpaque(true);
        jPanel1.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 130, 20));

        Pause7.setBackground(new java.awt.Color(255, 153, 0));
        Pause7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause7.setText("PAUSAR");
        Pause7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause7ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 120, 20));

        estado7.setBackground(new java.awt.Color(0, 255, 0));
        estado7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado7.setText("Normal");
        estado7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado7ActionPerformed(evt);
            }
        });
        jPanel1.add(estado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 160, 50));

        finish7.setBackground(new java.awt.Color(0, 255, 255));
        finish7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish7.setText("Finalizar ");
        finish7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish7ActionPerformed(evt);
            }
        });
        jPanel1.add(finish7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, 130, 40));

        Idea6.setBackground(new java.awt.Color(153, 51, 0));
        Idea6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        jLabel6.setBackground(new java.awt.Color(51, 255, 255));
        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel6.setText("Equipo; ");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, -1, 30));

        Pocision8.setEditable(false);
        Pocision8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision8.setText("9");
        jPanel1.add(Pocision8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 30, 30));

        Icono8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 100, 40));

        Idea7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 140, 120));

        Nombre8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, 150, 30));

        p10.setBackground(new java.awt.Color(102, 102, 255));
        p10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p10.setText("Nombre del Usuario; ");
        p10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p10.setOpaque(true);
        jPanel1.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, 140, 30));

        p11.setBackground(new java.awt.Color(255, 102, 255));
        p11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p11.setText("Grado,Grupo,Turno y Especialidad;");
        p11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p11.setOpaque(true);
        jPanel1.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 230, 30));

        Int8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 560, 60, 30));

        Reloj9.setEditable(false);
        Reloj9.setBackground(new java.awt.Color(0, 0, 0));
        Reloj9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj9.setForeground(new java.awt.Color(0, 255, 0));
        Reloj9.setText("00 :  00  :  00  :  00");
        Reloj9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 130, -1));

        comenzar8.setBackground(new java.awt.Color(255, 255, 0));
        comenzar8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar8.setText("COMENZAR");
        comenzar8.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar8ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 590, 120, -1));

        p12.setBackground(new java.awt.Color(0, 204, 204));
        p12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p12.setText("H   :  Min:    S  :  CS");
        p12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p12.setOpaque(true);
        jPanel1.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 130, 20));

        Pause8.setBackground(new java.awt.Color(255, 153, 0));
        Pause8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause8.setText("PAUSAR");
        Pause8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause8ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 610, 120, 20));

        estado8.setBackground(new java.awt.Color(0, 255, 0));
        estado8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado8.setText("Normal");
        estado8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado8ActionPerformed(evt);
            }
        });
        jPanel1.add(estado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 640, 160, 50));

        finish8.setBackground(new java.awt.Color(0, 255, 255));
        finish8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish8.setText("Finalizar ");
        finish8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish8ActionPerformed(evt);
            }
        });
        jPanel1.add(finish8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 650, 130, 40));

        Idea8.setBackground(new java.awt.Color(153, 51, 0));
        Idea8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, -1, -1));

        jLabel37.setBackground(new java.awt.Color(51, 255, 255));
        jLabel37.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel37.setText("Equipo; ");
        jLabel37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel37.setOpaque(true);
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 730, -1, 30));

        Pocision9.setEditable(false);
        Pocision9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision9.setText("10");
        jPanel1.add(Pocision9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 730, 30, 30));

        Icono9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 760, 100, 40));

        Idea9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 720, 140, 120));

        Nombre9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 730, 150, 30));

        p13.setBackground(new java.awt.Color(102, 102, 255));
        p13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p13.setText("Nombre del Usuario; ");
        p13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p13.setOpaque(true);
        jPanel1.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 730, 140, 30));

        p14.setBackground(new java.awt.Color(255, 102, 255));
        p14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p14.setText("Grado,Grupo,Turno y Especialidad;");
        p14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p14.setOpaque(true);
        jPanel1.add(p14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 760, 230, 30));

        Int9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 760, 60, 30));

        Reloj10.setEditable(false);
        Reloj10.setBackground(new java.awt.Color(0, 0, 0));
        Reloj10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj10.setForeground(new java.awt.Color(0, 255, 0));
        Reloj10.setText("00 :  00  :  00  :  00");
        Reloj10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 790, 130, -1));

        comenzar9.setBackground(new java.awt.Color(255, 255, 0));
        comenzar9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar9.setText("COMENZAR");
        comenzar9.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar9ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 790, 120, -1));

        p15.setBackground(new java.awt.Color(0, 204, 204));
        p15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p15.setText("H   :  Min:    S  :  CS");
        p15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p15.setOpaque(true);
        jPanel1.add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 810, 130, 20));

        Pause9.setBackground(new java.awt.Color(255, 153, 0));
        Pause9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause9.setText("PAUSAR");
        Pause9.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause9ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 810, 120, 20));

        estado9.setBackground(new java.awt.Color(0, 255, 0));
        estado9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado9.setText("Normal");
        estado9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado9ActionPerformed(evt);
            }
        });
        jPanel1.add(estado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 840, 160, 50));

        finish9.setBackground(new java.awt.Color(0, 255, 255));
        finish9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish9.setText("Finalizar ");
        finish9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish9ActionPerformed(evt);
            }
        });
        jPanel1.add(finish9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 850, 130, 40));

        Idea10.setBackground(new java.awt.Color(153, 51, 0));
        Idea10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 710, -1, -1));

        jLabel38.setBackground(new java.awt.Color(51, 255, 255));
        jLabel38.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel38.setText("Equipo; ");
        jLabel38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel38.setOpaque(true);
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 930, -1, 30));

        Pocision10.setEditable(false);
        Pocision10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision10.setText("11");
        jPanel1.add(Pocision10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 930, 30, 30));

        Icono10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 960, 100, 40));

        Idea11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 920, 140, 120));

        Nombre10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 930, 150, 30));

        p16.setBackground(new java.awt.Color(102, 102, 255));
        p16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p16.setText("Nombre del Usuario; ");
        p16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p16.setOpaque(true);
        jPanel1.add(p16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 930, 140, 30));

        p17.setBackground(new java.awt.Color(255, 102, 255));
        p17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p17.setText("Grado,Grupo,Turno y Especialidad;");
        p17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p17.setOpaque(true);
        jPanel1.add(p17, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 960, 230, 30));

        Int10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 960, 60, 30));

        Reloj11.setEditable(false);
        Reloj11.setBackground(new java.awt.Color(0, 0, 0));
        Reloj11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj11.setForeground(new java.awt.Color(0, 255, 0));
        Reloj11.setText("00 :  00  :  00  :  00");
        Reloj11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 990, 130, -1));

        comenzar10.setBackground(new java.awt.Color(255, 255, 0));
        comenzar10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar10.setText("COMENZAR");
        comenzar10.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar10ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 990, 120, -1));

        p18.setBackground(new java.awt.Color(0, 204, 204));
        p18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p18.setText("H   :  Min:    S  :  CS");
        p18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p18.setOpaque(true);
        jPanel1.add(p18, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1010, 130, 20));

        Pause10.setBackground(new java.awt.Color(255, 153, 0));
        Pause10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause10.setText("PAUSAR");
        Pause10.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause10ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1010, 120, 20));

        estado10.setBackground(new java.awt.Color(0, 255, 0));
        estado10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado10.setText("Normal");
        estado10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado10ActionPerformed(evt);
            }
        });
        jPanel1.add(estado10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 1040, 160, 50));

        finish10.setBackground(new java.awt.Color(0, 255, 255));
        finish10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish10.setText("Finalizar ");
        finish10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish10ActionPerformed(evt);
            }
        });
        jPanel1.add(finish10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1050, 130, 40));

        Idea12.setBackground(new java.awt.Color(153, 51, 0));
        Idea12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 910, -1, -1));

        jLabel39.setBackground(new java.awt.Color(51, 255, 255));
        jLabel39.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel39.setText("Equipo; ");
        jLabel39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel39.setOpaque(true);
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1130, -1, 30));

        Pocision11.setEditable(false);
        Pocision11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision11.setText("12");
        jPanel1.add(Pocision11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 1130, 30, 30));

        Icono11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1160, 100, 40));

        Idea13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 1120, 140, 120));

        Nombre11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre11, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 1130, 150, 30));

        p19.setBackground(new java.awt.Color(102, 102, 255));
        p19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p19.setText("Nombre del Usuario; ");
        p19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p19.setOpaque(true);
        jPanel1.add(p19, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1130, 140, 30));

        p20.setBackground(new java.awt.Color(255, 102, 255));
        p20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p20.setText("Grado,Grupo,Turno y Especialidad;");
        p20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p20.setOpaque(true);
        jPanel1.add(p20, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1160, 230, 30));

        Int11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 1160, 60, 30));

        Reloj12.setEditable(false);
        Reloj12.setBackground(new java.awt.Color(0, 0, 0));
        Reloj12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj12.setForeground(new java.awt.Color(0, 255, 0));
        Reloj12.setText("00 :  00  :  00  :  00");
        Reloj12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1190, 130, -1));

        comenzar11.setBackground(new java.awt.Color(255, 255, 0));
        comenzar11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar11.setText("COMENZAR");
        comenzar11.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar11ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1190, 120, -1));

        p21.setBackground(new java.awt.Color(0, 204, 204));
        p21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p21.setText("H   :  Min:    S  :  CS");
        p21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p21.setOpaque(true);
        jPanel1.add(p21, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1210, 130, 20));

        Pause11.setBackground(new java.awt.Color(255, 153, 0));
        Pause11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause11.setText("PAUSAR");
        Pause11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause11ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1210, 120, 20));

        estado11.setBackground(new java.awt.Color(0, 255, 0));
        estado11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado11.setText("Normal");
        estado11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado11ActionPerformed(evt);
            }
        });
        jPanel1.add(estado11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 1240, 160, 50));

        finish11.setBackground(new java.awt.Color(0, 255, 255));
        finish11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish11.setText("Finalizar ");
        finish11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish11ActionPerformed(evt);
            }
        });
        jPanel1.add(finish11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1250, 130, 40));

        Idea14.setBackground(new java.awt.Color(153, 51, 0));
        Idea14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea14.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1110, -1, -1));

        jLabel40.setBackground(new java.awt.Color(51, 255, 255));
        jLabel40.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel40.setText("Equipo; ");
        jLabel40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel40.setOpaque(true);
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 130, -1, 30));

        Pocision12.setEditable(false);
        Pocision12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision12.setText("13");
        jPanel1.add(Pocision12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 130, 30, 30));

        Icono12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 160, 100, 40));

        Idea15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 120, 140, 120));

        Nombre12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 130, 150, 30));

        p22.setBackground(new java.awt.Color(102, 102, 255));
        p22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p22.setText("Nombre del Usuario; ");
        p22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p22.setOpaque(true);
        jPanel1.add(p22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 130, 140, 30));

        p23.setBackground(new java.awt.Color(255, 102, 255));
        p23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p23.setText("Grado,Grupo,Turno y Especialidad;");
        p23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p23.setOpaque(true);
        jPanel1.add(p23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 160, 230, 30));

        Int12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 160, 60, 30));

        Reloj13.setEditable(false);
        Reloj13.setBackground(new java.awt.Color(0, 0, 0));
        Reloj13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj13.setForeground(new java.awt.Color(0, 255, 0));
        Reloj13.setText("00 :  00  :  00  :  00");
        Reloj13.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 190, 130, -1));

        comenzar12.setBackground(new java.awt.Color(255, 255, 0));
        comenzar12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar12.setText("COMENZAR");
        comenzar12.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar12ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 190, 120, -1));

        p24.setBackground(new java.awt.Color(0, 204, 204));
        p24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p24.setText("H   :  Min:    S  :  CS");
        p24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p24.setOpaque(true);
        jPanel1.add(p24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 210, 130, 20));

        Pause12.setBackground(new java.awt.Color(255, 153, 0));
        Pause12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause12.setText("PAUSAR");
        Pause12.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause12ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 210, 120, 20));

        estado12.setBackground(new java.awt.Color(0, 255, 0));
        estado12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado12.setText("Normal");
        estado12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado12ActionPerformed(evt);
            }
        });
        jPanel1.add(estado12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 240, 160, 50));

        finish12.setBackground(new java.awt.Color(0, 255, 255));
        finish12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish12.setText("Finalizar ");
        finish12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish12ActionPerformed(evt);
            }
        });
        jPanel1.add(finish12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 250, 130, 40));

        Idea16.setBackground(new java.awt.Color(153, 51, 0));
        Idea16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea16.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 110, -1, -1));

        jLabel41.setBackground(new java.awt.Color(51, 255, 255));
        jLabel41.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel41.setText("Equipo; ");
        jLabel41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel41.setOpaque(true);
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 330, -1, 30));

        Pocision13.setEditable(false);
        Pocision13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision13.setText("14");
        jPanel1.add(Pocision13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 330, 30, 30));

        Icono13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 360, 100, 40));

        Idea17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 320, 140, 120));

        Nombre13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 330, 150, 30));

        p25.setBackground(new java.awt.Color(102, 102, 255));
        p25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p25.setText("Nombre del Usuario; ");
        p25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p25.setOpaque(true);
        jPanel1.add(p25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 330, 140, 30));

        p26.setBackground(new java.awt.Color(255, 102, 255));
        p26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p26.setText("Grado,Grupo,Turno y Especialidad;");
        p26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p26.setOpaque(true);
        jPanel1.add(p26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 360, 230, 30));

        Int13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 360, 60, 30));

        Reloj14.setEditable(false);
        Reloj14.setBackground(new java.awt.Color(0, 0, 0));
        Reloj14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj14.setForeground(new java.awt.Color(0, 255, 0));
        Reloj14.setText("00 :  00  :  00  :  00");
        Reloj14.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 390, 130, -1));

        comenzar13.setBackground(new java.awt.Color(255, 255, 0));
        comenzar13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar13.setText("COMENZAR");
        comenzar13.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar13ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 390, 120, -1));

        p27.setBackground(new java.awt.Color(0, 204, 204));
        p27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p27.setText("H   :  Min:    S  :  CS");
        p27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p27.setOpaque(true);
        jPanel1.add(p27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 410, 130, 20));

        Pause13.setBackground(new java.awt.Color(255, 153, 0));
        Pause13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause13.setText("PAUSAR");
        Pause13.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause13ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 410, 120, 20));

        estado13.setBackground(new java.awt.Color(0, 255, 0));
        estado13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado13.setText("Normal");
        estado13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado13ActionPerformed(evt);
            }
        });
        jPanel1.add(estado13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 440, 160, 50));

        finish13.setBackground(new java.awt.Color(0, 255, 255));
        finish13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish13.setText("Finalizar ");
        finish13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish13ActionPerformed(evt);
            }
        });
        jPanel1.add(finish13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 450, 130, 40));

        Idea18.setBackground(new java.awt.Color(153, 51, 0));
        Idea18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea18.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 310, -1, -1));

        jLabel42.setBackground(new java.awt.Color(51, 255, 255));
        jLabel42.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel42.setText("Equipo; ");
        jLabel42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel42.setOpaque(true);
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 530, -1, 30));

        Pocision14.setEditable(false);
        Pocision14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision14.setText("15");
        jPanel1.add(Pocision14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 530, 30, 30));

        Icono14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 560, 100, 40));

        Idea19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 520, 140, 120));

        Nombre14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 530, 150, 30));

        p28.setBackground(new java.awt.Color(102, 102, 255));
        p28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p28.setText("Nombre del Usuario; ");
        p28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p28.setOpaque(true);
        jPanel1.add(p28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 530, 140, 30));

        p29.setBackground(new java.awt.Color(255, 102, 255));
        p29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p29.setText("Grado,Grupo,Turno y Especialidad;");
        p29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p29.setOpaque(true);
        jPanel1.add(p29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 560, 230, 30));

        Int14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 560, 60, 30));

        Reloj15.setEditable(false);
        Reloj15.setBackground(new java.awt.Color(0, 0, 0));
        Reloj15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj15.setForeground(new java.awt.Color(0, 255, 0));
        Reloj15.setText("00 :  00  :  00  :  00");
        Reloj15.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 590, 130, -1));

        comenzar14.setBackground(new java.awt.Color(255, 255, 0));
        comenzar14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar14.setText("COMENZAR");
        comenzar14.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar14ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 590, 120, -1));

        p30.setBackground(new java.awt.Color(0, 204, 204));
        p30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p30.setText("H   :  Min:    S  :  CS");
        p30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p30.setOpaque(true);
        jPanel1.add(p30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 610, 130, 20));

        Pause14.setBackground(new java.awt.Color(255, 153, 0));
        Pause14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause14.setText("PAUSAR");
        Pause14.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause14ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 610, 120, 20));

        estado14.setBackground(new java.awt.Color(0, 255, 0));
        estado14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado14.setText("Normal");
        estado14.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado14ActionPerformed(evt);
            }
        });
        jPanel1.add(estado14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 640, 160, 50));

        finish14.setBackground(new java.awt.Color(0, 255, 255));
        finish14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish14.setText("Finalizar ");
        finish14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish14ActionPerformed(evt);
            }
        });
        jPanel1.add(finish14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 650, 130, 40));

        Idea20.setBackground(new java.awt.Color(153, 51, 0));
        Idea20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea20.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 510, -1, -1));

        jLabel43.setBackground(new java.awt.Color(51, 255, 255));
        jLabel43.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel43.setText("Equipo; ");
        jLabel43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel43.setOpaque(true);
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 730, -1, 30));

        Pocision15.setEditable(false);
        Pocision15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision15.setText("16");
        jPanel1.add(Pocision15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 730, 30, 30));

        Icono15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 760, 100, 40));

        Idea21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 720, 140, 120));

        Nombre15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 730, 150, 30));

        p31.setBackground(new java.awt.Color(102, 102, 255));
        p31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p31.setText("Nombre del Usuario; ");
        p31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p31.setOpaque(true);
        jPanel1.add(p31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 730, 140, 30));

        p32.setBackground(new java.awt.Color(255, 102, 255));
        p32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p32.setText("Grado,Grupo,Turno y Especialidad;");
        p32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p32.setOpaque(true);
        jPanel1.add(p32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 760, 230, 30));

        Int15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 760, 60, 30));

        Reloj16.setEditable(false);
        Reloj16.setBackground(new java.awt.Color(0, 0, 0));
        Reloj16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj16.setForeground(new java.awt.Color(0, 255, 0));
        Reloj16.setText("00 :  00  :  00  :  00");
        Reloj16.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 790, 130, -1));

        comenzar15.setBackground(new java.awt.Color(255, 255, 0));
        comenzar15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar15.setText("COMENZAR");
        comenzar15.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar15ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 790, 120, -1));

        p33.setBackground(new java.awt.Color(0, 204, 204));
        p33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p33.setText("H   :  Min:    S  :  CS");
        p33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p33.setOpaque(true);
        jPanel1.add(p33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 810, 130, 20));

        Pause15.setBackground(new java.awt.Color(255, 153, 0));
        Pause15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause15.setText("PAUSAR");
        Pause15.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause15ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 810, 120, 20));

        estado15.setBackground(new java.awt.Color(0, 255, 0));
        estado15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado15.setText("Normal");
        estado15.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado15ActionPerformed(evt);
            }
        });
        jPanel1.add(estado15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 840, 160, 50));

        finish15.setBackground(new java.awt.Color(0, 255, 255));
        finish15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish15.setText("Finalizar ");
        finish15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish15ActionPerformed(evt);
            }
        });
        jPanel1.add(finish15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 850, 130, 40));

        Idea22.setBackground(new java.awt.Color(153, 51, 0));
        Idea22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea22.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 710, -1, -1));

        jLabel44.setBackground(new java.awt.Color(51, 255, 255));
        jLabel44.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel44.setText("Equipo; ");
        jLabel44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel44.setOpaque(true);
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 930, -1, 30));

        Pocision16.setEditable(false);
        Pocision16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision16.setText("17");
        jPanel1.add(Pocision16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 930, 30, 30));

        Icono16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 960, 100, 40));

        Idea23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 920, 140, 120));

        Nombre16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 930, 150, 30));

        p34.setBackground(new java.awt.Color(102, 102, 255));
        p34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p34.setText("Nombre del Usuario; ");
        p34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p34.setOpaque(true);
        jPanel1.add(p34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 930, 140, 30));

        p35.setBackground(new java.awt.Color(255, 102, 255));
        p35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p35.setText("Grado,Grupo,Turno y Especialidad;");
        p35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p35.setOpaque(true);
        jPanel1.add(p35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 960, 230, 30));

        Int16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 960, 60, 30));

        Reloj17.setEditable(false);
        Reloj17.setBackground(new java.awt.Color(0, 0, 0));
        Reloj17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj17.setForeground(new java.awt.Color(0, 255, 0));
        Reloj17.setText("00 :  00  :  00  :  00");
        Reloj17.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 990, 130, -1));

        comenzar16.setBackground(new java.awt.Color(255, 255, 0));
        comenzar16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar16.setText("COMENZAR");
        comenzar16.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar16ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 990, 120, -1));

        p36.setBackground(new java.awt.Color(0, 204, 204));
        p36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p36.setText("H   :  Min:    S  :  CS");
        p36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p36.setOpaque(true);
        jPanel1.add(p36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 1010, 130, 20));

        Pause16.setBackground(new java.awt.Color(255, 153, 0));
        Pause16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause16.setText("PAUSAR");
        Pause16.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause16ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1010, 120, 20));

        estado16.setBackground(new java.awt.Color(0, 255, 0));
        estado16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado16.setText("Normal");
        estado16.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado16ActionPerformed(evt);
            }
        });
        jPanel1.add(estado16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 1040, 160, 50));

        finish16.setBackground(new java.awt.Color(0, 255, 255));
        finish16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish16.setText("Finalizar ");
        finish16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish16ActionPerformed(evt);
            }
        });
        jPanel1.add(finish16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1050, 130, 40));

        Idea24.setBackground(new java.awt.Color(153, 51, 0));
        Idea24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea24.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 910, -1, -1));

        jLabel45.setBackground(new java.awt.Color(51, 255, 255));
        jLabel45.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel45.setText("Equipo; ");
        jLabel45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel45.setOpaque(true);
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1130, -1, 30));

        Pocision17.setEditable(false);
        Pocision17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision17.setText("18");
        jPanel1.add(Pocision17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 1130, 30, 30));

        Icono17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 1160, 100, 40));

        Idea25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 1120, 140, 120));

        Nombre17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 1130, 150, 30));

        p37.setBackground(new java.awt.Color(102, 102, 255));
        p37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p37.setText("Nombre del Usuario; ");
        p37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p37.setOpaque(true);
        jPanel1.add(p37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 1130, 140, 30));

        p38.setBackground(new java.awt.Color(255, 102, 255));
        p38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p38.setText("Grado,Grupo,Turno y Especialidad;");
        p38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p38.setOpaque(true);
        jPanel1.add(p38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 1160, 230, 30));

        Int17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 1160, 60, 30));

        Reloj18.setEditable(false);
        Reloj18.setBackground(new java.awt.Color(0, 0, 0));
        Reloj18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj18.setForeground(new java.awt.Color(0, 255, 0));
        Reloj18.setText("00 :  00  :  00  :  00");
        Reloj18.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 1190, 130, -1));

        comenzar17.setBackground(new java.awt.Color(255, 255, 0));
        comenzar17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar17.setText("COMENZAR");
        comenzar17.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar17ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1190, 120, -1));

        p39.setBackground(new java.awt.Color(0, 204, 204));
        p39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p39.setText("H   :  Min:    S  :  CS");
        p39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p39.setOpaque(true);
        jPanel1.add(p39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 1210, 130, 20));

        Pause17.setBackground(new java.awt.Color(255, 153, 0));
        Pause17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause17.setText("PAUSAR");
        Pause17.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause17ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1210, 120, 20));

        estado17.setBackground(new java.awt.Color(0, 255, 0));
        estado17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado17.setText("Normal");
        estado17.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado17ActionPerformed(evt);
            }
        });
        jPanel1.add(estado17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 1240, 160, 50));

        finish17.setBackground(new java.awt.Color(0, 255, 255));
        finish17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish17.setText("Finalizar ");
        finish17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish17ActionPerformed(evt);
            }
        });
        jPanel1.add(finish17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 1250, 130, 40));

        Idea26.setBackground(new java.awt.Color(153, 51, 0));
        Idea26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea26.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 1110, -1, -1));

        jLabel46.setBackground(new java.awt.Color(51, 255, 255));
        jLabel46.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel46.setText("Equipo; ");
        jLabel46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel46.setOpaque(true);
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 130, -1, 30));

        Pocision18.setEditable(false);
        Pocision18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision18.setText("19");
        jPanel1.add(Pocision18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1950, 130, 30, 30));

        Icono18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 160, 100, 40));

        Idea27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 120, 140, 120));

        Nombre18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2150, 130, 150, 30));

        p40.setBackground(new java.awt.Color(102, 102, 255));
        p40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p40.setText("Nombre del Usuario; ");
        p40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p40.setOpaque(true);
        jPanel1.add(p40, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 130, 140, 30));

        p41.setBackground(new java.awt.Color(255, 102, 255));
        p41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p41.setText("Grado,Grupo,Turno y Especialidad;");
        p41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p41.setOpaque(true);
        jPanel1.add(p41, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 160, 230, 30));

        Int18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2240, 160, 60, 30));

        Reloj19.setEditable(false);
        Reloj19.setBackground(new java.awt.Color(0, 0, 0));
        Reloj19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj19.setForeground(new java.awt.Color(0, 255, 0));
        Reloj19.setText("00 :  00  :  00  :  00");
        Reloj19.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj19, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 190, 130, -1));

        comenzar18.setBackground(new java.awt.Color(255, 255, 0));
        comenzar18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar18.setText("COMENZAR");
        comenzar18.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar18ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 190, 120, -1));

        p42.setBackground(new java.awt.Color(0, 204, 204));
        p42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p42.setText("H   :  Min:    S  :  CS");
        p42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p42.setOpaque(true);
        jPanel1.add(p42, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 210, 130, 20));

        Pause18.setBackground(new java.awt.Color(255, 153, 0));
        Pause18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause18.setText("PAUSAR");
        Pause18.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause18ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 210, 120, 20));

        estado18.setBackground(new java.awt.Color(0, 255, 0));
        estado18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado18.setText("Normal");
        estado18.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado18ActionPerformed(evt);
            }
        });
        jPanel1.add(estado18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 240, 160, 50));

        finish18.setBackground(new java.awt.Color(0, 255, 255));
        finish18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish18.setText("Finalizar ");
        finish18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish18ActionPerformed(evt);
            }
        });
        jPanel1.add(finish18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 250, 130, 40));

        Idea28.setBackground(new java.awt.Color(153, 51, 0));
        Idea28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea28.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 110, -1, -1));

        jLabel47.setBackground(new java.awt.Color(51, 255, 255));
        jLabel47.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel47.setText("Equipo; ");
        jLabel47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel47.setOpaque(true);
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 330, -1, 30));

        Pocision19.setEditable(false);
        Pocision19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision19.setText("20");
        jPanel1.add(Pocision19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1950, 330, 30, 30));

        Icono19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 360, 100, 40));

        Idea29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 320, 140, 120));

        Nombre19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre19, new org.netbeans.lib.awtextra.AbsoluteConstraints(2150, 330, 150, 30));

        p43.setBackground(new java.awt.Color(102, 102, 255));
        p43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p43.setText("Nombre del Usuario; ");
        p43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p43.setOpaque(true);
        jPanel1.add(p43, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 330, 140, 30));

        p44.setBackground(new java.awt.Color(255, 102, 255));
        p44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p44.setText("Grado,Grupo,Turno y Especialidad;");
        p44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p44.setOpaque(true);
        jPanel1.add(p44, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 360, 230, 30));

        Int19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int19, new org.netbeans.lib.awtextra.AbsoluteConstraints(2240, 360, 60, 30));

        Reloj20.setEditable(false);
        Reloj20.setBackground(new java.awt.Color(0, 0, 0));
        Reloj20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj20.setForeground(new java.awt.Color(0, 255, 0));
        Reloj20.setText("00 :  00  :  00  :  00");
        Reloj20.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 390, 130, -1));

        comenzar19.setBackground(new java.awt.Color(255, 255, 0));
        comenzar19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar19.setText("COMENZAR");
        comenzar19.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar19ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar19, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 390, 120, -1));

        p45.setBackground(new java.awt.Color(0, 204, 204));
        p45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p45.setText("H   :  Min:    S  :  CS");
        p45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p45.setOpaque(true);
        jPanel1.add(p45, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 410, 130, 20));

        Pause19.setBackground(new java.awt.Color(255, 153, 0));
        Pause19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause19.setText("PAUSAR");
        Pause19.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause19ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause19, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 410, 120, 20));

        estado19.setBackground(new java.awt.Color(0, 255, 0));
        estado19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado19.setText("Normal");
        estado19.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado19ActionPerformed(evt);
            }
        });
        jPanel1.add(estado19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 440, 160, 50));

        finish19.setBackground(new java.awt.Color(0, 255, 255));
        finish19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish19.setText("Finalizar ");
        finish19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish19ActionPerformed(evt);
            }
        });
        jPanel1.add(finish19, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 450, 130, 40));

        Idea30.setBackground(new java.awt.Color(153, 51, 0));
        Idea30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea30.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 310, -1, -1));

        jLabel48.setBackground(new java.awt.Color(51, 255, 255));
        jLabel48.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel48.setText("Equipo; ");
        jLabel48.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel48.setOpaque(true);
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 530, -1, 30));

        Pocision20.setEditable(false);
        Pocision20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision20.setText("21");
        jPanel1.add(Pocision20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1950, 530, 30, 30));

        Icono20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 560, 100, 40));

        Idea31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 520, 140, 120));

        Nombre20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2150, 530, 150, 30));

        p46.setBackground(new java.awt.Color(102, 102, 255));
        p46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p46.setText("Nombre del Usuario; ");
        p46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p46.setOpaque(true);
        jPanel1.add(p46, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 530, 140, 30));

        p47.setBackground(new java.awt.Color(255, 102, 255));
        p47.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p47.setText("Grado,Grupo,Turno y Especialidad;");
        p47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p47.setOpaque(true);
        jPanel1.add(p47, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 560, 230, 30));

        Int20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2240, 560, 60, 30));

        Reloj21.setEditable(false);
        Reloj21.setBackground(new java.awt.Color(0, 0, 0));
        Reloj21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj21.setForeground(new java.awt.Color(0, 255, 0));
        Reloj21.setText("00 :  00  :  00  :  00");
        Reloj21.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj21, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 590, 130, -1));

        comenzar20.setBackground(new java.awt.Color(255, 255, 0));
        comenzar20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar20.setText("COMENZAR");
        comenzar20.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar20ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 590, 120, -1));

        p48.setBackground(new java.awt.Color(0, 204, 204));
        p48.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p48.setText("H   :  Min:    S  :  CS");
        p48.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p48.setOpaque(true);
        jPanel1.add(p48, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 610, 130, 20));

        Pause20.setBackground(new java.awt.Color(255, 153, 0));
        Pause20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause20.setText("PAUSAR");
        Pause20.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause20ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 610, 120, 20));

        estado20.setBackground(new java.awt.Color(0, 255, 0));
        estado20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado20.setText("Normal");
        estado20.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado20ActionPerformed(evt);
            }
        });
        jPanel1.add(estado20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 640, 160, 50));

        finish20.setBackground(new java.awt.Color(0, 255, 255));
        finish20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish20.setText("Finalizar ");
        finish20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish20ActionPerformed(evt);
            }
        });
        jPanel1.add(finish20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 650, 130, 40));

        Idea32.setBackground(new java.awt.Color(153, 51, 0));
        Idea32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea32.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 510, -1, -1));

        jLabel49.setBackground(new java.awt.Color(51, 255, 255));
        jLabel49.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel49.setText("Equipo; ");
        jLabel49.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel49.setOpaque(true);
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 730, -1, 30));

        Pocision21.setEditable(false);
        Pocision21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision21.setText("22");
        jPanel1.add(Pocision21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1950, 730, 30, 30));

        Icono21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 760, 100, 40));

        Idea33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 720, 140, 120));

        Nombre21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre21, new org.netbeans.lib.awtextra.AbsoluteConstraints(2150, 730, 150, 30));

        p49.setBackground(new java.awt.Color(102, 102, 255));
        p49.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p49.setText("Nombre del Usuario; ");
        p49.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p49.setOpaque(true);
        jPanel1.add(p49, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 730, 140, 30));

        p50.setBackground(new java.awt.Color(255, 102, 255));
        p50.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p50.setText("Grado,Grupo,Turno y Especialidad;");
        p50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p50.setOpaque(true);
        jPanel1.add(p50, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 760, 230, 30));

        Int21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int21, new org.netbeans.lib.awtextra.AbsoluteConstraints(2240, 760, 60, 30));

        Reloj22.setEditable(false);
        Reloj22.setBackground(new java.awt.Color(0, 0, 0));
        Reloj22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj22.setForeground(new java.awt.Color(0, 255, 0));
        Reloj22.setText("00 :  00  :  00  :  00");
        Reloj22.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj22, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 790, 130, -1));

        comenzar21.setBackground(new java.awt.Color(255, 255, 0));
        comenzar21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar21.setText("COMENZAR");
        comenzar21.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar21ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar21, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 790, 120, -1));

        p51.setBackground(new java.awt.Color(0, 204, 204));
        p51.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p51.setText("H   :  Min:    S  :  CS");
        p51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p51.setOpaque(true);
        jPanel1.add(p51, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 810, 130, 20));

        Pause21.setBackground(new java.awt.Color(255, 153, 0));
        Pause21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause21.setText("PAUSAR");
        Pause21.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause21ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause21, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 810, 120, 20));

        estado21.setBackground(new java.awt.Color(0, 255, 0));
        estado21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado21.setText("Normal");
        estado21.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado21ActionPerformed(evt);
            }
        });
        jPanel1.add(estado21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 840, 160, 50));

        finish21.setBackground(new java.awt.Color(0, 255, 255));
        finish21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish21.setText("Finalizar ");
        finish21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish21ActionPerformed(evt);
            }
        });
        jPanel1.add(finish21, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 850, 130, 40));

        Idea34.setBackground(new java.awt.Color(153, 51, 0));
        Idea34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea34.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 710, -1, -1));

        jLabel50.setBackground(new java.awt.Color(51, 255, 255));
        jLabel50.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel50.setText("Equipo; ");
        jLabel50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel50.setOpaque(true);
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 930, -1, 30));

        Pocision22.setEditable(false);
        Pocision22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision22.setText("23");
        jPanel1.add(Pocision22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1950, 930, 30, 30));

        Icono22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 960, 100, 40));

        Idea35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 920, 140, 120));

        Nombre22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre22, new org.netbeans.lib.awtextra.AbsoluteConstraints(2150, 930, 150, 30));

        p52.setBackground(new java.awt.Color(102, 102, 255));
        p52.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p52.setText("Nombre del Usuario; ");
        p52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p52.setOpaque(true);
        jPanel1.add(p52, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 930, 140, 30));

        p53.setBackground(new java.awt.Color(255, 102, 255));
        p53.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p53.setText("Grado,Grupo,Turno y Especialidad;");
        p53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p53.setOpaque(true);
        jPanel1.add(p53, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 960, 230, 30));

        Int22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int22, new org.netbeans.lib.awtextra.AbsoluteConstraints(2240, 960, 60, 30));

        Reloj23.setEditable(false);
        Reloj23.setBackground(new java.awt.Color(0, 0, 0));
        Reloj23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj23.setForeground(new java.awt.Color(0, 255, 0));
        Reloj23.setText("00 :  00  :  00  :  00");
        Reloj23.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj23, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 990, 130, -1));

        comenzar22.setBackground(new java.awt.Color(255, 255, 0));
        comenzar22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar22.setText("COMENZAR");
        comenzar22.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar22ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar22, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 990, 120, -1));

        p54.setBackground(new java.awt.Color(0, 204, 204));
        p54.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p54.setText("H   :  Min:    S  :  CS");
        p54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p54.setOpaque(true);
        jPanel1.add(p54, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 1010, 130, 20));

        Pause22.setBackground(new java.awt.Color(255, 153, 0));
        Pause22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause22.setText("PAUSAR");
        Pause22.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause22ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause22, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 1010, 120, 20));

        estado22.setBackground(new java.awt.Color(0, 255, 0));
        estado22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado22.setText("Normal");
        estado22.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado22ActionPerformed(evt);
            }
        });
        jPanel1.add(estado22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 1040, 160, 50));

        finish22.setBackground(new java.awt.Color(0, 255, 255));
        finish22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish22.setText("Finalizar ");
        finish22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish22ActionPerformed(evt);
            }
        });
        jPanel1.add(finish22, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 1050, 130, 40));

        Idea36.setBackground(new java.awt.Color(153, 51, 0));
        Idea36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea36.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 910, -1, -1));

        jLabel51.setBackground(new java.awt.Color(51, 255, 255));
        jLabel51.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel51.setText("Equipo; ");
        jLabel51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jLabel51.setOpaque(true);
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 1130, -1, 30));

        Pocision23.setEditable(false);
        Pocision23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pocision23.setText("24");
        jPanel1.add(Pocision23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1950, 1130, 30, 30));

        Icono23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Icono23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 1160, 100, 40));

        Idea37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/monitor-2455524__340.png"))); // NOI18N
        jPanel1.add(Idea37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 1120, 140, 120));

        Nombre23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Nombre23, new org.netbeans.lib.awtextra.AbsoluteConstraints(2150, 1130, 150, 30));

        p55.setBackground(new java.awt.Color(102, 102, 255));
        p55.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p55.setText("Nombre del Usuario; ");
        p55.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        p55.setOpaque(true);
        jPanel1.add(p55, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 1130, 140, 30));

        p56.setBackground(new java.awt.Color(255, 102, 255));
        p56.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p56.setText("Grado,Grupo,Turno y Especialidad;");
        p56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 3, true));
        p56.setOpaque(true);
        jPanel1.add(p56, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 1160, 230, 30));

        Int23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Int23, new org.netbeans.lib.awtextra.AbsoluteConstraints(2240, 1160, 60, 30));

        Reloj24.setEditable(false);
        Reloj24.setBackground(new java.awt.Color(0, 0, 0));
        Reloj24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Reloj24.setForeground(new java.awt.Color(0, 255, 0));
        Reloj24.setText("00 :  00  :  00  :  00");
        Reloj24.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(Reloj24, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 1190, 130, -1));

        comenzar23.setBackground(new java.awt.Color(255, 255, 0));
        comenzar23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzar23.setText("COMENZAR");
        comenzar23.setBorder(new javax.swing.border.LineBorder(java.awt.Color.orange, 1, true));
        comenzar23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzar23ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzar23, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 1190, 120, -1));

        p57.setBackground(new java.awt.Color(0, 204, 204));
        p57.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p57.setText("H   :  Min:    S  :  CS");
        p57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 79, 231), 2, true));
        p57.setOpaque(true);
        jPanel1.add(p57, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 1210, 130, 20));

        Pause23.setBackground(new java.awt.Color(255, 153, 0));
        Pause23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pause23.setText("PAUSAR");
        Pause23.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Pause23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pause23ActionPerformed(evt);
            }
        });
        jPanel1.add(Pause23, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 1210, 120, 20));

        estado23.setBackground(new java.awt.Color(0, 255, 0));
        estado23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        estado23.setText("Normal");
        estado23.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 0), 1, true), "Estado del Computador; ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 12))); // NOI18N
        estado23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado23ActionPerformed(evt);
            }
        });
        jPanel1.add(estado23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 1240, 160, 50));

        finish23.setBackground(new java.awt.Color(0, 255, 255));
        finish23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        finish23.setText("Finalizar ");
        finish23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 2, true));
        finish23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish23ActionPerformed(evt);
            }
        });
        jPanel1.add(finish23, new org.netbeans.lib.awtextra.AbsoluteConstraints(2160, 1250, 130, 40));

        Idea38.setBackground(new java.awt.Color(153, 51, 0));
        Idea38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Imagenes/depositphotos_96987410-stock-illustration-realistic-work-desk-organization-top.jpg"))); // NOI18N
        Idea38.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), new java.awt.Color(204, 102, 0)));
        jPanel1.add(Idea38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 1110, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/suelo-laminado-del-entarimado-fondo-de-madera-ligero-la-textura-105674209.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2320, 1320));

        jScrollPane1.setViewportView(jPanel1);

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 153));
        jMenuBar1.setForeground(new java.awt.Color(255, 204, 102));

        M1.setText("Datos");
        M1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1ActionPerformed(evt);
            }
        });

        Registros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        Registros.setText("Registros");
        Registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrosActionPerformed(evt);
            }
        });
        M1.add(Registros);

        jMenuBar1.add(M1);

        M2.setText("Opciones");
        M2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2ActionPerformed(evt);
            }
        });

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        M2.add(Salir);

        jMenuBar1.add(M2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
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
     comenzar.setText("COMENZAR");
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
     comenzar.setText("COMENZAR");
    }//GEN-LAST:event_finishActionPerformed

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
     comenzar1.setText("COMENZAR");
    }//GEN-LAST:event_finish1ActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
    S.r.setText(Pocision.getText());
    S.n[0]=Pocision.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estadoActionPerformed

    private void estado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado1ActionPerformed
    S.r.setText(Pocision1.getText());
    S.n[1]=Pocision1.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado1ActionPerformed

    private void comenzar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar2ActionPerformed
     comenzar2.setText("COMENZAR");
        t2.start();
     Nombre2.setBackground(Color.yellow);
     Int2.setBackground(Color.yellow);
     Icono2.setText("OCUPADA");
     comenzar2.setEnabled(false);
     Pause2.setEnabled(true);  
    }//GEN-LAST:event_comenzar2ActionPerformed

    private void Pause2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause2ActionPerformed
      t2.stop();
        Pause2.setEnabled(false);
        comenzar2.setText("Reanudar");
        finish2.setEnabled(true);
        comenzar2.setEnabled(true);  
    }//GEN-LAST:event_Pause2ActionPerformed

    private void estado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado2ActionPerformed
    S.r.setText(Pocision2.getText());
    S.n[2]=Pocision2.getText();
    S.setVisible(true); 
    }//GEN-LAST:event_estado2ActionPerformed

    private void finish2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish2ActionPerformed
     t2.stop();
     Datos3[0]=Pocision2.getText();
     Datos3[1]=Nombre2.getText();
     Datos3[2]=Int2.getText();
     Datos3[3]=Reloj3.getText();
     f.dtm.addRow(Datos3);
     Nombre2.setBackground(Color.WHITE);
     Nombre2.setText("");
     Int2.setBackground(Color.WHITE);
     Int2.setText("");
     comenzar2.setEnabled(true);
     Pause2.setEnabled(false);
     finish2.setEnabled(false);
     H[2]=0;m[2]=0;s[2]=0;cs[2]=0;
     Actualizar2();
     Icono2.setBackground(null);
     Icono2.setText("");
     comenzar2.setText("COMENZAR");
    }//GEN-LAST:event_finish2ActionPerformed

    private void comenzar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar3ActionPerformed
      comenzar3.setText("COMENZAR");
        t3.start();
     Nombre3.setBackground(Color.yellow);
     Int3.setBackground(Color.yellow);
     Icono3.setText("OCUPADA");
     comenzar3.setEnabled(false);
     Pause3.setEnabled(true);  
    }//GEN-LAST:event_comenzar3ActionPerformed

    private void Pause3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause3ActionPerformed
       t3.stop();
        Pause3.setEnabled(false);
        comenzar3.setText("Reanudar");
        finish3.setEnabled(true);
        comenzar3.setEnabled(true); 
    }//GEN-LAST:event_Pause3ActionPerformed

    private void estado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado3ActionPerformed
    S.r.setText(Pocision3.getText());
    S.n[3]=Pocision3.getText();
    S.setVisible(true); 
    }//GEN-LAST:event_estado3ActionPerformed

    private void finish3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish3ActionPerformed
    t3.stop();
     Datos4[0]=Pocision3.getText();
     Datos4[1]=Nombre3.getText();
     Datos4[2]=Int3.getText();
     Datos4[3]=Reloj4.getText();
     f.dtm.addRow(Datos4);
     Nombre3.setBackground(Color.WHITE);
     Nombre3.setText("");
     Int3.setBackground(Color.WHITE);
     Int3.setText("");
     comenzar3.setEnabled(true);
     Pause3.setEnabled(false);
     finish3.setEnabled(false);
     H[3]=0;m[3]=0;s[3]=0;cs[3]=0;
     Actualizar3();
     Icono3.setBackground(null);
     Icono3.setText("");
     comenzar3.setText("COMENZAR");    
    }//GEN-LAST:event_finish3ActionPerformed

    private void comenzar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar4ActionPerformed
      comenzar4.setText("COMENZAR");
        t4.start();
     Nombre4.setBackground(Color.yellow);
     Int4.setBackground(Color.yellow);
     Icono4.setText("OCUPADA");
     comenzar4.setEnabled(false);
     Pause4.setEnabled(true);   
    }//GEN-LAST:event_comenzar4ActionPerformed

    private void Pause4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause4ActionPerformed
       t4.stop();
        Pause4.setEnabled(false);
        comenzar4.setText("Reanudar");
        finish4.setEnabled(true);
        comenzar4.setEnabled(true); 
    }//GEN-LAST:event_Pause4ActionPerformed

    private void estado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado4ActionPerformed
     S.r.setText(Pocision4.getText());
    S.n[4]=Pocision4.getText();
    S.setVisible(true);   
    }//GEN-LAST:event_estado4ActionPerformed

    private void finish4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish4ActionPerformed
     t4.stop();
     Datos5[0]=Pocision4.getText();
     Datos5[1]=Nombre4.getText();
     Datos5[2]=Int4.getText();
     Datos5[3]=Reloj5.getText();
     f.dtm.addRow(Datos5);
     Nombre4.setBackground(Color.WHITE);
     Nombre4.setText("");
     Int4.setBackground(Color.WHITE);
     Int4.setText("");
     comenzar4.setEnabled(true);
     Pause4.setEnabled(false);
     finish4.setEnabled(false);
     H[4]=0;m[4]=0;s[4]=0;cs[4]=0;
     Actualizar4();
     Icono4.setBackground(null);
     Icono4.setText("");
     comenzar4.setText("COMENZAR");    
    }//GEN-LAST:event_finish4ActionPerformed

    private void comenzar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar5ActionPerformed
     comenzar5.setText("COMENZAR");
        t5.start();
     Nombre5.setBackground(Color.yellow);
     Int5.setBackground(Color.yellow);
     Icono5.setText("OCUPADA");
     comenzar5.setEnabled(false);
     Pause5.setEnabled(true); 
    }//GEN-LAST:event_comenzar5ActionPerformed

    private void Pause5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause5ActionPerformed
       t5.stop();
        Pause5.setEnabled(false);
        comenzar5.setText("Reanudar");
        finish5.setEnabled(true);
        comenzar5.setEnabled(true);  
    }//GEN-LAST:event_Pause5ActionPerformed

    private void estado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado5ActionPerformed
    S.r.setText(Pocision5.getText());
    S.n[5]=Pocision5.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado5ActionPerformed

    private void finish5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish5ActionPerformed
     t5.stop();
     Datos6[0]=Pocision5.getText();
     Datos6[1]=Nombre5.getText();
     Datos6[2]=Int5.getText();
     Datos6[3]=Reloj6.getText();
     f.dtm.addRow(Datos6);
     Nombre5.setBackground(Color.WHITE);
     Nombre5.setText("");
     Int5.setBackground(Color.WHITE);
     Int5.setText("");
     comenzar5.setEnabled(true);
     Pause5.setEnabled(false);
     finish5.setEnabled(false);
     H[5]=0;m[5]=0;s[5]=0;cs[5]=0;
     Actualizar5();
     Icono5.setBackground(null);
     Icono5.setText("");
     comenzar5.setText("COMENZAR");   
    }//GEN-LAST:event_finish5ActionPerformed

    private void comenzar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar6ActionPerformed
      comenzar6.setText("COMENZAR");
        t6.start();
     Nombre6.setBackground(Color.yellow);
     Int6.setBackground(Color.yellow);
     Icono6.setText("OCUPADA");
     comenzar6.setEnabled(false);
     Pause6.setEnabled(true);   
    }//GEN-LAST:event_comenzar6ActionPerformed

    private void Pause6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause6ActionPerformed
      t6.stop();
        Pause6.setEnabled(false);
        comenzar6.setText("Reanudar");
        finish6.setEnabled(true);
        comenzar6.setEnabled(true);  
    }//GEN-LAST:event_Pause6ActionPerformed

    private void estado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado6ActionPerformed
        S.r.setText(Pocision6.getText());
    S.n[6]=Pocision6.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado6ActionPerformed

    private void finish6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish6ActionPerformed
     t6.stop();
     Datos7[0]=Pocision6.getText();
     Datos7[1]=Nombre6.getText();
     Datos7[2]=Int6.getText();
     Datos7[3]=Reloj7.getText();
     f.dtm.addRow(Datos7);
     Nombre6.setBackground(Color.WHITE);
     Nombre6.setText("");
     Int6.setBackground(Color.WHITE);
     Int6.setText("");
     comenzar6.setEnabled(true);
     Pause6.setEnabled(false);
     finish6.setEnabled(false);
     H[6]=0;m[6]=0;s[6]=0;cs[6]=0;
     Actualizar6();
     Icono6.setBackground(null);
     Icono6.setText("");
     comenzar6.setText("COMENZAR");  
    }//GEN-LAST:event_finish6ActionPerformed

    private void comenzar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar7ActionPerformed
      comenzar7.setText("COMENZAR");
        t7.start();
     Nombre7.setBackground(Color.yellow);
     Int7.setBackground(Color.yellow);
     Icono7.setText("OCUPADA");
     comenzar7.setEnabled(false);
     Pause7.setEnabled(true);  
    }//GEN-LAST:event_comenzar7ActionPerformed

    private void Pause7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause7ActionPerformed
       t7.stop();
        Pause7.setEnabled(false);
        comenzar7.setText("Reanudar");
        finish7.setEnabled(true);
        comenzar7.setEnabled(true); 
    }//GEN-LAST:event_Pause7ActionPerformed

    private void estado7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado7ActionPerformed
       S.r.setText(Pocision7.getText());
    S.n[7]=Pocision7.getText();
    S.setVisible(true); 
    }//GEN-LAST:event_estado7ActionPerformed

    private void finish7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish7ActionPerformed
      t7.stop();
     Datos8[0]=Pocision7.getText();
     Datos8[1]=Nombre7.getText();
     Datos8[2]=Int7.getText();
     Datos8[3]=Reloj8.getText();
     f.dtm.addRow(Datos8);
     Nombre7.setBackground(Color.WHITE);
     Nombre7.setText("");
     Int7.setBackground(Color.WHITE);
     Int7.setText("");
     comenzar7.setEnabled(true);
     Pause7.setEnabled(false);
     finish7.setEnabled(false);
     H[7]=0;m[7]=0;s[7]=0;cs[7]=0;
     Actualizar7();
     Icono7.setBackground(null);
     Icono7.setText("");
     comenzar7.setText("COMENZAR");  
    }//GEN-LAST:event_finish7ActionPerformed

    private void comenzar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar8ActionPerformed
      comenzar8.setText("COMENZAR");
        t8.start();
     Nombre8.setBackground(Color.yellow);
     Int8.setBackground(Color.yellow);
     Icono8.setText("OCUPADA");
     comenzar8.setEnabled(false);
     Pause8.setEnabled(true);   
    }//GEN-LAST:event_comenzar8ActionPerformed

    private void Pause8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause8ActionPerformed
        t8.stop();
        Pause8.setEnabled(false);
        comenzar8.setText("Reanudar");
        finish8.setEnabled(true);
        comenzar8.setEnabled(true);
    }//GEN-LAST:event_Pause8ActionPerformed

    private void estado8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado8ActionPerformed
    S.r.setText(Pocision8.getText());
    S.n[8]=Pocision8.getText();
    S.setVisible(true); 
    }//GEN-LAST:event_estado8ActionPerformed

    private void finish8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish8ActionPerformed
        t8.stop();
     Datos9[0]=Pocision8.getText();
     Datos9[1]=Nombre8.getText();
     Datos9[2]=Int8.getText();
     Datos9[3]=Reloj9.getText();
     f.dtm.addRow(Datos9);
     Nombre8.setBackground(Color.WHITE);
     Nombre8.setText("");
     Int8.setBackground(Color.WHITE);
     Int8.setText("");
     comenzar8.setEnabled(true);
     Pause8.setEnabled(false);
     finish8.setEnabled(false);
     H[8]=0;m[8]=0;s[8]=0;cs[8]=0;
     Actualizar8();
     Icono8.setBackground(null);
     Icono8.setText("");
     comenzar8.setText("COMENZAR");  
    }//GEN-LAST:event_finish8ActionPerformed

    private void comenzar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar9ActionPerformed
        comenzar9.setText("COMENZAR");
        t9.start();
     Nombre9.setBackground(Color.yellow);
     Int9.setBackground(Color.yellow);
     Icono9.setText("OCUPADA");
     comenzar9.setEnabled(false);
     Pause9.setEnabled(true);  
    }//GEN-LAST:event_comenzar9ActionPerformed

    private void Pause9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause9ActionPerformed
        t9.stop();
        Pause9.setEnabled(false);
        comenzar9.setText("Reanudar");
        finish9.setEnabled(true);
        comenzar9.setEnabled(true);
    }//GEN-LAST:event_Pause9ActionPerformed

    private void estado9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado9ActionPerformed
    S.r.setText(Pocision9.getText());
    S.n[9]=Pocision9.getText();
    S.setVisible(true); 
    }//GEN-LAST:event_estado9ActionPerformed

    private void finish9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish9ActionPerformed
       t9.stop();
     Datos10[0]=Pocision9.getText();
     Datos10[1]=Nombre9.getText();
     Datos10[2]=Int9.getText();
     Datos10[3]=Reloj10.getText();
     f.dtm.addRow(Datos10);
     Nombre9.setBackground(Color.WHITE);
     Nombre9.setText("");
     Int9.setBackground(Color.WHITE);
     Int9.setText("");
     comenzar9.setEnabled(true);
     Pause9.setEnabled(false);
     finish9.setEnabled(false);
     H[9]=0;m[9]=0;s[9]=0;cs[9]=0;
     Actualizar9();
     Icono9.setBackground(null);
     Icono9.setText("");
     comenzar9.setText("COMENZAR"); 
    }//GEN-LAST:event_finish9ActionPerformed

    private void comenzar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar10ActionPerformed
        comenzar10.setText("COMENZAR");
        t10.start();
     Nombre10.setBackground(Color.yellow);
     Int10.setBackground(Color.yellow);
     Icono10.setText("OCUPADA");
     comenzar10.setEnabled(false);
     Pause10.setEnabled(true);
    }//GEN-LAST:event_comenzar10ActionPerformed

    private void Pause10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause10ActionPerformed
        t10.stop();
        Pause10.setEnabled(false);
        comenzar10.setText("Reanudar");
        finish10.setEnabled(true);
        comenzar10.setEnabled(true);
    }//GEN-LAST:event_Pause10ActionPerformed

    private void estado10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado10ActionPerformed
        S.r.setText(Pocision10.getText());
    S.n[10]=Pocision10.getText();
    S.setVisible(true); 
    }//GEN-LAST:event_estado10ActionPerformed

    private void finish10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish10ActionPerformed
       t10.stop();
     Datos11[0]=Pocision10.getText();
     Datos11[1]=Nombre10.getText();
     Datos11[2]=Int10.getText();
     Datos11[3]=Reloj11.getText();
     f.dtm.addRow(Datos11);
     Nombre10.setBackground(Color.WHITE);
     Nombre10.setText("");
     Int10.setBackground(Color.WHITE);
     Int10.setText("");
     comenzar10.setEnabled(true);
     Pause10.setEnabled(false);
     finish10.setEnabled(false);
     H[10]=0;m[10]=0;s[10]=0;cs[10]=0;
     Actualizar10();
     Icono10.setBackground(null);
     Icono10.setText("");
     comenzar10.setText("COMENZAR"); 
    }//GEN-LAST:event_finish10ActionPerformed

    private void comenzar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar11ActionPerformed
       comenzar11.setText("COMENZAR");
        t11.start();
     Nombre11.setBackground(Color.yellow);
     Int11.setBackground(Color.yellow);
     Icono11.setText("OCUPADA");
     comenzar11.setEnabled(false);
     Pause11.setEnabled(true); 
    }//GEN-LAST:event_comenzar11ActionPerformed

    private void Pause11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause11ActionPerformed
        t11.stop();
        Pause11.setEnabled(false);
        comenzar11.setText("Reanudar");
        finish11.setEnabled(true);
        comenzar11.setEnabled(true);
    }//GEN-LAST:event_Pause11ActionPerformed

    private void estado11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado11ActionPerformed
        S.r.setText(Pocision11.getText());
    S.n[11]=Pocision11.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado11ActionPerformed

    private void finish11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish11ActionPerformed
         t11.stop();
     Datos12[0]=Pocision11.getText();
     Datos12[1]=Nombre11.getText();
     Datos12[2]=Int11.getText();
     Datos12[3]=Reloj12.getText();
     f.dtm.addRow(Datos12);
     Nombre11.setBackground(Color.WHITE);
     Nombre11.setText("");
     Int11.setBackground(Color.WHITE);
     Int11.setText("");
     comenzar11.setEnabled(true);
     Pause11.setEnabled(false);
     finish11.setEnabled(false);
     H[11]=0;m[11]=0;s[11]=0;cs[11]=0;
     Actualizar11();
     Icono11.setBackground(null);
     Icono11.setText("");
     comenzar11.setText("COMENZAR");
    }//GEN-LAST:event_finish11ActionPerformed

    private void comenzar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar12ActionPerformed
        comenzar12.setText("COMENZAR");
        t12.start();
     Nombre12.setBackground(Color.yellow);
     Int12.setBackground(Color.yellow);
     Icono12.setText("OCUPADA");
     comenzar12.setEnabled(false);
     Pause12.setEnabled(true);
    }//GEN-LAST:event_comenzar12ActionPerformed

    private void Pause12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause12ActionPerformed
        t12.stop();
        Pause12.setEnabled(false);
        comenzar12.setText("Reanudar");
        finish12.setEnabled(true);
        comenzar12.setEnabled(true);
    }//GEN-LAST:event_Pause12ActionPerformed

    private void estado12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado12ActionPerformed
       S.r.setText(Pocision12.getText());
    S.n[12]=Pocision12.getText();
    S.setVisible(true); 
    }//GEN-LAST:event_estado12ActionPerformed

    private void finish12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish12ActionPerformed
        t12.stop();
     Datos13[0]=Pocision12.getText();
     Datos13[1]=Nombre12.getText();
     Datos13[2]=Int12.getText();
     Datos13[3]=Reloj13.getText();
     f.dtm.addRow(Datos13);
     Nombre12.setBackground(Color.WHITE);
     Nombre12.setText("");
     Int12.setBackground(Color.WHITE);
     Int12.setText("");
     comenzar12.setEnabled(true);
     Pause12.setEnabled(false);
     finish12.setEnabled(false);
     H[12]=0;m[12]=0;s[12]=0;cs[12]=0;
     Actualizar12();
     Icono12.setBackground(null);
     Icono12.setText("");
     comenzar12.setText("COMENZAR");
    }//GEN-LAST:event_finish12ActionPerformed

    private void comenzar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar13ActionPerformed
       comenzar13.setText("COMENZAR");
        t13.start();
     Nombre13.setBackground(Color.yellow);
     Int13.setBackground(Color.yellow);
     Icono13.setText("OCUPADA");
     comenzar13.setEnabled(false);
     Pause13.setEnabled(true); 
    }//GEN-LAST:event_comenzar13ActionPerformed

    private void Pause13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause13ActionPerformed
        t13.stop();
        Pause13.setEnabled(false);
        comenzar13.setText("Reanudar");
        finish13.setEnabled(true);
        comenzar13.setEnabled(true);
    }//GEN-LAST:event_Pause13ActionPerformed

    private void estado13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado13ActionPerformed
       S.r.setText(Pocision13.getText());
    S.n[13]=Pocision13.getText();
    S.setVisible(true); 
    }//GEN-LAST:event_estado13ActionPerformed

    private void finish13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish13ActionPerformed
        t13.stop();
     Datos14[0]=Pocision13.getText();
     Datos14[1]=Nombre13.getText();
     Datos14[2]=Int13.getText();
     Datos14[3]=Reloj14.getText();
     f.dtm.addRow(Datos14);
     Nombre13.setBackground(Color.WHITE);
     Nombre13.setText("");
     Int13.setBackground(Color.WHITE);
     Int13.setText("");
     comenzar13.setEnabled(true);
     Pause13.setEnabled(false);
     finish13.setEnabled(false);
     H[13]=0;m[13]=0;s[13]=0;cs[13]=0;
     Actualizar13();
     Icono13.setBackground(null);
     Icono13.setText("");
     comenzar13.setText("COMENZAR");
    }//GEN-LAST:event_finish13ActionPerformed

    private void comenzar14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar14ActionPerformed
       comenzar14.setText("COMENZAR");
        t14.start();
     Nombre14.setBackground(Color.yellow);
     Int14.setBackground(Color.yellow);
     Icono14.setText("OCUPADA");
     comenzar14.setEnabled(false);
     Pause14.setEnabled(true);  
    }//GEN-LAST:event_comenzar14ActionPerformed

    private void Pause14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause14ActionPerformed
        t14.stop();
        Pause14.setEnabled(false);
        comenzar14.setText("Reanudar");
        finish14.setEnabled(true);
        comenzar14.setEnabled(true);
    }//GEN-LAST:event_Pause14ActionPerformed

    private void estado14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado14ActionPerformed
        S.r.setText(Pocision14.getText());
    S.n[14]=Pocision14.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado14ActionPerformed

    private void finish14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish14ActionPerformed
        t14.stop();
     Datos15[0]=Pocision14.getText();
     Datos15[1]=Nombre14.getText();
     Datos15[2]=Int14.getText();
     Datos15[3]=Reloj15.getText();
     f.dtm.addRow(Datos15);
     Nombre14.setBackground(Color.WHITE);
     Nombre14.setText("");
     Int14.setBackground(Color.WHITE);
     Int14.setText("");
     comenzar14.setEnabled(true);
     Pause14.setEnabled(false);
     finish14.setEnabled(false);
     H[14]=0;m[14]=0;s[14]=0;cs[14]=0;
     Actualizar14();
     Icono14.setBackground(null);
     Icono14.setText("");
     comenzar14.setText("COMENZAR");
    }//GEN-LAST:event_finish14ActionPerformed

    private void comenzar15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar15ActionPerformed
       comenzar15.setText("COMENZAR");
        t15.start();
     Nombre15.setBackground(Color.yellow);
     Int15.setBackground(Color.yellow);
     Icono15.setText("OCUPADA");
     comenzar15.setEnabled(false);
     Pause15.setEnabled(true);  
    }//GEN-LAST:event_comenzar15ActionPerformed

    private void Pause15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause15ActionPerformed
        t15.stop();
        Pause15.setEnabled(false);
        comenzar15.setText("Reanudar");
        finish15.setEnabled(true);
        comenzar15.setEnabled(true);
    }//GEN-LAST:event_Pause15ActionPerformed

    private void estado15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado15ActionPerformed
        S.r.setText(Pocision15.getText());
    S.n[15]=Pocision15.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado15ActionPerformed

    private void finish15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish15ActionPerformed
        t15.stop();
     Datos16[0]=Pocision15.getText();
     Datos16[1]=Nombre15.getText();
     Datos16[2]=Int15.getText();
     Datos16[3]=Reloj16.getText();
     f.dtm.addRow(Datos16);
     Nombre15.setBackground(Color.WHITE);
     Nombre15.setText("");
     Int15.setBackground(Color.WHITE);
     Int15.setText("");
     comenzar15.setEnabled(true);
     Pause15.setEnabled(false);
     finish15.setEnabled(false);
     H[15]=0;m[15]=0;s[15]=0;cs[15]=0;
     Actualizar15();
     Icono15.setBackground(null);
     Icono15.setText("");
     comenzar15.setText("COMENZAR");
    }//GEN-LAST:event_finish15ActionPerformed

    private void comenzar16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar16ActionPerformed
       comenzar16.setText("COMENZAR");
        t16.start();
     Nombre16.setBackground(Color.yellow);
     Int16.setBackground(Color.yellow);
     Icono16.setText("OCUPADA");
     comenzar16.setEnabled(false);
     Pause16.setEnabled(true); 
    }//GEN-LAST:event_comenzar16ActionPerformed

    private void Pause16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause16ActionPerformed
        t16.stop();
        Pause16.setEnabled(false);
        comenzar16.setText("Reanudar");
        finish16.setEnabled(true);
        comenzar16.setEnabled(true);
    }//GEN-LAST:event_Pause16ActionPerformed

    private void estado16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado16ActionPerformed
        S.r.setText(Pocision16.getText());
    S.n[16]=Pocision16.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado16ActionPerformed

    private void finish16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish16ActionPerformed
      t16.stop();
     Datos17[0]=Pocision16.getText();
     Datos17[1]=Nombre16.getText();
     Datos17[2]=Int16.getText();
     Datos17[3]=Reloj17.getText();
     f.dtm.addRow(Datos17);
     Nombre16.setBackground(Color.WHITE);
     Nombre16.setText("");
     Int16.setBackground(Color.WHITE);
     Int16.setText("");
     comenzar16.setEnabled(true);
     Pause16.setEnabled(false);
     finish16.setEnabled(false);
     H[16]=0;m[16]=0;s[16]=0;cs[16]=0;
     Actualizar16();
     Icono16.setBackground(null);
     Icono16.setText("");
     comenzar16.setText("COMENZAR");  
    }//GEN-LAST:event_finish16ActionPerformed

    private void comenzar17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar17ActionPerformed
        comenzar17.setText("COMENZAR");
        t17.start();
     Nombre17.setBackground(Color.yellow);
     Int17.setBackground(Color.yellow);
     Icono17.setText("OCUPADA");
     comenzar17.setEnabled(false);
     Pause17.setEnabled(true);
    }//GEN-LAST:event_comenzar17ActionPerformed

    private void Pause17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause17ActionPerformed
        t17.stop();
        Pause17.setEnabled(false);
        comenzar17.setText("Reanudar");
        finish17.setEnabled(true);
        comenzar17.setEnabled(true);
    }//GEN-LAST:event_Pause17ActionPerformed

    private void estado17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado17ActionPerformed
        S.r.setText(Pocision17.getText());
    S.n[17]=Pocision17.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado17ActionPerformed

    private void finish17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish17ActionPerformed
         t17.stop();
     Datos18[0]=Pocision17.getText();
     Datos18[1]=Nombre17.getText();
     Datos18[2]=Int17.getText();
     Datos18[3]=Reloj18.getText();
     f.dtm.addRow(Datos18);
     Nombre17.setBackground(Color.WHITE);
     Nombre17.setText("");
     Int17.setBackground(Color.WHITE);
     Int17.setText("");
     comenzar17.setEnabled(true);
     Pause17.setEnabled(false);
     finish17.setEnabled(false);
     H[17]=0;m[17]=0;s[17]=0;cs[17]=0;
     Actualizar17();
     Icono17.setBackground(null);
     Icono17.setText("");
     comenzar17.setText("COMENZAR");
    }//GEN-LAST:event_finish17ActionPerformed

    private void comenzar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar18ActionPerformed
      comenzar18.setText("COMENZAR");
        t18.start();
     Nombre18.setBackground(Color.yellow);
     Int18.setBackground(Color.yellow);
     Icono18.setText("OCUPADA");
     comenzar18.setEnabled(false);
     Pause18.setEnabled(true);  
    }//GEN-LAST:event_comenzar18ActionPerformed

    private void Pause18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause18ActionPerformed
       t18.stop();
        Pause18.setEnabled(false);
        comenzar18.setText("Reanudar");
        finish18.setEnabled(true);
        comenzar18.setEnabled(true); 
    }//GEN-LAST:event_Pause18ActionPerformed

    private void estado18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado18ActionPerformed
         S.r.setText(Pocision18.getText());
    S.n[18]=Pocision18.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado18ActionPerformed

    private void finish18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish18ActionPerformed
       t18.stop();
     Datos19[0]=Pocision18.getText();
     Datos19[1]=Nombre18.getText();
     Datos19[2]=Int18.getText();
     Datos19[3]=Reloj19.getText();
     f.dtm.addRow(Datos19);
     Nombre18.setBackground(Color.WHITE);
     Nombre18.setText("");
     Int18.setBackground(Color.WHITE);
     Int18.setText("");
     comenzar18.setEnabled(true);
     Pause18.setEnabled(false);
     finish18.setEnabled(false);
     H[18]=0;m[18]=0;s[18]=0;cs[18]=0;
     Actualizar18();
     Icono18.setBackground(null);
     Icono18.setText("");
     comenzar18.setText("COMENZAR"); 
    }//GEN-LAST:event_finish18ActionPerformed

    private void comenzar19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar19ActionPerformed
      comenzar19.setText("COMENZAR");
        t19.start();
     Nombre19.setBackground(Color.yellow);
     Int19.setBackground(Color.yellow);
     Icono19.setText("OCUPADA");
     comenzar19.setEnabled(false);
     Pause19.setEnabled(true);  
    }//GEN-LAST:event_comenzar19ActionPerformed

    private void Pause19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause19ActionPerformed
        t19.stop();
        Pause19.setEnabled(false);
        comenzar19.setText("Reanudar");
        finish19.setEnabled(true);
        comenzar19.setEnabled(true);
    }//GEN-LAST:event_Pause19ActionPerformed

    private void estado19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado19ActionPerformed
        S.r.setText(Pocision19.getText());
    S.n[19]=Pocision19.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado19ActionPerformed

    private void finish19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish19ActionPerformed
       t19.stop();
     Datos20[0]=Pocision19.getText();
     Datos20[1]=Nombre19.getText();
     Datos20[2]=Int19.getText();
     Datos20[3]=Reloj20.getText();
     f.dtm.addRow(Datos20);
     Nombre19.setBackground(Color.WHITE);
     Nombre19.setText("");
     Int19.setBackground(Color.WHITE);
     Int19.setText("");
     comenzar19.setEnabled(true);
     Pause19.setEnabled(false);
     finish19.setEnabled(false);
     H[19]=0;m[19]=0;s[19]=0;cs[19]=0;
     Actualizar19();
     Icono19.setBackground(null);
     Icono19.setText("");
     comenzar19.setText("COMENZAR");   
    }//GEN-LAST:event_finish19ActionPerformed

    private void comenzar20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar20ActionPerformed
        comenzar20.setText("COMENZAR");
        t20.start();
     Nombre20.setBackground(Color.yellow);
     Int20.setBackground(Color.yellow);
     Icono20.setText("OCUPADA");
     comenzar20.setEnabled(false);
     Pause20.setEnabled(true); 
    }//GEN-LAST:event_comenzar20ActionPerformed

    private void Pause20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause20ActionPerformed
       t20.stop();
        Pause20.setEnabled(false);
        comenzar20.setText("Reanudar");
        finish20.setEnabled(true);
        comenzar20.setEnabled(true); 
    }//GEN-LAST:event_Pause20ActionPerformed

    private void estado20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado20ActionPerformed
        S.r.setText(Pocision20.getText());
    S.n[20]=Pocision20.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado20ActionPerformed

    private void finish20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish20ActionPerformed
       t20.stop();
     Datos21[0]=Pocision20.getText();
     Datos21[1]=Nombre20.getText();
     Datos21[2]=Int20.getText();
     Datos21[3]=Reloj21.getText();
     f.dtm.addRow(Datos21);
     Nombre20.setBackground(Color.WHITE);
     Nombre20.setText("");
     Int20.setBackground(Color.WHITE);
     Int20.setText("");
     comenzar20.setEnabled(true);
     Pause20.setEnabled(false);
     finish20.setEnabled(false);
     H[20]=0;m[20]=0;s[20]=0;cs[20]=0;
     Actualizar20();
     Icono20.setBackground(null);
     Icono20.setText("");
     comenzar20.setText("COMENZAR");  
    }//GEN-LAST:event_finish20ActionPerformed

    private void comenzar21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar21ActionPerformed
       comenzar21.setText("COMENZAR");
        t21.start();
     Nombre21.setBackground(Color.yellow);
     Int21.setBackground(Color.yellow);
     Icono21.setText("OCUPADA");
     comenzar21.setEnabled(false);
     Pause21.setEnabled(true); 
    }//GEN-LAST:event_comenzar21ActionPerformed

    private void Pause21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause21ActionPerformed
       t21.stop();
        Pause21.setEnabled(false);
        comenzar21.setText("Reanudar");
        finish21.setEnabled(true);
        comenzar21.setEnabled(true); 
    }//GEN-LAST:event_Pause21ActionPerformed

    private void estado21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado21ActionPerformed
        S.r.setText(Pocision21.getText());
    S.n[21]=Pocision21.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado21ActionPerformed

    private void finish21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish21ActionPerformed
        t21.stop();
     Datos22[0]=Pocision21.getText();
     Datos22[1]=Nombre21.getText();
     Datos22[2]=Int21.getText();
     Datos22[3]=Reloj22.getText();
     f.dtm.addRow(Datos22);
     Nombre21.setBackground(Color.WHITE);
     Nombre21.setText("");
     Int21.setBackground(Color.WHITE);
     Int21.setText("");
     comenzar21.setEnabled(true);
     Pause21.setEnabled(false);
     finish21.setEnabled(false);
     H[21]=0;m[21]=0;s[21]=0;cs[21]=0;
     Actualizar21();
     Icono21.setBackground(null);
     Icono21.setText("");
     comenzar21.setText("COMENZAR"); 
    }//GEN-LAST:event_finish21ActionPerformed

    private void comenzar22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar22ActionPerformed
       comenzar22.setText("COMENZAR");
        t22.start();
     Nombre22.setBackground(Color.yellow);
     Int22.setBackground(Color.yellow);
     Icono22.setText("OCUPADA");
     comenzar22.setEnabled(false);
     Pause22.setEnabled(true);  
    }//GEN-LAST:event_comenzar22ActionPerformed

    private void Pause22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause22ActionPerformed
      t22.stop();
        Pause22.setEnabled(false);
        comenzar22.setText("Reanudar");
        finish22.setEnabled(true);
        comenzar22.setEnabled(true);  
    }//GEN-LAST:event_Pause22ActionPerformed

    private void estado22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado22ActionPerformed
        S.r.setText(Pocision22.getText());
    S.n[22]=Pocision22.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado22ActionPerformed

    private void finish22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish22ActionPerformed
        t22.stop();
     Datos23[0]=Pocision22.getText();
     Datos23[1]=Nombre22.getText();
     Datos23[2]=Int22.getText();
     Datos23[3]=Reloj23.getText();
     f.dtm.addRow(Datos23);
     Nombre22.setBackground(Color.WHITE);
     Nombre22.setText("");
     Int22.setBackground(Color.WHITE);
     Int22.setText("");
     comenzar22.setEnabled(true);
     Pause22.setEnabled(false);
     finish22.setEnabled(false);
     H[22]=0;m[22]=0;s[22]=0;cs[22]=0;
     Actualizar22();
     Icono22.setBackground(null);
     Icono22.setText("");
     comenzar22.setText("COMENZAR"); 
    }//GEN-LAST:event_finish22ActionPerformed

    private void comenzar23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzar23ActionPerformed
       comenzar23.setText("COMENZAR");
        t23.start();
     Nombre23.setBackground(Color.yellow);
     Int23.setBackground(Color.yellow);
     Icono23.setText("OCUPADA");
     comenzar23.setEnabled(false);
     Pause23.setEnabled(true);  
    }//GEN-LAST:event_comenzar23ActionPerformed

    private void Pause23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pause23ActionPerformed
       t23.stop();
        Pause23.setEnabled(false);
        comenzar23.setText("Reanudar");
        finish23.setEnabled(true);
        comenzar23.setEnabled(true); 
    }//GEN-LAST:event_Pause23ActionPerformed

    private void estado23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado23ActionPerformed
        S.r.setText(Pocision23.getText());
    S.n[23]=Pocision23.getText();
    S.setVisible(true);
    }//GEN-LAST:event_estado23ActionPerformed

    private void finish23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish23ActionPerformed
       t23.stop();
     Datos24[0]=Pocision23.getText();
     Datos24[1]=Nombre23.getText();
     Datos24[2]=Int23.getText();
     Datos24[3]=Reloj24.getText();
     f.dtm.addRow(Datos24);
     Nombre23.setBackground(Color.WHITE);
     Nombre23.setText("");
     Int23.setBackground(Color.WHITE);
     Int23.setText("");
     comenzar23.setEnabled(true);
     Pause23.setEnabled(false);
     finish23.setEnabled(false);
     H[23]=0;m[23]=0;s[23]=0;cs[23]=0;
     Actualizar23();
     Icono23.setBackground(null);
     Icono23.setText("");
     comenzar23.setText("COMENZAR"); 
    }//GEN-LAST:event_finish23ActionPerformed

    private void M2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2ActionPerformed
        
    }//GEN-LAST:event_M2ActionPerformed

    private void M1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1ActionPerformed
       
    }//GEN-LAST:event_M1ActionPerformed

    private void RegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrosActionPerformed
        f.setVisible(true);
    }//GEN-LAST:event_RegistrosActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public static javax.swing.JLabel Icono;
    public static javax.swing.JLabel Icono1;
    public static javax.swing.JLabel Icono10;
    public static javax.swing.JLabel Icono11;
    public static javax.swing.JLabel Icono12;
    public static javax.swing.JLabel Icono13;
    public static javax.swing.JLabel Icono14;
    public static javax.swing.JLabel Icono15;
    public static javax.swing.JLabel Icono16;
    public static javax.swing.JLabel Icono17;
    public static javax.swing.JLabel Icono18;
    public static javax.swing.JLabel Icono19;
    public static javax.swing.JLabel Icono2;
    public static javax.swing.JLabel Icono20;
    public static javax.swing.JLabel Icono21;
    public static javax.swing.JLabel Icono22;
    public static javax.swing.JLabel Icono23;
    public static javax.swing.JLabel Icono3;
    public static javax.swing.JLabel Icono4;
    public static javax.swing.JLabel Icono5;
    public static javax.swing.JLabel Icono6;
    public static javax.swing.JLabel Icono7;
    public static javax.swing.JLabel Icono8;
    public static javax.swing.JLabel Icono9;
    public static javax.swing.JLabel Idea1;
    public static javax.swing.JLabel Idea10;
    public static javax.swing.JLabel Idea11;
    public static javax.swing.JLabel Idea12;
    public static javax.swing.JLabel Idea13;
    public static javax.swing.JLabel Idea14;
    public static javax.swing.JLabel Idea15;
    public static javax.swing.JLabel Idea16;
    public static javax.swing.JLabel Idea17;
    public static javax.swing.JLabel Idea18;
    public static javax.swing.JLabel Idea19;
    public static javax.swing.JLabel Idea2;
    public static javax.swing.JLabel Idea20;
    public static javax.swing.JLabel Idea21;
    public static javax.swing.JLabel Idea22;
    public static javax.swing.JLabel Idea23;
    public static javax.swing.JLabel Idea24;
    public static javax.swing.JLabel Idea25;
    public static javax.swing.JLabel Idea26;
    public static javax.swing.JLabel Idea27;
    public static javax.swing.JLabel Idea28;
    public static javax.swing.JLabel Idea29;
    public static javax.swing.JLabel Idea3;
    public static javax.swing.JLabel Idea30;
    public static javax.swing.JLabel Idea31;
    public static javax.swing.JLabel Idea32;
    public static javax.swing.JLabel Idea33;
    public static javax.swing.JLabel Idea34;
    public static javax.swing.JLabel Idea35;
    public static javax.swing.JLabel Idea36;
    public static javax.swing.JLabel Idea37;
    public static javax.swing.JLabel Idea38;
    public static javax.swing.JLabel Idea39;
    public static javax.swing.JLabel Idea4;
    public static javax.swing.JLabel Idea40;
    public static javax.swing.JLabel Idea41;
    public static javax.swing.JLabel Idea42;
    public static javax.swing.JLabel Idea43;
    public static javax.swing.JLabel Idea44;
    public static javax.swing.JLabel Idea45;
    public static javax.swing.JLabel Idea46;
    public static javax.swing.JLabel Idea47;
    public static javax.swing.JLabel Idea48;
    public static javax.swing.JLabel Idea5;
    public static javax.swing.JLabel Idea6;
    public static javax.swing.JLabel Idea7;
    public static javax.swing.JLabel Idea8;
    public static javax.swing.JLabel Idea9;
    public static javax.swing.JTextField Int;
    private javax.swing.JTextField Int1;
    public static javax.swing.JTextField Int10;
    public static javax.swing.JTextField Int11;
    public static javax.swing.JTextField Int12;
    public static javax.swing.JTextField Int13;
    public static javax.swing.JTextField Int14;
    public static javax.swing.JTextField Int15;
    public static javax.swing.JTextField Int16;
    public static javax.swing.JTextField Int17;
    public static javax.swing.JTextField Int18;
    public static javax.swing.JTextField Int19;
    public static javax.swing.JTextField Int2;
    public static javax.swing.JTextField Int20;
    public static javax.swing.JTextField Int21;
    public static javax.swing.JTextField Int22;
    public static javax.swing.JTextField Int23;
    public static javax.swing.JTextField Int3;
    public static javax.swing.JTextField Int4;
    public static javax.swing.JTextField Int5;
    public static javax.swing.JTextField Int6;
    public static javax.swing.JTextField Int7;
    public static javax.swing.JTextField Int8;
    public static javax.swing.JTextField Int9;
    private javax.swing.JMenu M1;
    private javax.swing.JMenu M2;
    public static javax.swing.JTextField Nombre;
    public static javax.swing.JTextField Nombre1;
    public static javax.swing.JTextField Nombre10;
    public static javax.swing.JTextField Nombre11;
    public static javax.swing.JTextField Nombre12;
    public static javax.swing.JTextField Nombre13;
    public static javax.swing.JTextField Nombre14;
    public static javax.swing.JTextField Nombre15;
    public static javax.swing.JTextField Nombre16;
    public static javax.swing.JTextField Nombre17;
    public static javax.swing.JTextField Nombre18;
    public static javax.swing.JTextField Nombre19;
    public static javax.swing.JTextField Nombre2;
    public static javax.swing.JTextField Nombre20;
    public static javax.swing.JTextField Nombre21;
    public static javax.swing.JTextField Nombre22;
    public static javax.swing.JTextField Nombre23;
    public static javax.swing.JTextField Nombre3;
    public static javax.swing.JTextField Nombre4;
    public static javax.swing.JTextField Nombre5;
    public static javax.swing.JTextField Nombre6;
    public static javax.swing.JTextField Nombre7;
    public static javax.swing.JTextField Nombre8;
    public static javax.swing.JTextField Nombre9;
    public static javax.swing.JButton Pause;
    public static javax.swing.JButton Pause1;
    public static javax.swing.JButton Pause10;
    public static javax.swing.JButton Pause11;
    public static javax.swing.JButton Pause12;
    public static javax.swing.JButton Pause13;
    public static javax.swing.JButton Pause14;
    public static javax.swing.JButton Pause15;
    public static javax.swing.JButton Pause16;
    public static javax.swing.JButton Pause17;
    public static javax.swing.JButton Pause18;
    public static javax.swing.JButton Pause19;
    public static javax.swing.JButton Pause2;
    public static javax.swing.JButton Pause20;
    public static javax.swing.JButton Pause21;
    public static javax.swing.JButton Pause22;
    public static javax.swing.JButton Pause23;
    public static javax.swing.JButton Pause3;
    public static javax.swing.JButton Pause4;
    public static javax.swing.JButton Pause5;
    public static javax.swing.JButton Pause6;
    public static javax.swing.JButton Pause7;
    public static javax.swing.JButton Pause8;
    public static javax.swing.JButton Pause9;
    public static javax.swing.JTextField Pocision;
    public static javax.swing.JTextField Pocision1;
    public static javax.swing.JTextField Pocision10;
    public static javax.swing.JTextField Pocision11;
    public static javax.swing.JTextField Pocision12;
    public static javax.swing.JTextField Pocision13;
    public static javax.swing.JTextField Pocision14;
    public static javax.swing.JTextField Pocision15;
    public static javax.swing.JTextField Pocision16;
    public static javax.swing.JTextField Pocision17;
    public static javax.swing.JTextField Pocision18;
    public static javax.swing.JTextField Pocision19;
    private javax.swing.JTextField Pocision2;
    public static javax.swing.JTextField Pocision20;
    public static javax.swing.JTextField Pocision21;
    public static javax.swing.JTextField Pocision22;
    public static javax.swing.JTextField Pocision23;
    public static javax.swing.JTextField Pocision3;
    public static javax.swing.JTextField Pocision4;
    public static javax.swing.JTextField Pocision5;
    public static javax.swing.JTextField Pocision6;
    public static javax.swing.JTextField Pocision7;
    public static javax.swing.JTextField Pocision8;
    public static javax.swing.JTextField Pocision9;
    private javax.swing.JMenuItem Registros;
    public static javax.swing.JTextField Reloj1;
    public static javax.swing.JTextField Reloj10;
    public static javax.swing.JTextField Reloj11;
    public static javax.swing.JTextField Reloj12;
    public static javax.swing.JTextField Reloj13;
    public static javax.swing.JTextField Reloj14;
    public static javax.swing.JTextField Reloj15;
    public static javax.swing.JTextField Reloj16;
    public static javax.swing.JTextField Reloj17;
    public static javax.swing.JTextField Reloj18;
    public static javax.swing.JTextField Reloj19;
    public static javax.swing.JTextField Reloj2;
    public static javax.swing.JTextField Reloj20;
    public static javax.swing.JTextField Reloj21;
    public static javax.swing.JTextField Reloj22;
    public static javax.swing.JTextField Reloj23;
    public static javax.swing.JTextField Reloj24;
    private javax.swing.JTextField Reloj3;
    public static javax.swing.JTextField Reloj4;
    public static javax.swing.JTextField Reloj5;
    public static javax.swing.JTextField Reloj6;
    public static javax.swing.JTextField Reloj7;
    public static javax.swing.JTextField Reloj8;
    public static javax.swing.JTextField Reloj9;
    private javax.swing.JMenuItem Salir;
    public static javax.swing.JButton comenzar;
    public static javax.swing.JButton comenzar1;
    public static javax.swing.JButton comenzar10;
    public static javax.swing.JButton comenzar11;
    public static javax.swing.JButton comenzar12;
    public static javax.swing.JButton comenzar13;
    public static javax.swing.JButton comenzar14;
    public static javax.swing.JButton comenzar15;
    public static javax.swing.JButton comenzar16;
    public static javax.swing.JButton comenzar17;
    public static javax.swing.JButton comenzar18;
    public static javax.swing.JButton comenzar19;
    public static javax.swing.JButton comenzar2;
    public static javax.swing.JButton comenzar20;
    public static javax.swing.JButton comenzar21;
    public static javax.swing.JButton comenzar22;
    public static javax.swing.JButton comenzar23;
    public static javax.swing.JButton comenzar3;
    public static javax.swing.JButton comenzar4;
    public static javax.swing.JButton comenzar5;
    public static javax.swing.JButton comenzar6;
    public static javax.swing.JButton comenzar7;
    public static javax.swing.JButton comenzar8;
    public static javax.swing.JButton comenzar9;
    public static javax.swing.JButton estado;
    public static javax.swing.JButton estado1;
    public static javax.swing.JButton estado10;
    public static javax.swing.JButton estado11;
    public static javax.swing.JButton estado12;
    public static javax.swing.JButton estado13;
    public static javax.swing.JButton estado14;
    public static javax.swing.JButton estado15;
    public static javax.swing.JButton estado16;
    public static javax.swing.JButton estado17;
    public static javax.swing.JButton estado18;
    public static javax.swing.JButton estado19;
    public static javax.swing.JButton estado2;
    public static javax.swing.JButton estado20;
    public static javax.swing.JButton estado21;
    public static javax.swing.JButton estado22;
    public static javax.swing.JButton estado23;
    public static javax.swing.JButton estado3;
    public static javax.swing.JButton estado4;
    public static javax.swing.JButton estado5;
    public static javax.swing.JButton estado6;
    public static javax.swing.JButton estado7;
    public static javax.swing.JButton estado8;
    public static javax.swing.JButton estado9;
    public static javax.swing.JButton finish;
    public static javax.swing.JButton finish1;
    public static javax.swing.JButton finish10;
    public static javax.swing.JButton finish11;
    public static javax.swing.JButton finish12;
    public static javax.swing.JButton finish13;
    public static javax.swing.JButton finish14;
    public static javax.swing.JButton finish15;
    public static javax.swing.JButton finish16;
    public static javax.swing.JButton finish17;
    public static javax.swing.JButton finish18;
    public static javax.swing.JButton finish19;
    public static javax.swing.JButton finish2;
    public static javax.swing.JButton finish20;
    public static javax.swing.JButton finish21;
    public static javax.swing.JButton finish22;
    public static javax.swing.JButton finish23;
    public static javax.swing.JButton finish3;
    public static javax.swing.JButton finish4;
    public static javax.swing.JButton finish5;
    public static javax.swing.JButton finish6;
    public static javax.swing.JButton finish7;
    public static javax.swing.JButton finish8;
    public static javax.swing.JButton finish9;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel31;
    public static javax.swing.JLabel jLabel37;
    public static javax.swing.JLabel jLabel38;
    public static javax.swing.JLabel jLabel39;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel40;
    public static javax.swing.JLabel jLabel41;
    public static javax.swing.JLabel jLabel42;
    public static javax.swing.JLabel jLabel43;
    public static javax.swing.JLabel jLabel44;
    public static javax.swing.JLabel jLabel45;
    public static javax.swing.JLabel jLabel46;
    public static javax.swing.JLabel jLabel47;
    public static javax.swing.JLabel jLabel48;
    public static javax.swing.JLabel jLabel49;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel50;
    public static javax.swing.JLabel jLabel51;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel p1;
    public static javax.swing.JLabel p10;
    public static javax.swing.JLabel p11;
    public static javax.swing.JLabel p12;
    public static javax.swing.JLabel p13;
    public static javax.swing.JLabel p14;
    public static javax.swing.JLabel p15;
    public static javax.swing.JLabel p16;
    public static javax.swing.JLabel p17;
    public static javax.swing.JLabel p18;
    public static javax.swing.JLabel p19;
    public static javax.swing.JLabel p2;
    public static javax.swing.JLabel p20;
    public static javax.swing.JLabel p21;
    public static javax.swing.JLabel p22;
    public static javax.swing.JLabel p23;
    public static javax.swing.JLabel p24;
    public static javax.swing.JLabel p25;
    public static javax.swing.JLabel p26;
    public static javax.swing.JLabel p27;
    public static javax.swing.JLabel p28;
    public static javax.swing.JLabel p29;
    public static javax.swing.JLabel p3;
    public static javax.swing.JLabel p30;
    public static javax.swing.JLabel p31;
    public static javax.swing.JLabel p32;
    public static javax.swing.JLabel p33;
    public static javax.swing.JLabel p34;
    public static javax.swing.JLabel p35;
    public static javax.swing.JLabel p36;
    public static javax.swing.JLabel p37;
    public static javax.swing.JLabel p38;
    public static javax.swing.JLabel p39;
    public static javax.swing.JLabel p4;
    public static javax.swing.JLabel p40;
    public static javax.swing.JLabel p41;
    public static javax.swing.JLabel p42;
    public static javax.swing.JLabel p43;
    public static javax.swing.JLabel p44;
    public static javax.swing.JLabel p45;
    public static javax.swing.JLabel p46;
    public static javax.swing.JLabel p47;
    public static javax.swing.JLabel p48;
    public static javax.swing.JLabel p49;
    public static javax.swing.JLabel p5;
    public static javax.swing.JLabel p50;
    public static javax.swing.JLabel p51;
    public static javax.swing.JLabel p52;
    public static javax.swing.JLabel p53;
    public static javax.swing.JLabel p54;
    public static javax.swing.JLabel p55;
    public static javax.swing.JLabel p56;
    public static javax.swing.JLabel p57;
    public static javax.swing.JLabel p58;
    public static javax.swing.JLabel p59;
    public static javax.swing.JLabel p6;
    public static javax.swing.JLabel p60;
    public static javax.swing.JLabel p61;
    public static javax.swing.JLabel p62;
    private javax.swing.JLabel p63;
    public static javax.swing.JLabel p64;
    public static javax.swing.JLabel p65;
    public static javax.swing.JLabel p66;
    public static javax.swing.JLabel p67;
    public static javax.swing.JLabel p68;
    public static javax.swing.JLabel p69;
    public static javax.swing.JLabel p7;
    public static javax.swing.JLabel p70;
    public static javax.swing.JLabel p71;
    public static javax.swing.JLabel p72;
    public static javax.swing.JLabel p8;
    public static javax.swing.JLabel p9;
    // End of variables declaration//GEN-END:variables
}
