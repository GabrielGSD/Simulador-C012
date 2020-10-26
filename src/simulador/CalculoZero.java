package simulador;

import javax.swing.JTable;

public class CalculoZero {
    
    public JTable Tabela;
        
    public CalculoZero(JTable T){
        Tabela = T;
    }
    
    public FirstComeFirstServed fcfs = new FirstComeFirstServed(Tabela);
    public PriorityScheduling ps = new PriorityScheduling();
    public RoundRobin rr = new RoundRobin();
    public ShortestJobFirst sjf = new ShortestJobFirst();
    
    
}
