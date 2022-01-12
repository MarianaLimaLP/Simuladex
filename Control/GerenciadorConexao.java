package Control;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class GerenciadorConexao {
    private static EntityManagerFactory emf;
    
    public static EntityManagerFactory getFabrica()
    {
        
        if(emf == null)
        {
            emf = Persistence.createEntityManagerFactory("Interface-SimuladexPU");
        }
        return emf;
    }
    
    public static EntityManager getGerente()
    {
        return getFabrica().createEntityManager();
    }
}
