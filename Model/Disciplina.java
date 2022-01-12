package Model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "Disciplina.todas",          query = "SELECT disc FROM Disciplina disc"),
    @NamedQuery(name = "Disciplina.Id",             query = "SELECT disc FROM Disciplina disc WHERE disc.idDisciplina = :id"),
    @NamedQuery(name = "Disciplina.porNome",        query = "SELECT disc FROM Disciplina disc WHERE disc.nome like :nome"),
    @NamedQuery(name = "Disciplina.porArea",        query = "SELECT disc FROM Disciplina disc WHERE disc.area like :area")
})
@Table(name = "Disciplina")
public class Disciplina implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDisciplina")
    private Integer idDisciplina;
    
    @Column(name = "nome_disc", length = 75, nullable = false)
    private String nome;
    
    @Column(name = "areaDeEnsino", length = 100, nullable = false)
    private String area;

    @ManyToOne
    @JoinColumn(name = "idTurma", referencedColumnName = "idTurma")
    private Turma turma;
    
    @ManyToOne
    @JoinColumn(name = "prontuario_prof", referencedColumnName = "prontuario_prof")
    private Professor prontuario_prof;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "disciplina")
    private List<Questao> listaQuestoes; 
    
    public Disciplina() {
    }

    public Disciplina(Integer idDisciplina, String nome, String area) {
        this.idDisciplina = idDisciplina;
        this.nome = nome;
        this.area = area;
    }

    public List<Questao> getListaQuestoes() {
        return listaQuestoes;
    }

    public void setListaQuestoes(List<Questao> listaQuestoes) {
        this.listaQuestoes = listaQuestoes;
    }

    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Professor getProntuario_prof() {
        return prontuario_prof;
    }

    public void setProntuario_prof(Professor prontuario_prof) {
        this.prontuario_prof = prontuario_prof;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idDisciplina);
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
        final Disciplina other = (Disciplina) obj;
        if (!Objects.equals(this.idDisciplina, other.idDisciplina)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nome + ", " + turma + ", " + prontuario_prof ;
    }

}
