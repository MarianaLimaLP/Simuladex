
package View.Professor;

import Control.ControleProfessor;
import Control.ControleQuestao;
import javax.swing.JOptionPane;

public class TelaPrincipalProfessorCoordenador extends javax.swing.JFrame {

    public TelaPrincipalProfessorCoordenador() {
        initComponents();
    }
    
    ControleProfessor controleProfessor = new ControleProfessor();
    ControleQuestao controleQuestao = new ControleQuestao();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        pProva = new javax.swing.JPanel();
        bMontarProvas = new javax.swing.JButton();
        lProva = new javax.swing.JLabel();
        pQuestao = new javax.swing.JPanel();
        bQuestoes = new javax.swing.JButton();
        lQuestao = new javax.swing.JLabel();
        bSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFundo.setBackground(new java.awt.Color(241, 241, 255));
        pFundo.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lTitulo.setFont(new java.awt.Font("Gentium Book Basic", 1, 48)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Bem Vindo Coordenador!");

        pProva.setBackground(new java.awt.Color(51, 51, 51));

        bMontarProvas.setBackground(new java.awt.Color(255, 255, 255));
        bMontarProvas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-arquivoVazio.png"))); // NOI18N
        bMontarProvas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bMontarProvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMontarProvasActionPerformed(evt);
            }
        });

        lProva.setFont(new java.awt.Font("Gentium Book Basic", 0, 36)); // NOI18N
        lProva.setForeground(new java.awt.Color(255, 255, 255));
        lProva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lProva.setText("PROVAS");

        javax.swing.GroupLayout pProvaLayout = new javax.swing.GroupLayout(pProva);
        pProva.setLayout(pProvaLayout);
        pProvaLayout.setHorizontalGroup(
            pProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pProvaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lProva, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(bMontarProvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pProvaLayout.setVerticalGroup(
            pProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProvaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bMontarProvas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lProva, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        pQuestao.setBackground(new java.awt.Color(51, 51, 51));

        bQuestoes.setBackground(new java.awt.Color(255, 255, 255));
        bQuestoes.setFont(new java.awt.Font("JasmineUPC", 1, 30)); // NOI18N
        bQuestoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-questao.png"))); // NOI18N
        bQuestoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bQuestoes.setHideActionText(true);
        bQuestoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bQuestoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuestoesActionPerformed(evt);
            }
        });

        lQuestao.setFont(new java.awt.Font("Gentium Book Basic", 0, 36)); // NOI18N
        lQuestao.setForeground(new java.awt.Color(255, 255, 255));
        lQuestao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lQuestao.setText("QUESTÕES");

        javax.swing.GroupLayout pQuestaoLayout = new javax.swing.GroupLayout(pQuestao);
        pQuestao.setLayout(pQuestaoLayout);
        pQuestaoLayout.setHorizontalGroup(
            pQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pQuestaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lQuestao, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(bQuestoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pQuestaoLayout.setVerticalGroup(
            pQuestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pQuestaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bQuestoes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        bSair.setBackground(new java.awt.Color(0, 0, 0));
        bSair.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        bSair.setForeground(new java.awt.Color(255, 255, 255));
        bSair.setText("SAIR");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pProva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pProva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pQuestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pFundoLayout = new javax.swing.GroupLayout(pFundo);
        pFundo.setLayout(pFundoLayout);
        pFundoLayout.setHorizontalGroup(
            pFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pFundoLayout.setVerticalGroup(
            pFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bMontarProvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMontarProvasActionPerformed
        TelaProva telaProva = new TelaProva();
        if(controleQuestao.listarTodas().isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhuma questão cadastrada", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            telaProva.atualizarTabela();
            telaProva.setVisible(true);
        }
    }//GEN-LAST:event_bMontarProvasActionPerformed

    private void bQuestoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuestoesActionPerformed
        TelaQuestao telaQuestao = new TelaQuestao();
        telaQuestao.atualizarTabela();
        telaQuestao.setVisible(true);
    }//GEN-LAST:event_bQuestoesActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        controleProfessor.logoutProf();
        setVisible(false);
    }//GEN-LAST:event_bSairActionPerformed
    public void setTitulo(){
        lTitulo.setText("Bem Vindo(a) "+controleProfessor.getProfLogado().getNome()+"!!");
    }
    
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
            java.util.logging.Logger.getLogger(TelaPrincipalProfessorCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalProfessorCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalProfessorCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalProfessorCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalProfessorCoordenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMontarProvas;
    private javax.swing.JButton bQuestoes;
    private javax.swing.JButton bSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lProva;
    private javax.swing.JLabel lQuestao;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JPanel pFundo;
    private javax.swing.JPanel pProva;
    private javax.swing.JPanel pQuestao;
    // End of variables declaration//GEN-END:variables
}
