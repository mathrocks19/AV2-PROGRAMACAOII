package orm.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Matheus da Cunha Viana - 3°Módulo - AV2-PROGRAMAÇÃOPARTE2
 */

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aluno_id")
    private long id;
    @Column(name = "aluno_cpf")
    private String cpf;
    @Column(name = "aluno_nome")
    private String name;
    @Column(name = "aluno_email")
    private String email;
    @Column(name = "aluno_data_nascimento")
    private String dataDeNascimento;
    @Column(name = "aluno_endereco")
    private String endereco;
    @Column(name = "aluno_naturalidade")
    private String naturalidade;

    //@Column(name = "aluno_nota_enem")
    //private String  aluno_nota_enem;

    public Aluno() {

    }
    public Aluno(String name, String email, String cpf, String dataDeNascimento, String naturalidade, String endereco) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.naturalidade = naturalidade;
        this.endereco = endereco;
    }
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Aluno{id=" + this.id + ", name='" + this.name + "', email='" + this.email + "', cpf='" + this.cpf + "', dataDeNascimento='" + this.dataDeNascimento + "', naturalidade='" + this.naturalidade + "', endereco='" + this.endereco + "'}";
    }
}
