package editor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emilio C
 */
public class PanelP extends javax.swing.JFrame {

    String direccion = "", nom = "nombre";
    int cont = 0;
    int AX = 0, BX = 0, CX = 0, DX = 0, LD = 0;
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel m2 = new DefaultTableModel();
    DefaultTableModel m3 = new DefaultTableModel();
    DefaultTableModel m4 = new DefaultTableModel();
    DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();

    public PanelP() {
        initComponents();
        this.setLocationRelativeTo(null);
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        this.Datos.setModel(model);
        model.addColumn("CODIGO");
        model.addColumn("INSTRUCCION");
        model.addColumn("PARAMETROS");
        model.addColumn("ACCION");
        this.Simbolo.setModel(m2);
        m2.addColumn("SIMBOLO");
        m2.addColumn("VALOR");
        m2.addColumn("LONGITUD");
        this.Etiqueta.setModel(m3);
        m3.addColumn("ETIQUETA");
        m3.addColumn("VALOR");
        this.tmem.setModel(m4);
        m4.addColumn("MEMORIA");
        m4.addColumn("ASIGNADA");
        m4.addColumn("Mod");
        m4.addColumn("BINARIO");
        m4.addColumn("Num.NORMAL");
        Simbolo.getColumnModel().getColumn(0).setCellRenderer(tcr);
        Simbolo.getColumnModel().getColumn(1).setCellRenderer(tcr);
        Simbolo.getColumnModel().getColumn(2).setCellRenderer(tcr);
        Etiqueta.getColumnModel().getColumn(0).setCellRenderer(tcr);
        Etiqueta.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tmem.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tmem.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tmem.getColumnModel().getColumn(2).setCellRenderer(tcr);
        tmem.getColumnModel().getColumn(3).setCellRenderer(tcr);
        tmem.getColumnModel().getColumn(4).setCellRenderer(tcr);
    }

    public void obd(String d) {
        this.direccion = d;
    }

    public void analizarLexico(String nc[]) {
        String val = "[A]X|[B]X|[C]X|[D]X|[L]D", n = "[0-9]*", sim = "(.DATOS|DEC|.DESA)", sen1 = ";",
                ints = "(MOV|INC|MUL|PRINT|REST|ADD|JZ|JUMP)+", i2 = "(MOV|MUL|REST|ADD)+", i1 = "(INC|PRINT|JZ|JUMP)+",
                eti = "(cicloC|cicloD|cicloA)";
//               ints="(MOV|INC|MUL|JC|JZ|LOOP|LOOPE|PRINT|REST)+";

        String men1 = "";
        String w,wn,wn2="";
        int c = 1, p = 1, o1 = 0,pi=0;
        int b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0, bd = 0;
        if (!nc[0].matches(".DATOS")) {
            men1 += " El codigo no inicia correctamente sin ' .DATOS '.\n"
                    + " Error en la linea: 1\n";
            p = 0;
        }
        
        for (int i = 0; i < nc.length; i++) {
            w = nc[i];
            if (nc[i].matches(sen1)) {
                c++;
            }
            if (!w.matches(val) && !w.matches(n) && !w.matches(sim) && !w.matches(sen1) && !w.matches(ints) && !w.matches(eti)) {
                if(!nc[i--].matches("JUMP")){
                p = 0;
                men1 += " Instruccion incorrecta:\n"
                        + " Palabra reservada: ' " + w + " ' en la linea: " + c + "\n";
                o1 = 1;
                }
                
            }

            if (nc[i].matches(".DESA")) {
                bd = 1;
            }
            if (bd == 1) {
                if (nc[i].matches("DEC")) {
                    p = 0;
                    o1 = 1;
                    men1 += " No se pueden declarar variables en .DESA:\n"
                            + " Error: ' " + nc[i + 1] + " ' en la linea: " + c + "\n";
                }
            } else {
                if (nc[i].matches(eti)){
                    men1 += " Etiqueta antes de .DESA:\n"
                            + " Etiqueta no aceptada: ' " + w + " ' en la linea: " + c + "\n";
                    o1 = 1;
                    p = 0;
                }
                if (nc[i].matches("DEC")) {
                    if (nc[i + 1].matches(val)) {
                        if (nc[i + 2].matches(n)) {
                        } else {
                            p = 0;
                            o1 = 1;
                            men1 += " Tipo de dato incorrecto:\n"
                                    + " Numero no detectado: ' " + nc[i + 2] + " ' en la linea: " + c + "\n";
                        }
                        switch (nc[i + 1]) {
                            case "AX":
                                if (b1 > 0) {
                                    men1 += " La variable AX declarada más de una vez.\n"
                                            + " Error en linea " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                } else {
                                    b1++;
                                }
                                break;
                            case "BX":
                                if (b2 > 0) {
                                    men1 += " La variable BX declarada más de una vez.\n"
                                            + " Error en linea " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                } else {
                                    b2++;
                                }
                                break;
                            case "CX":
                                if (b3 > 0) {
                                    men1 += " La variable CX declarada más de una vez.\n"
                                            + " Error en linea " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                } else {
                                    b3++;
                                }
                                break;
                            case "DX":
                                if (b4 > 0) {
                                    men1 += " La variable DX declarada más de una vez.\n"
                                            + " Error en linea " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                } else {
                                    b4++;
                                }
                                break;
                            case "LD":
                                if (b5 > 0) {
                                    men1 += " La variable LD declarada más de una vez.\n"
                                            + " Error en linea " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                } else {
                                    b5++;
                                }
                                break;
                        }

                    } else {
                        men1 += " No es un registro valido:\n"
                                + " Expresion rara : ' " + nc[i + 1] + " ' en la linea: " + c + "\n";
                    }
                }
            }

            if (nc[i].matches(ints)) {
                
                if (nc[i].matches(i1)) {
                    
                    
                    if (nc[i].matches("JUMP")) {
                        wn = nc[i + 1];
                        pi = i;
                        i = i + 2;
                        while (!nc[i].matches(wn) && i < nc.length) {
                            i++;
                            if (i == nc.length - 1 && !nc[i].matches(wn)) {
                                men1 += " Etiqueta no encontrada:\n"
                                        + " Error de asignacion " + wn + " no se encuentra\n";
                            }
                        }
                        i = pi;
                    }
                    
                    if (nc[i].matches("JZ")) {
                        if (!nc[i + 1].matches(eti)) {
                            men1 += " No se encontro etiqueta:\n"
                                    + " Error de asignacion " + nc[i + 1] + " ' en la linea: " + c + "\n";
                            p = 0;
                            o1 = 1;
                        }
                    } else {
                        if (!nc[i + 1].matches(val)) {
                            men1 += " No se encontro registro:\n"
                                    + " Error de asignacion " + nc[i + 1] + " ' en la linea: " + c + "\n";
                            p = 0;
                            o1 = 1;
                        }
                    }
                } else {
                    if (nc[i].matches(i2)) {
                        if (!nc[i + 1].matches(val)) {
                            men1 += " No se encontro registro: " + nc[i + 1] + "\n"
                                    + " Sin registro, en la linea: " + c + "\n";
                            p = 0;
                            o1 = 1;
                            if (!nc[i + 2].matches(val) || !nc[i + 2].matches(n)) {
                                men1 += " Tipo de dato incorrecto:\n"
                                        + " Ni numero ni registro : ' " + nc[i + 2] + " ' en la linea: " + c + "\n";
                                p = 0;
                                o1 = 1;
                            }
                        }
                    } else {
                        p = 0;
                        o1 = 1;
                        men1 += " Instruccion desconocida: ' " + nc[i] + " '\n"
                                + " En la linea: " + c + "\n";
                    }
                }
            }
        }
        if (o1 == 1) {
            men1 += " Fuera de eso todo esta bien\n";
            Resultados.setText(men1);
            Imprimir.setText("");
        }
        if (p == 1) {
            analizarexist(nc, men1);
        }
    }

