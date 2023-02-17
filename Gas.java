/**
 * Classe que representa o conjunto comum de características
 * (atributos), e métodos que dispõem os tipos Gas (Carro à Gas)
 * que herdam da Classe Carro, e que por sua vez, também herdam da Classe
 * Veiculo.
 * 
 * @author: Rafael Santos
 * @version: versao 1.0
 */

public class Gas extends Carro {
    private int qtdeCilinidros;
    private double capacidadeCilinidro;

    /**
     * Construtor da Classe Gas.
     * 
     * @param marca               - String Contendo a Marca do Gas (Carro à Gas)
     * @param tipo                - String Contendo o Tipo do Gas (Carro à Gas)
     * @param cambio              - String Contendo o Tipo do Câmbio
     *                            (Manual/Automático) do Gas (Carro à Gas)
     * @param placa               - String Contendo a Placa do Gas (Carro à Gas)
     * @param valorFixo           - double Contendo o Valor Fixo do Aluguel do
     *                            Gas (Carro à Gas)
     * @param qtdPortas           - Inteiro Contendo o Valor Referente a Quantidade
     *                            de Portas do Gas (Carro à Gas)
     * @param qtdeCilinidros      - Inteiro Contendo a Quantidade de Cilindros do
     *                            Gas (Carro à Gas)
     * @param capacidadeCilinidro - double Contendo o Valor Referente a Capacidade
     *                            do Cilindro do Gas (Carro à Gas)
     */
    public Gas(String marca, String tipo, String cambio, String placa, double valorFixo, int qtdPortas,
            int qtdeCilinidros,
            double capacidadeCilinidro) {
        super(marca, tipo, cambio, placa, valorFixo, qtdPortas);
        this.qtdeCilinidros = qtdeCilinidros;
        this.capacidadeCilinidro = capacidadeCilinidro;
    }

    /**
     * Método para Retornar o Preço do Aluguel do Gas (Carro à Gas)
     * 
     * @return double - Preço do Aluguel do Gas (Carro à Gas).
     */
    @Override
    public double precoAluguel() {
        return qtdeCilinidros * (capacidadeCilinidro * 4.0);
    }

    /**
     * Método para Retornar a Quantidade de Cilindros do Gas (Carro à Gas)
     * 
     * @return int - Inteiro Contendo a Quantidade de Cilindros do Gas (Carro à Gas)
     */
    public int getQtdeCilindros() {
        return qtdeCilinidros;
    }

    /**
     * Método para Retornar a Capacidade do Cilindro do Gas (Carro à Gas)
     * 
     * @return double - double Contendo a Capacidade do Cilindro do Gas (Carro à
     *         Gas)
     */
    public double getcapacidadeCilinidro() {
        return capacidadeCilinidro;
    }

    /**
     * Método para Retornar Todas as Características (Atributos) do Gas (Carro à
     * Gas).
     * 
     * @return String - Características (Atributos) do Gas (Carro à Gas).
     */
    @Override
    public String toString() {
        return super.toString() + " \nQuantidade de Cilindros: " + getQtdeCilindros() + " \nCapacidade do Cilindro: "
                + getcapacidadeCilinidro();
    }
}
