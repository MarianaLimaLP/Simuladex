package Model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({
    @NamedQuery(name = "Prova.todas",          query = "SELECT prova FROM Prova prova"),
    @NamedQuery(name = "Prova.Id",             query = "SELECT prova FROM Prova prova WHERE prova.idProva = :id")
})
@Table(name = "Prova")
public class Prova implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProva")
    private Integer idProva;
    
    @Column(name = "qtdquestaodisciplina", nullable = false)
    private Integer qtdquestaodisciplina;
    
    @Column(name = "datadosimulado", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datadosimulado;

    @ManyToOne
    @JoinColumn(name = "idTurma", referencedColumnName = "idTurma")
    private Turma turma;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prova")
    private List<ProvaAluno> listaProvasAluno;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prova")
    private List<RespostaQuestao> listaRespostasQuestao; 
    
    @JoinTable(name = "questaoprova", joinColumns = {
        @JoinColumn(name = "idProva", referencedColumnName = "idProva")}, inverseJoinColumns = {
        @JoinColumn(name = "idQuestao", referencedColumnName = "idQuestao")})
    @ManyToMany
    private List<Questao> listaQuestoes;
    
    public Prova() {
    }

    public Prova(Integer idProva, Integer qtdquestaodisciplina, Date datadosimulado) {
        this.idProva = idProva;
        this.qtdquestaodisciplina = qtdquestaodisciplina;
        this.datadosimulado = datadosimulado;
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

    public List<Questao> getListaQuestoes() {
        return listaQuestoes;
    }

    public void setListaQuestoes(List<Questao> listaQuestoes) {
        this.listaQuestoes = listaQuestoes;
    }

    public Integer getIdProva() {
        return idProva;
    }

    public void setIdProva(Integer idProva) {
        this.idProva = idProva;
    }

    public Integer getQtdquestaodisciplina() {
        return qtdquestaodisciplina;
    }

    public void setQtdquestaodisciplina(Integer qtdquestaodisciplina) {
        this.qtdquestaodisciplina = qtdquestaodisciplina;
    }

    public Date getDatadosimulado() {
        return datadosimulado;
    }

    public void setDatadosimulado(Date datadosimulado) {
        this.datadosimulado = datadosimulado;
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
        hash = 83 * hash + Objects.hashCode(this.idProva);
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
        final Prova other = (Prova) obj;
        if (!Objects.equals(this.idProva, other.idProva)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        String datadoSimuladoFormatada = formatador.format(datadosimulado);
        
        return "" + idProva + ", " + qtdquestaodisciplina + " questões, dia " + datadoSimuladoFormatada;
    }

    
}
