/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adriana.oramalho
 */
public class Estoque extends javax.swing.JFrame {

    /**
     * Creates new form Estoque
     */
    public Estoque() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        data = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtValidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQtde = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        data1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtvalidade = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEstoque1 = new javax.swing.JTable();
        btverifivalidade = new javax.swing.JButton();
        tbestoque = new javax.swing.JButton();

        jLabel1.setText("Data:");

        jLabel5.setText("Validade:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estoque");

        jLabel2.setText("Obra:");

        jLabel3.setText("Qtde:");

        txtQtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdeActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLabel6.setText("Data:");

        jLabel7.setText("Validade:");

        tbEstoque1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Obra", "Qtde", "validade"
            }
        ));
        jScrollPane2.setViewportView(tbEstoque1);

        btverifivalidade.setText("Verificar validade");
        btverifivalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btverifivalidadeActionPerformed(evt);
            }
        });

        tbestoque.setText("Verificar estoque");
        tbestoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbestoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtvalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btverifivalidade))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btInserir)
                                .addGap(45, 45, 45)
                                .addComponent(btExcluir)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbestoque)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(data1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btverifivalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInserir)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btExcluir)
                        .addComponent(tbestoque)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here
        if (txtvalidade.getText().trim().isEmpty()) {
         System.err.println("Erro: campo de validade est� vazio!");
         return;
        }
        // formatar a data
        SimpleDateFormat sdfInput1 = new SimpleDateFormat("ddMMyyyy");  
        SimpleDateFormat sdfInput2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfOutput = new SimpleDateFormat("dd/MM/yyyy");
        String dataValidade = txtvalidade.getText();
        Date date = null;
        try {
         date = sdfInput1.parse(dataValidade);
        } catch (ParseException e) {
         try {
         date = sdfInput2.parse(dataValidade);
        } catch (ParseException ex) {
         System.err.println("Erro ao converter data: " + ex.getMessage());
         return;
        }
      }
         String dataFormatada = sdfOutput.format(date);
         // adicionar dados � tabela
         DefaultTableModel Produtos = (DefaultTableModel) tbEstoque1.getModel();
         Object [] dados = {txtItem.getText(), txtQtde.getText(), dataFormatada};
         Produtos.addRow(dados);
        if(txtvalidade.getText().equals(data)){JOptionPane.showMessageDialog(null, "Produto vencido", "Alerta", 1, null);
        }
        
    }//GEN-LAST:event_btInserirActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        if(tbEstoque1.getSelectedRow() != -1){
            DefaultTableModel Produto = (DefaultTableModel) tbEstoque1.getModel();
            Produto.removeRow(tbEstoque1.getSelectedRow());
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtQtdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdeActionPerformed

    private void btverifivalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btverifivalidadeActionPerformed
        // TODO add your handling code here
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
try {
    Date validade = sdf.parse(txtvalidade.getText());
    Date dataAtual = sdf.parse(data1.getText());
    if (validade.equals(dataAtual)) {
        JOptionPane.showMessageDialog(null, "produto vencendo hoje");
    } else if (validade.before(dataAtual)) {
        JOptionPane.showMessageDialog(null, "Produto fora da validade");
    } else if (validade.after(dataAtual)) {
        JOptionPane.showMessageDialog(null, "Produto dentro do prazo de validade");
    }
} catch (ParseException e) {
    System.err.println("Erro ao parsear data: " + e.getMessage());
}
    }//GEN-LAST:event_btverifivalidadeActionPerformed

    private void tbestoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbestoqueActionPerformed
        // TODO add your handling code here:
         DefaultTableModel Produtos = (DefaultTableModel) tbEstoque1.getModel();
        int linhaCount = Produtos.getRowCount();
        double[] coluna1 = new double[linhaCount];
        int LinhaMenor = -1;

        for (int i = 0; i < linhaCount; i++) { 
           double Qtde = Double.parseDouble((String) Produtos.getValueAt(i, 1));
         if(Qtde<=2){
          LinhaMenor = i;
         break;
         }  
        }  
        
        if(LinhaMenor!= -1){
           String LinhaTexto = "na linha " + (LinhaMenor +1) +": ";
        JOptionPane.showMessageDialog(null, "Alerta de Estoque baixo!!!" + LinhaTexto);
        }
    }//GEN-LAST:event_tbestoqueActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btverifivalidade;
    private javax.swing.JTextField data;
    private javax.swing.JTextField data1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbEstoque1;
    private javax.swing.JButton tbestoque;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtQtde;
    private javax.swing.JTextField txtValidade;
    private javax.swing.JTextField txtvalidade;
    // End of variables declaration//GEN-END:variables
}
