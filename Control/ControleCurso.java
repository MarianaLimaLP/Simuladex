package Control;

import Model.Curso;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ControleCurso {
    
    public void adicionar(Curso c) {
        
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.persist(c);
        
        gerente.getTransaction().commit();
        gerente.close();
    }

    public void remover(Curso c) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        Curso excluirCurso = gerente.find(Curso.class, c.getIdCurso());
        
        gerente.getTransaction().begin();
        
        gerente.remove(excluirCurso);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public void editar(Curso c)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.merge(c);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public List<Curso> listarTodas()
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Curso> consulta = gerente.createNamedQuery("Curso.todas", Curso.class);
        
        return consulta.getResultList();
        
    }

    public List<Curso> listarPorId(Integer id)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Curso> consulta = gerente.createNamedQuery("Curso.porId", Curso.class);
        
        consulta.setParameter("id", id);
        
        return consulta.getResultList(); 
    }
    
    public List<Curso> listarPorNome(String nome)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Curso> consulta = gerente.createNamedQuery("Curso.porNome", Curso.class);
        
        consulta.setParameter("nome", "%"+nome+"%");
        
        return consulta.getResultList(); 
    }
    
}
