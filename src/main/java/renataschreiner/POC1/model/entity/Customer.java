package renataschreiner.POC1.model.entity;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_CUSTOMER")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size (max = 30)
    private String name;

    @Min(value = 12) //porque sim
    private Integer age;

    @Email
    private String email;

    @Size(min = 11, max = 14)
    private String cpf_cnpj;

    private String type;

    @OneToMany(mappedBy = "customer")
    private List<Address> addresses = new ArrayList<>();

    public Customer() {
    }

    public Customer(Long id, String name, Integer age, String email, String cpf_cnpj, String type, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.cpf_cnpj = cpf_cnpj;
        this.type = type;
        this.addresses = addresses;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
