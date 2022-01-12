package View.Professor;

import Control.ControleDisciplina;
import Control.ControleQuestao;
import Model.Disciplina;
import Model.Questao;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class TelaDadosQuestao extends javax.swing.JFrame {

    ControleQuestao controle = new ControleQuestao();
    ControleDisciplina controleDisciplina = new ControleDisciplina();

    public TelaDadosQuestao() {
        initComponents();
    }

    public void setDisciplinas(List<Disciplina> listaDisciplina) {
        for (Disciplina d : listaDisciplina) {
            cbDisciplina.addItem(d);
        }
    }

    private int id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Disciplina getDisciplina() {
        return (Disciplina) cbDisciplina.getSelectedItem();

    }

    public void setDisciplina(Disciplina d) {
        cbDisciplina.setSelectedItem(d);
    }

    public String getAlternativaCorreta() {
        return cbAlternativaCorreta.getSelectedItem().toString();
    }

    public void setAlternativaCorreta(String altCorreta) {
        cbAlternativaCorreta.setSelectedItem(altCorreta);
    }

    public JTextPane getTxpExplicacao() {
        return txpExplicacao;
    }

    public void setTxpExplicacao(JTextPane txpExplicacao) {
        this.txpExplicacao = txpExplicacao;
    }

    public JTextPane getTxpQuestao() {
        return txpQuestao;
    }

    public void setTxpQuestao(JTextPane txpQuestao) {
        this.txpQuestao = txpQuestao;
    }

    int acaoo = 0;

    public void setAcao(int acao) {
        switch (acao) {
            case 0:
                dispose();
                break;

            case 1:
                lTitulo.setText("Adicionar Questão");
                bConfirmar.setText("CONFIRMAR QUESTÃO");
                acaoo = 1;
                break;

            case 2:
                lTitulo.setText("Editar Questão");
                bConfirmar.setText("EDITAR QUESTÃO");
                acaoo = 2;
                break;

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txpQuestao = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txpExplicacao = new javax.swing.JTextPane();
        cbAlternativaCorreta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbDisciplina = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        altA = new javax.swing.JTextField();
        altB = new javax.swing.JTextField();
        altC = new javax.swing.JTextField();
        altD = new javax.swing.JTextField();
        altE = new javax.swing.JTextField();
        bConfirmar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFundo.setBackground(new java.awt.Color(241, 241, 255));
        pFundo.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lTitulo.setFont(new java.awt.Font("Gentium Book Basic", 1, 48)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Fazer Questão");

        jLabel1.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        jLabel1.setText("Digite a Questão:");

        jLabel2.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        jLabel2.setText("Selecione a alternativa correta:");

        jLabel3.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        jLabel3.setText("Explicação da Questão:");

        txpQuestao.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(txpQuestao);

        txpExplicacao.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(txpExplicacao);

        cbAlternativaCorreta.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        cbAlternativaCorreta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " a", " b", " c", " d", " e" }));
        cbAlternativaCorreta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        jLabel4.setText("Selecione a Disciplina:");

        cbDisciplina.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        jLabel5.setText("Escreva as alternativas em ordem:");

        altA.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        altA.setText("a.");

        altB.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        altB.setText("b.");

        altC.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        altC.setText("c.");

        altD.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        altD.setText("d.");

        altE.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        altE.setText("e.");

        bConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        bConfirmar.setFont(new java.awt.Font("Gentium Book Basic", 0, 30)); // NOI18N
        bConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        bConfirmar.setText("Confirmar");
        bConfirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        bConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmarActionPerformed(evt);
            }
        });

        bCancelar.setBackground(new java.awt.Color(0, 0, 0));
        bCancelar.setFont(new java.awt.Font("Gentium Book Basic", 0, 30)); // NOI18N
        bCancelar.setForeground(new java.awt.Color(255, 255, 255));
        bCancelar.setText("Cancelar");
        bCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(bConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbAlternativaCorreta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(altA, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(altB, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(altC, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(altD, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(altE, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbAlternativaCorreta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(altA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(altB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(altC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(altD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(altE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(bConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pFundoLayout = new javax.swing.GroupLayout(pFundo);
        pFundo.setLayout(pFundoLayout);
        pFundoLayout.setHorizontalGroup(
            pFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFundoLayout.createSequentialGroup()
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

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        if (cbDisciplina.getSelectedIndex() != -1) {
            if (txpQuestao.getText() != "" || txpQuestao.getText().length() <= 5000) {
                if (txpExplicacao.getText() != "" || txpExplicacao.getText().length() <= 5000) {
                    if (altA.getText() != "" || altA.getText() == "a." || altA.getText().length() <= 1000) {
                        if (altB.getText() != "" || altB.getText() == "b." || altB.getText().length() <= 1000) {
                            if (altC.getText() != "" || altC.getText() == "c." || altC.getText().length() <= 1000) {
                                if (altD.getText() != "" || altD.getText() == "d." || altD.getText().length() <= 1000) {
                                    if (altE.getText() != "" || altE.getText() == "e." || altE.getText().length() <= 1000) {
                                        Questao q = new Questao();

                                        q.setDisciplina((Disciplina) cbDisciplina.getSelectedItem());
                                        q.setDescricao(txpQuestao.getText());
                                        q.setExplicacao(txpExplicacao.getText());
                                        if(cbAlternativaCorreta.getSelectedIndex()==0){
                                            q.setRespostaCorreta("a");
                                        } else if(cbAlternativaCorreta.getSelectedIndex()==1){
                                            q.setRespostaCorreta("b");
                                        } else if(cbAlternativaCorreta.getSelectedIndex()==2){
                                            q.setRespostaCorreta("c");
                                        } else if(cbAlternativaCorreta.getSelectedIndex()==3){
                                            q.setRespostaCorreta("d");
                                        } else if(cbAlternativaCorreta.getSelectedIndex()==4){
                                            q.setRespostaCorreta("e");
                                        }
                                        
                                        q.setAltA(altA.getText());
                                        q.setAltB(altB.getText());
                                        q.setAltC(altC.getText());
                                        q.setAltD(altD.getText());
                                        q.setAltE(altE.getText());
                                        
                                        if (acaoo == 1) {
                                            controle.adicionar(q);
                                            JOptionPane.showMessageDialog(null, "Questao cadastrada com sucesso!");
                                        }
                                        if (acaoo == 2) {
                                            q.setIdQuestao(getId());
                                            controle.editar(q);
                                            JOptionPane.showMessageDialog(null, "Questao editada com sucesso!");
                                        }
                                        
                                        limparCampos();
                                        setVisible(false);
                                    } else {

                                        if (altE.getText().length() > 5000) {
                                            JOptionPane.showMessageDialog(null, "Por favor, digite a alternativa E menor!");
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Por favor, digite a alternativa E!");
                                            altE.requestFocus();
                                        }
                                    }
                                } else {

                                    if (altD.getText().length() > 5000) {
                                        JOptionPane.showMessageDialog(null, "Por favor, digite a alternativa D menor!");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Por favor, digite a alternativa D!");
                                        altD.requestFocus();
                                    }
                                }
                            } else {

                                if (altC.getText().length() > 5000) {
                                    JOptionPane.showMessageDialog(null, "Por favor, digite a alternativa C menor!");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Por favor, digite a alternativa C!");
                                    altC.requestFocus();
                                }
                            }
                        } else {

                            if (altB.getText().length() > 5000) {
                                JOptionPane.showMessageDialog(null, "Por favor, digite a alternativa B menor!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Por favor, digite a alternativa B!");
                                altB.requestFocus();
                            }
                        }
                    } else {

                        if (altA.getText().length() > 5000) {
                            JOptionPane.showMessageDialog(null, "Por favor, digite a alternativa A menor!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor, digite a alternativa A!");
                            altA.requestFocus();
                        }
                        
                    }
                } else {

                    if (txpExplicacao.getText() != "") {
                        JOptionPane.showMessageDialog(null, "Por favor, digite a explicacao da questão!");
                    }
                    if (txpExplicacao.getText().length() > 5000) {
                        JOptionPane.showMessageDialog(null, "Por favor, digite uma explicação menor!");
                    }
                    txpExplicacao.requestFocus();
                }
            } else {
                if (txpQuestao.getText() != "") {
                    JOptionPane.showMessageDialog(null, "Por favor, digite a questao!");
                }

                if (txpQuestao.getText().length() > 5000) {
                    JOptionPane.showMessageDialog(null, "Por favor, digite uma questao menor!");
                }

                txpQuestao.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione a disciplina!");
            cbDisciplina.requestFocus();
        }
    }//GEN-LAST:event_bConfirmarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        if (acaoo == 1) {
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar o cadastro? Os dados atuais não serão salvos.", "Cancelar Cadastro", 0) == 0) {
                limparCampos();
                setVisible(false);
            };
        }
        if (acaoo == 2) {
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar? Os dados atuais não serão salvos.", "Cancelar", 0) == 0) {
                limparCampos();
                setVisible(false);
            };
        }
    }//GEN-LAST:event_bCancelarActionPerformed

    private void limparCampos() {
        cbDisciplina.setSelectedIndex(0);
        cbAlternativaCorreta.setSelectedIndex(0);
        altA.setText("");
        altB.setText("");
        altC.setText("");
        altD.setText("");
        altE.setText("");
        txpQuestao.setText("");
        txpExplicacao.setText("");
    }

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
            java.util.logging.Logger.getLogger(TelaDadosQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDadosQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDadosQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDadosQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDadosQuestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altA;
    private javax.swing.JTextField altB;
    private javax.swing.JTextField altC;
    private javax.swing.JTextField altD;
    private javax.swing.JTextField altE;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bConfirmar;
    private javax.swing.JComboBox<String> cbAlternativaCorreta;
    private javax.swing.JComboBox<Disciplina> cbDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JPanel pFundo;
    private javax.swing.JTextPane txpExplicacao;
    private javax.swing.JTextPane txpQuestao;
    // End of variables declaration//GEN-END:variables
}
