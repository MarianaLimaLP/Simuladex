package Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "RespostaQuestao.todas", query = "SELECT rq FROM RespostaQuestao rq")
})
@Table(name = "RespostaQuestao")
@IdClass(RespostaQuestaoId.class)
public class RespostaQuestao implements Serializable{
    
    
    @Id
    @ManyToOne
    @JoinColumn(name="prontuario_aluno", referencedColumnName = "prontuario_aluno")
    private Aluno aluno;
    
    @Id
    @ManyToOne
    @JoinColumn(name="idQuestao", referencedColumnName = "idQuestao")
    private Questao questao;
    
    @Id
    @ManyToOne
    @JoinColumn(name="idProva", referencedColumnName = "idProva")
    private Prova prova;
    
    @Column(name = "respostadada", length = 1, nullable=false)
    private String respostadada;

    public RespostaQuestao() {
    }

    public RespostaQuestao(Aluno aluno, Questao questao, Prova prova, String respostadada) {
        this.aluno = aluno;
        this.questao = questao;
        this.prova = prova;
        this.respostadada = respostadada;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public String getRespostadada() {
        return respostadada;
    }

    public void setRespostadada(String respostadada) {
        this.respostadada = respostadada;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.aluno);
        hash = 41 * hash + Objects.hashCode(this.questao);
        hash = 41 * hash + Objects.hashCode(this.prova);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RespostaQuestao other = (RespostaQuestao) obj;
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        if (!Objects.equals(this.questao, other.questao)) {
            return false;
        }
        if (!Objects.equals(this.prova, other.prova)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aluno: " + aluno + ", questao: " + questao + ", prova: " + prova + ", respostadada: " + respostadada ;
    }

}
