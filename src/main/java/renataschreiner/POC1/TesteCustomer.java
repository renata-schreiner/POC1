package renataschreiner.POC1;

public class TesteCustomer {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setName("Renata");
        c1.setAge(25);
        c1.setId(12345);

        Adress a1 = new Adress(1233, "Rua X", 23);
        a1.setCep(3454);

        System.out.println(c1.getName());
        System.out.println(c1.getAge());
        System.out.println(c1.getId());
        System.out.println(a1.getCep());
        System.out.println(a1.getRua());
        System.out.println(a1.getNumero());
    }
}
