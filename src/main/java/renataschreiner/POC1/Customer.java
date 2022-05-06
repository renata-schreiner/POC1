package renataschreiner.POC1;

public class Customer {

    private String name;
    private Integer age;
    private Integer id;

    public Customer() {
    }

    public Customer(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public Integer getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
