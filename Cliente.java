public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    Reserva reserva;

    public Cliente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public String toString() {
        return "\nCliente: " + getNome() + " \nCPF: " + getCpf() + " \nIdade: " + getIdade() + " \n\nReserva: "
                + getReserva();
    }

    public void reservarVeiculo(int qtdeDias, int mesReservado, int diaInicial, Veiculo v) {
        reserva = new Reserva(qtdeDias, mesReservado, diaInicial, v);
    }

    public void cancelarReserva() {
        reserva = null;
    }
}
