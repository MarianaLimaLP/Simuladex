package View.Administrador.Dados;

import Model.Disciplina;
import Control.ControleDisciplina;
import Control.ControleProfessor;
import Model.Professor;
import Model.Turma;
import View.Administrador.TelaPrincipalAdministrador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogDadosDisciplina extends javax.swing.JDialog {

    
    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private DefaultTableModel modeloTabela;
    ControleDisciplina controle = new ControleDisciplina();
    ControleProfessor controleProf = new ControleProfessor();
    
    public DialogDadosDisciplina(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    private ArrayList<Professor> listaProf = new ArrayList<>();
    
    private int id;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
        
    public String getNome() {
        return txtNome.getText();
    }

    public void setNome(String nome) {
        this.txtNome.setText(nome);
    }
    
    public String getArea() {
        return cbArea.getItemAt(cbArea.getSelectedIndex());
        
    }
    
    public void setArea(String area) {
        if(area.equals(cbArea.getItemAt(1))){
            this.cbArea.setSelectedIndex(1);
        } else if (area.equals(cbArea.getItemAt(2))){
            this.cbArea.setSelectedIndex(2);
        } else if (area.equals(cbArea.getItemAt(3))){
            this.cbArea.setSelectedIndex(3);
        } else if (area.equals(cbArea.getItemAt(4))){
            this.cbArea.setSelectedIndex(4);
        } else if (area.equals(cbArea.getItemAt(5))){
            this.cbArea.setSelectedIndex(5);
        }
    }
    
    public Turma getTurma() {
        return (Turma) cbTurma.getSelectedItem();
    }
    
    public void setTurma(Turma turma) {
        cbTurma.setSelectedItem(turma);
    }
    
    public void setTurmas(List<Turma> listaTurma){
        for(Turma t : listaTurma){
            cbTurma.addItem(t);
        }
    }
    
    public Professor getProfessor() {
        return listaProf.get(tabela.getSelectedRow());
    }
    
    public void setProfessor(Professor prof) {
        for(int i=0; i<tabela.getRowCount(); i++){
            if(tabela.getValueAt(i, 0).toString()==prof.getProntuario()){
                tabela.addRowSelectionInterval(i, i);
            }
        }
    }
    
    public void setProfessores(List<Professor> listaProfs){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaProf.clear();
        
        listaProf.addAll(listaProfs);
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Professor p : listaProf){
            modelo.addRow(new Object[]{p.getProntuario(), p.getNome()});
        }
    }
    
    int acaoo = 0;
    public void setAcao(int acao) {
        switch (acao) {
            case 0:
                dispose();
                break;

            case 1:
                lTituloPrincipal.setText("Cadastrar Disciplina");
                bConfirmar.setText("CONFIRMAR CADASTRO");
                bConfirmar.setVisible(true);
                bConfirmar.setEnabled(true);
                acaoo = 1;
                txtNome.setEditable(true);
                cbTurma.setEnabled(true);
                break;

            case 2:
                lTituloPrincipal.setText("Editar Disciplina");
                bConfirmar.setText("EDITAR DISCIPLINA");
                bConfirmar.setVisible(true);
                bConfirmar.setEnabled(true);
                acaoo = 2;
                txtNome.setEditable(true);
                cbArea.setEnabled(true);
                cbTurma.setEnabled(true);
                break;

            case 3:
                lTituloPrincipal.setText("Visualizar Disciplina");
                bCancelar.setText("FECHAR");
                bConfirmar.setVisible(false);
                bConfirmar.setEnabled(false);
                acaoo = 3;
                txtNome.setEditable(false);
                cbTurma.setEnabled(false);
                break;

        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pCadastrar = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lArea = new javax.swing.JLabel();
        cbArea = new javax.swing.JComboBox<>();
        bConfirmar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        lTituloPrincipal = new javax.swing.JLabel();
        cbTurma = new javax.swing.JComboBox<>();
        lTurma = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        bPesquise = new javax.swing.JButton();
        bGeral = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        pCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        pCadastrar.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        lNome.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        lArea.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lArea.setText("Área de Ensino:");

        cbArea.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        cbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Área", "Linguagens", "Matemática", "Ciências da Natureza", "Ciências Humanas", "Disciplinas Técnicas" }));

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

        lTituloPrincipal.setFont(new java.awt.Font("Gentium Book Basic", 1, 36)); // NOI18N
        lTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTituloPrincipal.setText("Fazer Disciplina");

        cbTurma.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        lTurma.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lTurma.setText("Turma:");

        tabela.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prontuário", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel1.setFont(new java.awt.Font("Gentium Book Basic", 1, 12)); // NOI18N
        jLabel1.setText("Pesquise e Selecione o Professor:");

        txtPesquisa.setFont(new java.awt.Font("Gentium Book Basic", 0, 12)); // NOI18N

        bPesquise.setBackground(new java.awt.Color(0, 0, 0));
        bPesquise.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        bPesquise.setForeground(new java.awt.Color(255, 255, 255));
        bPesquise.setText("Pesquise");
        bPesquise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquiseActionPerformed(evt);
            }
        });

        bGeral.setBackground(new java.awt.Color(0, 0, 0));
        bGeral.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        bGeral.setForeground(new java.awt.Color(255, 255, 255));
        bGeral.setText("Atualizar Geral");
        bGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGeralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCadastrarLayout = new javax.swing.GroupLayout(pCadastrar);
        pCadastrar.setLayout(pCadastrarLayout);
        pCadastrarLayout.setHorizontalGroup(
            pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pCadastrarLayout.createSequentialGroup()
                        .addComponent(bConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCadastrarLayout.createSequentialGroup()
                        .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pCadastrarLayout.createSequentialGroup()
                                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lTurma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pCadastrarLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCadastrarLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pCadastrarLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bPesquise, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pCadastrarLayout.setVerticalGroup(
            pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbTurma, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pCadastrarLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bPesquise)
                        .addGap(26, 26, 26)
                        .addComponent(bGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        if(acaoo == 3) {
            limparCampos();
            setVisible(false);
        }
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        int prof = tabela.getSelectedRow();

        if(!txtNome.getText().equals("")){
            if(cbArea.getSelectedIndex()!=0){
                if(cbTurma.getSelectedIndex()!=-1){
                    if (prof>=0) {
                        Disciplina disc = new Disciplina();
                        disc.setNome(txtNome.getText());
                        disc.setArea(cbArea.getSelectedItem().toString());
                        disc.setTurma((Turma) cbTurma.getSelectedItem());
                        disc.setProntuario_prof(listaProf.get(prof));
                        
                        if(acaoo==1){
                            controle.adicionar(disc);
                            JOptionPane.showMessageDialog(this, "Disciplina cadastrada com sucesso!");
                            
                        }
                        if(acaoo==2){
                            disc.setIdDisciplina(id);
                            controle.editar(disc);
                            JOptionPane.showMessageDialog(this, "Disciplina editada com sucesso!");
                        }
                        
                        limparCampos();
                        setVisible(false);
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "Selecione um Professor da tabela!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Selecione uma Turma!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma Área de Ensino!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Digite o Nome da Disciplina!");
        }
    }//GEN-LAST:event_bConfirmarActionPerformed

    private void bPesquiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquiseActionPerformed
        if(txtPesquisa.getText().matches("[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]*")){
            atualizarTabelaPorNome();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ao b uscar pelo nome, digite apenas letras");
        }
    }//GEN-LAST:event_bPesquiseActionPerformed

    private void bGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGeralActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_bGeralActionPerformed

    public void atualizarTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaProf.clear();
        
        listaProf.addAll(controleProf.listarTodas());
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Professor p: listaProf)
        {
            modelo.addRow(new Object[]{p.getProntuario(), p.getNome()});
        }
    }
    
    public void atualizarTabelaPorNome()
    {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        listaProf.clear();
        
        listaProf.addAll(controleProf.listarPorNome(txtPesquisa.getText()));
        
        while(modelo.getRowCount()>0)
        {
            modelo.removeRow(0);
        }
        
        for(Professor p: listaProf)
        {
            modelo.addRow(new Object[]{p.getProntuario(), p.getNome()});
        }
    }
    
    private void limparCampos() {
        txtNome.setText("");
        cbArea.setSelectedIndex(0);
        cbTurma.setSelectedIndex(0);
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
    private javax.swing.JButton bGeral;
    private javax.swing.JButton bPesquise;
    private javax.swing.JComboBox<String> cbArea;
    private javax.swing.JComboBox<Turma> cbTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lArea;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lTituloPrincipal;
    private javax.swing.JLabel lTurma;
    private javax.swing.JPanel pCadastrar;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
