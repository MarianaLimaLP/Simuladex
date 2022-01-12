package Control;

import javax.persistence.EntityManager;
import Model.Aluno;
import java.util.List;
import javax.persistence.TypedQuery;

public class ControleAluno {
    
    public void adicionar(Aluno a) {
        
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.persist(a);
        
        gerente.getTransaction().commit();
        gerente.close();
    }

    public void remover(Aluno a) {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        Aluno excluirAluno = gerente.find(Aluno.class, a.getProntuario());
        
        gerente.getTransaction().begin();
        
        gerente.remove(excluirAluno);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public void editar(Aluno a)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        gerente.getTransaction().begin();
        
        gerente.merge(a);
        
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public static List<Aluno> listarTodas()
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Aluno> consulta = gerente.createNamedQuery("Aluno.todas", Aluno.class);
        
        return consulta.getResultList();
        
    }
    
    public List<Aluno> listarPorProntuario(Integer pront)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Aluno> consulta = gerente.createNamedQuery("Aluno.porProntuario", Aluno.class);
        
        consulta.setParameter("pront", pront);
        
        return consulta.getResultList(); 
    }
    
    public List<Aluno> listarPorNome(String nome)
    {
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        TypedQuery<Aluno> consulta = gerente.createNamedQuery("Aluno.porNome", Aluno.class);
        
        consulta.setParameter("nome", "%"+nome+"%");
        
        return consulta.getResultList(); 
    }
    
    private static Aluno alunoLogado = null;
    
    public static Aluno getAlunoLogado() {
        return alunoLogado;
    }

    public static boolean isAlunoLogado()
    {
        if (alunoLogado == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static void logoutAluno()
    {
        ControleAluno.alunoLogado = null;
    }
    
    
    public static boolean logarAluno(Integer prontuario, String senha) {
        
        boolean logou = false;
                
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        List<Aluno> listaAlunos;
    
        TypedQuery<Aluno> consulta = gerente.createNamedQuery("Aluno.Acessar", Aluno.class);
        
        consulta.setParameter("prontuario", prontuario);
        consulta.setParameter("senha", senha);
        
        listaAlunos = consulta.getResultList();
        
        if (listaAlunos.isEmpty())
        {
            ControleAluno.alunoLogado =  null;
            
        }
        else
        {
            ControleAluno.alunoLogado = listaAlunos.get(0);
            logou = true;
        }
        
        return logou;
    }

}
