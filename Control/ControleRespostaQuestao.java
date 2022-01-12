package Control;

import Model.RespostaQuestao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ControleRespostaQuestao {
    
    public void adicionar(RespostaQuestao rq) {
        
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.persist(rq);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public void editar(RespostaQuestao rq)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.merge(rq);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public static List<RespostaQuestao> listarTodas()
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<RespostaQuestao> consulta = gerente.createNamedQuery("RespostaQuestao.todas", RespostaQuestao.class);
        
        return consulta.getResultList();
        
    }
    
}
