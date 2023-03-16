/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;
import javax.swing.JOptionPane;
import modelo.ContaPoupanca;
/**
 *
 * @author Usuario
 */
public class TelaConta extends javax.swing.JFrame {
ContaPoupanca contaPoupancaobj = null;
    /**
     * Creates new form TelaConta
     */
    public TelaConta() {
        initComponents();
        this.setLocationRelativeTo(null);
        //DESABILITANDO BOTÕES E CAMPO DE DIGITAÇÃO
        jButton1Depositar.setEnabled(false);
        jButton1Sacar.setEnabled(false);
        jButton1Emitir_Saldo.setEnabled(false);
        jTextField1Espaco_Depositar.setEnabled(false);
        jTextField1Espaco_Sacar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelConta = new javax.swing.JLabel();
        jLabelAgencia = new javax.swing.JLabel();
        jTextFieldEspaco_Nome = new javax.swing.JTextField();
        jTextFieldEspaco_Conta = new javax.swing.JTextField();
        jTextFieldEspaco_Agencia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1SaidaDeDados = new javax.swing.JTextArea();
        jButton1Sacar = new javax.swing.JButton();
        jButton1Criar_Conta = new javax.swing.JButton();
        jTextField1Espaco_Depositar = new javax.swing.JTextField();
        jButton1Emitir_Saldo = new javax.swing.JButton();
        jTextField1Espaco_Sacar = new javax.swing.JTextField();
        jButton1Depositar = new javax.swing.JButton();
        jLabelSaldo = new javax.swing.JLabel();
        jTextFieldEspaco_Saldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1Inicio.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/money.png"))); // NOI18N
        jLabel1.setText("CONTA-POUPANÇA");

        javax.swing.GroupLayout jPanel1InicioLayout = new javax.swing.GroupLayout(jPanel1Inicio);
        jPanel1Inicio.setLayout(jPanel1InicioLayout);
        jPanel1InicioLayout.setHorizontalGroup(
            jPanel1InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1InicioLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1InicioLayout.setVerticalGroup(
            jPanel1InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1InicioLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabelNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNome.setText("NOME:");

        jLabelConta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelConta.setForeground(new java.awt.Color(0, 0, 0));
        jLabelConta.setText("CONTA");

        jLabelAgencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAgencia.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAgencia.setText("AGENCIA");

        jTextFieldEspaco_Nome.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEspaco_Nome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldEspaco_Nome.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldEspaco_Conta.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEspaco_Conta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldEspaco_Conta.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldEspaco_Agencia.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEspaco_Agencia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldEspaco_Agencia.setForeground(new java.awt.Color(0, 0, 0));

        jTextArea1SaidaDeDados.setColumns(20);
        jTextArea1SaidaDeDados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea1SaidaDeDados.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1SaidaDeDados.setRows(5);
        jScrollPane1.setViewportView(jTextArea1SaidaDeDados);

        jButton1Sacar.setBackground(new java.awt.Color(153, 153, 153));
        jButton1Sacar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1Sacar.setForeground(new java.awt.Color(0, 0, 0));
        jButton1Sacar.setText("SACAR");
        jButton1Sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SacarActionPerformed(evt);
            }
        });

