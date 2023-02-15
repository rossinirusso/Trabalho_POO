import java.util.ArrayList;

public class TesteFael {

    public static void main(String[] args) {
        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<Veiculo> veiculo = new ArrayList<>();

        cliente.add(new Cliente("Rafael Ávila dos Santos", 22, "13485144690"));
        cliente.add(new Cliente("Rossini Russo", 23, "11122233344"));
        cliente.add(new Cliente("Adrielle Cunha da Silva", 21, "55566677788"));
        cliente.add(new Cliente("Eduardo Henrique Fernandes", 30, "99911122233"));

        for (Cliente c : cliente) {
            System.out.println(c);
        }

        System.out.println("-----------------------------------------------------------");

        veiculo.add(new Moto("Suzuki", "Moto", "Manual", "HM2J71", 23, "Trail"));
        veiculo.add(new Combustao("Ford", "Carro a Combustao", "Manual", "RAHJ11", 23, 4, 50));
        veiculo.add(new Moto("BMW", "Moto", "Automatico", "AV221K", 23, "Trail"));

        cliente.get(0).reservarVeiculo(5, 2, 12, veiculo.get(0));
        cliente.get(2).reservarVeiculo(5, 2, 12, veiculo.get(2));

        for (Cliente c : cliente) {
            System.out.println(c);
            System.out.println("-------------------------");
        }
        /*
         * System.out.
         * println("-------------------Veiculos Cadastrados: -------------------");
         * for (Veiculo v : veiculo) {
         * System.out.println(v);
         * System.out.println("-------------------------");
         * }
         * 
         * System.out.
         * println("-------------------Nome dos Clientes Cadastrados: -------------------"
         * );
         * for (Cliente c : cliente) {
         * System.out.println(c.getNome());
         * System.out.println("-------------------------");
         * }
         */
        System.out.println("-----------------------------------------------------------");
        cliente.get(0).cancelarReserva();
        cliente.get(2).cancelarReserva();

        for (Cliente c : cliente) {
            System.out.println(c);
            System.out.println("-------------------------");
        }
    }

}