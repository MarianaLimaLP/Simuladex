package View.Administrador.Dados;

import Control.ControleAluno;
import Model.Aluno;
import Model.Turma;
import View.Administrador.TelaPrincipalAdministrador;
import java.util.List;
import javax.swing.JOptionPane;

public class DialogDadosAluno extends javax.swing.JDialog {

    ControleAluno controle = new ControleAluno();

    public DialogDadosAluno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Integer getProntuario() {
        System.out.println(ftxtProntuario.getText());
        return Integer.parseInt(ftxtProntuario.getText());
    }

    public void setProntuario(Integer prontuario) {
        this.ftxtProntuario.setText(prontuario.toString());
    }

    public String getSenha() {
        return pfSenha.getText();
    }

    public void setSenha(String senha) {
        this.pfSenha.setText(senha);
    }

    public String getEmail() {
        return txtEmail.getText();
    }

    public void setEmail(String email) {
        this.txtEmail.setText(email);
    }

    public String getNome() {
        return txtNome.getText();
    }

    public void setNome(String nome) {
        this.txtNome.setText(nome);
    }

    public Turma getTurma() {
        return (Turma) cbTurma.getSelectedItem();
    }

    public void setTurma(Turma turma) {
        cbTurma.setSelectedItem(turma);
    }

    public void setTurmas(List<Turma> listaTurma) {

        for (Turma t : listaTurma) {
            cbTurma.addItem(t);
        }
    }

    int acaoo = 0;

