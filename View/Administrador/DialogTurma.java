/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Administrador;

import Model.Curso;
import Control.ControleCurso;
import Control.ControleTurma;
import Model.Turma;
import View.Administrador.Dados.DialogDadosTurma;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogTurma extends javax.swing.JDialog {

    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private DefaultTableModel modeloTabela;

    ControleTurma controle = new ControleTurma();
    Turma turma = new Turma();

    private ArrayList<Turma> listaTurma = new ArrayList<>();

    public DialogTurma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    Turma turmaSelecionada = new Turma();

    ControleCurso controleCurso = new ControleCurso();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        bExcluirPrincipal = new javax.swing.JButton();
        bEditarPrincipal = new javax.swing.JButton();
        bVisualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        pPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        pPrincipal.setPreferredSize(new java.awt.Dimension(800, 605));

        lTitulo2.setFont(new java.awt.Font("Gentium Book Basic", 1, 48)); // NOI18N
        lTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-turma.png"))); // NOI18N
        lTitulo2.setText("Turmas");

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
        bCadastrarPrincipal1.setText("Cadastrar Turma");
        bCadastrarPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarPrincipal1ActionPerformed(evt);
            }
        });

        lPesquisar.setFont(new java.awt.Font("Gentium Book Basic", 1, 12)); // NOI18N
        lPesquisar.setText("Pesquisar:");

        txtPesquisa.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N

        cbPesquisarPor.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        cbPesquisarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um item", "Série" }));

        bPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        bPesquisar.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        bPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        bPesquisar.setText("Pesquisar");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        tabela.setBackground(new java.awt.Color(0, 0, 0));
        tabela.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        tabela.setForeground(new java.awt.Color(255, 255, 255));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Curso", "Série"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pPrincipalLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pPrincipalLayout.createSequentialGroup()
                                        .addComponent(lPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pPrincipalLayout.createSequentialGroup()
                                .addComponent(bCadastrarPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bEditarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bExcluirPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bExcluirPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bEditarPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCadastrarPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPesquisar)
                        .addGap(34, 34, 34)
                        .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVisualizarActionPerformed
        DialogDadosTurma telaDados = new DialogDadosTurma(null, true);

        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione uma turma da tabela para visualizar!");

        } else {
            telaDados.setAcao(3);

            turmaSelecionada = listaTurma.get(linha);

            telaDados.setSerie(turmaSelecionada.getSerie());
            telaDados.setCurso(turmaSelecionada.getCurso());

            telaDados.setCursos(controleCurso.listarTodas());

            telaDados.setVisible(true);

            atualizarTabela();
        }
    }//GEN-LAST:event_bVisualizarActionPerformed

    private void bEditarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarPrincipalActionPerformed
        DialogDadosTurma telaDados = new DialogDadosTurma(null, true);

        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione um curso da tabela para editar!");

        } else {
            turmaSelecionada = listaTurma.get(linha);
            telaDados.setAcao(2);

            telaDados.setId(turmaSelecionada.getIdTurma());
            telaDados.setSerie(turmaSelecionada.getSerie());
            telaDados.setCurso(turmaSelecionada.getCurso());

            telaDados.setCursos(controleCurso.listarTodas());

            telaDados.setVisible(true);

            atualizarTabela();
        }
    }//GEN-LAST:event_bEditarPrincipalActionPerformed

    private void bExcluirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirPrincipalActionPerformed
        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione um curso da tabela para excluir!");

        } else {
            turmaSelecionada = listaTurma.get(linha);
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esta turma?\n" + turmaSelecionada.getSerie() + turmaSelecionada.getCurso(), "Confirmar remoção", 0) == 0) {
                controle.remover(turmaSelecionada);
                JOptionPane.showMessageDialog(null, "Curso excluído com sucesso!");
            };
            atualizarTabela();
        }
    }//GEN-LAST:event_bExcluirPrincipalActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        if (cbPesquisarPor.getSelectedIndex() == 0 || txtPesquisa.getText().equals("")) {
            if (cbPesquisarPor.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecione uma forma de busca!");
            }

            if (txtPesquisa.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Digite algo para fazer a busca!");
            }

        } else {
            if (txtPesquisa.getText().matches("[0-9]*")) {
                atualizarTabelaPorSerie();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ao buscar pela série coloque apenas números!");
            }

        }
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bCadastrarPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarPrincipal1ActionPerformed
        DialogDadosTurma telaDados = new DialogDadosTurma(null, true);

        telaDados.setCursos(controleCurso.listarTodas());
        telaDados.setAcao(1);

        telaDados.setVisible(true);
        atualizarTabela();
    }//GEN-LAST:event_bCadastrarPrincipal1ActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void atualizarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        listaTurma.clear();

        listaTurma.addAll(controle.listarTodas());

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Turma t : listaTurma) {
            modelo.addRow(new Object[]{t.getIdTurma(), t.getSerie(), t.getCurso()});
        }
    }

    private void atualizarTabelaPorId() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        listaTurma.clear();

        listaTurma.addAll(controle.listarPorId(Integer.parseInt(txtPesquisa.getText())));

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Turma t : listaTurma) {
            modelo.addRow(new Object[]{t.getIdTurma(), t.getSerie(), t.getCurso()});
        }
    }

    private void atualizarTabelaPorSerie() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        listaTurma.clear();

        listaTurma.addAll(controle.listarPorSerie(Integer.parseInt(txtPesquisa.getText())));

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Turma t : listaTurma) {
            modelo.addRow(new Object[]{t.getIdTurma(), t.getSerie(), t.getCurso()});
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lPesquisar;
    private javax.swing.JLabel lTitulo2;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
