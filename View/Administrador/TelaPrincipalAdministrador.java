package View.Administrador;

import Control.ControleAluno;
import Control.ControleCurso;
import Control.ControleProfessor;
import Control.ControleTurma;
import View.Administrador.DialogDisciplina;
import View.Administrador.DialogTurma;
import View.Administrador.DialogAluno;
import View.Administrador.DialogProfessor;
import View.Administrador.DialogCurso;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;

public class TelaPrincipalAdministrador extends javax.swing.JFrame {

    ControleProfessor controleProf = new ControleProfessor();
    ControleCurso controleCurso = new ControleCurso();
    ControleTurma controleTurma = new ControleTurma();
    ControleAluno controleAluno = new ControleAluno();
    
    public TelaPrincipalAdministrador() {
        initComponents();
        
        setResizable(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        lAtencao = new javax.swing.JLabel();
        bProfessor = new javax.swing.JButton();
        bCurso = new javax.swing.JButton();
        bTurma = new javax.swing.JButton();
        bAluno = new javax.swing.JButton();
        bDisciplina = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        bRelatorioProf = new javax.swing.JButton();
        bRelatorioAlunos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFundo.setBackground(new java.awt.Color(241, 241, 255));
        pFundo.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 50, 50, 50, new javax.swing.ImageIcon(getClass().getResource("/imagens/azul3.jpg")))); // NOI18N
        pFundo.setForeground(new java.awt.Color(255, 255, 255));
        pFundo.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lTitulo.setFont(new java.awt.Font("Gentium Book Basic", 1, 55)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-administrar.png"))); // NOI18N
        lTitulo.setText("Administrar");

        lAtencao.setFont(new java.awt.Font("Gentium Book Basic", 0, 18)); // NOI18N
        lAtencao.setText("ATENÇÃO!!! Os 3 primeiros itens só podem ser cadastrados em sua respectiva ordem:");

        bProfessor.setBackground(new java.awt.Color(0, 0, 0));
        bProfessor.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        bProfessor.setForeground(new java.awt.Color(255, 255, 255));
        bProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-professor.png"))); // NOI18N
        bProfessor.setText("Professor");
        bProfessor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        bProfessor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProfessorActionPerformed(evt);
            }
        });

        bCurso.setBackground(new java.awt.Color(0, 0, 0));
        bCurso.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        bCurso.setForeground(new java.awt.Color(255, 255, 255));
        bCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-curso.png"))); // NOI18N
        bCurso.setText("Curso");
        bCurso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        bCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCursoActionPerformed(evt);
            }
        });

        bTurma.setBackground(new java.awt.Color(0, 0, 0));
        bTurma.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        bTurma.setForeground(new java.awt.Color(255, 255, 255));
        bTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-turma.png"))); // NOI18N
        bTurma.setText("Turma");
        bTurma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        bTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTurmaActionPerformed(evt);
            }
        });

        bAluno.setBackground(new java.awt.Color(0, 0, 0));
        bAluno.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        bAluno.setForeground(new java.awt.Color(255, 255, 255));
        bAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-estudante.png"))); // NOI18N
        bAluno.setText("Aluno");
        bAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        bAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlunoActionPerformed(evt);
            }
        });

        bDisciplina.setBackground(new java.awt.Color(0, 0, 0));
        bDisciplina.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        bDisciplina.setForeground(new java.awt.Color(255, 255, 255));
        bDisciplina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-discplina.png"))); // NOI18N
        bDisciplina.setText("Disciplina");
        bDisciplina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        bDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDisciplinaActionPerformed(evt);
            }
        });

        bSair.setBackground(new java.awt.Color(0, 0, 0));
        bSair.setFont(new java.awt.Font("Gentium Book Basic", 0, 24)); // NOI18N
        bSair.setForeground(new java.awt.Color(255, 255, 255));
        bSair.setText("SAIR");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        bRelatorioProf.setBackground(new java.awt.Color(51, 51, 51));
        bRelatorioProf.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        bRelatorioProf.setForeground(new java.awt.Color(255, 255, 255));
        bRelatorioProf.setText("Relatório de Professores");
        bRelatorioProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelatorioProfActionPerformed(evt);
            }
        });

        bRelatorioAlunos.setBackground(new java.awt.Color(51, 51, 51));
        bRelatorioAlunos.setFont(new java.awt.Font("Gentium Book Basic", 0, 14)); // NOI18N
        bRelatorioAlunos.setForeground(new java.awt.Color(255, 255, 255));
        bRelatorioAlunos.setText("Relatório de Alunos");
        bRelatorioAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelatorioAlunosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAtencao, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bRelatorioProf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bRelatorioAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lAtencao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRelatorioProf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRelatorioAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pFundoLayout = new javax.swing.GroupLayout(pFundo);
        pFundo.setLayout(pFundoLayout);
        pFundoLayout.setHorizontalGroup(
            pFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pFundoLayout.setVerticalGroup(
            pFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFundoLayout.createSequentialGroup()
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

    private void bTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTurmaActionPerformed
        DialogTurma turma = new DialogTurma(this, true);
        if(controleCurso.listarTodas().isEmpty()){
            JOptionPane.showMessageDialog(null, "Precisa ser adicionado pelo menos um curso para cadastrar uma turma!");
        } else {
            turma.atualizarTabela();
            turma.setVisible(true);
        }
    }//GEN-LAST:event_bTurmaActionPerformed

    private void bCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCursoActionPerformed
        DialogCurso curso = new DialogCurso(this, true);
        if(controleProf.listarCoordenadores().isEmpty()){
            JOptionPane.showMessageDialog(null, "Precisa ser adicionado pelo menos um professor coordenador para cadastrar um curso!");
        } else {
            curso.atualizarTabela();
            curso.setVisible(true);
        }
    }//GEN-LAST:event_bCursoActionPerformed

    private void bDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDisciplinaActionPerformed
        DialogDisciplina disciplina = new DialogDisciplina(this, true);
        if(controleTurma.listarTodas().isEmpty()){
            JOptionPane.showMessageDialog(null, "Precisa ser adicionado pelo menos uma turma para cadastrar uma turma!");
        } else if(controleProf.listarCoordenadores().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Precisa ser adicionado pelo menos um professor coordenador para cadastrar um curso!");
        } else {
            disciplina.atualizarTabela();
            disciplina.setVisible(true);
        }
    }//GEN-LAST:event_bDisciplinaActionPerformed

    private void bAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlunoActionPerformed
        DialogAluno aluno = new DialogAluno(this, true);
        if(controleTurma.listarTodas().isEmpty()){
            JOptionPane.showMessageDialog(null, "Precisa ser adicionado pelo menos uma turma para cadastrar um aluno!");
        } else {
            aluno.atualizarTabela();
            aluno.setVisible(true);
        }
    }//GEN-LAST:event_bAlunoActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_bSairActionPerformed

    private void bProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProfessorActionPerformed
        DialogProfessor prof = new DialogProfessor(this, true);
        prof.atualizarTabela();
        prof.setVisible(true);
    }//GEN-LAST:event_bProfessorActionPerformed

    private void bRelatorioProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelatorioProfActionPerformed
        if(controleProf.listarTodas().isEmpty()){
            JOptionPane.showMessageDialog(this, "Não há professores para mostrar", "Nenhum Professor", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                JasperReport relatorioCompilado = JasperCompileManager.compileReport("src/Relatorios/RelatorioProfessores.jrxml");
            
                JasperPrint relatorioPreenchido = JasperFillManager.fillReport(relatorioCompilado, null, new JRBeanCollectionDataSource(controleProf.listarTodas()));

                JDialog tela = new JDialog(this, "RelatorioProfessores", true);
                tela.setSize(800, 800);
            
                JRViewer painelRelatorio = new JRViewer(relatorioPreenchido);
            
                tela.getContentPane().add(painelRelatorio);
            
                tela.setVisible(true);
            
            } catch (JRException ex) {
                Logger.getLogger(TelaPrincipalAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Erro ao gerar Relatório.");
            }
        }
    }//GEN-LAST:event_bRelatorioProfActionPerformed

    private void bRelatorioAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelatorioAlunosActionPerformed
        if(controleAluno.listarTodas().isEmpty()){
            JOptionPane.showMessageDialog(this, "Não há alunos para mostrar", "Nenhum Aluno", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                JasperReport relatorioCompilado = JasperCompileManager.compileReport("src/Relatorios/RelatorioAlunos.jrxml");
            
                JasperPrint relatorioPreenchido = JasperFillManager.fillReport(relatorioCompilado, null, new JRBeanCollectionDataSource(controleAluno.listarTodas()));

                JDialog tela = new JDialog(this, "RelatorioAlunos", true);
                tela.setSize(800,800);
            
                JRViewer painelRelatorio = new JRViewer(relatorioPreenchido);
            
                tela.getContentPane().add(painelRelatorio);
            
                tela.setVisible(true);
            
            } catch (JRException ex) {
                Logger.getLogger(TelaPrincipalAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Erro ao gerar Relatório.");
            }
        }
    }//GEN-LAST:event_bRelatorioAlunosActionPerformed


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
    private javax.swing.JButton bAluno;
    private javax.swing.JButton bCurso;
    private javax.swing.JButton bDisciplina;
    private javax.swing.JButton bProfessor;
    private javax.swing.JButton bRelatorioAlunos;
    private javax.swing.JButton bRelatorioProf;
    private javax.swing.JButton bSair;
    private javax.swing.JButton bTurma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAtencao;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JPanel pFundo;
    // End of variables declaration//GEN-END:variables
}