    public void setAcao(int acao) {
        switch (acao) {
            case 0:
                dispose();
                break;

            case 1:
                lTituloPrincipal.setText("Cadastrar Aluno");
                bConfirmar.setText("CONFIRMAR CADASTRO");
                bConfirmar.setVisible(true);
                bConfirmar.setEnabled(true);
                acaoo = 1;
                pfSenha.setEchoChar('*');
                ftxtProntuario.setEditable(true);
                txtNome.setEditable(true);
                txtEmail.setEditable(true);
                cbTurma.setEnabled(true);
                pfSenha.setEditable(true);
                break;

            case 2:
                lTituloPrincipal.setText("Editar Aluno");
                bConfirmar.setText("EDITAR ALUNO");
                bConfirmar.setVisible(true);
                bConfirmar.setEnabled(true);
                acaoo = 2;
                pfSenha.setEchoChar('*');
                ftxtProntuario.setEditable(false);
                txtNome.setEditable(true);
                txtEmail.setEditable(true);
                cbTurma.setEnabled(true);
                pfSenha.setEditable(true);
                break;

            case 3:
                lTituloPrincipal.setText("Visualizar Aluno");
                bCancelar.setText("FECHAR");
                bConfirmar.setVisible(false);
                bConfirmar.setEnabled(false);
                acaoo = 3;
                pfSenha.setEchoChar((char) 0);
                ftxtProntuario.setEditable(false);
                txtNome.setEditable(false);
                txtEmail.setEditable(false);
                cbTurma.setEnabled(false);
                pfSenha.setEditable(false);
                break;

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pCadastrar = new javax.swing.JPanel();
        lProntuario1 = new javax.swing.JLabel();
        ftxtProntuario = new javax.swing.JFormattedTextField();
        lNome1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lEmail1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        bConfirmar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        lSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        lTituloPrincipal = new javax.swing.JLabel();
        lTurma = new javax.swing.JLabel();
        cbTurma = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(241, 241, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        pCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        pCadastrar.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        lProntuario1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lProntuario1.setText("Prontuário:");

        try {
            ftxtProntuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtProntuario.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        lNome1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lNome1.setText("Nome Completo:");

        txtNome.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        lEmail1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lEmail1.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        bConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        bConfirmar.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        bConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        bConfirmar.setText("CONFIRMAR");
        bConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmarActionPerformed(evt);
            }
        });

        bCancelar.setBackground(new java.awt.Color(0, 0, 0));
        bCancelar.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        bCancelar.setForeground(new java.awt.Color(255, 255, 255));
        bCancelar.setText("CANCELAR");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        lSenha.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lSenha.setText("Senha:");

        pfSenha.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        lTituloPrincipal.setFont(new java.awt.Font("Gentium Book Basic", 1, 36)); // NOI18N
        lTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTituloPrincipal.setText("Fazer Aluno");

        lTurma.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lTurma.setText("Turma:");

        cbTurma.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        javax.swing.GroupLayout pCadastrarLayout = new javax.swing.GroupLayout(pCadastrar);
        pCadastrar.setLayout(pCadastrarLayout);
        pCadastrarLayout.setHorizontalGroup(
            pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCadastrarLayout.createSequentialGroup()
                        .addComponent(lProntuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ftxtProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pCadastrarLayout.createSequentialGroup()
                        .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pCadastrarLayout.createSequentialGroup()
                                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pCadastrarLayout.createSequentialGroup()
                                        .addComponent(lNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pCadastrarLayout.createSequentialGroup()
                                        .addComponent(lEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pCadastrarLayout.createSequentialGroup()
                                        .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lTurma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 27, Short.MAX_VALUE))
                            .addGroup(pCadastrarLayout.createSequentialGroup()
                                .addComponent(bConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        pCadastrarLayout.setVerticalGroup(
            pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lProntuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(ftxtProntuario))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        if (prontuarioExistente() && acaoo == 1) {
            JOptionPane.showMessageDialog(this, "Um aluno com o mesmo prontuario já existe", "Erro com o Prontuário", JOptionPane.ERROR_MESSAGE);
            ftxtProntuario.requestFocus();
        } else {

            if (!ftxtProntuario.getText().equals("     - ")) {
                if (!txtNome.getText().equals("")) {
                    if (cbTurma.getSelectedIndex() != -1) {
                        if (!pfSenha.getText().equals("")) {

                            Aluno aluno = new Aluno();

                            aluno.setProntuario(Integer.valueOf(ftxtProntuario.getText()));
                            aluno.setNome(txtNome.getText());
                            if (!txtEmail.getText().equals("")) {
                                aluno.setEmail(txtEmail.getText());
                            } else {
                                aluno.setEmail("");
                            }
                            aluno.setTurma((Turma) cbTurma.getSelectedItem());
                            aluno.setSenha(pfSenha.getText());

                            if (acaoo == 1) {
                                controle.adicionar(aluno);
                                JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
                            }
                            if (acaoo == 2) {
                                controle.editar(aluno);
                                JOptionPane.showMessageDialog(this, "Aluno editado com sucesso!");
                            }

                            limparCampos();
                            setVisible(false);

                        } else {
                            JOptionPane.showMessageDialog(this, "Selecione uma Senha!");
                            pfSenha.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Selecione uma Turma!");
                        cbTurma.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira o nome completo!");
                    txtNome.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira o prontuário!");
                ftxtProntuario.requestFocus();
            }
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
        if (acaoo == 3) {
            limparCampos();
            setVisible(false);
        }
    }//GEN-LAST:event_bCancelarActionPerformed

    public Boolean prontuarioExistente() {
        if (controle.listarPorProntuario(Integer.valueOf(ftxtProntuario.getText())).isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    private void limparCampos() {
        ftxtProntuario.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        cbTurma.setSelectedIndex(0);
        pfSenha.setText("");
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
            java.util.logging.Logger.getLogger(TelaPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bConfirmar;
    private javax.swing.JComboBox<Turma> cbTurma;
    private javax.swing.JFormattedTextField ftxtProntuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lEmail1;
    private javax.swing.JLabel lNome1;
    private javax.swing.JLabel lProntuario1;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lTituloPrincipal;
    private javax.swing.JLabel lTurma;
    private javax.swing.JPanel pCadastrar;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
