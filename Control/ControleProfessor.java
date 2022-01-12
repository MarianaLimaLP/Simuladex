package Control;

import Model.Professor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ControleProfessor {
    
    public void adicionar(Professor p) {
        
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.persist(p);
        
        gerente.getTransaction().commit();
        gerente.close();
    }

    public void remover(Professor p) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        Professor excluirProf = gerente.find(Professor.class, p.getProntuario());
        
        gerente.getTransaction().begin();
        
        gerente.remove(excluirProf);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public void editar(Professor p)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.merge(p);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public List<Professor> listarTodas()
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Professor> consulta = gerente.createNamedQuery("Professor.todas", Professor.class);
//        Query consulta = gerente.createQuery("SELECT prof FROM Professor prof");
        
        return consulta.getResultList();
        
    }

    public List<Professor> listarCoordenadores()
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Professor> consulta = gerente.createNamedQuery("Professor.profCoords", Professor.class);
        
        return consulta.getResultList(); 
    }
    
    public List<Professor> listarPorNome(String nome)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Professor> consulta = gerente.createNamedQuery("Professor.porNome", Professor.class);
        
        consulta.setParameter("nome", "%"+nome+"%");
        
        return consulta.getResultList(); 
    }

    public List<Professor> listarPorProntuario(String pront)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Professor> consulta = gerente.createNamedQuery("Professor.porProntuario", Professor.class);
        
        consulta.setParameter("pront", "%"+pront+"%");
        
        return consulta.getResultList(); 
    }
    
    public List<Professor> listarAtuadores()
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Professor> consulta = gerente.createNamedQuery("Professor.atua", Professor.class);
        
        return consulta.getResultList(); 
    }
    
    private static Professor profLogado = null;
    
    public static Professor getProfLogado() {
        return profLogado;
    }
    
    public static boolean isProfLogado()
    {
        if (profLogado == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static void logoutProf()
    {
        ControleProfessor.profLogado = null;
    }
    
    public static boolean logarProf(String prontuario, String senha) {
        
        boolean logou = false;
                
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        List<Professor> listaProfs;
    
        TypedQuery<Professor> consulta = gerente.createNamedQuery("Professor.Acessar", Professor.class);
        
        consulta.setParameter("prontuario", prontuario);
        consulta.setParameter("senha", senha);
        
        listaProfs = consulta.getResultList();
        
        if (listaProfs.isEmpty())
        {
            ControleProfessor.profLogado =  null;
            
        }
        else
        {
            ControleProfessor.profLogado = listaProfs.get(0);
            logou = true;
        }
        
        return logou;
    }
    
}
