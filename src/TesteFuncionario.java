
public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente nico = new Gerente();
        nico.setNome("nico");
        nico.setCpf("020020020-90");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

//        nico.salario = 300.0;

    }
}