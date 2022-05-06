package renataschreiner.POC1;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table (name = "TB_ADRESS")

public class Adress {

    private Integer cep;
    private String rua;
    private Integer numero;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Adress() {
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
