package View.Aluno;

import Control.ControleAluno;
import Control.ControleDisciplina;
import Control.ControleProva;
import Control.ControleProvaAluno;
import Control.ControleQuestao;
import Control.ControleRespostaQuestao;
import Control.ControleTurma;
import Model.Aluno;
import Model.Prova;
import Model.Questao;
import Model.Disciplina;
import Model.ProvaAluno;
import Model.Turma;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
//import static javax.management.Query.lt;

public class TelaPrincipalAluno extends javax.swing.JFrame {

    public TelaPrincipalAluno() {
        initComponents();
    }

    Boolean naotemprova = false;
    Prova provaDesseAluno = new Prova();
    ProvaAluno provaAluno = new ProvaAluno();
    Aluno alunoLogado = new Aluno();
    Disciplina disciplina = new Disciplina();
    ControleAluno controleAluno = new ControleAluno();
    ControleProvaAluno controleProvaAluno = new ControleProvaAluno();
    ControleProva controleProva = new ControleProva();
    ControleQuestao controleQuestao = new ControleQuestao();
    ControleRespostaQuestao controleRespostaQuestao = new ControleRespostaQuestao();
    ControleDisciplina controleDisc = new ControleDisciplina();
    ControleTurma controleTurma = new ControleTurma();
    List<Disciplina> listaDisc = new ArrayList<>();
    List<Questao> listaQuestao = new ArrayList<>();
    List<Questao> TODASasQuestoesDaProva = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        bSair = new javax.swing.JButton();
        bCorrecao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bComeçar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFundo.setBackground(new java.awt.Color(241, 241, 255));
        pFundo.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lTitulo.setFont(new java.awt.Font("Gentium Book Basic", 3, 48)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Bem vindo Aluno!");

        bSair.setBackground(new java.awt.Color(0, 0, 0));
        bSair.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        bSair.setForeground(new java.awt.Color(255, 255, 255));
        bSair.setText("SAIR");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        bCorrecao.setBackground(new java.awt.Color(255, 255, 255));
        bCorrecao.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        bCorrecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-redacao.png"))); // NOI18N
        bCorrecao.setText("Correção");
        bCorrecao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.black));
        bCorrecao.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bCorrecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCorrecaoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        bComeçar.setBackground(new java.awt.Color(0, 0, 0));
        bComeçar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-exameBranco.png"))); // NOI18N
        bComeçar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComeçarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Começar Prova");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bComeçar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bComeçar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 503, Short.MAX_VALUE)
                        .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bCorrecao, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCorrecao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void bComeçarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComeçarActionPerformed
        TelaSimulado simulado = new TelaSimulado();
        TelaCorrecaoSimulado correcao = new TelaCorrecaoSimulado();

        if (naotemprova) {
            JOptionPane.showMessageDialog(this, "Ainda não há prova para fazer!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            this.setProvaAluno(simulado.getEfindProvaAluno());
            if (simulado.verSeAcabou(simulado.getEfindProvaAluno())) {
                JOptionPane.showMessageDialog(this, "A prova já foi feita!!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                if (provaDesseAluno.getDatadosimulado().before(getPegaDataAtual())) {
                    System.out.println("Data do dimulado: "+provaDesseAluno.getDatadosimulado() + " e data atual:" + getPegaDataAtual());
                    questoes();
                    simulado.comecar();
                    simulado.setQuestoesdaProva(TODASasQuestoesDaProva);
                    simulado.setQuestaoAtual(TODASasQuestoesDaProva.get(0));
                    simulado.verificarBotoes();
                    simulado.setarTXTs();
                    simulado.setVisible(true);
                } else {
                    System.out.println("Data do dimulado: "+provaDesseAluno.getDatadosimulado() + " e data atual:" + getPegaDataAtual());
                    JOptionPane.showMessageDialog(this, "Hoje não é o dia de fazer prova!");
                }
            }
        }

    }//GEN-LAST:event_bComeçarActionPerformed

    private void bCorrecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCorrecaoActionPerformed
        TelaSimulado simulado = new TelaSimulado();
        TelaCorrecaoSimulado correcao = new TelaCorrecaoSimulado();
        
        if (naotemprova) {
            JOptionPane.showMessageDialog(this, "Ainda não há prova para fazer!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (simulado.verSeAcabou(simulado.getEfindProvaAluno())) {
                correcao.corrigirProva();
                correcao.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "A prova ainda não foi feita!");
            }
        }
    }//GEN-LAST:event_bCorrecaoActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        controleAluno.logoutAluno();
        setVisible(false);
    }//GEN-LAST:event_bSairActionPerformed
    public void setProvaAluno(ProvaAluno pa){
        this.provaAluno = pa;
    }
    public void setTitulo() {
        lTitulo.setText("Bem Vindo(a) " + controleAluno.getAlunoLogado().getNome() + "!!");
    }

    public void questoes() {
        this.listaDisc = controleDisc.listarTodas();

        for (int i = 0; i < listaDisc.size()-1; i++) {
            this.listaQuestao = getQuestoesdaDisciplina(listaDisc.get(i));
            Collections.shuffle(listaQuestao);
            for (int y = 0; y  < provaDesseAluno.getQtdquestaodisciplina(); y++) {
                this.TODASasQuestoesDaProva.add(listaQuestao.get(y));
            }
        }
    }

    public List<Questao> getQuestoesdaDisciplina(Disciplina disc) {
        List<Questao> TODASquestoes = controleQuestao.listarTodas();
        List<Questao> questoes = new ArrayList<>();
        Questao questao = new Questao();

        boolean achou = false;
        int i = 0;
        while (TODASquestoes.size() > i) {
            questao = TODASquestoes.get(i);
            if (questao.getDisciplina().equals(disc)) {
                questoes.add(questao);
            }
            i++;
        }
        return questoes;
    }

    public void setarProva() {
        List<Prova> provas = controleProva.listarTodas();
        Prova prova = new Prova();
        
        boolean achou = false;
        int i = 0;
        while ((!achou) && (provas.size()-1 >= i)) {
            prova = provas.get(i);
            if (prova.getTurma().equals(ControleAluno.getAlunoLogado().getTurma())) {
                achou = true;
                this.provaDesseAluno = prova;
            }
            i++;
        }
        if (achou == false) {
            this.naotemprova = true;
        } else {
            this.naotemprova = false;
        }
    }

    public Date getPegaDataAtual() {
        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        calendar.setTime(date);
        return calendar.getTime();
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
            java.util.logging.Logger.getLogger(TelaPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bComeçar;
    private javax.swing.JButton bCorrecao;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JPanel pFundo;
    // End of variables declaration//GEN-END:variables
}
