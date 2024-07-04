package orm.tests;

import java.util.Scanner;
import orm.actions.AlteraAluno;
import orm.actions.BuscaPorId;
import orm.models.Aluno;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

public class TestaAltera {
    public TestaAltera() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = (new BuscaPorId()).getById(1L);
        System.out.print("\u001b[32m\u001b[40mNome: \u001b[0m");
        aluno.setName(sc.nextLine());
        System.out.print("\u001b[32m\u001b[40mE-mail: \u001b[0m");
        aluno.setEmail(sc.nextLine());
        System.out.print("\u001b[32m\u001b[40mCPF: \u001b[0m");
        aluno.setCpf(sc.nextLine());
        System.out.print("\u001b[32m\u001b[40mData de nascimento (dd/mm/yyyy): \u001b[0m");
        aluno.setDataDeNascimento(sc.nextLine());
        System.out.print("\u001b[32m\u001b[40mNaturalidade: \u001b[0m");
        aluno.setNaturalidade(sc.nextLine());
        System.out.println("\u001b[32m\u001b[40mEndereço: \u001b[0m");
        aluno.setEndereco(sc.nextLine());
        Aluno altera = (new AlteraAluno()).alteraAluno(aluno);
        System.out.println("\u001b[32m\u001b[40mDados Atualizados!\u001b[0m");
        sc.close();
    }
}
