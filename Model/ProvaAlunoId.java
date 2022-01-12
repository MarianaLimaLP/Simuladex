package Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

public class ProvaAlunoId implements Serializable{
    
    private Integer aluno;
    private Integer prova;

    public ProvaAlunoId() {
    }

    public ProvaAlunoId(Integer aluno, Integer prova) {
        this.aluno = aluno;
        this.prova = prova;
    }

    public Integer getAluno() {
        return aluno;
    }

    public void setAluno(Integer aluno) {
        this.aluno = aluno;
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
        hash = 19 * hash + Objects.hashCode(this.aluno);
        hash = 19 * hash + Objects.hashCode(this.prova);
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
        final ProvaAlunoId other = (ProvaAlunoId) obj;
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        if (!Objects.equals(this.prova, other.prova)) {
            return false;
        }
        return true;
    }
    
}
