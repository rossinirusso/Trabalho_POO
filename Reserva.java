
public class Reserva {
    private int qtdeDias;
    private int mesReservado;
    private int diaInicial;
    private Veiculo v;

    public Reserva(int qtdeDias, int mesReservado, int diaInicial, Veiculo veiculo) {
        this.qtdeDias = qtdeDias;
        this.mesReservado = mesReservado;
        this.diaInicial = diaInicial;
        this.v = veiculo;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public int getMesReservado() {
        return mesReservado;
    }

    public int getDiaInicial() {
        return diaInicial;
    }

    public Veiculo getVeiculo() {
        return v;
    }

    public String toString() {
        return " \nData da reserva: " + geraDataInicial() + " \nQuantidade de Dias Reservado: " + getQtdeDias()
                + " \nVeiculo Alugado: "
                + getVeiculo() + "\nValor Aluguel: " + valorFinalAluguel();
    }

    public double valorFinalAluguel() {
        return v.precoAluguel() + (qtdeDias * v.GetvalorFixo());
    }

    public String geraDataInicial() {
        return String.valueOf(getDiaInicial()) + "/" + String.valueOf(getMesReservado());
    }

    /*
     * public boolean verificaData(Veiculo v){
     * for (Cliente cliente2 : cliente) {
     * Veiculo atual = cliente2.getReserva().getVeiculo();
     * return true;
     * }
     * }
     */
}
