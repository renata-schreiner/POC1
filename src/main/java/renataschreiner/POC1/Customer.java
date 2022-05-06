package renataschreiner.POC1;

import javax.persistence.*;

@Entity
@Table (name = "TB_CUSTOMER")

public class Customer {

    private String name;
    private Integer age;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    public Customer() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
