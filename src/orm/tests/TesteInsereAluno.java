package orm.tests;

import java.util.Scanner;

import orm.actions.InsereAluno;
import orm.models.Aluno;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

public class TesteInsereAluno {
    public TesteInsereAluno() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001b[32m\u001b[40mCadastro de aluno\u001b[0m");
        System.out.print("\u001b[32m\u001b[40mNome:\u001b[0m ");
        String nome = sc.nextLine();
        System.out.print("\u001b[32m\u001b[40mE-mail:\u001b[0m ");
        String email = sc.nextLine();
        System.out.print("\u001b[32m\u001b[40mCPF:\u001b[0m ");
        String cpf = sc.nextLine();
        System.out.print("\u001b[32m\u001b[40mData de nascimento (dd/mm/yyyy):\u001b[0m ");
        String dataNascimento = sc.nextLine();
        System.out.print("\u001b[32m\u001b[40mNaturalidade:\u001b[0m ");
        String naturalidade = sc.nextLine();
        System.out.println("\u001b[32m\u001b[40mEndereço:\u001b[0m ");
        String endereco = sc.nextLine();
        Aluno aluno = new Aluno(nome, email, cpf, dataNascimento, naturalidade, endereco);
        InsereAluno insere = new InsereAluno();
        insere.insere(aluno);
        System.out.println("\u001b[32m\u001b[40mDados Atualizados!\u001b[0m");
        sc.close();
    }
}
