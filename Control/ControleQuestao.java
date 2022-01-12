package Control;

import Model.Disciplina;
import Model.Questao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ControleQuestao {
    
    public void adicionar(Questao q) {
        
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.persist(q);
        
        gerente.getTransaction().commit();
        gerente.close();
    }

    public void remover(Questao q) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        Questao excluirQuestao = gerente.find(Questao.class, q.getIdQuestao());
        
        gerente.getTransaction().begin();
        
        gerente.remove(excluirQuestao);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public void editar(Questao q)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.merge(q);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public List<Questao> listarTodas()
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Questao> consulta = gerente.createNamedQuery("Questao.todas", Questao.class);
        
        return consulta.getResultList();
        
    }
    
    public List<Questao> listarPorId(Integer id)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Questao> consulta = gerente.createNamedQuery("Questao.porId", Questao.class);
        
        consulta.setParameter("id", id);       
        return consulta.getResultList(); 
    }
    
    public List<Questao> listarPorDescricao(String desc)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Questao> consulta = gerente.createNamedQuery("Questao.porDescricao", Questao.class);
        
        consulta.setParameter("desc", "%"+desc+"%");       
        return consulta.getResultList(); 
    }
    
}
