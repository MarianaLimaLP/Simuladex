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
    @NamedQuery(name = "ProvaAluno.todas", query = "SELECT pa FROM ProvaAluno pa")
})
@Table(name = "ProvaAluno")
@IdClass(ProvaAlunoId.class)
public class ProvaAluno implements Serializable{
    
    @Id
    @ManyToOne
    @JoinColumn(name="prontuario_aluno", referencedColumnName = "prontuario_aluno")
    private Aluno aluno;
    
    @Id
    @ManyToOne
    @JoinColumn(name="idProva", referencedColumnName = "idProva")
    private Prova prova;
    
    @Column(name = "horafinal", nullable = true, length = 5)
    private String horafinal;
    
    @Column(name = "horainicial", nullable = true, length = 5)
    private String horainicial;

    public ProvaAluno() {
    }

    public ProvaAluno(Aluno aluno, Prova prova, String horafinal, String horainicial) {
        this.aluno = aluno;
        this.prova = prova;
        this.horafinal = horafinal;
        this.horainicial = horainicial;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public String getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }

    public String getHorainicial() {
        return horainicial;
    }

    public void setHorainicial(String horainicial) {
        this.horainicial = horainicial;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.aluno);
        hash = 97 * hash + Objects.hashCode(this.prova);
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
        final ProvaAluno other = (ProvaAluno) obj;
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        if (!Objects.equals(this.prova, other.prova)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aluno: " + aluno + ", prova: " + prova + ", hora final: " + horafinal + ", hora inicial: " + horainicial;
    }
    

}
