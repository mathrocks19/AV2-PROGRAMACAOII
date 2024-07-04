package orm.tests;

import javax.persistence.NoResultException;

import orm.actions.BuscaPorId;
import orm.models.Aluno;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

public class TestGetById {
    public TestGetById() {
    }

    public static void main(String[] args) {
        try {
            Aluno a = (new BuscaPorId()).getById(9L);
            System.out.println("\u001b[32m\u001b[40mAluno \u001b[0m" + a.getId());
            System.out.println("\u001b[32m\u001b[40mNome: \u001b[0m" + a.getName());
            System.out.println("\u001b[32m\u001b[40mEmail: \u001b[0m" + a.getEmail());
            System.out.println("\u001b[32m\u001b[40mCPF: \u001b[0m" + a.getCpf());
            System.out.println("\u001b[32m\u001b[40mData de nascimento:\u001b[0m " + a.getDataDeNascimento());
            System.out.println("\u001b[32m\u001b[40mNaturalidade: \u001b[0m" + a.getNaturalidade());
            System.out.println("\u001b[32m\u001b[40mEndereço: \u001b[0m" + a.getEndereco());
            System.out.println();
        } catch (NoResultException var2) {
            System.out.println("\u001b[40m\u001b[31mAluno não encontrado.\u001b[0m");
        }

    }
}
