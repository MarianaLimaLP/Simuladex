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
    @NamedQuery(name = "Curso.todas",       query = "SELECT curso FROM Curso curso"),
    @NamedQuery(name = "Curso.porId",       query = "SELECT curso FROM Curso curso WHERE curso.idCurso = :id"),
    @NamedQuery(name = "Curso.porNome",     query = "SELECT curso FROM Curso curso WHERE curso.nome like :nome")
})
@Table(name = "Curso")

public class Curso implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCurso")
    private Integer idCurso;
    
    @Column(name = "nome", length = 75, nullable = false)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "prontuario_coord", referencedColumnName = "prontuario_prof")
    private Professor professor;
    
    @OneToMany(mappedBy = "curso")
    private List<Turma> listaTurmas;
    
    public Curso(){
    }

    public Curso(Integer idCurso, String nome) {
        this.idCurso = idCurso;
        this.nome = nome;
    }

    public List<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(List<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.idCurso);
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
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.idCurso, other.idCurso)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nome;
    }

}
