import java.util.ArrayList;

/**
 * Classe de Controle Responsável por toda a dinâmica do sistema,
 * e controle dos conjuntos de veículos cadastrados e clientes
 */

public class Controle {
    private ArrayList<Veiculo> veiculo;
    private ArrayList<Cliente> cliente;

    public Controle() {
        veiculo = new ArrayList<Veiculo>();
        cliente = new ArrayList<Cliente>();
    }

    public void cadastraVeiculo(Veiculo v) {
        veiculo.add(v);
    }

    public void removeVeiculo(Veiculo v) {
        veiculo.remove(v);
    }

    public void visualizaVeiculos() {
        for (Veiculo v : veiculo) {
            System.out.println(v);
            System.out.println("-----------------");
        }
    }

    public void cadastraCliente(Cliente c) {
        cliente.add(c);
    }

    public void removeCliente(Cliente c) {
        int i = 0;

        while (cliente.get(i) != c) {
            i += 1;
        }

        cliente.remove(i);
    }

    public boolean verificaCliente(String cpf) {
        return cliente.contains(buscarCliente(cpf));
    }

    public void fazReserva(Cliente c, int qtdeDias, int mesReservado, int diaInicial, String placa) {
        Veiculo v = buscarVeiculo(placa);
        c.reservarVeiculo(qtdeDias, mesReservado, diaInicial, v);   
    }

    // Método que busca a placa e retorna um booleano caso p veiculo referente a
    // placa esteja reservado
    public boolean buscaPlaca(String placa) {
        for (Cliente cliente2 : cliente) {
            if(cliente2.getReserva() != null){
            Veiculo atual = cliente2.getReserva().getVeiculo();
            if (atual.getPlaca().equals(placa)) {
                return true;
            } else {
                return false;
            }
        }
            else{
                return false;
            }
        }
        return false;
    }

    // metodo que busca e retornar um veiculo a partir de seu placa
    public Veiculo buscarVeiculo(String info) {
        for (Veiculo v : veiculo) {
            if (v.getPlaca().equals(info)) {
                return v;
            }
        }
        return null;
    }

    // metodo que busca e retornar um cliente a partir de seu cpf
    public Cliente buscarCliente(String cpf) {
        for (Cliente c : cliente) {
            if (c.getCpf().equals((cpf))) {
                return c;
            }
        }
        return null;
    }

    public void infoReserva(Cliente c) {
        System.out.println("Informações da reserva");
        System.out.println(c);
        System.out.println("--------------------------------");

    }
    
    //Verifica se o veículo está disponível para reserva 
    public boolean verificaDisponibilidade(String placa){
        if(buscaPlaca(placa)){
            return false;
            }
    
            else{
                return true;
            }


    }
    
    /*
    public boolean verificaData(String placa){
        Reserva r;
        for (Cliente cliente2 : cliente) {
            if(cliente2.getReserva() != null){
                r = cliente2.getReserva();


            }
            
        }

    }
   
    


    //teste
    public boolean teste(String placa, int qtdeDias,int mesReservado, int diaInicial) {
        Reserva r;
        Veiculo atual;
        for (Cliente cliente2 : cliente) {
            if(cliente2.getReserva() != null){
             r = cliente2.getReserva();   
             atual = cliente2.getReserva().getVeiculo();
            if (atual.getPlaca().equals(placa) && r.geraDataInicial()) {
                return true;
            } else {
                return false;
            }
        }
            else{
                return false;
            }
        }
        return false;
    }
    */
}
