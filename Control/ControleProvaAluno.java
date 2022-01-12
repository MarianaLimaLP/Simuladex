package Control;

import Model.ProvaAluno;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ControleProvaAluno {
    
    public void adicionar(ProvaAluno pa) {
        
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.persist(pa);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public void editar(ProvaAluno pa)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.merge(pa);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public static List<ProvaAluno> listarTodas()
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<ProvaAluno> consulta = gerente.createNamedQuery("ProvaAluno.todas", ProvaAluno.class);
        
        return consulta.getResultList();
        
    }
    
}
