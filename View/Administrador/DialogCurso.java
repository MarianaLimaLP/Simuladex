
package View.Administrador;

import Control.ControleCurso;
import Control.ControleProfessor;
import Model.Curso;
import Model.Professor;
import View.Administrador.Dados.DialogDadosCurso;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogCurso extends javax.swing.JDialog {

    
    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private DefaultTableModel modeloTabela;
    
    ControleCurso controle = new ControleCurso();
    ControleProfessor controleProf = new ControleProfessor();
    
    Curso curso = new Curso();
    
    private ArrayList<Curso> listaCurso = new ArrayList<>();
    
    public DialogCurso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        modeloTabela = (DefaultTableModel) tabela.getModel();
    }
    
    Curso cursoSelecionado = new Curso();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pPrincipal1 = new javax.swing.JPanel();
        lTitulo2 = new javax.swing.JLabel();
        bAtualizar = new javax.swing.JButton();
        bCadastrarPrincipal1 = new javax.swing.JButton();
        bExcluirPrincipal = new javax.swing.JButton();
        bEditarPrincipal = new javax.swing.JButton();
        bVisualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        lPesquisar = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        cbPesquisarPor = new javax.swing.JComboBox<>();
        bPesquisar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        pPrincipal1.setBackground(new java.awt.Color(255, 255, 255));
        pPrincipal1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        pPrincipal1.setPreferredSize(new java.awt.Dimension(800, 605));

        lTitulo2.setFont(new java.awt.Font("Gentium Book Basic", 1, 48)); // NOI18N
        lTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-curso.png"))); // NOI18N
        lTitulo2.setText("Cursos");

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
        bCadastrarPrincipal1.setText("Cadastrar Curso");
        bCadastrarPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarPrincipal1ActionPerformed(evt);
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
                "Identificador", "Nome", "Coordenador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
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

        lPesquisar.setFont(new java.awt.Font("Gentium Book Basic", 1, 12)); // NOI18N
        lPesquisar.setText("Pesquisar:");

        txtPesquisa.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N

        cbPesquisarPor.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        cbPesquisarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um item", "Nome" }));

        bPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        bPesquisar.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        bPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        bPesquisar.setText("Pesquisar");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
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

        javax.swing.GroupLayout pPrincipal1Layout = new javax.swing.GroupLayout(pPrincipal1);
        pPrincipal1.setLayout(pPrincipal1Layout);
        pPrincipal1Layout.setHorizontalGroup(
            pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrincipal1Layout.createSequentialGroup()
                        .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pPrincipal1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbPesquisarPor, 0, 130, Short.MAX_VALUE))
                                    .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pPrincipal1Layout.createSequentialGroup()
                                        .addComponent(lPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pPrincipal1Layout.createSequentialGroup()
                                .addComponent(bCadastrarPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bEditarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bExcluirPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pPrincipal1Layout.createSequentialGroup()
                        .addComponent(lTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipal1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pPrincipal1Layout.setVerticalGroup(
            pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(bEditarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCadastrarPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bExcluirPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrincipal1Layout.createSequentialGroup()
                        .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(pPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
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

    private void bCadastrarPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarPrincipal1ActionPerformed
        DialogDadosCurso telaDados = new DialogDadosCurso(null, true);
        telaDados.setCoordenadores(controleProf.listarCoordenadores());
        telaDados.setAcao(1);
            
        telaDados.setVisible(true);
        atualizarTabela();
    }//GEN-LAST:event_bCadastrarPrincipal1ActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        if(cbPesquisarPor.getSelectedIndex()==0||txtPesquisa.getText().equals("")){
            if(cbPesquisarPor.getSelectedIndex()==0)
                JOptionPane.showMessageDialog(this, "Selecione uma forma de busca!");
            
            if(txtPesquisa.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Digite algo para fazer a busca!");
                
        } else {
            atualizarTabelaPorNome();
        }
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVisualizarActionPerformed
        DialogDadosCurso telaDados = new DialogDadosCurso(null, true);
        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione um curso da tabela para visualizar!");

        } else {
            cursoSelecionado = listaCurso.get(linha);
            telaDados.setAcao(3);
            
            telaDados.setNome(cursoSelecionado.getNome());
            
            telaDados.setCoordenadores(controleProf.listarCoordenadores());
            telaDados.setCoordenador(cursoSelecionado.getProfessor());
            
            telaDados.setVisible(true);

            atualizarTabela();
        }
    }//GEN-LAST:event_bVisualizarActionPerformed

    private void bEditarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarPrincipalActionPerformed
        DialogDadosCurso telaDados = new DialogDadosCurso(null, true);
        
        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione um curso da tabela para editar!");

        } else {
            cursoSelecionado = listaCurso.get(linha);
            telaDados.setAcao(2);
            
            telaDados.setId(cursoSelecionado.getIdCurso());
            telaDados.setNome(cursoSelecionado.getNome());
            
            telaDados.setCoordenadores(controleProf.listarCoordenadores());
            telaDados.setCoordenador(cursoSelecionado.getProfessor());
            
            telaDados.setVisible(true);

            atualizarTabela();
        }
    }//GEN-LAST:event_bEditarPrincipalActionPerformed

    private void bExcluirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirPrincipalActionPerformed
        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione um curso da tabela para excluir!");

        } else {
            cursoSelecionado = listaCurso.get(linha);
            if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este curso?\n" + cursoSelecionado.getNome(), "Confirmar remoção",0)==0){
                controle.remover(cursoSelecionado);
                JOptionPane.showMessageDialog(null, "Curso excluído com sucesso!");
            };
            atualizarTabela();
        }
    }//GEN-LAST:event_bExcluirPrincipalActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void atualizarTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaCurso.clear();
        
        listaCurso.addAll(controle.listarTodas());
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Curso c: listaCurso)
        {
            modelo.addRow(new Object[]{c.getIdCurso(), c.getNome(), c.getProfessor()});
        }
    }
    
    private void atualizarTabelaPorId()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaCurso.clear();
        
        listaCurso.addAll(controle.listarPorId(Integer.parseInt(txtPesquisa.getText())));
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Curso c: listaCurso)
        {
            modelo.addRow(new Object[]{c.getIdCurso(), c.getNome()});
        }
    }
    
    private void atualizarTabelaPorNome()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaCurso.clear();
        
        listaCurso.addAll(controle.listarPorNome(txtPesquisa.getText()));
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Curso c: listaCurso)
        {
            modelo.addRow(new Object[]{c.getIdCurso(), c.getNome()});
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
    private javax.swing.JPanel pPrincipal1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
