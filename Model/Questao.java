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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "Questao.todas",          query = "SELECT quest FROM Questao quest"),
    @NamedQuery(name = "Questao.Id",             query = "SELECT quest FROM Questao quest WHERE quest.idQuestao = :id"),
    @NamedQuery(name = "Questao.porDescricao",   query = "SELECT quest FROM Questao quest WHERE quest.descricao like :desc")
})
@Table(name = "Questao")
public class Questao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idQuestao")
    private Integer idQuestao;
    
    @Column(name = "descricao", length = 5000, nullable = false)
    private String descricao;
    
    @Column(name = "altA", length = 1000, nullable = false)
    private String altA;
    
    @Column(name = "altB", length = 1000, nullable = false)
    private String altB;
    
    @Column(name = "altC", length = 1000, nullable = false)
    private String altC;
    
    @Column(name = "altD", length = 1000, nullable = false)
    private String altD;
    
    @Column(name = "altE", length = 1000, nullable = false)
    private String altE;
    
    @Column(name = "respostaCorreta", length = 1, nullable = false)
    private String respostaCorreta;
    
    @Column(name = "explicacao", length = 5000, nullable = false)
    private String explicacao;
    
    @ManyToOne
    @JoinColumn(name = "idDisciplina", referencedColumnName = "idDisciplina")
    private Disciplina disciplina;

    @ManyToMany(mappedBy = "listaQuestoes")
    private List<Prova> listaProvas;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questao")
    private List<RespostaQuestao> listaRespostasQuestao;

    public Questao() {
    }

    public Questao(Integer idQuestao, String descricao, String altA, String altB, String altC, String altD, String altE, String respostaCorreta, String explicacao, Disciplina disciplina) {
        this.idQuestao = idQuestao;
        this.descricao = descricao;
        this.altA = altA;
        this.altB = altB;
        this.altC = altC;
        this.altD = altD;
        this.altE = altE;
        this.respostaCorreta = respostaCorreta;
        this.explicacao = explicacao;
        this.disciplina = disciplina;
    }

    public List<Prova> getListaProvas() {
        return listaProvas;
    }

    public void setListaProvas(List<Prova> listaProvas) {
        this.listaProvas = listaProvas;
    }

    public List<RespostaQuestao> getListaRespostasQuestao() {
        return listaRespostasQuestao;
    }

    public void setListaRespostasQuestao(List<RespostaQuestao> listaRespostasQuestao) {
        this.listaRespostasQuestao = listaRespostasQuestao;
    }

    public Integer getIdQuestao() {
        return idQuestao;
    }

    public void setIdQuestao(Integer idQuestao) {
        this.idQuestao = idQuestao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public String getExplicacao() {
        return explicacao;
    }

    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getAltA() {
        return altA;
    }

    public void setAltA(String altA) {
        this.altA = altA;
    }

    public String getAltB() {
        return altB;
    }

    public void setAltB(String altB) {
        this.altB = altB;
    }

    public String getAltC() {
        return altC;
    }

    public void setAltC(String altC) {
        this.altC = altC;
    }

    public String getAltD() {
        return altD;
    }

    public void setAltD(String altD) {
        this.altD = altD;
    }

    public String getAltE() {
        return altE;
    }

    public void setAltE(String altE) {
        this.altE = altE;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.idQuestao);
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
        final Questao other = (Questao) obj;
        if (!Objects.equals(this.idQuestao, other.idQuestao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + idQuestao + ", " + respostaCorreta + ", " + disciplina;
    }
    
}
