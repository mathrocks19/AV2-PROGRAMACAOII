package orm.tests;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

public class TestaCriaTabela {
    public TestaCriaTabela() {
    }
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        factory.close();
    }
}
