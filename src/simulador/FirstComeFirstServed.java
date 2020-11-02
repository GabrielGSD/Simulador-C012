package simulador;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class FirstComeFirstServed {
    
    public JTable TabelaFcfs;
    public int NumLinhas = 0; 
    public int Processos[][][];
    double tempoMedio = 0;
    
    ArrayList Lista = new ArrayList();
    
    String[] coluna = new String[3];
    
    public FirstComeFirstServed(JTable T){
        TabelaFcfs = T;
        NumLinhas = TabelaFcfs.getRowCount();
        
    }
    
    public double fcfsPreemptivo(){
        for(int i = 0; i < NumLinhas; i++){
            coluna[0] = TabelaFcfs.getValueAt(i, 0).toString().replaceAll("P", "p");
            coluna[1] = TabelaFcfs.getValueAt(i, 1).toString();
            coluna[2] = TabelaFcfs.getValueAt(i, 2).toString();
            
            Lista.add(Arrays.toString(coluna));
        }
        
        
        
        for(int i = 0; i < NumLinhas; i++){
            System.out.println(Lista.get(i));
            //Processos = (int[][][]) Lista.get(i);
        }
        
        for(int i = 0; i < NumLinhas; i++){
            //tempoMedio = Processos[0][i][2]; 
        }
        
        //tempoMedio = (tempoMedio - Processos[0][NumLinhas][2]) / NumLinhas;
        
        JOptionPane.showInputDialog("TM_FCFS_pp: " + NumLinhas + " ms");
        return tempoMedio;
    }
}
