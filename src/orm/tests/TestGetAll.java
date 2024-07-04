package orm.tests;

import java.util.Iterator;
import java.util.List;

import orm.actions.BuscaAlunos;
import orm.models.Aluno;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

public class TestGetAll {
    public TestGetAll() {
    }

    public static void main(String[] args) {
        List<Aluno> lista = (new BuscaAlunos()).getAll();
        Iterator var2 = lista.iterator();

        while (var2.hasNext()) {
            Aluno a = (Aluno) var2.next();
            System.out.println("\u001b[32m\u001b[40mID:\u001b[0m " + a.getId());
            System.out.println("\u001b[32m\u001b[40mNome: \u001b[0m" + a.getName());
            System.out.println("\u001b[32m\u001b[40mCPF: \u001b[0m" + a.getCpf());
            System.out.println("\u001b[32m\u001b[40mEmail:\u001b[0m " + a.getEmail());
            System.out.println("\u001b[32m\u001b[40mEndereço: \u001b[0m" + a.getEndereco());
            System.out.println("\u001b[32m\u001b[40mData de nascimento:\u001b[0m " + a.getDataDeNascimento());
            System.out.println("\u001b[32m\u001b[40mNaturalidade: \u001b[0m" + a.getNaturalidade());
            System.out.println();
        }

    }
}
