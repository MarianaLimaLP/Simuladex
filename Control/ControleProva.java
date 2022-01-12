package Control;

import Model.Prova;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ControleProva {
    
    public void adicionar(Prova p) {
        
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.persist(p);
        
        gerente.getTransaction().commit();
        gerente.close();
    }

    public void remover(Prova p) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        Prova excluirProva = gerente.find(Prova.class, p.getIdProva());
        
        gerente.getTransaction().begin();
        
        gerente.remove(excluirProva);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public void editar(Prova p)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.merge(p);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public List<Prova> listarTodas()
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Prova> consulta = gerente.createNamedQuery("Prova.todas", Prova.class);
        
        return consulta.getResultList();
        
    }
    
    public List<Prova> listarPorId(Integer id)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Prova> consulta = gerente.createNamedQuery("Prova.porId", Prova.class);
        
        consulta.setParameter("id", id);       
        return consulta.getResultList(); 
    }
    
}
