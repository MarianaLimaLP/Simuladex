/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Aluno;

import Control.ControleAluno;
import Control.ControleProvaAluno;
import Control.ControleRespostaQuestao;
import Model.Prova;
import Model.ProvaAluno;
import Model.Questao;
import Model.RespostaQuestao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class TelaSimulado extends javax.swing.JFrame {

    /**
     * Creates new form TelaSimulado
     */
    public TelaSimulado() {
        initComponents();
    }
    Questao QuestaoAtual = new Questao();
    List<Questao> QuestoesDaProva = new ArrayList<>();
    List<String> respostas = new ArrayList<>();
    
    ControleRespostaQuestao controleRespostaQuestao = new ControleRespostaQuestao();
    List<RespostaQuestao> listaRQ = new ArrayList<>();
    
    ControleProvaAluno controleProvaAluno = new ControleProvaAluno();
    ProvaAluno provaAluno = new ProvaAluno();
    
    
    public void verificarBotoes(){
        if(QuestoesDaProva.get(0)==QuestaoAtual){
            bAnterior.setVisible(false);
            bAnterior.setEnabled(false);
        } else {
            bAnterior.setVisible(true);
            bAnterior.setEnabled(true);
        }
        
        if(QuestoesDaProva.get(QuestoesDaProva.size()-1)==QuestaoAtual){
            bProximo.setText("Terminar Prova");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgAlternativas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pPrincipal = new javax.swing.JPanel();
        lTitulo2 = new javax.swing.JLabel();
        bAnterior = new javax.swing.JButton();
        bProximo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestao = new javax.swing.JTextArea();
        altA = new javax.swing.JRadioButton();
        altB = new javax.swing.JRadioButton();
        altC = new javax.swing.JRadioButton();
        altD = new javax.swing.JRadioButton();
        altE = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAltA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAltB = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAltC = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAltD = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAltE = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N

        pPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        pPrincipal.setPreferredSize(new java.awt.Dimension(800, 605));

        lTitulo2.setFont(new java.awt.Font("Gentium Book Basic", 1, 48)); // NOI18N
        lTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo2.setText("Simulado");

        bAnterior.setBackground(new java.awt.Color(0, 0, 0));
        bAnterior.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        bAnterior.setForeground(new java.awt.Color(255, 255, 255));
        bAnterior.setText("Questão Anterior");
        bAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnteriorActionPerformed(evt);
            }
        });

        bProximo.setBackground(new java.awt.Color(0, 0, 0));
        bProximo.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        bProximo.setForeground(new java.awt.Color(255, 255, 255));
        bProximo.setText("Próxima Questão");
        bProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProximoActionPerformed(evt);
            }
        });

        txtQuestao.setColumns(20);
        txtQuestao.setRows(5);
        txtQuestao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtQuestao);

        bgAlternativas.add(altA);

        bgAlternativas.add(altB);

        bgAlternativas.add(altC);

        bgAlternativas.add(altD);

        bgAlternativas.add(altE);

        txtAltA.setColumns(20);
        txtAltA.setRows(5);
        jScrollPane2.setViewportView(txtAltA);

        txtAltB.setColumns(20);
        txtAltB.setRows(5);
        jScrollPane3.setViewportView(txtAltB);

        txtAltC.setColumns(20);
        txtAltC.setRows(5);
        jScrollPane4.setViewportView(txtAltC);

        txtAltD.setColumns(20);
        txtAltD.setRows(5);
        jScrollPane5.setViewportView(txtAltD);

        txtAltE.setColumns(20);
        txtAltE.setRows(5);
        jScrollPane6.setViewportView(txtAltE);

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                        .addComponent(bAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pPrincipalLayout.createSequentialGroup()
                                .addComponent(altD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(altE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pPrincipalLayout.createSequentialGroup()
                                .addComponent(altA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(altB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(altC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altA)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altB)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altC))
                .addGap(18, 18, 18)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(altD)
                    .addComponent(jScrollPane6)
                    .addComponent(altE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
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

    private void bAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnteriorActionPerformed
        adicionarResposta();
        limparSelecao();
        setQuestaoAtual(QuestoesDaProva.get(getIndexDaQuestaoAtual()-1));
        verificarBotoes();
    }//GEN-LAST:event_bAnteriorActionPerformed

    private void bProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProximoActionPerformed
        TelaCorrecaoSimulado correcao = new TelaCorrecaoSimulado();
        TelaPrincipalAluno principal = new TelaPrincipalAluno();
        if(altA.isSelected()||altB.isSelected()||altC.isSelected()||altD.isSelected()||altE.isSelected()){
            adicionarResposta();
            verificarBotoes();
            if(bProximo.getText().equals("Terminar Prova")){
                this.acabar();
                this.setRespostasNasQuestoes();
                correcao.corrigirProva();
                setVisible(false);
                correcao.setVisible(true);
                limparSelecao();
            } else {
                limparSelecao();
                setQuestaoAtual(QuestoesDaProva.get(getIndexDaQuestaoAtual()+1));
                verificarBotoes();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma alternativa!");
        }
    }//GEN-LAST:event_bProximoActionPerformed
    
    public void comecar(){
        ProvaAluno pa = this.provaAluno;
        
        pa.setHorainicial(this.getHoraAtual());
        controleProvaAluno.editar(pa);
        this.provaAluno = pa;
    }
    
    public void acabar(){
        ProvaAluno pa = this.provaAluno;
        
        pa.setHorafinal(this.getHoraAtual());
        
        controleProvaAluno.editar(pa);
        this.provaAluno = pa;
    }
    
    public Boolean verSeAcabou(ProvaAluno pa){
        if(pa.getHorafinal()!=null){
            return true;
        } else {
            return false;
        }
        
    }
    
    public ProvaAluno getEfindProvaAluno(){
        ProvaAluno pa = new ProvaAluno();
        List<ProvaAluno> provasAlunos = controleProvaAluno.listarTodas();
        
        boolean achou = false;
        int i = 0;
        while ((!achou)&&(provasAlunos.size()>i)) {
            pa = provasAlunos.get(i);
            if (pa.getAluno().equals(ControleAluno.getAlunoLogado())) {
                achou = true;
            }
            i++;
        }
        
        this.provaAluno = pa;
        return this.provaAluno;
    }
    
    public String getHoraAtual(){
        Date horaAtual = new Date();
        String hora = new SimpleDateFormat("HH:mm").format(horaAtual);
        return hora;
    }
    
    public void limparSelecao(){
        if(altA.isSelected()||altB.isSelected()||altC.isSelected()||altD.isSelected()||altE.isSelected())
            bgAlternativas.clearSelection();
    }
    
    public void setarTXTs(){
        txtQuestao.setEditable(false);
        txtAltA.setEditable(false);
        txtAltB.setEditable(false);
        txtAltC.setEditable(false);
        txtAltD.setEditable(false);
        txtAltE.setEditable(false);
    }
    
    public List getListaDeQuestoes(){
        return QuestoesDaProva;
    }
    
    public void adicionarResposta(){
        if(altA.isSelected()){
            respostas.add(getIndexDaQuestaoAtual(), "a");
        }
        if(altB.isSelected()){
            respostas.add(getIndexDaQuestaoAtual(), "b");
        }
        if(altC.isSelected()){
            respostas.add(getIndexDaQuestaoAtual(), "c");
        }
        if(altD.isSelected()){
            respostas.add(getIndexDaQuestaoAtual(), "d");
        }
        if(altE.isSelected()){
            respostas.add(getIndexDaQuestaoAtual(), "e");
        }
    }
    
    public int getIndexDaQuestaoAtual(){
        return QuestoesDaProva.indexOf(QuestaoAtual);
    }
    
    public void setQuestaoAtual(Questao q){
        this.QuestaoAtual = q;
        lTitulo2.setText("Questão " + (QuestoesDaProva.indexOf(q)+1) + " de " + QuestoesDaProva.size());
        txtQuestao.setText(q.getDescricao());
        txtAltA.setText(q.getAltA());
        txtAltB.setText(q.getAltB());
        txtAltC.setText(q.getAltC());
        txtAltD.setText(q.getAltD());
        txtAltE.setText(q.getAltE());
    }
    public void setQuestoesdaProva(List questoes){
        this.QuestoesDaProva = questoes;
        Collections.shuffle(QuestoesDaProva);
    }
    
    public void setRespostasNasQuestoes(){
        List<RespostaQuestao> listaATUALIZADA = new ArrayList<>();
        
        this.organizarRespostasQuestoes();
        this.listaRQ = ControleAluno.getAlunoLogado().getListaRespostasQuestao();
        
        for(int i=0;i<this.listaRQ.size();i++){
            RespostaQuestao rq = new RespostaQuestao();
            rq.setAluno(listaRQ.get(i).getAluno());
            rq.setProva(listaRQ.get(i).getProva());
            rq.setQuestao(listaRQ.get(i).getQuestao());
            rq.setRespostadada(this.respostas.get(i));
            controleRespostaQuestao.editar(rq);
            System.out.println("RQ: ->>>"+rq);
            listaATUALIZADA.add(rq);
        }
        ControleAluno.getAlunoLogado().setListaRespostasQuestao(listaATUALIZADA);
    }
    
    public void organizarRespostasQuestoes(){
        List<RespostaQuestao> listaORGANIZADA = new ArrayList<>();
        List<RespostaQuestao> listaANTIGA = ControleAluno.getAlunoLogado().getListaRespostasQuestao();
        
        for(int i=0;i<listaANTIGA.size();i++){
            for(int y=0;y<this.QuestoesDaProva.size();y++){
                if(listaANTIGA.get(i).getQuestao().equals(this.QuestoesDaProva.get(y))){
                    System.out.println("entrou aqui");
                    listaORGANIZADA.add(listaANTIGA.get(i));
                }
            }
        }
        ControleAluno.getAlunoLogado().setListaRespostasQuestao(listaORGANIZADA);
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
            java.util.logging.Logger.getLogger(TelaSimulado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSimulado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSimulado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSimulado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSimulado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton altA;
    private javax.swing.JRadioButton altB;
    private javax.swing.JRadioButton altC;
    private javax.swing.JRadioButton altD;
    private javax.swing.JRadioButton altE;
    private javax.swing.JButton bAnterior;
    private javax.swing.JButton bProximo;
    private javax.swing.ButtonGroup bgAlternativas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lTitulo2;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JTextArea txtAltA;
    private javax.swing.JTextArea txtAltB;
    private javax.swing.JTextArea txtAltC;
    private javax.swing.JTextArea txtAltD;
    private javax.swing.JTextArea txtAltE;
    private javax.swing.JTextArea txtQuestao;
    // End of variables declaration//GEN-END:variables
}
