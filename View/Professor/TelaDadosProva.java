package View.Professor;

import Control.ControleAluno;
import Control.ControleProva;
import Control.ControleProvaAluno;
import Control.ControleQuestao;
import Control.ControleTurma;
import Control.ControleRespostaQuestao;
import Model.RespostaQuestao;
import Model.Prova;
import Model.Turma;
import Model.Aluno;
import Model.ProvaAluno;
import Model.Questao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaDadosProva extends javax.swing.JFrame {

    
    public TelaDadosProva() {
        initComponents();
    }

    ControleProva controle = new ControleProva();
    ControleTurma controleTurma = new ControleTurma();
    ControleAluno controleAluno = new ControleAluno();
    ControleQuestao controleQuestao = new ControleQuestao();
    ControleProvaAluno controleProvaAluno = new ControleProvaAluno();
    ControleRespostaQuestao controleRespostaQuestao = new ControleRespostaQuestao();
    
    Boolean naotemquestoes = false;
    List<Questao> questoesDessaProva = new ArrayList<>();
    
    public void setTurmas(List<Turma> listaTurma){
        for(Turma t : listaTurma){
            cbTurma.addItem(t);
        }
    }
    
    private int id;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getQtdQuestoes() {
        return sliderQtd.getValue();
    }

    public void setQtdQuestoes(Integer qtd) {
        this.sliderQtd.setValue(qtd);
    }
    
    public Turma getTurma() {
        return (Turma) cbTurma.getSelectedItem();
        
    }
    
    public void setTurma(Turma t) {
        cbTurma.setSelectedItem(t);
    }

    public Date getDataDoSimulado() {
        return sdeData.getDate();
    }

    public void setDataDoSimulado(Date data) {
        sdeData.setDate(data);
    }
    
    int acaoo = 0;
    public void setAcao(int acao) {
        switch (acao) {
            case 0:
                dispose();
                break;

            case 1:
                lTitulo.setText("Montar Prova");
                bConfirmar.setText("CONFIRMAR PROVA");
                acaoo = 1;
                break;

            case 2:
                lTitulo.setText("Editar Prova");
                bConfirmar.setText("EDITAR PROVA");
                acaoo = 2;
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbTurma = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliderQtd = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        bConfirmar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        sdeData = new com.toedter.calendar.JSpinnerDateEditor();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFundo.setBackground(new java.awt.Color(241, 241, 255));
        pFundo.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lTitulo.setFont(new java.awt.Font("Gentium Book Basic", 1, 48)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Fazer Prova");

        jLabel1.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        jLabel1.setText("Selecione a Turma:");

        cbTurma.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        jLabel2.setText("Quantidade de Questões por Disciplina:");

        jLabel3.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        jLabel3.setText("Coloque a Data em que o Simulado acontecerá:");

        sliderQtd.setBackground(new java.awt.Color(255, 255, 255));
        sliderQtd.setMaximum(10);
        sliderQtd.setMinimum(1);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText(" 1      2      3      4      5      6      7      8      9      10");

        bConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        bConfirmar.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        bConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        bConfirmar.setText("Confirmar");
        bConfirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmarActionPerformed(evt);
            }
        });

        bCancelar.setBackground(new java.awt.Color(0, 0, 0));
        bCancelar.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        bCancelar.setForeground(new java.awt.Color(255, 255, 255));
        bCancelar.setText("Cancelar");
        bCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        sdeData.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        sdeData.setMaxSelectableDate(new java.util.Date(253370858399000L));
        sdeData.setMinSelectableDate(new java.util.Date(-62135758800000L));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sliderQtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbTurma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(sdeData, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sliderQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sdeData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(bConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pFundoLayout = new javax.swing.GroupLayout(pFundo);
        pFundo.setLayout(pFundoLayout);
        pFundoLayout.setHorizontalGroup(
            pFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pFundoLayout.setVerticalGroup(
            pFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        if(cbTurma.getSelectedIndex()!= -1){
                System.out.println(sdeData.getDateFormatString());
                Prova p = new Prova();
                
                p.setQtdquestaodisciplina(sliderQtd.getValue());
                p.setTurma((Turma) cbTurma.getSelectedItem());
                p.setDatadosimulado(sdeData.getDate());
                
                this.setQuestoesProva(p);
                if(naotemquestoes){
                    JOptionPane.showMessageDialog(this, "Não tem nenhuma questão cadastrada para essa prova, cadastre todas antes de montar a prova!!!!!", "Erro ao montar a prova", JOptionPane.ERROR_MESSAGE);
                } else {
                    if(acaoo==1){
                        controle.adicionar(p);
                        this.setProvaAluno(p);
                        JOptionPane.showMessageDialog(null, "Prova montada com sucesso!");
                    }
                    if(acaoo==2){
                        p.setIdProva(getId());
                        controle.editar(p);
                    JOptionPane.showMessageDialog(null, "Prova editada com sucesso!");
                    }
                }
                limparCampos();
                setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione a turma!");
            cbTurma.requestFocus();
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
    }//GEN-LAST:event_bCancelarActionPerformed
    
    public void setProvaAluno(Prova prova) {
        List<Aluno> alunos = controleAluno.listarTodas();
        Aluno aluno = new Aluno();
        ProvaAluno pa = new ProvaAluno();
        
        int i = 0;
        while (alunos.size() > i) {
            aluno = alunos.get(i);
            if (prova.getTurma().equals(aluno.getTurma())) {
                pa.setAluno(aluno);
                pa.setProva(prova);
                this.setRespostasQuestoes(aluno, prova);
                controleProvaAluno.adicionar(pa);
            }
            i++;
        }
    }
    
    public void setRespostasQuestoes(Aluno aluno, Prova prova){
        if(!naotemquestoes){
            List<RespostaQuestao> listaRespostasQuestao = new ArrayList<>();
            RespostaQuestao rq = new RespostaQuestao();
        
            for(int i=0;i<questoesDessaProva.size();i++){
                rq.setAluno(aluno);
                rq.setProva(prova);
                rq.setQuestao(questoesDessaProva.get(i));
                controleRespostaQuestao.adicionar(rq);
            }
            aluno.setListaRespostasQuestao(listaRespostasQuestao);
            prova.setListaRespostasQuestao(listaRespostasQuestao);
        }
    }
    
    public void setQuestoesProva(Prova prova) {
        List<Questao> TODASquestoes = controleQuestao.listarTodas();
        Questao questao = new Questao();
        
        Boolean achou = false;
        int i = 0;
        while (TODASquestoes.size() > i) {
            questao = TODASquestoes.get(i);
            if (prova.getTurma().equals(questao.getDisciplina().getTurma())) {
                achou = true;
                questoesDessaProva.add(questao);
            }
            i++;
        }
        
        if(!achou){
            this.naotemquestoes = true;
        }
    }
    
    private void limparCampos() {
        cbTurma.setSelectedIndex(0);
        sliderQtd.setValue(1);
        sdeData.setDate(null);
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaDadosProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDadosProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDadosProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDadosProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDadosProva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bConfirmar;
    private javax.swing.JComboBox<Turma> cbTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JPanel pFundo;
    private com.toedter.calendar.JSpinnerDateEditor sdeData;
    private javax.swing.JSlider sliderQtd;
    // End of variables declaration//GEN-END:variables
}
