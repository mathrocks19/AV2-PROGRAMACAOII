package orm.actions;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import orm.models.Aluno;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

public class BuscaPrimeiraLetra {
    public BuscaPrimeiraLetra() {
    }

    public List<Aluno> getByFirstLetter(String letra) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        Query query = manager.createQuery("SELECT a FROM Aluno a WHERE SUBSTRING(a.name, 1, 1) = :letra");
        query.setParameter("letra", letra);
        List<Aluno> lista = query.getResultList();
        manager.close();
        factory.close();
        return lista;
    }
}
