package Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;

public class RespostaQuestaoId implements Serializable{
    
    private Integer aluno;
    private Integer questao;
    private Integer prova;

    public RespostaQuestaoId() {
    }

    public RespostaQuestaoId(Integer aluno, Integer questao, Integer prova) {
        this.aluno = aluno;
        this.questao = questao;
        this.prova = prova;
    }

    public Integer getAluno() {
        return aluno;
    }

    public void setAluno(Integer aluno) {
        this.aluno = aluno;
    }

    public Integer getQuestao() {
        return questao;
    }

    public void setQuestao(Integer questao) {
        this.questao = questao;
    }

    public Integer getProva() {
        return prova;
    }

    public void setProva(Integer prova) {
        this.prova = prova;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.aluno);
        hash = 73 * hash + Objects.hashCode(this.questao);
        hash = 73 * hash + Objects.hashCode(this.prova);
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
        final RespostaQuestaoId other = (RespostaQuestaoId) obj;
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
    
}