        jButton1Criar_Conta.setBackground(new java.awt.Color(153, 153, 153));
        jButton1Criar_Conta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1Criar_Conta.setForeground(new java.awt.Color(0, 0, 0));
        jButton1Criar_Conta.setText("CRIAR CONTA");
        jButton1Criar_Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Criar_ContaActionPerformed(evt);
            }
        });

        jTextField1Espaco_Depositar.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1Espaco_Depositar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextField1Espaco_Depositar.setForeground(new java.awt.Color(0, 0, 0));

        jButton1Emitir_Saldo.setBackground(new java.awt.Color(153, 153, 153));
        jButton1Emitir_Saldo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1Emitir_Saldo.setForeground(new java.awt.Color(0, 0, 0));
        jButton1Emitir_Saldo.setText("EMITIR SALDO");
        jButton1Emitir_Saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Emitir_SaldoActionPerformed(evt);
            }
        });

        jTextField1Espaco_Sacar.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1Espaco_Sacar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextField1Espaco_Sacar.setForeground(new java.awt.Color(0, 0, 0));

        jButton1Depositar.setBackground(new java.awt.Color(153, 153, 153));
        jButton1Depositar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1Depositar.setForeground(new java.awt.Color(0, 0, 0));
        jButton1Depositar.setText("DEPOSITAR");
        jButton1Depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1DepositarActionPerformed(evt);
            }
        });

        jLabelSaldo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSaldo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSaldo.setText("SALDO");

        jTextFieldEspaco_Saldo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEspaco_Saldo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldEspaco_Saldo.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSaldo)
                                    .addComponent(jTextFieldEspaco_Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(413, 413, 413)
                                .addComponent(jButton1Emitir_Saldo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNome)
                                    .addComponent(jLabelAgencia)
                                    .addComponent(jTextFieldEspaco_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEspaco_Agencia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelConta))
                        .addGap(380, 380, 380)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1Espaco_Depositar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1Depositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(49, 49, 49)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1Espaco_Sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1Sacar))
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldEspaco_Conta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(548, Short.MAX_VALUE)
                    .addComponent(jButton1Criar_Conta)
                    .addGap(151, 151, 151)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelNome)
                .addGap(10, 10, 10)
                .addComponent(jTextFieldEspaco_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabelAgencia)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jTextFieldEspaco_Agencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1Sacar)
                            .addComponent(jButton1Depositar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1Espaco_Depositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelConta))
                    .addComponent(jTextField1Espaco_Sacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldEspaco_Conta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEspaco_Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1Emitir_Saldo)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jButton1Criar_Conta)
                    .addContainerGap(437, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1Criar_ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Criar_ContaActionPerformed
        // TODO add your handling code here:
        try {
            contaPoupancaobj = new ContaPoupanca(jTextFieldEspaco_Nome.getText(),
            Integer.parseInt(jTextFieldEspaco_Agencia.getText()),
            Integer.parseInt(jTextFieldEspaco_Conta.getText()),
              Float.parseFloat(jTextFieldEspaco_Saldo.getText()));
        
            //Ordem de desabilitar do espaço de digitação
            jTextFieldEspaco_Nome.setEnabled(false);
            jTextFieldEspaco_Conta.setEnabled(false);
            jTextFieldEspaco_Agencia.setEnabled(false);
            jTextFieldEspaco_Saldo.setEnabled(false);
            //Ordem de habilitar o espaço de digitação dos botões depositar e sacar
            jButton1Depositar.setEnabled(true);
            jButton1Sacar.setEnabled(true);
            jTextField1Espaco_Depositar.setEnabled(true);
            jTextField1Espaco_Sacar.setEnabled(true);
            //Habilita o botão de emitir saldo
            jButton1Emitir_Saldo.setEnabled(true);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton1Criar_ContaActionPerformed

    private void jButton1DepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1DepositarActionPerformed
        // TODO add your handling code here:
        try {
            contaPoupancaobj.depositarDinheiro(Float.parseFloat(jTextField1Espaco_Depositar.getText()));
        } catch (Exception erro) {
        JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton1DepositarActionPerformed

    private void jButton1SacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SacarActionPerformed
        // TODO add your handling code here:
        try {
            contaPoupancaobj.sacarDinheiro(Float.parseFloat(jTextField1Espaco_Sacar.getText()));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton1SacarActionPerformed

    private void jButton1Emitir_SaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Emitir_SaldoActionPerformed
        // TODO add your handling code here:
        jTextArea1SaidaDeDados.setText(
        "DADOS DO CLIENTE: \n"
        + "\nNome: " + contaPoupancaobj.getNomeDoCliente()
        + "\nNúmero da agência: " + contaPoupancaobj.getAgenciaBanco()
        + "\nNúmero da conta: " + contaPoupancaobj.getNumeroDaConta()
        + "\nSaldo: " + contaPoupancaobj.getSaldoConta());
    }//GEN-LAST:event_jButton1Emitir_SaldoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Criar_Conta;
    private javax.swing.JButton jButton1Depositar;
    private javax.swing.JButton jButton1Emitir_Saldo;
    private javax.swing.JButton jButton1Sacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAgencia;
    private javax.swing.JLabel jLabelConta;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1Inicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1SaidaDeDados;
    private javax.swing.JTextField jTextField1Espaco_Depositar;
    private javax.swing.JTextField jTextField1Espaco_Sacar;
    private javax.swing.JTextField jTextFieldEspaco_Agencia;
    private javax.swing.JTextField jTextFieldEspaco_Conta;
    private javax.swing.JTextField jTextFieldEspaco_Nome;
    private javax.swing.JTextField jTextFieldEspaco_Saldo;
    // End of variables declaration//GEN-END:variables
}
