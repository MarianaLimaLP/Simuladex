package Model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "Aluno.todas",           query = "SELECT aluno FROM Aluno aluno"),
    @NamedQuery(name = "Aluno.porProntuario",   query = "SELECT aluno FROM Aluno aluno WHERE aluno.prontuario = :pront"),
    @NamedQuery(name = "Aluno.porNome",         query = "SELECT aluno FROM Aluno aluno WHERE aluno.nome like :nome"),
    @NamedQuery(name = "Aluno.Acessar",         query = "SELECT aluno FROM Aluno aluno WHERE aluno.prontuario = :prontuario AND aluno.senha like :senha")
})
@Table(name = "Aluno")
public class Aluno implements Serializable {
    @Id
    @Column(name = "prontuario_aluno")
    private Integer prontuario;
    
    @Column(name = "nome", length = 75, nullable = false)
    private String nome;
    
    @Column(name = "email", length = 75)
    private String email;
    
    @Column(name = "senha", length = 20, nullable = false)
    private String senha;
    
    @ManyToOne
    @JoinColumn(name = "idTurma", referencedColumnName = "idTurma")
    private Turma turma;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
    private List<ProvaAluno> listaProvasAluno;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
    private List<RespostaQuestao> listaRespostasQuestao; 
    
    public Aluno() {
    }

    public Aluno(Integer prontuario, String nome, String email, String senha) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public List<ProvaAluno> getListaProvasAluno() {
        return listaProvasAluno;
    }

    public void setListaProvasAluno(List<ProvaAluno> listaProvasAluno) {
        this.listaProvasAluno = listaProvasAluno;
    }

    public List<RespostaQuestao> getListaRespostasQuestao() {
        return listaRespostasQuestao;
    }

    public void setListaRespostasQuestao(List<RespostaQuestao> listaRespostasQuestao) {
        this.listaRespostasQuestao = listaRespostasQuestao;
    }

    public Integer getProntuario() {
        return prontuario;
    }

    public void setProntuario(Integer prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.prontuario);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.prontuario, other.prontuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", " + prontuario + ", " + turma;
    }

    
}
