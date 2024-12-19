package p_emilioc;
import javax.swing.*;
/**
 * @author Emilio
 */
public class P_EmilioC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][]a1= {{1,2,3},{4,5,6}};
        String a="";
        a+="Lo elementos de A1 son:\n";
    for(int i=0;i<a1.length;i++){
        for(int j=0;j<a1.length+1;j++)
        a+=a1[i][j]+" ";
    a+="\n";
    }
    int op=0;
    JOptionPane.showMessageDialog(null, a);
    }  
    
}
