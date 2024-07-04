package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import orm.models.Aluno;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

public class DeleteAluno {
	public DeleteAluno() {
	}

	public void delete(Aluno aluno, Long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		aluno = (Aluno)manager.find(Aluno.class, id);
		manager.getTransaction().begin();
		manager.remove(aluno);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
