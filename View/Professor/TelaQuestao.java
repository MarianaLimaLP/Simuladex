/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Professor;

import Control.ControleAluno;
import Control.ControleQuestao;
import Control.ControleDisciplina;
import Control.ControleProfessor;
import Control.ControleProva;
import Control.ControleTurma;
import Model.Disciplina;
import Model.Professor;
import Model.Prova;
import Model.Questao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class TelaQuestao extends javax.swing.JFrame {

    
    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private DefaultTableModel modeloTabela;
    
    public TelaQuestao() {
        initComponents();
        modeloTabela = (DefaultTableModel) tabela.getModel();
    }
    
    Boolean naotemdisciplina = false;
    ControleAluno controleAluno = new ControleAluno();
    ControleProfessor controleProfessor = new ControleProfessor();
    ControleTurma controleTurma = new ControleTurma();
    ControleProva controleProva = new ControleProva();
    ControleDisciplina controleDisciplina = new ControleDisciplina();
    ControleQuestao controle = new ControleQuestao();
    
    Questao questao = new Questao();
    
    private ArrayList<Questao> listaQuestao = new ArrayList<>();
    
    Disciplina disciplinaDesseProf = new Disciplina();
    Professor profLogado = controleProfessor.getProfLogado();
    
    Questao questaoSelecionada = new Questao();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        bPesquisarId = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        bExcluir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        bAlterar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        bCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bMostrarTodas = new javax.swing.JButton();
        bFechar = new javax.swing.JButton();
        cbPesquisaPor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Gentium Book Basic", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Questões");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idQuestao", "Descrição", "Disciplina"
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
        tabela.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabela);

        bPesquisarId.setBackground(new java.awt.Color(255, 255, 255));
        bPesquisarId.setFont(new java.awt.Font("JasmineUPC", 0, 24)); // NOI18N
        bPesquisarId.setText("Pesquisar");
        bPesquisarId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        bPesquisarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarIdActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        bExcluir.setBackground(new java.awt.Color(255, 255, 255));
        bExcluir.setFont(new java.awt.Font("JasmineUPC", 0, 24)); // NOI18N
        bExcluir.setText("Excluir Questão");
        bExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        bAlterar.setBackground(new java.awt.Color(255, 255, 255));
        bAlterar.setFont(new java.awt.Font("JasmineUPC", 0, 24)); // NOI18N
        bAlterar.setText("Alterar Questão");
        bAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        bCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        bCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-adicionar.png"))); // NOI18N
        bCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("JasmineUPC", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Criar Nova Questão");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bMostrarTodas.setBackground(new java.awt.Color(255, 255, 255));
        bMostrarTodas.setFont(new java.awt.Font("JasmineUPC", 0, 24)); // NOI18N
        bMostrarTodas.setText("Mostrar Todas");
        bMostrarTodas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        bMostrarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarTodasActionPerformed(evt);
            }
        });

        bFechar.setBackground(new java.awt.Color(255, 255, 255));
        bFechar.setText("Fechar");
        bFechar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 5));
        bFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFecharActionPerformed(evt);
            }
        });

        cbPesquisaPor.setFont(new java.awt.Font("JasmineUPC", 0, 18)); // NOI18N
        cbPesquisaPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por ID", "Por Descrição" }));
        cbPesquisaPor.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bMostrarTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPesquisaPor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bPesquisarId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bPesquisarId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(cbPesquisaPor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bMostrarTodas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void bPesquisarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarIdActionPerformed
        if(txtPesquisa.getText().matches("[0-9]*")){
            if(txtPesquisa.getText().equals("")){
                atualizarTabelaPorId();
            } else {
                JOptionPane.showMessageDialog(this, "Digite algo para pesquisar pelo ID!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "O ID só aceita números!!");
        }
    }//GEN-LAST:event_bPesquisarIdActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        int linha = tabela.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma questao da tabela para excluir!");

        } else {
            questaoSelecionada = listaQuestao.get(linha);
            if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esta questao?\n" + questaoSelecionada.toString(), "Confirmar remoção",0)==0){
                controle.remover(questaoSelecionada);
                JOptionPane.showMessageDialog(null, "Questao excluída com sucesso!");
            };
            if(profLogado.getCoord_prof()){
                atualizarTabela();
            } else { 
                atualizarTabelaPorDisciplinas(profLogado.getListaDisciplinas());
            }
        }
    }//GEN-LAST:event_bExcluirActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        TelaDadosQuestao telaDados = new TelaDadosQuestao();

        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione uma questao da tabela para editar!");

        } else {
            questaoSelecionada = listaQuestao.get(linha);
            telaDados.setAcao(2);
            
            telaDados.setDisciplinas(controleDisciplina.listarTodas());
            telaDados.setId(questaoSelecionada.getIdQuestao());
            telaDados.setDisciplina(questaoSelecionada.getDisciplina());

            telaDados.setVisible(true);

            if(profLogado.getCoord_prof()){
                atualizarTabela();
            } else {
                atualizarTabelaPorDisciplinas(profLogado.getListaDisciplinas());
            }
        }
    }//GEN-LAST:event_bAlterarActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        TelaDadosQuestao telaDados = new TelaDadosQuestao();
        telaDados.setDisciplinas(controleDisciplina.listarTodas());
        telaDados.setAcao(1);

        telaDados.setVisible(true);
        
        if(profLogado.getCoord_prof()){
            atualizarTabela();
        } else {
            atualizarTabelaPorDisciplinas(profLogado.getListaDisciplinas());
        }
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void bMostrarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarTodasActionPerformed
        if(profLogado.getCoord_prof()){
            atualizarTabela();
        } else {
            atualizarTabelaPorDisciplinas(profLogado.getListaDisciplinas());
        }
    }//GEN-LAST:event_bMostrarTodasActionPerformed

    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed
        setVisible(false);
    }//GEN-LAST:event_bFecharActionPerformed

    public void atualizarTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaQuestao.clear();
        
        listaQuestao.addAll(controle.listarTodas());
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Questao q: listaQuestao)
        {
            modelo.addRow(new Object[]{q.getIdQuestao(), q.getDescricao(), q.getDisciplina()});
        }
    }
    public Boolean temDisciplina(){
        if(this.naotemdisciplina){
            return false;
        } else {
            return true;
        }
    }
    
    private void atualizarTabelaPorId()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaQuestao.clear();
        
        listaQuestao.addAll(controle.listarPorId(Integer.parseInt(txtPesquisa.getText())));
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Questao q: listaQuestao)
        {
            modelo.addRow(new Object[]{q.getIdQuestao(), q.getDescricao(), q.getDisciplina()});
        }
    }
    
    private void atualizarTabelaPorDescricao()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaQuestao.clear();
        
        listaQuestao.addAll(controle.listarPorDescricao(txtPesquisa.getText()));
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Questao q: listaQuestao)
        {
            modelo.addRow(new Object[]{q.getIdQuestao(), q.getDescricao(), q.getDisciplina()});
        }
    }
    
    public void atualizarTabelaPorDisciplina(Disciplina disc)
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaQuestao.clear();
        
        listaQuestao.addAll(this.getQuestoesdaDisciplina(disc));
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Questao q: listaQuestao)
        {
            modelo.addRow(new Object[]{q.getIdQuestao(), q.getDescricao(), q.getDisciplina()});
        }
    }
    
    public void atualizarTabelaPorDisciplinas(List<Disciplina> listaDisciplinas)
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaQuestao.clear();
        for(int i=0; i<listaDisciplinas.size();i++){
            listaQuestao.addAll(this.getQuestoesdaDisciplina(listaDisciplinas.get(i)));
        }
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Questao q: listaQuestao)
        {
            modelo.addRow(new Object[]{q.getIdQuestao(), q.getDescricao(), q.getDisciplina()});
        }
    }
    
    public List<Questao> getQuestoesdaDisciplina(Disciplina disc){
        List<Questao> TODASquestoes = controle.listarTodas();
        List<Questao> questoes = new ArrayList<>();
        Questao questao = new Questao();
        
        boolean achou = false;
        int i = 0;
        while(TODASquestoes.size()>i){
            questao = TODASquestoes.get(i);
            if(questao.getDisciplina().equals(disc)){
                questoes.add(questao);
            }
            i++;
        }
        return questoes;
    }
    
    public void setDisciplinas(Professor prof){
        List<Disciplina> TODASdisciplinas = controleDisciplina.listarTodas();
        List<Disciplina> listaDisciplinasDesseProf = new ArrayList<>();
        Disciplina disc = new Disciplina();
        
        boolean achou = false;
        int i = 0;
        while((!achou) && (TODASdisciplinas.size()-1 >= i)){
            disc = TODASdisciplinas.get(i);
            if(disc.getProntuario_prof().equals(prof)){
                listaDisciplinasDesseProf.add(disc);
            }
            i++;
        }
        if (achou == false) {
            this.naotemdisciplina = true;
        }
        profLogado.setListaDisciplinas(listaDisciplinasDesseProf);
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
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bMostrarTodas;
    private javax.swing.JButton bPesquisarId;
    private javax.swing.JComboBox<String> cbPesquisaPor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
