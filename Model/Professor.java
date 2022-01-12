package Model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "Professor.todas",           query = "SELECT prof FROM Professor prof"),
    @NamedQuery(name = "Professor.profCoords",      query = "SELECT prof FROM Professor prof WHERE prof.coord_prof = true"),
    @NamedQuery(name = "Professor.porNome",         query = "SELECT prof FROM Professor prof WHERE prof.nome like :nome"),
    @NamedQuery(name = "Professor.porProntuario",   query = "SELECT prof FROM Professor prof WHERE prof.prontuario like :pront"),
    @NamedQuery(name = "Professor.atua",            query = "SELECT prof FROM Professor prof WHERE prof.atua = true"),
    @NamedQuery(name = "Professor.Acessar",         query = "SELECT prof FROM Professor prof WHERE prof.prontuario like :prontuario AND prof.senha like :senha")
})
@Table(name = "Professor")
public class Professor implements Serializable {
    @Id
    @Column(name = "prontuario_prof", length = 7)
    private String prontuario;
    
    @Column(name = "nome", length = 75, nullable = false)
    private String nome;
    
    @Column(name = "titulacao", length = 75, nullable = false)
    private String titulacao;
    
    @Column(name = "atua", nullable = false)
    private boolean atua;
    
    @Column(name = "coord", nullable = false)
    private boolean coord_prof;
    
    @Column(name = "cpf", length = 14, nullable = false)
    private String cpf;
    
    @Column(name = "email", length = 75, nullable = false)
    private String email;
    
    @Column(name = "senha", length = 20, nullable = false)
    private String senha;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prontuario_prof")
    private List<Disciplina> listaDisciplinas;

    @OneToMany(mappedBy = "professor")
    private List<Curso> listaCursos;

    public Professor(){
    }

    public Professor(String prontuario, String nome, String titulacao, boolean atua, boolean coord_prof, String cpf, String email, String senha) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.titulacao = titulacao;
        this.atua = atua;
        this.coord_prof = coord_prof;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public boolean getAtua() {
        return atua;
    }

    public void setAtua(boolean atua) {
        this.atua = atua;
    }

    public boolean getCoord_prof() {
        return coord_prof;
    }

    public void setCoord_prof(boolean coord_prof) {
        this.coord_prof = coord_prof;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.prontuario);
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
        final Professor other = (Professor) obj;
        if (!Objects.equals(this.prontuario, other.prontuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nome;
    }

}
