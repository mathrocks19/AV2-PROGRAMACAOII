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

public class BuscaAlunos {
    public BuscaAlunos() {
    }

    public List<Aluno> getAll() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        Query query = manager.createQuery("select a from Aluno as a");
        List<Aluno> lista = query.getResultList();
        manager.close();
        factory.close();
        return lista;
    }
}
