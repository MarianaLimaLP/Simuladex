package View.Administrador;

import Control.ControleProfessor;
import Model.Professor;
import View.Administrador.Dados.DialogDadosProfessor;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogProfessor extends javax.swing.JDialog {
    
    
    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private DefaultTableModel modeloTabela;
    
    ControleProfessor controle = new ControleProfessor();
    Professor prof = new Professor();
    
    private ArrayList<Professor> listaProf = new ArrayList<>();
    
    public DialogProfessor(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        
        modeloTabela = (DefaultTableModel) tabela.getModel();
        
        tabela.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        
    }
//    public int acao = 0;
    // 1 para cadastro; 2 para edição; 3 para visualização; 0 para nada;
    
    Professor profSelecionado = new Professor();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAtua = new javax.swing.ButtonGroup();
        bgTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pPrincipal1 = new javax.swing.JPanel();
        lTitulo2 = new javax.swing.JLabel();
        bAtualizar = new javax.swing.JButton();
        bAtualizarAtua = new javax.swing.JButton();
        bAtualizarCoord = new javax.swing.JButton();
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        pPrincipal1.setBackground(new java.awt.Color(255, 255, 255));
        pPrincipal1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        pPrincipal1.setPreferredSize(new java.awt.Dimension(800, 605));

        lTitulo2.setFont(new java.awt.Font("Gentium Book Basic", 1, 48)); // NOI18N
        lTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-professor.png"))); // NOI18N
        lTitulo2.setText("Professores");

        bAtualizar.setBackground(new java.awt.Color(0, 0, 0));
        bAtualizar.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        bAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        bAtualizar.setText("Atualizar Geral");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        bAtualizarAtua.setBackground(new java.awt.Color(0, 0, 0));
        bAtualizarAtua.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        bAtualizarAtua.setForeground(new java.awt.Color(255, 255, 255));
        bAtualizarAtua.setText("Atualizar com quem Atua");
        bAtualizarAtua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarAtuaActionPerformed(evt);
            }
        });

        bAtualizarCoord.setBackground(new java.awt.Color(0, 0, 0));
        bAtualizarCoord.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        bAtualizarCoord.setForeground(new java.awt.Color(255, 255, 255));
        bAtualizarCoord.setText("Atualizar com Coordenadores");
        bAtualizarCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarCoordActionPerformed(evt);
            }
        });

        bCadastrarPrincipal1.setBackground(new java.awt.Color(0, 0, 0));
        bCadastrarPrincipal1.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        bCadastrarPrincipal1.setForeground(new java.awt.Color(255, 255, 255));
        bCadastrarPrincipal1.setText("Cadastrar Professor");
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

        tabela.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prontuario", "Nome", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
                    .addComponent(lTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipal1Layout.createSequentialGroup()
                        .addComponent(bCadastrarPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipal1Layout.createSequentialGroup()
                                .addComponent(bEditarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bExcluirPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pPrincipal1Layout.createSequentialGroup()
                        .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pPrincipal1Layout.createSequentialGroup()
                                .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bAtualizarCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bAtualizarAtua, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pPrincipal1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pPrincipal1Layout.createSequentialGroup()
                                        .addComponent(lPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pPrincipal1Layout.createSequentialGroup()
                                        .addComponent(cbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pPrincipal1Layout.setVerticalGroup(
            pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bVisualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(bEditarPrincipal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCadastrarPrincipal1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bExcluirPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pPrincipal1Layout.createSequentialGroup()
                        .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAtualizarAtua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bAtualizarCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(pPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
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
        DialogDadosProfessor telaDados = new DialogDadosProfessor(null, true);
    
        telaDados.setAcao(1);
        
        telaDados.setVisible(true);
        atualizarTabela();
    }//GEN-LAST:event_bCadastrarPrincipal1ActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        if(cbPesquisarPor.getSelectedIndex()==0||txtPesquisa.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Selecione uma forma de busca!");
        } else {
            if(cbPesquisarPor.getSelectedIndex()==1){
                atualizarTabelaPorProntuario();
            } else {
                atualizarTabelaPorNome();
            }
        }
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVisualizarActionPerformed
        DialogDadosProfessor telaDados = new DialogDadosProfessor(null, true);
    
        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione um professor da tabela para visualizar!");

        } else {
            telaDados.setAcao(3);
            
            profSelecionado = listaProf.get(linha);
            
            telaDados.setProntuario(profSelecionado.getProntuario());
            telaDados.setNome(profSelecionado.getNome());
            telaDados.setCpf(profSelecionado.getCpf());
            telaDados.setEmail(profSelecionado.getEmail());
            telaDados.setAtua(profSelecionado.getAtua());
            telaDados.setTitulacao(profSelecionado.getTitulacao());
            telaDados.setTipo(profSelecionado.getCoord_prof());
            telaDados.setSenha(profSelecionado.getSenha());
            
            telaDados.setVisible(true);
            atualizarTabela();
        }
    }//GEN-LAST:event_bVisualizarActionPerformed

    private void bEditarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarPrincipalActionPerformed
        DialogDadosProfessor telaDados = new DialogDadosProfessor(null, true);
    
        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione um professor da tabela para editar!");

        } else {
            telaDados.setAcao(2);
            
            profSelecionado = listaProf.get(linha);
            
            telaDados.setProntuario(profSelecionado.getProntuario());
            telaDados.setNome(profSelecionado.getNome());
            telaDados.setCpf(profSelecionado.getCpf());
            telaDados.setEmail(profSelecionado.getEmail());
            telaDados.setAtua(profSelecionado.getAtua());
            telaDados.setTitulacao(profSelecionado.getTitulacao());
            telaDados.setTipo(profSelecionado.getCoord_prof());
            telaDados.setSenha(profSelecionado.getSenha());

            telaDados.setVisible(true);
            atualizarTabela();
        }
    }//GEN-LAST:event_bEditarPrincipalActionPerformed

    private void bExcluirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirPrincipalActionPerformed
        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(this, "Selecione um professor da tabela para excluir!");

        } else {
            profSelecionado = listaProf.get(linha);
            if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este professor?\n" + profSelecionado.getNome(), "Confirmar remoção",0)==0){
                controle.remover(profSelecionado);
                JOptionPane.showMessageDialog(null, "Professor excluído com sucesso!");
            };
            atualizarTabela();
        }
    }//GEN-LAST:event_bExcluirPrincipalActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void bAtualizarAtuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarAtuaActionPerformed
        atualizarTabelaPorAtuadores();
    }//GEN-LAST:event_bAtualizarAtuaActionPerformed

    private void bAtualizarCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarCoordActionPerformed
        atualizarTabelaPorCoordenadores();
    }//GEN-LAST:event_bAtualizarCoordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    String atua = "Não Leciona Atualmente";
    
    public void atualizarTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaProf.clear();
        
        listaProf.addAll(controle.listarTodas());
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Professor p: listaProf)
        {
            if(p.getAtua()){
                atua = "Leciona Atualmente";
            } else {
                atua = "Não Leciona Atualmente";
            }
            modelo.addRow(new Object[]{p.getProntuario(), p.getNome(), atua});
        }
    }
    
    private void atualizarTabelaPorCoordenadores()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaProf.clear();
        
        listaProf.addAll(controle.listarCoordenadores());
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Professor p: listaProf)
        {
            if(p.getAtua()){
                atua = "Leciona Atualmente";
            } else {
                atua = "Não Leciona Atualmente";
            }
            modelo.addRow(new Object[]{p.getProntuario(), p.getNome(), atua});
        }
    }
    
    private void atualizarTabelaPorProntuario()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaProf.clear();
        
        listaProf.addAll(controle.listarPorProntuario(txtPesquisa.getText()));
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Professor p: listaProf)
        {
            if(p.getAtua()){
                atua = "Leciona Atualmente";
            } else {
                atua = "Não Leciona Atualmente";
            }
            modelo.addRow(new Object[]{p.getProntuario(), p.getNome(), atua});
        }
    }
    
    private void atualizarTabelaPorNome()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaProf.clear();
        
        listaProf.addAll(controle.listarPorNome(txtPesquisa.getText()));
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Professor p: listaProf)
        {
            if(p.getAtua()){
                atua = "Leciona Atualmente";
            } else {
                atua = "Não Leciona Atualmente";
            }
            modelo.addRow(new Object[]{p.getProntuario(), p.getNome(), atua});
        }
    }
    
    private void atualizarTabelaPorAtuadores()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaProf.clear();
        
        listaProf.addAll(controle.listarAtuadores());
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Professor p: listaProf)
        {
            if(p.getAtua()){
                atua = "Leciona Atualmente";
            } else {
                atua = "Não Leciona Atualmente";
            }
            modelo.addRow(new Object[]{p.getProntuario(), p.getNome(), atua});
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
    private javax.swing.JButton bAtualizarAtua;
    private javax.swing.JButton bAtualizarCoord;
    private javax.swing.JButton bCadastrarPrincipal1;
    private javax.swing.JButton bEditarPrincipal;
    private javax.swing.JButton bExcluirPrincipal;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bVisualizar;
    private javax.swing.ButtonGroup bgAtua;
    private javax.swing.ButtonGroup bgTipo;
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
