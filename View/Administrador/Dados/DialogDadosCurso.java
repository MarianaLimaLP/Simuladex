package View.Administrador.Dados;

import Control.ControleCurso;
import Control.ControleProfessor;
import Model.Curso;
import Model.Professor;
import View.Administrador.TelaPrincipalAdministrador;
import java.util.List;
import javax.swing.JOptionPane;

public class DialogDadosCurso extends javax.swing.JDialog {

    ControleProfessor controleProf = new ControleProfessor();
    ControleCurso controle = new ControleCurso();
    
    public DialogDadosCurso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void setCoordenadores(List<Professor> listaProf){
        for(Professor p : listaProf){
            cbCoordenador.addItem(p);
        }
    }
    
    public String getNome() {
        return txtNome.getText();
    }

    public void setNome(String nome) {
        this.txtNome.setText(nome);
    }
    
    private int id;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Professor getCoordenador() {
        return (Professor) cbCoordenador.getSelectedItem();
        
    }
    
    public void setCoordenador(Professor p) {
        cbCoordenador.setSelectedItem(p);
    }

    int acaoo = 0;
    public void setAcao(int acao) {
        switch (acao) {
            case 0:
                dispose();
                break;

            case 1:
                lTituloPrincipal.setText("Cadastrar Curso");
                bConfirmar.setText("CONFIRMAR CURSO");
                bConfirmar.setVisible(true);
                bConfirmar.setEnabled(true);
                acaoo = 1;
                txtNome.setEditable(true);
                cbCoordenador.setEnabled(true);
                break;

            case 2:
                lTituloPrincipal.setText("Editar Curso");
                bConfirmar.setText("EDITAR CURSO");
                bConfirmar.setVisible(true);
                bConfirmar.setEnabled(true);
                acaoo = 2;
                txtNome.setEditable(true);
                cbCoordenador.setEnabled(true);
                break;

            case 3:
                lTituloPrincipal.setText("Visualizar Curso");
                bCancelar.setText("FECHAR");
                bConfirmar.setVisible(false);
                bConfirmar.setEnabled(false);
                acaoo = 3;
                txtNome.setEditable(false);
                cbCoordenador.setEnabled(false);
                
                break;

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pCadastrar = new javax.swing.JPanel();
        lNome1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        bConfirmar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        lTituloPrincipal = new javax.swing.JLabel();
        lCoordenador = new javax.swing.JLabel();
        cbCoordenador = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(241, 241, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        pCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        pCadastrar.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        lNome1.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lNome1.setText("Nome do Curso:");

        txtNome.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N

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

        lTituloPrincipal.setFont(new java.awt.Font("Gentium Book Basic", 1, 36)); // NOI18N
        lTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTituloPrincipal.setText("Fazer Curso");

        lCoordenador.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        lCoordenador.setText("Professor Coordenador:");

        cbCoordenador.setFont(new java.awt.Font("Gentium Book Basic", 0, 16)); // NOI18N
        cbCoordenador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                            .addComponent(lCoordenador, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(lNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome)
                            .addComponent(cbCoordenador, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
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
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lCoordenador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCoordenador, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        if(!txtNome.getText().equals("")){
            if(cbCoordenador.getSelectedIndex() != -1){
                Curso curso = new Curso();
                
                curso.setNome(txtNome.getText());
                curso.setProfessor((Professor) cbCoordenador.getSelectedItem());
                
                if(acaoo==1){
                    controle.adicionar(curso);
                    JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
                }
                if(acaoo==2){
                    curso.setIdCurso(getId());
                    controle.editar(curso);
                    JOptionPane.showMessageDialog(null, "Curso editado com sucesso!");
                }
                
                setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecione o professor coordenador do curso!");
                cbCoordenador.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, insira o nome do curso!");
            txtNome.requestFocus();
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
        txtNome.setText("");
        cbCoordenador.setSelectedIndex(0);
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
    private javax.swing.JComboBox<Professor> cbCoordenador;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lCoordenador;
    private javax.swing.JLabel lNome1;
    private javax.swing.JLabel lTituloPrincipal;
    private javax.swing.JPanel pCadastrar;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
