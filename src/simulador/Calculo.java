package simulador;

import javax.swing.JTable;

public class Calculo {
    
    public JTable Tabela;
    
    public Calculo(JTable T){
        Tabela = T;
    }
    
    public FirstComeFirstServed fcfs = new FirstComeFirstServed(Tabela);
    public PriorityScheduling ps = new PriorityScheduling();
    public RoundRobin rr = new RoundRobin();
    public ShortestJobFirst sjf = new ShortestJobFirst();
    
    
}
