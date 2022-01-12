package View.Administrador;

import Control.ControleAluno;
import Control.ControleTurma;
import Model.Aluno;
import Model.Turma;
import View.Administrador.Dados.DialogDadosAluno;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogAluno extends javax.swing.JDialog {

    
    
    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private DefaultTableModel modeloTabela;
    
    ControleAluno controle = new ControleAluno();
    ControleTurma controleTurma = new ControleTurma();
    
    Aluno curso = new Aluno();
    
    private ArrayList<Aluno> listaAluno = new ArrayList<>();
    
    
    public DialogAluno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    Aluno alunoSelecionado = new Aluno();
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pPrincipal = new javax.swing.JPanel();
        lTitulo2 = new javax.swing.JLabel();
        bAtualizar = new javax.swing.JButton();
        bCadastrarPrincipal1 = new javax.swing.JButton();
        lPesquisar = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        cbPesquisarPor = new javax.swing.JComboBox<>();
        bPesquisar = new javax.swing.JButton();
        bExcluirPrincipal = new javax.swing.JButton();
        bEditarPrincipal = new javax.swing.JButton();
        bVisualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        pPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        pPrincipal.setPreferredSize(new java.awt.Dimension(800, 605));

        lTitulo2.setFont(new java.awt.Font("Gentium Book Basic", 1, 48)); // NOI18N
        lTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-estudante.png"))); // NOI18N
        lTitulo2.setText("Alunos");

        bAtualizar.setBackground(new java.awt.Color(0, 0, 0));
        bAtualizar.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        bAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        bAtualizar.setText("Atualizar Tabela");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        bCadastrarPrincipal1.setBackground(new java.awt.Color(0, 0, 0));
        bCadastrarPrincipal1.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        bCadastrarPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        bCadastrarPrincipal1.setText("Cadastrar Aluno");
        bCadastrarPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarPrincipal1ActionPerformed(evt);
            }
        });

        lPesquisar.setFont(new java.awt.Font("Gentium Book Basic", 1, 12)); // NOI18N
        lPesquisar.setText("Pesquisar:");

        txtPesquisa.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N

        cbPesquisarPor.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        cbPesquisarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um item", "Prontuário", "Nome" }));

        bPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        bPesquisar.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        bPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        bPesquisar.setText("Pesquisar");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        bExcluirPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        bExcluirPrincipal.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        bExcluirPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        bExcluirPrincipal.setText("Excluir");
        bExcluirPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirPrincipalActionPerformed(evt);
            }
        });

        bEditarPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        bEditarPrincipal.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        bEditarPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        bEditarPrincipal.setText("Editar");
        bEditarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarPrincipalActionPerformed(evt);
            }
        });

        bVisualizar.setBackground(new java.awt.Color(0, 0, 0));
        bVisualizar.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        bVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        bVisualizar.setText("Visualizar");
        bVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVisualizarActionPerformed(evt);
            }
        });

        tabela.setBackground(new java.awt.Color(0, 0, 0));
        tabela.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        tabela.setForeground(new java.awt.Color(255, 255, 255));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prontuário", "Nome", "Turma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pPrincipalLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbPesquisarPor, 0, 132, Short.MAX_VALUE)
                                        .addComponent(bPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pPrincipalLayout.createSequentialGroup()
                                    .addComponent(bCadastrarPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(bEditarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(bVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(bExcluirPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bEditarPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCadastrarPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bVisualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bExcluirPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bPesquisar)
                        .addGap(32, 32, 32)
                        .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
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

    private void bCadastrarPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarPrincipal1ActionPerformed
        DialogDadosAluno telaDados = new DialogDadosAluno(null, true);
        telaDados.setAcao(1);
        
        telaDados.setTurmas(controleTurma.listarTodas());

        telaDados.setVisible(true);
        atualizarTabela();
    }//GEN-LAST:event_bCadastrarPrincipal1ActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        if(cbPesquisarPor.getSelectedIndex()==0||txtPesquisa.getText().equals("")){
            if(cbPesquisarPor.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(this, "Selecione uma forma de busca!");
            }
            
            if(txtPesquisa.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Digite algo para fazer a busca!");
            }
        } else {
            if(cbPesquisarPor.getSelectedIndex()==1){
                if(txtPesquisa.getText().matches("[0-9]*")){
                    atualizarTabelaPorProntuario();
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ao buscar por prontuário coloque apenas números!");
                }
            } else {
                atualizarTabelaPorNome();
            }
        }
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVisualizarActionPerformed
        DialogDadosAluno telaDados = new DialogDadosAluno(null, true);
        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione um aluno da tabela para visualizar!");

        } else {
            alunoSelecionado = listaAluno.get(linha);
            telaDados.setAcao(3);
            
            telaDados.setProntuario(alunoSelecionado.getProntuario());
            telaDados.setNome(alunoSelecionado.getNome());
            telaDados.setEmail(alunoSelecionado.getEmail());
            telaDados.setTurma(alunoSelecionado.getTurma());
            telaDados.setSenha(alunoSelecionado.getSenha());
            
            telaDados.setTurmas(controleTurma.listarTodas());

            telaDados.setVisible(true);

            atualizarTabela();
        }
    }//GEN-LAST:event_bVisualizarActionPerformed

    private void bEditarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarPrincipalActionPerformed
        DialogDadosAluno telaDados = new DialogDadosAluno(null, true);

        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione um curso da tabela para editar!");

        } else {
            alunoSelecionado = listaAluno.get(linha);
            telaDados.setAcao(2);
            
            telaDados.setProntuario(alunoSelecionado.getProntuario());
            telaDados.setNome(alunoSelecionado.getNome());
            telaDados.setEmail(alunoSelecionado.getEmail());
            telaDados.setTurma(alunoSelecionado.getTurma());
            telaDados.setSenha(alunoSelecionado.getSenha());
            
            telaDados.setTurmas(controleTurma.listarTodas());
            
            telaDados.setVisible(true);
            atualizarTabela();
        }
    }//GEN-LAST:event_bEditarPrincipalActionPerformed

    private void bExcluirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirPrincipalActionPerformed
        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione um curso da tabela para excluir!");

        } else {
            alunoSelecionado = listaAluno.get(linha);
            if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este aluno?\n" + alunoSelecionado.getNome(), "Confirmar remoção",0)==0){
                controle.remover(alunoSelecionado);
                JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso!");
            };
            atualizarTabela();
        }
    }//GEN-LAST:event_bExcluirPrincipalActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void atualizarTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaAluno.clear();
        
        listaAluno.addAll(controle.listarTodas());
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Aluno a: listaAluno)
        {
            modelo.addRow(new Object[]{a.getProntuario(), a.getNome(), a.getTurma()});
        }
    }
    
    public void atualizarTabelaPorProntuario()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaAluno.clear();
        
        listaAluno.addAll(controle.listarPorProntuario(Integer.valueOf(txtPesquisa.getText())));
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Aluno a: listaAluno)
        {
            modelo.addRow(new Object[]{a.getProntuario(), a.getNome(), a.getTurma()});
        }
    }
    
    public void atualizarTabelaPorNome()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaAluno.clear();
        
        listaAluno.addAll(controle.listarPorNome(txtPesquisa.getText()));
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Aluno a: listaAluno)
        {
            modelo.addRow(new Object[]{a.getProntuario(), a.getNome(), a.getTurma()});
        }
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
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bCadastrarPrincipal1;
    private javax.swing.JButton bEditarPrincipal;
    private javax.swing.JButton bExcluirPrincipal;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bVisualizar;
    private javax.swing.JComboBox<String> cbPesquisarPor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lPesquisar;
    private javax.swing.JLabel lTitulo2;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
