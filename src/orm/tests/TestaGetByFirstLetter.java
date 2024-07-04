package orm.tests;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import orm.actions.BuscaPrimeiraLetra;
import orm.models.Aluno;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

public class TestaGetByFirstLetter {
    public TestaGetByFirstLetter() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\u001b[32m\u001b[40mInsira a letra: \u001b[0m");
        String letra = sc.nextLine();
        List<Aluno> lista = (new BuscaPrimeiraLetra()).getByFirstLetter(letra);
        Iterator var4 = lista.iterator();

        while (var4.hasNext()) {
            Aluno a = (Aluno) var4.next();
            System.out.println("\u001b[32m\u001b[40mAluno \u001b[0m" + a.getId());
            System.out.println("\u001b[32m\u001b[40mNome: \u001b[0m" + a.getName());
            System.out.println("\u001b[32m\u001b[40mEmail: \u001b[0m" + a.getEmail());
            System.out.println("\u001b[32m\u001b[40mCPF: \u001b[0m" + a.getCpf());
            System.out.println("\u001b[32m\u001b[40mData de nascimento: \u001b[0m" + a.getDataDeNascimento());
            System.out.println("\u001b[32m\u001b[40mNaturalidade: \u001b[0m" + a.getNaturalidade());
            System.out.println("\u001b[32m\u001b[40mEndereço: \u001b[0m" + a.getEndereco());
            System.out.println();
        }

    }
}
