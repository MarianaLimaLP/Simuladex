package View.Administrador.Dados;

import Control.ControleProfessor;
import Model.Professor;
import View.Administrador.DialogProfessor;
import View.Administrador.TelaPrincipalAdministrador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogDadosProfessor extends javax.swing.JDialog {

    ControleProfessor controle = new ControleProfessor();

    public DialogDadosProfessor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public String getTitulacao() {
        return cbTitulacao.getItemAt(cbTitulacao.getSelectedIndex());

    }

    public void setTitulacao(String titulacao) {
        for (int i = 1; i < cbTitulacao.getItemCount(); i++) {
            if (titulacao.equals(cbTitulacao.getItemAt(i))) {
                this.cbTitulacao.setSelectedIndex(i);
            }
        }
    }

    public String getCpf() {
        return ftxtCpf.getText();
    }

    public void setCpf(String cpf) {
        this.ftxtCpf.setText(cpf);
    }

    public String getProntuario() {
        return ftxtProntuario.getText();
    }

    public void setProntuario(String prontuario) {
        this.ftxtProntuario.setText(prontuario);
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

    public boolean getAtua() {
        if (rbSim.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    public void setAtua(boolean atua) {
        if (atua) {
            rbSim.setSelected(true);
        } else {
            rbNao.setSelected(true);
        }
    }

    public boolean getTipo() {
        if (rbCoordenador.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    public void setTipo(boolean tipo) {
        if (tipo) {
            rbCoordenador.setSelected(true);
        } else {
            rbComum.setSelected(true);
        }
    }

    int acaoo = 0;

    public void setAcao(int acao) {
        switch (acao) {
            case 0:
                dispose();
                break;

            case 1:
                lTituloPrincipal.setText("Cadastrar Professor");
                bConfirmar.setText("CONFIRMAR CADASTRO");
                bConfirmar.setVisible(true);
                bConfirmar.setEnabled(true);
                acaoo = 1;
                pfSenha.setEchoChar('*');
                ftxtProntuario.setEditable(true);
                txtNome.setEditable(true);
                ftxtCpf.setEditable(true);
                txtEmail.setEditable(true);
                rbSim.setEnabled(true);
                rbNao.setEnabled(true);
                cbTitulacao.setEnabled(true);
                rbComum.setEnabled(true);
                rbCoordenador.setEnabled(true);
                pfSenha.setEditable(true);
                break;

            case 2:
                lTituloPrincipal.setText("Editar Professor");
                bConfirmar.setText("EDITAR PROFESSOR");
                bConfirmar.setVisible(true);
                bConfirmar.setEnabled(true);
                acaoo = 2;
                pfSenha.setEchoChar('*');
                ftxtProntuario.setEditable(false);
                txtNome.setEditable(true);
                ftxtCpf.setEditable(true);
                txtEmail.setEditable(true);
                rbSim.setEnabled(true);
                rbNao.setEnabled(true);
                cbTitulacao.setEnabled(true);
                rbComum.setEnabled(true);
                rbCoordenador.setEnabled(true);
                pfSenha.setEditable(true);
                break;

            case 3:
                lTituloPrincipal.setText("Visualizar Professor");
                bCancelar.setText("FECHAR");
                bConfirmar.setVisible(false);
                bConfirmar.setEnabled(false);
                acaoo = 3;
                pfSenha.setEchoChar((char) 0);
                ftxtProntuario.setEditable(false);
                txtNome.setEditable(false);
                ftxtCpf.setEditable(false);
                txtEmail.setEditable(false);
                rbSim.setEnabled(false);
                rbNao.setEnabled(false);
                cbTitulacao.setEnabled(false);
                rbComum.setEnabled(false);
                rbCoordenador.setEnabled(false);
                pfSenha.setEditable(false);

                break;

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAtua = new javax.swing.ButtonGroup();
        bgTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pCadastrar = new javax.swing.JPanel();
        lProntuario1 = new javax.swing.JLabel();
        ftxtProntuario = new javax.swing.JFormattedTextField();
        lNome1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lCpf1 = new javax.swing.JLabel();
        ftxtCpf = new javax.swing.JFormattedTextField();
        lEmail1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lAtua1 = new javax.swing.JLabel();
        lTitulacao1 = new javax.swing.JLabel();
        lTipo1 = new javax.swing.JLabel();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        cbTitulacao = new javax.swing.JComboBox<>();
        rbComum = new javax.swing.JRadioButton();
        rbCoordenador = new javax.swing.JRadioButton();
        bConfirmar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        lSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        lTituloPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        pCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        pCadastrar.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        lProntuario1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lProntuario1.setText("Prontuário:");

        try {
            ftxtProntuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtProntuario.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        lNome1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lNome1.setText("Nome Completo:");

        txtNome.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        lCpf1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lCpf1.setText("CPF:");

        try {
            ftxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCpf.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        lEmail1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lEmail1.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        lAtua1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lAtua1.setText("Leciona Atualmente");

        lTitulacao1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lTitulacao1.setText("Titulação:");

        lTipo1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lTipo1.setText("Tipo:");

        bgAtua.add(rbSim);
        rbSim.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        rbSim.setText("Sim");

        bgAtua.add(rbNao);
        rbNao.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        rbNao.setText("Não");

        cbTitulacao.setEditable(true);
        cbTitulacao.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        cbTitulacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Título", "Graduado", "Especialista", "Mestre", "Doutor", "Pós-Doutor", "Livre-Docente" }));

        bgTipo.add(rbComum);
        rbComum.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        rbComum.setText("Comum");

        bgTipo.add(rbCoordenador);
        rbCoordenador.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        rbCoordenador.setText("Coordenador");

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
        bCancelar.setForeground(new java.awt.Color(255, 255, 225));
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
        lTituloPrincipal.setText("Fazer Professor");

        javax.swing.GroupLayout pCadastrarLayout = new javax.swing.GroupLayout(pCadastrar);
        pCadastrar.setLayout(pCadastrarLayout);
        pCadastrarLayout.setHorizontalGroup(
            pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pCadastrarLayout.createSequentialGroup()
                        .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCadastrarLayout.createSequentialGroup()
                                .addComponent(bConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pCadastrarLayout.createSequentialGroup()
                                .addComponent(lSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pCadastrarLayout.createSequentialGroup()
                                .addComponent(lProntuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ftxtProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pCadastrarLayout.createSequentialGroup()
                                    .addComponent(lEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEmail))
                                .addGroup(pCadastrarLayout.createSequentialGroup()
                                    .addComponent(lCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ftxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pCadastrarLayout.createSequentialGroup()
                                    .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lTipo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lTitulacao1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lAtua1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pCadastrarLayout.createSequentialGroup()
                                            .addComponent(rbComum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbCoordenador, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pCadastrarLayout.createSequentialGroup()
                                            .addComponent(rbSim, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbNao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pCadastrarLayout.createSequentialGroup()
                                .addComponent(lNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pCadastrarLayout.setVerticalGroup(
            pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pCadastrarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lProntuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addComponent(ftxtProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ftxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lAtua1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbSim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbNao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTitulacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lTipo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbCoordenador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbComum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        if (prontuarioExistente() && acaoo == 1) {
            JOptionPane.showMessageDialog(this, "Um professor com o mesmo prontuario já existe", "Erro com o Prontuário", JOptionPane.ERROR_MESSAGE);
            ftxtProntuario.requestFocus();
        } else {
            if (!ftxtProntuario.getText().equals("     - ")) {
                if (!txtNome.getText().equals("")) {
                    if (!ftxtCpf.getText().equals("   .   .   -  ")) {
                        if (!txtEmail.getText().equals("")) {
                            if (rbNao.isSelected() || rbSim.isSelected()) {
                                if (cbTitulacao.getSelectedIndex() != 0) {
                                    if (rbComum.isSelected() || rbCoordenador.isSelected()) {
                                        if (!pfSenha.getText().equals("")) {

                                            Professor prof = new Professor();

                                            prof.setProntuario(ftxtProntuario.getText());
                                            prof.setNome(txtNome.getText());
                                            prof.setCpf(ftxtCpf.getText());
                                            prof.setEmail(txtEmail.getText());
                                            prof.setTitulacao(cbTitulacao.getSelectedItem().toString());
                                            prof.setSenha(pfSenha.getText());

                                            if (rbSim.isSelected()) {
                                                prof.setAtua(true);
                                            } else {
                                                prof.setAtua(false);
                                            }

                                            if (rbCoordenador.isSelected()) {
                                                prof.setCoord_prof(true);
                                            } else {
                                                prof.setCoord_prof(false);
                                            }

                                            if (acaoo == 1) {
                                                controle.adicionar(prof);
                                                JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
                                            }
                                            if (acaoo == 2) {
                                                controle.editar(prof);
                                                JOptionPane.showMessageDialog(null, "Professor editado com sucesso!");
                                            }

                                            limparCampos();
                                            setVisible(false);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "Por favor, insira a senha!");
                                            pfSenha.requestFocus();
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Por favor, selecione se o professor é do tipo coordenador ou comum!");
                                        rbComum.requestFocus();
                                        rbCoordenador.requestFocus();
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Por favor, selecione a titulação!");
                                    cbTitulacao.requestFocus();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Por favor, selecione se o professor leciona atualmente ou está de licença!");
                                rbSim.requestFocus();
                                rbNao.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor, insira o email!");
                            txtEmail.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, insira o CPF!");
                        ftxtCpf.requestFocus();
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
        if (controle.listarPorProntuario(ftxtProntuario.getText()).isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    private void limparCampos() {
        ftxtProntuario.setText("");
        txtNome.setText("");
        ftxtCpf.setText("");
        txtEmail.setText("");
        bgAtua.clearSelection();
        cbTitulacao.setSelectedIndex(0);
        bgTipo.clearSelection();
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
    private javax.swing.ButtonGroup bgAtua;
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JComboBox<String> cbTitulacao;
    private javax.swing.JFormattedTextField ftxtCpf;
    private javax.swing.JFormattedTextField ftxtProntuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAtua1;
    private javax.swing.JLabel lCpf1;
    private javax.swing.JLabel lEmail1;
    private javax.swing.JLabel lNome1;
    private javax.swing.JLabel lProntuario1;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lTipo1;
    private javax.swing.JLabel lTitulacao1;
    private javax.swing.JLabel lTituloPrincipal;
    private javax.swing.JPanel pCadastrar;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JRadioButton rbComum;
    private javax.swing.JRadioButton rbCoordenador;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