    private void analizarexist(String nc[], String men1) {
        String sen1 = "(;)", ints = "(MOV|INC|MUL|PRINT|REST)+", i2 = "(MOV|MUL|REST|ADD)+", i1 = "(INC|PRINT|JZ)+",
                eti = "(cicloC|cicloD|cicloA)";
        int c = 1, p = 1, o1 = 0;
        boolean a1 = false, a2 = false, a3 = false, a4 = false, a5 = false;
        boolean b1 = false, b2 = false, b3 = false;
        for (int i = 0; i < nc.length; i++) {
            if (nc[i].matches(sen1)) {
                c++;
            }
            if (nc[i].matches("DEC")) {
                switch (nc[i + 1]) {
                    case "AX":
                        a1 = true;
                        break;
                    case "BX":
                        a2 = true;
                        break;
                    case "CX":
                        a3 = true;
                        break;
                    case "DX":
                        a4 = true;
                        break;
                    case "LD":
                        a5 = true;
                        break;
                }
            }
            if (nc[i].matches(eti)) {
                switch (nc[i]) {
                    case "cicloA":
                        if (a1 != true) {
                            men1 += "Etiqueta invalida:\n"
                                    + "No se puede usar: ' " + nc[i] + " ' en linea: " + c + "\n";
                            p = 0;
                            o1 = 1;
                        } else {
                            b1 = true;
                        }
                        break;
                    case "cicloD":
                        if (a4 != true) {
                            men1 += "Etiqueta invalida:\n"
                                    + "No se puede usar: ' " + nc[i] + " ' en linea: " + c + "\n";
                            p = 0;
                            o1 = 1;
                        } else {
                            b2 = true;
                        }
                        break;
                    case "cicloC":
                        if (a3 != true) {
                            men1 += "Etiqueta invalida:\n"
                                    + "No se puede usar: ' " + nc[i] + " ' en linea: " + c + "\n";
                            p = 0;
                            o1 = 1;
                        } else {
                            b3 = true;
                        }
                        break;
                }
            }
            if (nc[i].matches("JZ")) {
                switch (nc[i + 1]) {
                    case "cicloA":
                        if (b1 != true) {
                            men1 += "Etiqueta no declarada:\n"
                                    + "No se puede usar: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                            p = 0;
                            o1 = 1;
                        }
                        break;
                    case "cicloD":
                        if (b2 != true) {
                            men1 += "Etiqueta no declarada:\n"
                                    + "No se puede usar: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                            p = 0;
                            o1 = 1;
                        }
                        break;
                    case "cicloC":
                        if (b3 != true) {
                            men1 += "Etiqueta no declarada:\n"
                                    + "No se puede usar: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                            p = 0;
                            o1 = 1;
                        }
                        break;
                }
            }
            if (nc[i].matches(ints)) {
                if (nc[i].matches(i1)) {
                    switch (nc[i + 1]) {
                        case "AX":
                            if (a1 != true) {
                                men1 += "Registro no declarado:\n"
                                        + "No se declaro: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                                p = 0;
                                o1 = 1;
                            }
                            break;
                        case "BX":
                            if (a2 != true) {
                                men1 += "Registro no declarado:\n"
                                        + "No se declaro: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                                p = 0;
                                o1 = 1;
                            }
                            break;
                        case "CX":
                            if (a3 != true) {
                                men1 += "Registro no declarado:\n"
                                        + "No se declaro: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                                p = 0;
                                o1 = 1;
                            }
                            break;
                        case "DX":
                            if (a4 != true) {
                                men1 += "Registro no declarado:\n"
                                        + "No se declaro: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                                p = 0;
                                o1 = 1;
                            }
                            break;
                        case "LD":
                            if (a5 != true) {
                                men1 += "Registro no declarado:\n"
                                        + "No se declaro: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                                p = 0;
                                o1 = 1;
                            }
                            break;
                    }
                } else {
                    if (nc[i].matches(i2)) {
                        switch (nc[i + 1]) {
                            case "AX":
                                if (a1 != true) {
                                    men1 += "Registro no declarado:\n"
                                            + "No se declaro: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                }
                                break;
                            case "BX":
                                if (a2 != true) {
                                    men1 += "Registro no declarado:\n"
                                            + "No se declaro: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                }
                                break;
                            case "CX":
                                if (a3 != true) {
                                    men1 += "Registro no declarado:\n"
                                            + "No se declaro: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                }
                                break;
                            case "DX":
                                if (a4 != true) {
                                    men1 += "Registro no declarado:\n"
                                            + "No se declaro: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                }
                                break;
                            case "LD":
                                if (a5 != true) {
                                    men1 += "Registro no declarado:\n"
                                            + "No se declaro: ' " + nc[i + 1] + " ' en linea: " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                }
                                break;
                        }
                        switch (nc[i + 2]) {
                            case "AX":
                                if (a1 != true) {
                                    men1 += "Registro no declarado:\n"
                                            + "No se declaro: ' " + nc[i + 2] + " ' en linea: " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                }
                                break;
                            case "BX":
                                if (a2 != true) {
                                    men1 += "Registro no declarado:\n"
                                            + "No se declaro: ' " + nc[i + 2] + " ' en linea: " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                }
                                break;
                            case "CX":
                                if (a3 != true) {
                                    men1 += "Registro no declarado:\n"
                                            + "No se declaro: ' " + nc[i + 2] + " ' en linea: " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                }
                                break;
                            case "DX":
                                if (a4 != true) {
                                    men1 += "Registro no declarado:\n"
                                            + "No se declaro: ' " + nc[i + 2] + " ' en linea: " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                }
                                break;
                            case "LD":
                                if (a5 != true) {
                                    men1 += "Registro no declarado:\n"
                                            + "No se declaro: ' " + nc[i + 2] + " ' en linea: " + c + "\n";
                                    p = 0;
                                    o1 = 1;
                                }
                                break;
                        }
                    }
                }
            }
        }
        if (p == 1 && o1 == 0) {
            Resultados.setText("Lenguaje leido y escrito correctamente. No ahi errores lexicos o logica.\n");
            opc(nc);
        } else {
            Resultados.setText(men1);
            Imprimir.setText("");
        }
    }

    private void opc(String nc[]) {
        String val = "[A]X|[B]X|[C]X|[D]X|[L]D", n = "[0-9]*", men2 = "", eti = "(cicloC|cicloD|cicloA)+";//"JZ"; 
        int a = 0, d = 0, c = 0;
        String w;
        for (int i = 0; i < nc.length; i++) {
            if (nc[i].matches(eti)) {
                switch (nc[i]) {
                    case "cicloA":
                        a = i;
                        break;
                    case "cicloD":
                        d = i;
                        break;
                    case "cicloC":
                        c = i;
                        break;
                }
            }
            if(nc[i].matches("JUMP")){
            w=nc[i];
            while(!nc[i].matches(w)) i++;
            }
            if (nc[i].matches("JZ")) {
                switch (nc[i + 1]) {
                    case "cicloA":
                        if (AX != 0) {
                            i = a;
                            AX--;
                        }
                        break;
                    case "cicloD":
                        if (DX != 0) {
                            i = d;
                            DX--;
                        }
                        break;
                    case "cicloC":
                        if (CX != 0) {
                            i = c;
                            CX--;
                        }
                        break;
                }
            }
            
            switch (nc[i]) {
                case "DEC":
                    switch (nc[i + 1]) {
                        case "AX":
                            this.AX = Integer.parseInt(nc[i + 2]);
                            break;
                        case "BX":
                            this.BX = Integer.parseInt(nc[i + 2]);
                            break;
                        case "CX":
                            this.CX = Integer.parseInt(nc[i + 2]);
                            break;
                        case "DX":
                            this.DX = Integer.parseInt(nc[i + 2]);
                            break;
                        case "LD":
                            this.LD = Integer.parseInt(nc[i + 2]);
                            break;
                    }
                    break;
                case "ADD":
                    switch (nc[i + 1]) {
                        case "AX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        AX = AX + AX;
                                        break;
                                    case "BX":
                                        AX = AX + BX;
                                        break;
                                    case "CX":
                                        AX = AX + CX;
                                        break;
                                    case "DX":
                                        AX = AX + DX;
                                        break;
                                    case "LD":
                                        AX = AX + LD;
                                        break;
                                }
                            } else {
                                AX = AX + Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "BX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        BX = BX + AX;
                                        break;
                                    case "BX":
                                        BX = BX + BX;
                                        break;
                                    case "CX":
                                        BX = BX + CX;
                                        break;
                                    case "DX":
                                        BX = BX + DX;
                                        break;
                                    case "LD":
                                        BX = BX + LD;
                                        break;
                                }
                            } else {
                                if (nc[i + 2].matches(n)) {
                                    AX = AX + Integer.parseInt(nc[i + 2]);
                                }
                            }
                            break;
                        case "CX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        CX = CX + AX;
                                        break;
                                    case "BX":
                                        CX = CX + BX;
                                        break;
                                    case "CX":
                                        CX = CX + CX;
                                        break;
                                    case "DX":
                                        CX = CX + DX;
                                        break;
                                    case "LD":
                                        CX = CX + LD;
                                        break;
                                }
                            } else {
                                if (nc[i + 2].matches(n)) {
                                    CX = CX + Integer.parseInt(nc[i + 2]);
                                }
                            }
                            break;
                        case "DX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        CX = CX + AX;
                                        break;
                                    case "BX":
                                        CX = CX + BX;
                                        break;
                                    case "CX":
                                        CX = CX + CX;
                                        break;
                                    case "DX":
                                        CX = CX + DX;
                                        break;
                                    case "LD":
                                        CX = CX + LD;
                                        break;
                                }
                            } else {
                                if (nc[i + 2].matches(n)) {
                                    CX = CX + Integer.parseInt(nc[i + 2]);
                                }
                            }
                            break;
                        case "LD":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        LD = LD + AX;
                                        break;
                                    case "BX":
                                        LD = LD + BX;
                                        break;
                                    case "CX":
                                        LD = LD + CX;
                                        break;
                                    case "DX":
                                        LD = LD + DX;
                                        break;
                                    case "LD":
                                        LD = LD + LD;
                                        break;
                                }
                            } else {
                                LD = LD + Integer.parseInt(nc[i + 2]);
                            }
                    }
                    break;
                case "MOV":
                    switch (nc[i + 1]) {
                        case "AX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "BX":
                                        AX = BX;
                                        break;
                                    case "CX":
                                        AX = CX;
                                        break;
                                    case "DX":
                                        AX = DX;
                                        break;
                                    case "LD":
                                        AX = LD;
                                        break;
                                }
                            } else {
                                AX = Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "BX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        BX = AX;
                                        break;
                                    case "CX":
                                        BX = CX;
                                        break;
                                    case "DX":
                                        BX = DX;
                                        break;
                                    case "LD":
                                        BX = LD;
                                        break;
                                }
                            } else {
                                BX = Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "CX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        CX = AX;
                                        break;
                                    case "BX":
                                        CX = BX;
                                        break;
                                    case "DX":
                                        CX = DX;
                                        break;
                                    case "LD":
                                        CX = LD;
                                        break;
                                }
                            } else {
                                CX = Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "DX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        DX = AX;
                                        break;
                                    case "BX":
                                        DX = BX;
                                        break;
                                    case "CX":
                                        DX = CX;
                                        break;
                                    case "LD":
                                        DX = LD;
                                        break;
                                }
                            } else {
                                DX = Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "LD":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        LD = AX;
                                        break;
                                    case "BX":
                                        LD = BX;
                                        break;
                                    case "CX":
                                        LD = CX;
                                        break;
                                    case "DX":
                                        LD = DX;
                                        break;
                                }
                            } else {
                                AX = Integer.parseInt(nc[i + 2]);
                            }
                            break;
                    }

                    break;
                case "MUL":
                    switch (nc[i + 1]) {
                        case "AX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        AX = AX * AX;
                                        break;
                                    case "BX":
                                        AX = AX * BX;
                                        break;
                                    case "CX":
                                        AX = AX * CX;
                                        break;
                                    case "DX":
                                        AX = AX * DX;
                                        break;
                                    case "LD":
                                        AX = AX * LD;
                                        break;
                                }
                            } else {
                                AX = AX * Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "BX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        BX = BX * AX;
                                        break;
                                    case "BX":
                                        BX = BX * BX;
                                        break;
                                    case "CX":
                                        BX = BX * CX;
                                        break;
                                    case "DX":
                                        BX = BX * DX;
                                        break;
                                    case "LD":
                                        BX = BX * LD;
                                        break;
                                }
                            } else {
                                BX = BX * Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "CX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        CX = CX * AX;
                                        break;
                                    case "BX":
                                        CX = CX * BX;
                                        break;
                                    case "CX":
                                        CX = CX * CX;
                                        break;
                                    case "DX":
                                        CX = CX * DX;
                                        break;
                                    case "LD":
                                        CX = CX * LD;
                                        break;
                                }
                            } else {
                                CX = CX * Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "DX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        DX = DX * AX;
                                        break;
                                    case "BX":
                                        DX = DX * BX;
                                        break;
                                    case "CX":
                                        DX = DX * CX;
                                        break;
                                    case "DX":
                                        DX = DX * DX;
                                        break;
                                    case "LD":
                                        DX = DX * LD;
                                        break;
                                }
                            } else {
                                DX = DX * Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "LD":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        LD = LD * AX;
                                        break;
                                    case "BX":
                                        LD = LD * BX;
                                        break;
                                    case "CX":
                                        LD = LD * CX;
                                        break;
                                    case "DX":
                                        LD = LD * DX;
                                        break;
                                    case "LD":
                                        LD = LD * LD;
                                        break;
                                }
                            } else {
                                LD = LD * Integer.parseInt(nc[i + 2]);
                            }
                    }

                    break;
                case "INC":
                    if (nc[i + 1].matches(val)) {
                        switch (nc[i + 1]) {
                            case "AX":
                                AX++;
                                break;
                            case "BX":
                                BX++;
                                break;
                            case "CX":
                                CX++;
                                break;
                            case "DX":
                                DX++;
                                break;
                            case "LD":
                                LD++;
                                break;
                        }
                    }

                    break;
                case "REST":
                    switch (nc[i + 1]) {
                        case "AX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        AX = AX - AX;
                                        break;
                                    case "BX":
                                        AX = AX - BX;
                                        break;
                                    case "CX":
                                        AX = AX - CX;
                                        break;
                                    case "DX":
                                        AX = AX - DX;
                                        break;
                                    case "LD":
                                        AX = AX - LD;
                                        break;
                                }
                            } else {
                                AX = AX - Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "BX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        BX = BX - AX;
                                        break;
                                    case "BX":
                                        BX = BX - BX;
                                        break;
                                    case "CX":
                                        BX = BX - CX;
                                        break;
                                    case "DX":
                                        BX = BX - DX;
                                        break;
                                    case "LD":
                                        BX = BX - LD;
                                        break;
                                }
                            } else {
                                BX = BX - Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "CX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        CX = CX - AX;
                                        break;
                                    case "BX":
                                        CX = CX - BX;
                                        break;
                                    case "CX":
                                        CX = CX - CX;
                                        break;
                                    case "DX":
                                        CX = CX - DX;
                                        break;
                                    case "LD":
                                        CX = CX - LD;
                                        break;
                                }
                            } else {
                                CX = CX - Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "DX":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        CX = CX - AX;
                                        break;
                                    case "BX":
                                        CX = CX - BX;
                                        break;
                                    case "CX":
                                        CX = CX - CX;
                                        break;
                                    case "DX":
                                        CX = CX - DX;
                                        break;
                                    case "LD":
                                        CX = CX - LD;
                                        break;
                                }
                            } else {
                                DX = DX - Integer.parseInt(nc[i + 2]);
                            }
                            break;
                        case "LD":
                            if (nc[i + 2].matches(val)) {
                                switch (nc[i + 2]) {
                                    case "AX":
                                        LD = LD - AX;
                                        break;
                                    case "BX":
                                        LD = LD - BX;
                                        break;
                                    case "CX":
                                        LD = LD - CX;
                                        break;
                                    case "DX":
                                        LD = LD - DX;
                                        break;
                                    case "LD":
                                        LD = LD - LD;
                                        break;
                                }
                            } else {
                                LD = LD - Integer.parseInt(nc[i + 2]);
                            }
                    }
                    break;
                case "PRINT":
                    switch (nc[i + 1]) {
                        case "AX":
                            men2 += "\n  AX: " + AX + " \n";
                            break;
                        case "BX":
                            men2 += "\n  BX: " + BX + " \n";
                            break;
                        case "CX":
                            men2 += "\n  CX: " + CX + " \n";
                            break;
                        case "DX":
                            men2 += "\n  DX: " + DX + " \n";
                            break;
                        case "LD":
                            men2 += "\n  LD: " + LD + " \n";
                            break;
                    }
                    Imprimir.setText(men2);
                    break;
            }
        }
