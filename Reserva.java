/**
 * Classe responsável por representar a Reserva, com seus respectivos atributos
 * e métodos.
 * 
 * @author: Rafael Santos
 * @version: versao 1.0
 */

public class Reserva {
    private int qtdeDias;
    private int mesReservado;
    private int diaInicial;
    private Veiculo v;

    /**
     * Construtor da Classe Reserva.
     * 
     * @param qtdeDias     - Inteiro Contendo a Quantidade de Dias Reservado.
     * @param mesReservado - Inteiro Contendo o Número Referente ao Mês Reservado.
     * @param diaInicial   - Inteiro Contendo o Dia Inicial da Reserva.
     * @param veiculo      - Veiculo contendo o Veículo Desejado para a Reserva.
     */
    public Reserva(int qtdeDias, int mesReservado, int diaInicial, Veiculo veiculo) {
        this.qtdeDias = qtdeDias;
        this.mesReservado = mesReservado;
        this.diaInicial = diaInicial;
        this.v = veiculo;
    }

    /**
     * Método para Retornar a Quantidade de Dias Reservado.
     * 
     * @return int - Quantidade de Dias Reservado.
     */
    public int getQtdeDias() {
        return qtdeDias;
    }

    /**
     * Método para Retornar o Mês Reservado.
     * 
     * @return int - Número Referente ao Mês Reservado.
     */
    public int getMesReservado() {
        return mesReservado;
    }

    /**
     * Método para Retornar o Dia Inicial da Reserva.
     * 
     * @return int - Dia Inicial da Reserva.
     */
    public int getDiaInicial() {
        return diaInicial;
    }

    /**
     * Método para Retornar o Veículo Reservado.
     * 
     * @return Veiculo - veículo com suas respectivas características (atributos).
     */
    public Veiculo getVeiculo() {
        return v;
    }

    /**
     * Método para Retornar Todas as Características (Atributos) da Reserva.
     * 
     * @return String - Características (Atributos) da Reserva.
     */
    public String toString() {
        return " \nData da reserva: " + geraDataInicial() + " \nQuantidade de Dias Reservado: " + getQtdeDias()
                + " \nVeiculo Alugado: "
                + getVeiculo() + "\nValor Aluguel: " + valorFinalAluguel();
    }

    /**
     * Método para Retornar o Valor Final do Aluguel do Veículo especificado da
     * Reserva.
     * 
     * @return double - Valor Final do Aluguel do Veículo.
     */
    public double valorFinalAluguel() {
        return v.precoAluguel() + (qtdeDias * v.GetvalorFixo());
    }

    /**
     * Método para Retornar a data inicial (Dia/Mês) da Reserva.
     * 
     * @return String - Data Inicial (Dia/Mês) da Reserva.
     */
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
