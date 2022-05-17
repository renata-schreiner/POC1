package renataschreiner.POC1.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_CUSTOMER")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    private String email;

    private String cpf_cnpj;

    private boolean isPessoaFisica;

    public Customer() {
    }

    public Customer(Long id, String name, Integer age, String email, String cpf_cnpj, Boolean isPessoaFisica) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.cpf_cnpj = cpf_cnpj;
        this.isPessoaFisica = isPessoaFisica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public Boolean getPessoaFisica() {
        return isPessoaFisica;
    }

    public void setPessoaFisica(boolean pessoaFisica) {
        isPessoaFisica = pessoaFisica;

    }
}