//        comparar(nc);
//        comparar2(AX, BX, CX, DX, LD);
    }

    private void comparar(String nc[]) {
        borrar();
        String val = "[A]X|[B]X|[C]X|[D]X|[L]D", n = "[0-9]*", sim = "(.DATOS|DEC|.DESA)", sen1 = ";",
                ints = "(MOV|INC|MUL|PRINT|REST)+";
        String[] agregar = new String[3];
        String s = "";
        int c = 1, v = 0;
        for (String nc1 : nc) {
            if (nc1.matches(val)) {
                s = "Registro";
            }
            if (nc1.matches(n)) {
                s = "Numero entero";
            }
            if (nc1.matches(sim)) {
                s = "Palabra reservada";
            }
            if (nc1.matches(ints)) {
                s = "Instruccion";
            }
            agregar[0] = s;
            if (!nc1.matches(sen1)) {
                agregar[1] = nc1;
            }
            if (nc1.matches(sen1)) {
                agregar[2] = Integer.toString(c);
                c++;
            } else {
                agregar[2] = Integer.toString(c);
            }
            if (!nc1.matches(sen1)) {
                model.addRow(agregar);
            }
        }
    }

    private void borrar() {
        int tf = model.getRowCount();
        for (int i = 0; i < tf; i++) {
            model.removeRow(0);
        }
    }

    private void b2() {
        int tf = m2.getRowCount();
        for (int i = 0; i < tf; i++) {
            m2.removeRow(0);
        }
    }

    private void b3() {
        int tf = m3.getRowCount();
        for (int i = 0; i < tf; i++) {
            m3.removeRow(0);
        }
    }

    private void b4() {
        int tf = m4.getRowCount();
        for (int i = 0; i < tf; i++) {
            m4.removeRow(0);
        }
    }

    private void imprimir(int aux, int j) {
        String[] a = new String[5];
        a[0] = Integer.toString(j);
        a[1] = Integer.toHexString(aux);
        a[3] = Integer.toBinaryString(aux);
        a[4] = Integer.toString(aux);
        m4.addRow(a);
    }

    private void c() {
        String c1 = Entrada.getText();
        StringTokenizer st = new StringTokenizer(c1);
        String n = "[0-9]*", sen1 = ";",
                ints = "(MOV|INC|MUL|PRINT|REST|ADD|JZ|DEC)+";
        borrar();
        String token;
        String[] a = new String[4];
        int j = 1;
        while (st.hasMoreTokens()) {
            token = st.nextToken();  //alt+124 ||
            if (token.matches(sen1)) {
                j++;
            }
            a[0] = Integer.toString(j);
            a[1] = token;
            if (token.matches(ints)) {
                switch (token) {
                    case "DEC":
                        a[2] = "DEC Reg Num";
                        a[3] = "Declarar un registro con valor.";
                        break;
                    case "JZ":
                        a[2] = "JZ (cicloA,cicloD,cicloC)";
                        a[3] = "Hacer un bucle. hasta 0";
                        break;
                    case "MOV":
                        a[2] = "MOV Reg Reg o Num";
                        a[3] = "Mueve de registro 2 a registro 1.";
                        break;
                    case "INC":
                        a[2] = "INC (Reg)";
                        a[3] = "Incrementa en 1 el X registro.";
                        break;
                    case "MUL":
                        a[2] = "MUL Reg (Reg o Num)";
                        a[3] = "Multiplica r2 por r1, para r1.";
                        break;
                    case "PRINT":
                        a[2] = "PRINT Reg";
                        a[3] = "Imprime el valor del X registro.";
                        break;
                    case "REST":
                        a[2] = "REST Reg Reg o Num";
                        a[2] = "Resta el valor de r1 por r2 para r1.";
                        break;
                    case "ADD":
                        a[2] = "ADD Reg (Reg O Num)";
                        a[2] = "Suma el valor de r1 por r2 para r1.";
                        break;
                }
                model.addRow(a);
            }
        }
    }

    private void c2() {
        String c1 = Entrada.getText();
        StringTokenizer st = new StringTokenizer(c1);
        String val = "[A]X|[B]X|[C]X|[D]X|[L]D", n = "[0-9]*", sen1 = ";";
        String[] nc = new String[st.countTokens()];
        int i = 0;
        String[] a = new String[3];
        int j = 1, b;
        b2();
        while (st.hasMoreTokens()) {
            nc[i] = st.nextToken();
            if (nc[i].matches(n)) {
                if (nc[i - 1].matches(val)) {
                    if (nc[i - 2].matches("DEC")) {
                        a[0] = nc[i-1];
                        a[1] = nc[i];
                        m2.addRow(a);
                    }
                }
            }
            i++;
        }
    }

    private void c3() {
        b3();
        String c1 = Entrada.getText();
        StringTokenizer st = new StringTokenizer(c1);
        String eti = "(cicloC|cicloD|cicloA)", sen1 = ";", sim = "(.DATOS|.DESA)";
        String[] nc = new String[st.countTokens()];
        String[] a = new String[2];
        int j = 1, i = 0;
        while (st.hasMoreTokens()) {
            nc[i] = st.nextToken();

            if (nc[i].matches(sen1)) j++;
            //alt+124 ||
            if (nc[i].matches(eti) || nc[i].matches(sim)){
                a[0] = nc[i];
                a[1] = Integer.toString(j);
                m3.addRow(a);
            }
            i++;
        }
    }

    private void c4() {
        int in = (int) Carg.getValue();
        String c1 = Entrada.getText();
        StringTokenizer st = new StringTokenizer(c1);
        String[] c = new String[st.countTokens()];
        String val = "[A]X|[B]X|[C]X|[D]X|[L]D", n = "[0-9]*", sim = "(.DATOS|.DESA)", sen1 = ";";
        String eti = "(cicloC|cicloD|cicloA)", i2 = "(MOV|MUL|REST|ADD|DEC)+", i1 = "(INC|PRINT|JZ|JUMP)+";
        
        b4();
        String token, w="";
        String[] a = new String[4];
        int j = 0, a1 = 0,a2 = 0, k = 0,b=0,b2=0;
        
         if(in>1) j=in-1;
        b4();
        while (st.hasMoreElements()) {
            c[k] = st.nextToken();
            k++;
        }
        
        for (int i = 0; i < c.length; i++) {
            if (c[i].matches(val) || c[i].matches(n) || c[i].matches(sim) || c[i].matches(eti) || c[i].matches(i1) || c[i].matches(i2) ){
                j++;
            } else{
            if(c[i-1].matches("JUMP")){
               imprimir(33, j);
               j++;
               imprimir(36, j);
               w=c[i]; 
               a1=j+1; 
               a2=i+2;
               b=1;
               i++;
               while(!c[i].equals(w)){
               System.out.println("Porque no se cumple cumplio xD");
               i++;
               }
            }
            }
            
            if(b==1 && i==c.length-1){
            i=a2;
            b2=1;
            }
            if(c[i].matches(w) && b2==1){
            i=c.length;
            }
            
//            if(i==c.length-1 && b2==1){ i=a2; b=0; }
            
            if (c[i].matches(sim)) {
                switch (c[i]) {
                    case ".DATOS": imprimir(1, j);
                        break;
                    case ".DESA": imprimir(7, j);
                        break;
                }
            }
            if (c[i].matches(i2)) {
                        switch (c[i]) {
                            case "MOV": imprimir(10, j);
                                break;
                            case "MUL": imprimir(16, j);
                                break;
                            case "REST": imprimir(14, j);
                                break;
                            case "ADD": imprimir(12, j);
                                break;
                            case "DEC": imprimir(7, j);
                                break;
                        }
            }
            if (c[i].matches(i1)) {
                switch (c[i]) {
                    case "INC": imprimir(9, j); break;
                    case "PRINT": imprimir(24, j); break;
                    case "JZ": imprimir(20, j); break;
                }
            }
            
            if(c[i].matches(val)){
            switch(c[i]){
                case "AX": imprimir(2, j); break;
                case "BX": imprimir(3, j); break;
                case "CX": imprimir(4, j); break;
                case "DX": imprimir(5, j); break;
                case "LD": imprimir(6, j); break;
            }
            }
            if(c[i].matches(n)){
            imprimir(35, j);
            }
            
            if (c[i].matches(eti)) {
                switch (c[i]) {
                    case "cicloA": imprimir(28, j);
                        break;
                    case "cicloC": imprimir(30, j);
                        break;
                    case "cicloD": imprimir(32, j);
                        break;
                }
            } 
        }
    }

    private void comparar2(int a, int b, int cx, int d, int l) {
        String[] agregar = new String[3];
        b2();
        String s = "";
        if (a != -1) {
            s = "AX";
            agregar[0] = s;
            agregar[1] = Integer.toHexString(a);
            agregar[2] = Integer.toString(Integer.BYTES);
            m2.addRow(agregar);
        }
        if (b != -1) {
            s = "BX";
            agregar[0] = s;
            agregar[1] = Integer.toHexString(b);
            agregar[2] = Integer.toString(Integer.BYTES);
            m2.addRow(agregar);
        }
        if (cx != -1) {
            s = "CX";
            agregar[0] = s;
            agregar[1] = Integer.toHexString(cx);
            agregar[2] = Integer.toString(Integer.BYTES);
            m2.addRow(agregar);
        }
        if (d != -1) {
            s = "DX";
            agregar[0] = s;
            agregar[1] = Integer.toHexString(d);
            agregar[2] = Integer.toString(Integer.BYTES);
            m2.addRow(agregar);
        }
        if (l != -1) {
            s = "LD";
            agregar[0] = s;
            agregar[1] = Integer.toHexString(l);
            agregar[2] = Integer.toString(Integer.BYTES);
            m2.addRow(agregar);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre = new javax.swing.JLabel();
        Compila = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Entrada = new javax.swing.JEditorPane();
        Lineas1 = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Imprimir = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sc1 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        Simbolo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tmem = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Etiqueta = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Carg = new javax.swing.JSpinner();
        b1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Nuevo = new javax.swing.JMenuItem();
        Selecciona = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("Nombre del archivo");
        Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Nombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Nombre.setOpaque(true);
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 30));

        Compila.setBackground(new java.awt.Color(204, 0, 0));
        Compila.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Compila.setForeground(new java.awt.Color(255, 255, 255));
        Compila.setText("Compilar");
        Compila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompilaActionPerformed(evt);
            }
        });
        getContentPane().add(Compila, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 140, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Entrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntradaKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(Entrada);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 240, 540));

        Lineas1.setEditable(false);
        Lineas1.setText("1");
        jPanel1.add(Lineas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 20, 530));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 290, 330));

        Resultados.setEditable(false);
        Resultados.setColumns(20);
        Resultados.setLineWrap(true);
        Resultados.setRows(5);
        jScrollPane2.setViewportView(Resultados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 280, 70));

        Imprimir.setEditable(false);
        Imprimir.setColumns(20);
        Imprimir.setRows(5);
        jScrollPane4.setViewportView(Imprimir);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 240, 70));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Resultados de PRINT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Correciones");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, 20));

        sc1.setEnabled(false);

        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "INSTRUCCION", "PARAMETROS", "ACCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Datos.setShowHorizontalLines(false);
        Datos.setSurrendersFocusOnKeystroke(true);
        sc1.setViewportView(Datos);

        getContentPane().add(sc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 510, 100));

        Simbolo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SIMBOLO", "VALOR", "LONGITUD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Simbolo.setShowHorizontalLines(false);
        jScrollPane7.setViewportView(Simbolo);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 280, 100));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Tabla de etiquetas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 180, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Tabla de Códigos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 160, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Tabla de memoria");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 160, -1));

        tmem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MEMORIA", "CODIGO", "MOD", "Num. NORMAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tmem);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 510, 120));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Tabla de simbolos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 160, -1));

        Etiqueta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ETIQUETA", "COLUMNA"
            }
        ));
        jScrollPane8.setViewportView(Etiqueta);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 220, 100));

        jLabel7.setBackground(new java.awt.Color(255, 153, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cargador");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 40));

        Carg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Carg.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        Carg.setAutoscrolls(true);
        Carg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Carg.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CargAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                CargAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Carg.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CargStateChanged(evt);
            }
        });
        Carg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargMouseClicked(evt);
            }
        });
        Carg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CargKeyPressed(evt);
            }
        });
        getContentPane().add(Carg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 50, 40));

        b1.setBackground(new java.awt.Color(255, 51, 51));
        b1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        b1.setText("Cambiar");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, 40));

        Fondo.setBackground(new java.awt.Color(153, 153, 255));
        Fondo.setOpaque(true);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 570));

        jMenuBar1.setBackground(new java.awt.Color(102, 204, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jMenuBar1.setForeground(new java.awt.Color(0, 102, 255));
        jMenuBar1.setToolTipText("");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/About.png"))); // NOI18N
        jMenu1.setText("Opciones");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setBackground(new java.awt.Color(153, 204, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Save.png"))); // NOI18N
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        Nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Nuevo.setBackground(new java.awt.Color(153, 204, 255));
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/New document.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        jMenu1.add(Nuevo);

        Selecciona.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Selecciona.setBackground(new java.awt.Color(153, 204, 255));
        Selecciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Down.png"))); // NOI18N
        Selecciona.setText("Selecciona");
        Selecciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionaActionPerformed(evt);
            }
        });
        jMenu1.add(Selecciona);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void CompilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompilaActionPerformed
        String c1 = Entrada.getText();
        StringTokenizer tkns = new StringTokenizer(c1);//","
        String[] nc = new String[tkns.countTokens()];
        String v;
        int i = 0;
        while (tkns.hasMoreElements()) {
            nc[i] = tkns.nextToken();
            i++;
        }
        for (int j = 0; j < nc.length; j++) {
            if (nc[j].equals("\n")) {
            }
        }
        analizarLexico(nc);
    }//GEN-LAST:event_CompilaActionPerformed

    private void EntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaKeyPressed

    }//GEN-LAST:event_EntradaKeyPressed

    private void EntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaKeyReleased
        StringTokenizer st = new StringTokenizer(Entrada.getText(), "\n", true);
        String txt = "", token;
        cont = 1;
        while (st.hasMoreTokens()) {
            token = st.nextToken();
            if ("\n".equals(token)) {
                cont++;
            }
        }

        for (int i = 1; i <= cont; i++) {
            txt += i + "\n";
        }
        Lineas1.setText(txt);
        c();
        c2();
        c3();
        c4();
    }//GEN-LAST:event_EntradaKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String cadena;
        try {
            String filePath = direccion;
            cadena = Entrada.getText();
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write("");
            bw.close();
            byte[] byteArr2; //converting string into byte array
            byteArr2 = cadena.getBytes();
            FileOutputStream f = new FileOutputStream(filePath, true);
            f.write(byteArr2);
            f.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        String nam, a1 = "";
        int l = 1;
        try {
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();

            if (guarda != null) {
                /*guardamos el archivo y le damos el formato directamente,
       * si queremos que se guarde en formato doc lo definimos como .doc*/
                FileWriter save = new FileWriter(guarda + ".txt");
                save.close();
                JOptionPane.showMessageDialog(null,
                        "El archivo se a guardado Exitosamente",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            }
            this.obd(guarda.getAbsolutePath());
            nam = guarda.getName();
            try {
                Nombre.setText(nam);
                FileReader fr = new FileReader(guarda);
                BufferedReader br = new BufferedReader(fr);
                String text = "";
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    text += linea + "\n";
                    a1 += l + "\n";
                    l++;
                }
                Entrada.setText(text);
                Lineas1.setText(a1);
            } catch (Exception e) {
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_NuevoActionPerformed

    private void SeleccionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionaActionPerformed
        String nam, a1 = "";
        int l = 1;
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        this.obd(archivo.getAbsolutePath());
        nam = archivo.getName();
        try {
            Nombre.setText(nam);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String text = "";
            String linea = "";
            while ((linea = br.readLine()) != null) {
                text += linea + "\n";
                a1 += l + "\n";
                l++;
            }
            Entrada.setText(text);
            Lineas1.setText(a1);
            JOptionPane.showMessageDialog(null, "archivo leido correctamente");
        } catch (Exception e) {
        }
        StringTokenizer tkns = new StringTokenizer(Entrada.getText());//","
        String[] nc = new String[tkns.countTokens()];
        int i = 0;
        while (tkns.hasMoreElements()) {
            nc[i] = tkns.nextToken();
            i++;
        }
        c();
        c2();
        c3();
        c4();
    }//GEN-LAST:event_SeleccionaActionPerformed

    private void CargAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CargAncestorAdded
      
    }//GEN-LAST:event_CargAncestorAdded

    private void CargKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CargKeyPressed
       
    }//GEN-LAST:event_CargKeyPressed

    private void CargAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CargAncestorMoved
        
    }//GEN-LAST:event_CargAncestorMoved

    private void CargStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CargStateChanged
        
    }//GEN-LAST:event_CargStateChanged

    private void CargMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargMouseClicked
      
    }//GEN-LAST:event_CargMouseClicked

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       c4(); 
    }//GEN-LAST:event_b1ActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Carg;
    private javax.swing.JButton Compila;
    private javax.swing.JTable Datos;
    private javax.swing.JEditorPane Entrada;
    private javax.swing.JTable Etiqueta;
    private javax.swing.JLabel Fondo;
    public javax.swing.JTextArea Imprimir;
    private javax.swing.JEditorPane Lineas1;
    private javax.swing.JLabel Nombre;
    private javax.swing.JMenuItem Nuevo;
    public javax.swing.JTextArea Resultados;
    private javax.swing.JMenuItem Selecciona;
    private javax.swing.JTable Simbolo;
    private javax.swing.JButton b1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane sc1;
    private javax.swing.JTable tmem;
    // End of variables declaration//GEN-END:variables
}
