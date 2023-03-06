/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

/**
 *
 * @author Usuario
 */
public class Imc extends javax.swing.JFrame {

    /**
     * Creates new form Imc
     */
    public Imc() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
//ATALHO PARA FORMATAR ALT + SHIFT + F
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Titulo = new javax.swing.JPanel();
        jLabel1Imctitulo = new javax.swing.JLabel();
        jLabel1Altura = new javax.swing.JLabel();
        jTextField1Campotextoaltura = new javax.swing.JTextField();
        jLabel1Nome = new javax.swing.JLabel();
        jTextField1Campotextonome1 = new javax.swing.JTextField();
        jLabel1Peso1 = new javax.swing.JLabel();
        jTextField1Campotextopeso1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Informacoes = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1Titulo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1Titulo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1Imctitulo.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1Imctitulo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1Imctitulo.setText("    ÍNDICE DE MASSA CORPÓREA");

        javax.swing.GroupLayout jPanel1TituloLayout = new javax.swing.GroupLayout(jPanel1Titulo);
        jPanel1Titulo.setLayout(jPanel1TituloLayout);
        jPanel1TituloLayout.setHorizontalGroup(
            jPanel1TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1TituloLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1Imctitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1TituloLayout.setVerticalGroup(
            jPanel1TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1TituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1Imctitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1Altura.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Altura.setText("Altura");

        jTextField1Campotextoaltura.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1Nome.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1Nome.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Nome.setText("Nome:");

        jTextField1Campotextonome1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1Peso1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Peso1.setText("Peso:");

        jTextField1Campotextopeso1.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea1Informacoes.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1Informacoes.setColumns(20);
        jTextArea1Informacoes.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextArea1Informacoes.setRows(5);
        jTextArea1Informacoes.setText("Obrigado e volte sempre!");
        jScrollPane1.setViewportView(jTextArea1Informacoes);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setText("Calcular IMC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1Campotextonome1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1Campotextopeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1Campotextoaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jLabel1Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(786, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1Campotextonome1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jButton1)
                .addGap(5, 5, 5)
                .addComponent(jTextField1Campotextopeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1Campotextoaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(jLabel1Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(217, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String str1 = jTextField1Campotextonome1.getText();
        String str2 = jTextArea1Informacoes.getText();
        int peso = Integer.parseInt(jTextField1Campotextopeso1.getText());
        float altura = Float.parseFloat(jTextField1Campotextoaltura.getText());
        double imc = peso / (altura * altura);

        String saida = "Dados digitados nos campos: \n";
        saida += "Nome:  " + str1 + "\n";
        saida += "Peso: " + peso + "\n";
        saida += "Altura: " + altura + "\n";
        saida += "Cálculo do IMC " + imc + "\n";
        
        saida += "   " + str2 + "\n";

        jTextArea1Informacoes.setText(saida);

        jTextField1Campotextonome1.setText(" ");
        jTextField1Campotextopeso1.setText(" ");
        jTextField1Campotextoaltura.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1Altura;
    private javax.swing.JLabel jLabel1Imctitulo;
    private javax.swing.JLabel jLabel1Nome;
    private javax.swing.JLabel jLabel1Peso1;
    private javax.swing.JPanel jPanel1Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1Informacoes;
    private javax.swing.JTextField jTextField1Campotextoaltura;
    private javax.swing.JTextField jTextField1Campotextonome1;
    private javax.swing.JTextField jTextField1Campotextopeso1;
    // End of variables declaration//GEN-END:variables
}