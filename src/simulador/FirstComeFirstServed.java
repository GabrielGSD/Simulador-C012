package simulador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class FirstComeFirstServed {
    
    public JTable TabelaFcfs;
    public int NumLinhas = 0; 
    public ArrayList Processos[][];
    double tempoMedio = 0;
        
    public FirstComeFirstServed(JTable T){
        TabelaFcfs = T;
        NumLinhas = TabelaFcfs.getRowCount();
        
    }
    
    public double fcfsPreemptivo(){
        for(int i = 0; i < NumLinhas; i++){
            tempoMedio +=  Integer.parseInt(TabelaFcfs.getValueAt(i, 1).toString());
        }
        
        tempoMedio = (tempoMedio - Integer.parseInt(TabelaFcfs.getValueAt(NumLinhas -1, 1).toString()))/NumLinhas; 
        JOptionPane.showInputDialog("TM_FCFS_pp: " + tempoMedio + " ms");
        return tempoMedio;
    }
}
