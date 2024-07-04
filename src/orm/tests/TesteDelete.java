package orm.tests;

import javax.persistence.NoResultException;

import orm.actions.BuscaPorId;
import orm.actions.DeleteAluno;
import orm.models.Aluno;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

public class TesteDelete {
    public TesteDelete() {
    }

    public static void main(String[] args) {
        try {
            Aluno aluno = (new BuscaPorId()).getById(10L);
            if (aluno != null) {
                (new DeleteAluno()).delete(aluno, aluno.getId());
                System.out.println("\u001b[32m\u001b[40mAluno Deletado\u001b[0m");
            } else {
                System.out.println("\u001b[31m\u001b[40mID do aluno não encontrado\u001b[0m");
            }
        } catch (NoResultException var2) {
            System.out.println("\u001b[31m\u001b[40mID do aluno não encontrado\u001b[0m");
        }

    }
}
