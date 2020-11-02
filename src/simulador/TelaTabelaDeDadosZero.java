package simulador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaTabelaDeDadosZero extends javax.swing.JFrame {
    
    public int linha = 0;
    public int coluna = 0; 
    
    int Dados[][] = new int[10][10];
    
    public TelaTabelaDeDadosZero() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDeDadosZero = new javax.swing.JTable();
        BtAvancar = new javax.swing.JButton();
        BtCancelar = new javax.swing.JButton();
        lbl_NameProcess = new javax.swing.JLabel();
        lbl_BurstTime = new javax.swing.JLabel();
        lbl_Priority = new javax.swing.JLabel();
        txt_NameProcess = new javax.swing.JTextField();
        txt_Priority = new javax.swing.JTextField();
        txt_BurstTime = new javax.swing.JTextField();
        BtInserir = new javax.swing.JButton();
        BtEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabelaDeDadosZero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "Burst Time", "Priority"
            }
        ));
        jScrollPane1.setViewportView(TabelaDeDadosZero);

        BtAvancar.setText("Avancar");
        BtAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAvancarActionPerformed(evt);
            }
        });

        BtCancelar.setText("Cancelar");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        lbl_NameProcess.setText("Process");

        lbl_BurstTime.setText("Burst Time");

        lbl_Priority.setText("Priority");

        BtInserir.setText("Inserir");
        BtInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInserirActionPerformed(evt);
            }
        });

        BtEditar.setText("Editar");
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtInserir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BtCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtAvancar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_NameProcess)
                            .addComponent(txt_NameProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_BurstTime)
                            .addComponent(txt_BurstTime, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Priority)
                            .addComponent(txt_Priority, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NameProcess)
                    .addComponent(lbl_Priority)
                    .addComponent(lbl_BurstTime))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NameProcess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_BurstTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Priority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtInserir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtEditar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtAvancar)
                    .addComponent(BtCancelar))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
        setVisible(false);
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void BtAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAvancarActionPerformed
        // TODO add your handling code here:
        /*
        int NumProcessos = 1;
        for(int i = 0; i < NumProcessos; i++){ //linha
            for(int j = 0; i < 3; i++){ //coluna
                Dados[i][j] = (int) (TabelaDeDadosZero.getValueAt(i, j));
            }
        }
        JOptionPane.showInputDialog(Dados[0][0] + " .", null);
    }//GEN-LAST:event_BtAvancarActionPerformed
    */
        double x = 0;
        FirstComeFirstServed fc = new FirstComeFirstServed(TabelaDeDadosZero);
        x = fc.fcfsPreemptivo();
        JOptionPane.showInputDialog("O valor é : " + x);
    }
    private void BtInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInserirActionPerformed
        // TODO add your handling code here:
        
        String process = txt_NameProcess.getText().trim();
        String burstTime = txt_BurstTime.getText().trim();
        String priority = txt_Priority.getText().trim();
        
        DefaultTableModel dtm = (DefaultTableModel) TabelaDeDadosZero.getModel();
        dtm.addRow(new String[]{ process, burstTime, priority});
        
        txt_NameProcess.setText("");
        txt_BurstTime.setText("");
        txt_Priority.setText("");
        
        txt_NameProcess.requestFocus();
    }//GEN-LAST:event_BtInserirActionPerformed

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        // TODO add your handling code here:
        
        txt_NameProcess.setText(TabelaDeDadosZero.getValueAt(TabelaDeDadosZero.getSelectedRow(), 0) + "");
        txt_BurstTime.setText(TabelaDeDadosZero.getValueAt(TabelaDeDadosZero.getSelectedRow(), 1) + "");
        txt_Priority.setText(TabelaDeDadosZero.getValueAt(TabelaDeDadosZero.getSelectedRow(), 2) + "");
        
        String process = txt_NameProcess.getText().trim();
        String burstTime = txt_BurstTime.getText().trim();
        String priority = txt_Priority.getText().trim();
        
        
        // Corrigir essa parte do editar
        
        DefaultTableModel dtm = (DefaultTableModel) TabelaDeDadosZero.getModel();
        dtm.addRow(new String[]{process, burstTime, priority});
                
        txt_NameProcess.requestFocus();
    }//GEN-LAST:event_BtEditarActionPerformed

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
        } catch (Exception ex) {
            System.out.println("Erro!");
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaTabelaDeDadosZero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAvancar;
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton BtInserir;
    public javax.swing.JTable TabelaDeDadosZero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_BurstTime;
    private javax.swing.JLabel lbl_NameProcess;
    private javax.swing.JLabel lbl_Priority;
    private javax.swing.JTextField txt_BurstTime;
    private javax.swing.JTextField txt_NameProcess;
    private javax.swing.JTextField txt_Priority;
    // End of variables declaration//GEN-END:variables
}
