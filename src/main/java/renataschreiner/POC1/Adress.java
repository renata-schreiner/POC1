package renataschreiner.POC1;

import javax.persistence.criteria.CriteriaBuilder;

public class Adress {

    private Integer cep;
    private String rua;
    private Integer numero;

    public Adress() {
    }
    public Adress (Integer cep, String rua, Integer numero){
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
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
}
