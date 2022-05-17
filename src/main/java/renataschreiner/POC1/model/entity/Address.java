package renataschreiner.POC1.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_ADRESS")

public class Address {

    private Integer cep;

    private String estado;

    private String cidade;
    private String rua;
    private Integer numero;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Address() {
    }

    public Address(Integer cep, String estado, String cidade, String rua, Integer numero, Long id) {
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.id = id;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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
