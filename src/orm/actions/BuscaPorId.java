package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import orm.models.Aluno;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

public class BuscaPorId {
    public BuscaPorId() {
    }

    public Aluno getById(Long id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        Query query = manager.createQuery("SELECT a FROM Aluno a WHERE a.id = :id");
        query.setParameter("id", id);
        Aluno aluno = (Aluno)query.getSingleResult();
        manager.close();
        factory.close();
        return aluno;
    }
}
