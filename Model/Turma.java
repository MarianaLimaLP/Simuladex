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
    @NamedQuery(name = "Turma.todas",       query = "SELECT turma FROM Turma turma"),
    @NamedQuery(name = "Turma.porId",       query = "SELECT turma FROM Turma turma WHERE turma.idTurma = :id"),
    @NamedQuery(name = "Turma.porSerie",    query = "SELECT turma FROM Turma turma WHERE turma.serie = :serie")
})
@Table(name="Turma")

public class Turma implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTurma")
    private Integer idTurma;
    
    @Column(name = "serie", nullable = false)
    private Integer serie;
    
    @ManyToOne
    @JoinColumn(name = "idCurso", referencedColumnName = "idCurso")
    private Curso curso;
    
    @OneToMany(mappedBy = "turma")
    List<Aluno> listaAlunos; 
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "turma")
    List<Disciplina> listaDisciplinas; 
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "turma")
    List<Prova> listaProvas; 
    
    
    public Turma() {
    }

    public Turma(Integer idTurma, Integer serie) {
        this.idTurma = idTurma;
        this.serie = serie;
    }

    public List<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    public List<Prova> getListaProvas() {
        return listaProvas;
    }

    public void setListaProvas(List<Prova> listaProvas) {
        this.listaProvas = listaProvas;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    
    public Integer getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Integer idTurma) {
        this.idTurma = idTurma;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.idTurma);
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
        final Turma other = (Turma) obj;
        if (!Objects.equals(this.idTurma, other.idTurma)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + serie + "ª série de " + curso;
    }

}
