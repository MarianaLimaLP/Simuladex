package View.Administrador.Dados;

import Control.ControleTurma;
import Model.Turma;
import Model.Curso;
import View.Administrador.TelaPrincipalAdministrador;
import java.util.List;
import javax.swing.JOptionPane;

public class DialogDadosTurma extends javax.swing.JDialog {

    
    ControleTurma controle = new ControleTurma();
    
    public DialogDadosTurma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    private int id;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Curso getCurso() {
        return (Curso) cbCurso.getSelectedItem();
        
    }
    
    public void setCurso(Curso c) {
        cbCurso.setSelectedItem(c);
    }

    public void setCursos(List<Curso> listaCurso){
        for(Curso c : listaCurso){
            cbCurso.addItem(c);
        }
    }
    public Integer getSerie() {
        Integer r = 0;
        if(rb1.isSelected()){
            r = 1;
        }
        if(rb2.isSelected()){
            r = 2;
        }
        if(rb3.isSelected()){
            r = 3;
        }
        return r;
    }
    
    public void setSerie(Integer serie) {
        if(serie==1){
            rb1.setSelected(true);
        }
        if(serie==2){
            rb2.setSelected(true);
        }
        if(serie==3){
            rb3.setSelected(true);
        }
    }
    
    int acaoo = 0;
    public void setAcao(int acao) {
        switch (acao) {
            case 0:
                dispose();
                break;

            case 1:
                lTituloPrincipal.setText("Cadastrar Turma");
                bConfirmar.setText("CONFIRMAR CADASTRO");
                bConfirmar.setVisible(true);
                bConfirmar.setEnabled(true);
                acaoo = 1;
                cbCurso.setEnabled(true);
                rb1.setEnabled(true);
                rb2.setEnabled(true);
                rb3.setEnabled(true);
                break;

            case 2:
                lTituloPrincipal.setText("Editar Turma");
                bConfirmar.setText("EDITAR TURMA");
                bConfirmar.setVisible(true);
                bConfirmar.setEnabled(true);
                acaoo = 2;
                cbCurso.setEnabled(true);
                rb1.setEnabled(true);
                rb2.setEnabled(true);
                rb3.setEnabled(true);
                break;

            case 3:
                lTituloPrincipal.setText("Visualizar Turma");
                bCancelar.setText("FECHAR");
                bConfirmar.setVisible(false);
                bConfirmar.setEnabled(false);
                acaoo = 3;
                cbCurso.setEnabled(false);
                rb1.setEnabled(false);
                rb2.setEnabled(false);
                rb3.setEnabled(false);
                break;

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSerie = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pCadastrar = new javax.swing.JPanel();
        lSerie = new javax.swing.JLabel();
        lCurso = new javax.swing.JLabel();
        cbCurso = new javax.swing.JComboBox<>();
        bConfirmar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        lTituloPrincipal = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        pCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        pCadastrar.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        lSerie.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lSerie.setText("Série:");

        lCurso.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lCurso.setText("Curso:");

        cbCurso.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

        bConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        bConfirmar.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        bConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        bConfirmar.setText("CONFIRMAR ");
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
        lTituloPrincipal.setText("Fazer Turma");

        bgSerie.add(rb1);
        rb1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        rb1.setText("1º");

        bgSerie.add(rb2);
        rb2.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        rb2.setText("2º");

        bgSerie.add(rb3);
        rb3.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        rb3.setText("3º");

        javax.swing.GroupLayout pCadastrarLayout = new javax.swing.GroupLayout(pCadastrar);
        pCadastrar.setLayout(pCadastrarLayout);
        pCadastrarLayout.setHorizontalGroup(
            pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pCadastrarLayout.createSequentialGroup()
                        .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pCadastrarLayout.createSequentialGroup()
                                .addComponent(lCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pCadastrarLayout.createSequentialGroup()
                                .addComponent(lSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rb1)
                                .addGap(18, 18, 18)
                                .addComponent(rb2)
                                .addGap(18, 18, 18)
                                .addComponent(rb3)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(pCadastrarLayout.createSequentialGroup()
                        .addComponent(bConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pCadastrarLayout.setVerticalGroup(
            pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
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

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        if(cbCurso.getSelectedIndex()!=-1){
            if(rb1.isSelected() || rb2.isSelected() || rb3.isSelected()){
                Turma turma = new Turma();
                
                if(rb1.isSelected())
                turma.setSerie(1);
                if(rb2.isSelected())
                turma.setSerie(2);
                if(rb3.isSelected())
                turma.setSerie(3);
                
                turma.setCurso((Curso) cbCurso.getSelectedItem());
                
                if(acaoo==1){
                    controle.adicionar(turma);
                    JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso!");
                }
                if(acaoo==2){
                    turma.setIdTurma(getId());
                    controle.editar(turma);
                    JOptionPane.showMessageDialog(null, "Turma editado com sucesso!");
                }
                
                limparCampos();
                setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecione a série!");
                rb1.requestFocus();
                rb2.requestFocus();
                rb3.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione o Curso!");
            cbCurso.requestFocus();
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
        if(acaoo == 3) {
            limparCampos();
            setVisible(false);
        }
        
    }//GEN-LAST:event_bCancelarActionPerformed
    
    private void limparCampos() {
        bgSerie.clearSelection();
        cbCurso.setSelectedIndex(0);
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
    private javax.swing.ButtonGroup bgSerie;
    private javax.swing.JComboBox<Curso> cbCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lCurso;
    private javax.swing.JLabel lSerie;
    private javax.swing.JLabel lTituloPrincipal;
    private javax.swing.JPanel pCadastrar;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    // End of variables declaration//GEN-END:variables
}
