package Control;

import Model.Disciplina;
import Model.Professor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ControleDisciplina {
    
    public void adicionar(Disciplina d) {
        
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.persist(d);
        
        gerente.getTransaction().commit();
        gerente.close();
    }

    public void remover(Disciplina d) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        Disciplina excluirDisc = gerente.find(Disciplina.class, d.getIdDisciplina());
        
        gerente.getTransaction().begin();
        
        gerente.remove(excluirDisc);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public void editar(Disciplina d)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.merge(d);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public List<Disciplina> listarTodas()
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Disciplina> consulta = gerente.createNamedQuery("Disciplina.todas", Disciplina.class);
        
        return consulta.getResultList();
        
    }
    
    public List<Disciplina> listarPorId(Integer id)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Disciplina> consulta = gerente.createNamedQuery("Disciplina.porId", Disciplina.class);
        
        consulta.setParameter("id", id);       
        return consulta.getResultList(); 
    }
    
    public List<Disciplina> listarPorNome(String nome)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Disciplina> consulta = gerente.createNamedQuery("Disciplina.porNome", Disciplina.class);
        
        consulta.setParameter("nome", "%"+nome+"%");
        
        return consulta.getResultList(); 
    }

    public List<Disciplina> listarPorArea(String area)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Disciplina> consulta = gerente.createNamedQuery("Disciplina.porArea", Disciplina.class);
        
        consulta.setParameter("area", "%"+area+"%");
        
        return consulta.getResultList(); 
    }
    
}
