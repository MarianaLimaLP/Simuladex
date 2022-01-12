package Control;

import Model.Curso;
import Model.Turma;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ControleTurma {
    
    public void adicionar(Turma t) {
        
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.persist(t);
        
        gerente.getTransaction().commit();
        gerente.close();
    }

    public void remover(Turma t) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        Turma excluirTurma = gerente.find(Turma.class, t.getIdTurma());
        
        gerente.getTransaction().begin();
        
        gerente.remove(excluirTurma);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public void editar(Turma t)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.merge(t);
        
        gerente.getTransaction().commit();
        gerente.close();
    }

    
    public List<Turma> listarTodas()
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Turma> consulta = gerente.createNamedQuery("Turma.todas", Turma.class);
        
        return consulta.getResultList();
        
    }
    
    public List<Turma> listarPorId(Integer id)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Turma> consulta = gerente.createNamedQuery("Turma.porId", Turma.class);
        
        consulta.setParameter("id", id);
        
        return consulta.getResultList(); 
    }

    public List<Turma> listarPorSerie(Integer serie)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Turma> consulta = gerente.createNamedQuery("Turma.porSerie", Turma.class);
        
        consulta.setParameter("serie", serie);
        
        return consulta.getResultList(); 
    }
    
}
